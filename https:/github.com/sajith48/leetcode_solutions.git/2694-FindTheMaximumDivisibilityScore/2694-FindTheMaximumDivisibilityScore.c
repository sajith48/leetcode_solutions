// Last updated: 7/18/2026, 9:24:50 PM
int maxDivScore(int* nums, int numsSize, int* divisors, int divisorsSize) {
    int maxScore = -1;
    int result = divisors[0];

    for (int i = 0; i < divisorsSize; i++) {
        int d = divisors[i];
        int score = 0;

        for (int j = 0; j < numsSize; j++) {
            if (nums[j] % d == 0) {
                score++;
            }
        }

        // choose max score, and if tie choose smaller divisor
        if (score > maxScore || (score == maxScore && d < result)) {
            maxScore = score;
            result = d;
        }
    }

    return result;
}
