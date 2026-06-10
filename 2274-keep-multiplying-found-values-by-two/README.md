<h2><a href="https://leetcode.com/problems/keep-multiplying-found-values-by-two">Keep Multiplying Found Values by Two</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><p>You are given an array of integers <code>nums</code>. You are also given an integer <code>original</code> which is the first number that needs to be searched for in <code>nums</code>.</p>

<p>You then do the following steps:</p>

<ol>
	<li>If <code>original</code> is found in <code>nums</code>, <strong>multiply</strong> it by two (i.e., set <code>original = 2 * original</code>).</li>
	<li>Otherwise, <strong>stop</strong> the process.</li>
	<li><strong>Repeat</strong> this process with the new number as long as you keep finding the number.</li>
</ol>

<p>Return <em>the <strong>final</strong> value of </em><code>original</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [5,3,6,1,12], original = 3
<strong>Output:</strong> 24
<strong>Explanation:</strong> 
- 3 is found in nums. 3 is multiplied by 2 to obtain 6.
- 6 is found in nums. 6 is multiplied by 2 to obtain 12.
- 12 is found in nums. 12 is multiplied by 2 to obtain 24.
- 24 is not found in nums. Thus, 24 is returned.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,7,9], original = 4
<strong>Output:</strong> 4
<strong>Explanation:</strong>
- 4 is not found in nums. Thus, 4 is returned.
</pre>
## Algorithm: Remainder Tracking (Modulo 3)

### Approach:
1. **Initialize a counter** `operations` to `0` to keep track of the total moves required.
2. **Iterate through each number** in the given `nums` array using an enhanced for-loop.
3. **Check divisibility**: For each element, check if it is divisible by 3 using the modulo operator (`num % 3 != 0`).
4. **Calculate operations**: 
   - If the remainder is `1` (e.g., 4), we subtract 1 to make it 3 (Takes 1 operation).
   - If the remainder is `2` (e.g., 5), we add 1 to make it 6 (Takes 1 operation).
   - Therefore, any number not divisible by 3 always requires exactly **1 operation**.
5. **Increment and Return**: Increment the `operations` counter by 1 for every non-divisible number, and return the total count.

### Complexity Analysis:
- **Time Complexity:** **O(N)** — Where N is the number of elements in the array. We loop through the array exactly once.
- **Space Complexity:** **O(1)** — We only use a single integer variable (`operations`) for tracking, consuming constant extra space.


<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 1000</code></li>
	<li><code>1 &lt;= nums[i], original &lt;= 1000</code></li>
</ul>
