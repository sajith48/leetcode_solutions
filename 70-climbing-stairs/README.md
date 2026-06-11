<h2><a href="https://leetcode.com/problems/climbing-stairs">Climbing Stairs</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><p>You are climbing a staircase. It takes <code>n</code> steps to reach the top.</p>

<p>Each time you can either climb <code>1</code> or <code>2</code> steps. In how many distinct ways can you climb to the top?</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> n = 2
<strong>Output:</strong> 2
<strong>Explanation:</strong> There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 3
<strong>Output:</strong> 3
<strong>Explanation:</strong> There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
</pre>
## Algorithm: Dynamic Programming (Top-Down Memoization)

### Approach:
1. **State Optimization Cache**: Allocate a linear lookup array `dp` of size `n + 1` initialized completely with `-1` to track unvisited subproblem states.
2. **Recursive Decomposition**: Define a helper routing function `check(n, dp)` to break down the main stair climbing problem into smaller recursive paths.
3. **Base Case Confinement**: 
   - If `n == 0` or `n == 1`, return `1`. This provides the foundational base value for calculating subsequent step additions and stops recursion safely before indices turn negative.
4. **Cache Lookup (Memoization)**: Before triggering deeper recursive paths, check if `dp[n] != -1`. If true, return the cached value immediately to avoid redundant calculations.
5. **Recurrence Relation**: If the state is uncomputed, solve it by summing the two preceding steps: `check(n - 1, dp) + check(n - 2, dp)`. Store this result directly inside `dp[n]` before returning it.

### Complexity Analysis:
- **Time Complexity:** **O(N)** — Without memoization, a standard recursive tree branches exponentially out to $O(2^N)$. Adding the `dp` cache ensures each distinct step value from $0$ to $N$ is computed exactly once, turning it into a linear run time.
- **Space Complexity:** **O(N)** — Auxiliary memory space is scaled linearly due to the combination of the `dp` tracking array of size $N + 1$ and the internal execution stack frame overhead during recursion.

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 45</code></li>
</ul>
