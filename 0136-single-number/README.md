<h2><a href="https://leetcode.com/problems/single-number">136. Single Number</a></h2><h3>Easy</h3><hr><p>Given a <strong>non-empty</strong>&nbsp;array of integers <code>nums</code>, every element appears <em>twice</em> except for one. Find that single one.</p>

<p>You must&nbsp;implement a solution with a linear runtime complexity and use&nbsp;only constant&nbsp;extra space.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [2,2,1]</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [4,1,2,1,2]</span></p>

<p><strong>Output:</strong> <span class="example-io">4</span></p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [1]</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 3 * 10<sup>4</sup></code></li>
	<li><code>-3 * 10<sup>4</sup> &lt;= nums[i] &lt;= 3 * 10<sup>4</sup></code></li>
	<li>Each element in the array appears twice except for one element which appears only once.</li>
</ul>
Complexity Analysis
Time Complexity: $O(N)$ — We iterate through the array exactly once.
Space Complexity: $O(1)$ — We only use one variable (ans) to store the result, regardless of the array size.


The Logic: Bitwise XOR ($\oplus$)The most elegant way to solve this problem with $O(N)$ time and $O(1)$ space is using the XOR operation. XOR follows these specific rules that are perfect for this scenario:Identity: $a \oplus 0 = a$Self-Cancellation: $a \oplus a = 0$ (This is the key!)Commutative: The order doesn't matter ($a \oplus b \oplus a$ is the same as $a \oplus a \oplus b$).How it works:Since every number appears exactly twice except for one, if you XOR all the numbers together, the matching pairs will "cancel" each other out (becoming 0), leaving only the single number remaining.
