// Last updated: 7/18/2026, 9:25:53 PM
#include <limits.h>
#include <stdlib.h>

typedef struct {
    int r, c;
    int effort;
} Node;

typedef struct {
    Node *arr;
    int size;
    int capacity;
} MinHeap;

// -------- Min Heap Functions --------
void swap(Node *a, Node *b) {
    Node temp = *a;
    *a = *b;
    *b = temp;
}

MinHeap* createHeap(int cap) {
    MinHeap* h = (MinHeap*)malloc(sizeof(MinHeap));
    h->arr = (Node*)malloc(sizeof(Node) * cap);
    h->size = 0;
    h->capacity = cap;
    return h;
}

void heapPush(MinHeap *h, Node x) {
    int i = h->size++;
    h->arr[i] = x;

    while (i > 0) {
        int p = (i - 1) / 2;
        if (h->arr[p].effort <= h->arr[i].effort) break;
        swap(&h->arr[p], &h->arr[i]);
        i = p;
    }
}

Node heapPop(MinHeap *h) {
    Node top = h->arr[0];
    h->arr[0] = h->arr[--h->size];

    int i = 0;
    while (1) {
        int left = 2*i + 1, right = 2*i + 2;
        int smallest = i;

        if (left < h->size && h->arr[left].effort < h->arr[smallest].effort)
            smallest = left;
        if (right < h->size && h->arr[right].effort < h->arr[smallest].effort)
            smallest = right;

        if (smallest == i) break;
        swap(&h->arr[i], &h->arr[smallest]);
        i = smallest;
    }

    return top;
}

int heapEmpty(MinHeap *h) {
    return h->size == 0;
}

// -------- Solve Function --------
int minimumEffortPath(int** heights, int rows, int* cols) {
    int R = rows, C = cols[0];

    int directions[4][2] = {{1,0},{-1,0},{0,1},{0,-1}};

    int** dist = (int**)malloc(sizeof(int*) * R);
    for (int i = 0; i < R; i++) {
        dist[i] = (int*)malloc(sizeof(int) * C);
        for (int j = 0; j < C; j++)
            dist[i][j] = INT_MAX;
    }

    MinHeap* heap = createHeap(R*C);
    heapPush(heap, (Node){0, 0, 0});
    dist[0][0] = 0;

    while (!heapEmpty(heap)) {
        Node cur = heapPop(heap);
        int r = cur.r, c = cur.c, e = cur.effort;

        if (r == R-1 && c == C-1) return e;

        if (e > dist[r][c]) continue;

        for (int k = 0; k < 4; k++) {
            int nr = r + directions[k][0];
            int nc = c + directions[k][1];

            if (nr < 0 || nc < 0 || nr >= R || nc >= C) continue;

            int diff = abs(heights[r][c] - heights[nr][nc]);
            int newEffort = (diff > e ? diff : e);

            if (newEffort < dist[nr][nc]) {
                dist[nr][nc] = newEffort;
                heapPush(heap, (Node){nr, nc, newEffort});
            }
        }
    }
    return 0;
}
