<h2><a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string">Find the Index of the First Occurrence in a String</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><p>Given two strings <code>needle</code> and <code>haystack</code>, return the index of the first occurrence of <code>needle</code> in <code>haystack</code>, or <code>-1</code> if <code>needle</code> is not part of <code>haystack</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> haystack = &quot;sadbutsad&quot;, needle = &quot;sad&quot;
<strong>Output:</strong> 0
<strong>Explanation:</strong> &quot;sad&quot; occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> haystack = &quot;leetcode&quot;, needle = &quot;leeto&quot;
<strong>Output:</strong> -1
<strong>Explanation:</strong> &quot;leeto&quot; did not occur in &quot;leetcode&quot;, so we return -1.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= haystack.length, needle.length &lt;= 10<sup>4</sup></code></li>
	<li><code>haystack</code> and <code>needle</code> consist of only lowercase English characters.</li>
</ul>
## Algorithm: Sliding Window (Manual Substring Search)

### Approach:
1. **Length Check**: Calculate the lengths of both strings: `n` for `haystack` and `m` for `needle`.
2. **Outer Loop (Window Sliding)**: Iterate through `haystack` from index `i = 0` up to `n - m`. We only need to check up to `n - m` because any remaining substring shorter than `needle` cannot form a valid match.
3. **Inner Loop (Character Matching)**: For each starting position `i`, use a second pointer `j` to compare characters of `needle` with characters of `haystack` starting at `i + j`.
4. **Match Validation**: The inner loop continues as long as characters match (`haystack[i + j] == needle[j]`) and we haven't reached the end of the `needle` (`j < m`).
5. **Return Index**: If `j` reaches the length of `m`, it means the entire `needle` string was found sequentially. We immediately return the starting index `i`.
6. **Fallback Value**: If the outer loop completes without finding any valid match, return `-1`.

### Complexity Analysis:
- **Time Complexity:** **O((N - M + 1) × M)** 
  - In the worst case (e.g., `haystack = "aaaaa"`, `needle = "aab"`), the outer loop runs `N - M + 1` times, and the inner loop runs `M` times.
- **Space Complexity:** **O(1)** 
  - The algorithm executes in constant auxiliary space because it only uses a few primitive integer pointers (`i`, `j`, `n`, `m`) and does not allocate extra memory structures.
