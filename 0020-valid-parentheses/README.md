<h2><a href="https://leetcode.com/problems/valid-parentheses">20. Valid Parentheses</a></h2><h3>Easy</h3><hr><p>Given a string <code>s</code> containing just the characters <code>&#39;(&#39;</code>, <code>&#39;)&#39;</code>, <code>&#39;{&#39;</code>, <code>&#39;}&#39;</code>, <code>&#39;[&#39;</code> and <code>&#39;]&#39;</code>, determine if the input string is valid.</p>

<p>An input string is valid if:</p>

<ol>
	<li>Open brackets must be closed by the same type of brackets.</li>
	<li>Open brackets must be closed in the correct order.</li>
	<li>Every close bracket has a corresponding open bracket of the same type.</li>
</ol>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;()&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;()[]{}&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;(]&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">false</span></p>
</div>

<p><strong class="example">Example 4:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;([])&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>
</div>

<p><strong class="example">Example 5:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;([)]&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">false</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
	<li><code>s</code> consists of parentheses only <code>&#39;()[]{}&#39;</code>.</li>
</ul>


# LeetCode #20 - Valid Parentheses

<details>
<summary><b>Click to View Logic & Step-by-Step Explanation</b></summary>

<br>

## 🧠 Logic
The core logic relies on the **LIFO (Last-In, First-Out)** property of a **Stack**. 
Since the last bracket opened must be the first one closed, a stack allows us to store "expectations." When we see an opening bracket, we push it; when we see a closing bracket, we check if it matches the most recent opening bracket (the top of the stack).

---

## 🛠️ Execution Steps (Dry Run)
Target String: `s = "{[]}"`



<table border="1">
  <tr>
    <th>Step</th>
    <th>Char</th>
    <th>Action</th>
    <th>Stack State</th>
    <th>Reasoning</th>
  </tr>
  <tr>
    <td>1</td>
    <td><code>{</code></td>
    <td>Push</td>
    <td><code>['{']</code></td>
    <td>Opening bracket, store it.</td>
  </tr>
  <tr>
    <td>2</td>
    <td><code>[</code></td>
    <td>Push</td>
    <td><code>['{', '[']</code></td>
    <td>Opening bracket, store on top.</td>
  </tr>
  <tr>
    <td>3</td>
    <td><code>]</code></td>
    <td>Pop & Match</td>
    <td><code>['{']</code></td>
    <td>Matches the top <code>[</code>. Valid.</td>
  </tr>
  <tr>
    <td>4</td>
    <td><code>}</code></td>
    <td>Pop & Match</td>
    <td><code>[]</code></td>
    <td>Matches the top <code>{</code>. Valid.</td>
  </tr>
</table>

**Final Check:** If the stack is empty after the loop, return `true`.

---

## 📊 Complexity Analysis

<ul>
  <li><b>Time Complexity:</b> <code>O(n)</code>
    <br>We traverse the string exactly once. Each character is pushed and popped at most once.
  </li>
  <li><b>Space Complexity:</b> <code>O(n)</code>
    <br>In the worst case (e.g., <code>"((((("</code>), we store all <code>n</code> characters in the stack.
  </li>
</ul>

---

## 💡 Key Edge Cases
<ol>
  <li><b>Empty Stack on Closing:</b> If we see <code>)</code> but the stack is empty, it's invalid.</li>
  <li><b>Mismatch:</b> If we pop <code>(</code> but the current char is <code>]</code>, it's invalid.</li>
  <li><b>Remaining Stack:</b> If the loop ends and the stack isn't empty (e.g., <code>s = "("</code>), it's invalid.</li>
</ol>

</details>
