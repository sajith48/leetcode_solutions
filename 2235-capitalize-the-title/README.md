<h2><a href="https://leetcode.com/problems/capitalize-the-title">Capitalize the Title</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><p>You are given a string <code>title</code> consisting of one or more words separated by a single space, where each word consists of English letters. <strong>Capitalize</strong> the string by changing the capitalization of each word such that:</p>

<ul>
	<li>If the length of the word is <code>1</code> or <code>2</code> letters, change all letters to lowercase.</li>
	<li>Otherwise, change the first letter to uppercase and the remaining letters to lowercase.</li>
</ul>

<p>Return <em>the <strong>capitalized</strong> </em><code>title</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> title = &quot;capiTalIze tHe titLe&quot;
<strong>Output:</strong> &quot;Capitalize The Title&quot;
<strong>Explanation:</strong>
Since all the words have a length of at least 3, the first letter of each word is uppercase, and the remaining letters are lowercase.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> title = &quot;First leTTeR of EACH Word&quot;
<strong>Output:</strong> &quot;First Letter of Each Word&quot;
<strong>Explanation:</strong>
The word &quot;of&quot; has length 2, so it is all lowercase.
The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> title = &quot;i lOve leetcode&quot;
<strong>Output:</strong> &quot;i Love Leetcode&quot;
<strong>Explanation:</strong>
The word &quot;i&quot; has length 1, so it is lowercase.
The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.
</pre>
## Algorithm: Tokenization and Conditional Capitalization

### Approach:
1. **Normalization**: Convert the entire input string `title` to lowercase using `toLowerCase()` to handle any irregular uppercase letters across words uniformly.
2. **Tokenization**: Split the normalized string into an array of individual words (`String[] words`) using space (`" "`) as the delimiter.
3. **Length Validation and Transformation**: Loop through each word in the array:
   - Check the word length. If it is **2 characters or fewer**, leave it entirely in lowercase as required by the constraints.
   - If the word is **longer than 2 characters**, extract its characters into a mutable character array using `toCharArray()`. Change the first character (`chars[0]`) to uppercase using `Character.toUpperCase()`, and convert it back into a string.
4. **Reassembly**: Merge the processed array of words back into a single string using `String.join(" ", words)`, separating each word with a single space.

### Complexity Analysis:
- **Time Complexity:** **O(N)** — Where N is the total number of characters in the `title` string. Converting to lowercase, splitting, iterating through characters, and joining the strings all take linear time proportional to the string length.
- **Space Complexity:** **O(N)** — We create an array of split words, separate character arrays, and a final reassembled string, which requires auxiliary space scaling linearly with the size of the input.


<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= title.length &lt;= 100</code></li>
	<li><code>title</code> consists of words separated by a single space without any leading or trailing spaces.</li>
	<li>Each word consists of uppercase and lowercase English letters and is <strong>non-empty</strong>.</li>
</ul>
