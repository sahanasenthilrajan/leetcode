<h2><a href="https://leetcode.com/problems/richest-customer-wealth">1791. Richest Customer Wealth</a></h2><h3>Easy</h3><hr><p>You are given an <code>m x n</code> integer grid <code>accounts</code> where <code>accounts[i][j]</code> is the amount of money the <code>i​​​​​<sup>​​​​​​th</sup>​​​​</code> customer has in the <code>j​​​​​<sup>​​​​​​th</sup></code>​​​​ bank. Return<em> the <strong>wealth</strong> that the richest customer has.</em></p>

<p>A customer&#39;s <strong>wealth</strong> is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum <strong>wealth</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> accounts = [[1,2,3],[3,2,1]]
<strong>Output:</strong> 6
<strong>Explanation</strong><strong>:</strong>
<code>1st customer has wealth = 1 + 2 + 3 = 6
</code><code>2nd customer has wealth = 3 + 2 + 1 = 6
</code>Both customers are considered the richest with a wealth of 6 each, so return 6.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> accounts = [[1,5],[7,3],[3,5]]
<strong>Output:</strong> 10
<strong>Explanation</strong>: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> accounts = [[2,8,7],[7,1,3],[1,9,5]]
<strong>Output:</strong> 17
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>m ==&nbsp;accounts.length</code></li>
	<li><code>n ==&nbsp;accounts[i].length</code></li>
	<li><code>1 &lt;= m, n &lt;= 50</code></li>
	<li><code>1 &lt;= accounts[i][j] &lt;= 100</code></li>
</ul>
💡 IntuitionThe problem asks us to find the customer with the maximum total wealth.
The input is a 2D grid where:Rows represent different customers.
Columns represent the bank accounts belonging to that customer.
To solve this, we need to iterate through each customer (row), sum up all their accounts (columns), and keep track of the highest sum encountered.
This is effectively a "maximum of sums" problem.🚀 ApproachInitialize Max Wealth: Create a variable max initialized to a very small value (or 0) to store the highest wealth found so far.
Iterate Through Customers: Use an outer loop to traverse through each row of the accounts matrix.Calculate Current Wealth: inside the outer loop:Initialize a rowsum variable to 0.Use an inner loop to traverse the columns (accounts) for the current customer, adding each value to rowsum.Update Maximum: After summing a customer's accounts, compare their rowsum with the current max. If rowsum is greater, update max.Return Result: After checking all customers, return max.⏱️ Complexity Analysis
Time Complexity: $O(m \times n)$We traverse every element in the grid exactly once, where $m$ is the number of customers (rows) and $n$ is the number of accounts (columns).
Space Complexity: $O(1)$We only use a few variables (max, rowsum, i, j) for storage, regardless of the input size. No extra data structures are used.






yt->https://youtu.be/xGztxT4Pwq8?si=MXFwRZhIjH0swGOt

