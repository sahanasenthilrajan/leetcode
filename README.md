# My leetcode journey
<!---LeetCode Topics Start-->
# LeetCode topics
## Array
## string 
|  |
| ------- |
| [0001-two-sum](https://github.com/sahanasenthilrajan/leetcode/tree/master/0001-two-sum) |
| [3512-minimum-operations-to-make-array-sum-divisible-by-k](https://github.com/sahanasenthilrajan/leetcode/tree/master/3512-minimum-operations-to-make-array-sum-divisible-by-k) |
🎯 LeetCode #3512: Make Array Sum Divisible by K

Mathematical insight beats complex logic - A remainder-based solution in O(n) time.


📌 Problem
Reduce array elements by 1 (any number of times) to make sum divisible by k. Find minimum operations.

💡 Key Insight
Each operation reduces sum by 1
Answer = sum % k

✅ Solution
javaclass Solution {
    public int minOperations(int[] nums, int k) {
        long sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return (int)(sum % k);
    }
}
```

**Time:** O(n) | **Space:** O(1)

---

## 🐛 Common Mistakes Fixed

| ❌ Wrong | ✅ Correct |
|---------|----------|
| `i <= nums.length` | `i < nums.length` |
| `sum += i` | `sum += nums[i]` |
| `int sum` | `long sum` |

---

## 🧪 Test Cases
```
[1,2,3,4], k=5 → 0 (sum=10, already divisible)
[3,7,9], k=6   → 1 (sum=19, need 1 operation)
[10], k=3      → 1 (sum=10, need 1 operation)

🎓 Pattern
Modular Arithmetic + Greedy - Don't overthink which elements to reduce, just calculate the remainder!
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/sahanasenthilrajan/leetcode/tree/master/0001-two-sum) |
## Math
|  |
| ------- |
| [3512-minimum-operations-to-make-array-sum-divisible-by-k](https://github.com/sahanasenthilrajan/leetcode/tree/master/3512-minimum-operations-to-make-array-sum-divisible-by-k) |
<!---LeetCode Topics End-->
