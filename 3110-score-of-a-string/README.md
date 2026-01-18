<h2><a href="https://leetcode.com/problems/score-of-a-string">3379. Score of a String</a></h2><h3>Easy</h3><hr><p>You are given a string <code>s</code>. The <strong>score</strong> of a string is defined as the sum of the absolute difference between the <strong>ASCII</strong> values of adjacent characters.</p>

<p>Return the <strong>score</strong> of<em> </em><code>s</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;hello&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">13</span></p>

<p><strong>Explanation:</strong></p>

<p>The <strong>ASCII</strong> values of the characters in <code>s</code> are: <code>&#39;h&#39; = 104</code>, <code>&#39;e&#39; = 101</code>, <code>&#39;l&#39; = 108</code>, <code>&#39;o&#39; = 111</code>. So, the score of <code>s</code> would be <code>|104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;zaz&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">50</span></p>

<p><strong>Explanation:</strong></p>

<p>The <strong>ASCII</strong> values of the characters in <code>s</code> are: <code>&#39;z&#39; = 122</code>, <code>&#39;a&#39; = 97</code>. So, the score of <code>s</code> would be <code>|122 - 97| + |97 - 122| = 25 + 25 = 50</code>.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= s.length &lt;= 100</code></li>
	<li><code>s</code> consists only of lowercase English letters.</li>
</ul>
Tools you need:
1.Loop: A standard for loop to travel through the string.
2.Access: s.charAt(i) to get the character at the current position.
3.Math: Math.abs(value) to ensure the difference is always positive (e.g., $|5 - 10| = 5$).
Drafting the Algorithm:
->Initialize a variable score = 0.
->Start a loop from index i = 0.
->Crucial Step: Run the loop only while i < s.length() - 1.Why? If the string has length 5 (indices 0 to 4), the last pair starts at index 3 (comparing 3 and 4). --->If you try to start at index 4, you will try to compare it with index 5, which doesn't exist!Inside the loop:Get character at i.Get character at i + 1.
->Subtract them and get the absolute value.Add to score.
->Return score.
