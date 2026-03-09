<h2><a href="https://leetcode.com/problems/array-partition">561. Array Partition</a></h2><h3>Easy</h3><hr><p>Given an integer array <code>nums</code> of <code>2n</code> integers, group these integers into <code>n</code> pairs <code>(a<sub>1</sub>, b<sub>1</sub>), (a<sub>2</sub>, b<sub>2</sub>), ..., (a<sub>n</sub>, b<sub>n</sub>)</code> such that the sum of <code>min(a<sub>i</sub>, b<sub>i</sub>)</code> for all <code>i</code> is <strong>maximized</strong>. Return<em> the maximized sum</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,4,3,2]
<strong>Output:</strong> 4
<strong>Explanation:</strong> All possible pairings (ignoring the ordering of elements) are:
1. (1, 4), (2, 3) -&gt; min(1, 4) + min(2, 3) = 1 + 2 = 3
2. (1, 3), (2, 4) -&gt; min(1, 3) + min(2, 4) = 1 + 2 = 3
3. (1, 2), (3, 4) -&gt; min(1, 2) + min(3, 4) = 1 + 3 = 4
So the maximum possible sum is 4.</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [6,2,6,5,1,2]
<strong>Output:</strong> 9
<strong>Explanation:</strong> The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 10<sup>4</sup></code></li>
	<li><code>nums.length == 2 * n</code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LeetCode 561 - Array Partition README</title>
    <style>
        body { font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Helvetica, Arial, sans-serif; line-height: 1.6; color: #24292e; max-width: 900px; margin: 20px auto; padding: 20px; }
        h1 { border-bottom: 1px solid #eaecef; padding-bottom: 0.3em; }
        h2 { border-bottom: 1px solid #eaecef; padding-bottom: 0.3em; margin-top: 24px; }
        h3 { margin-top: 20px; }
        code { background-color: rgba(27,31,35,0.05); border-radius: 3px; padding: 0.2em 0.4em; font-family: "SFMono-Regular", Consolas, "Liberation Mono", Menlo, monospace; font-size: 85%; }
        pre { background-color: #f6f8fa; border-radius: 3px; padding: 16px; overflow: auto; line-height: 1.45; }
        .step { margin-bottom: 20px; border-left: 4px solid #3498db; padding-left: 15px; }
        .complexity { background-color: #fffbdd; border: 1px solid #d1d5da; padding: 10px; border-radius: 6px; }
        .formula { font-style: italic; color: #0366d6; font-weight: bold; }
        img-placeholder { display: block; background: #e1e4e8; color: #586069; padding: 20px; text-align: center; border-radius: 6px; margin: 10px 0; font-style: italic; }
    </style>
</head>
<body>

    <h1>Array Partition (LeetCode 561)</h1>

    <h2>📝 Description</h2>
    <p>Given an integer array <code>nums</code> of <code>2n</code> integers, group these integers into <code>n</code> pairs <code>(a₁, b₁), (a₂, b₂), ..., (aₙ, bₙ)</code> such that the sum of <code>min(aᵢ, bᵢ)</code> for all <code>i</code> is <strong>maximized</strong>. Return the maximized sum.</p>

    <hr>

    <h2>💡 Algorithm Logic Step-by-Step</h2>

    <div class="step">
        <h3>1. The "Loss" Constraint</h3>
        <p>In any pair <code>(a, b)</code>, the <code>min(a, b)</code> function selects the smaller value. This means the larger value in the pair is effectively "lost" and does not contribute to the final sum. To maximize the total, we must pair numbers that are numerically close to each other to minimize the value we lose.</p>
    </div>

    <div class="step">
        <h3>2. Sorting for Proximity</h3>
        <p>By sorting the array in ascending order, we ensure that every element is adjacent to its closest neighbors. This is a <strong>Greedy Approach</strong>: pairing the smallest available numbers together preserves the larger numbers to be paired with each other later.</p>
        
    </div>

    <div class="step">
        <h3>3. Pairing Adjacent Elements</h3>
        <p>Once sorted, we group elements into pairs: <code>(nums[0], nums[1]), (nums[2], nums[3]), ...</code>. In a sorted array, <code>nums[i] ≤ nums[i+1]</code>, so the minimum of any adjacent pair is always the element at the even index.</p>
    </div>

    <div class="step">
        <h3>4. Extracting and Summing Values</h3>
        <p>Instead of manually calling a <code>min()</code> function, we simply iterate through the array with a <strong>step of 2</strong> (index 0, 2, 4...) and accumulate those values.</p>
        
    </div>

    <div class="step">
        <h3>5. Final Calculation</h3>
        <p>The maximized sum is the total of all elements at even positions:</p>
        <p class="formula">Maximized Sum = Σ nums[2i] for i = 0 to n-1</p>
    </div>

    <h2>🚀 Java Implementation</h2>
<pre><code>import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        // Step 1: Sort the array - O(n log n)
        Arrays.sort(nums);
        
        int maxSum = 0;
        
        // Step 2: Sum elements at even indices - O(n)
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }
        
        return maxSum;
    }
}</code></pre>

    <h2>📊 Complexity Analysis</h2>
    <div class="complexity">
        <ul>
            <li><strong>Time Complexity:</strong> <code>O(n log n)</code> — The algorithm is dominated by the <code>Arrays.sort()</code> method. The summation loop only takes <code>O(n)</code>.</li>
            <li><strong>Space Complexity:</strong> <code>O(log n)</code> — This accounts for the stack space used by Java's internal Quicksort implementation.</li>
        </ul>
    </div>

</body>
</html>



