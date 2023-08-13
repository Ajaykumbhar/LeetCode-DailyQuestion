
### 2369. Check if There is a Valid Partition For The Array | Link <a href="https://leetcode.com/problems/check-if-there-is-a-valid-partition-for-the-array/"><img src="https://leetcode.com/_next/static/images/logo-dark-c96c407d175e36c81e236fcfdd682a0b.png" alt="LeetCode Logo" width="18"> </a>


### Approach: DP
  
#### What? 

- From the problem statement we can tell that it requires making decisions at each step based on the previous steps' results, DP might be a suitable approach.

#### Why?

- At each step (index) is influenced by whether valid partitions could be formed for previous indices.

      For instance, whether a partition of 2 elements or a partition of 3 elements could be formed before the current index.
  
      This implies that in order to determine whether there's a valid partition at index i, we need information about valid
      partitions at indices less than i

##### The time complexity of this algorithm is O(log n), where `n` is the number of elements in the array.

#### How? 

- Create a boolean array dp of length n + 1, where n is the length of the input array.
- Initialize dp[0] as true because an empty array is always considered a valid partition.
- Initialize dp[2] as true only if the first two elements of the array are equal. This is because a partition of two equal elements is valid.
Iterative Process:

- Iterate from index 3 to n, filling in the dp array for each index.

  `Updating dp[i] for index i:`

- The main idea is to check whether we can extend a valid partition from a previous index to the current index while satisfying the given conditions.

  `dp[i - 2] && nums[i - 2] == nums[i - 1]:`
  
- This condition checks if the current element can be added to a partition of two equal elements. If `dp[i - 2]` is true (meaning there's a valid partition for the first i - 2 elements) and the last two elements are equal, then the current array with the added element forms a valid partition.

  `Conditions involving dp[i - 3]:`
  
- These conditions check if the last three elements of the array can form a valid partition according to the three conditions specified in the problem statement. If any of these conditions hold true and `dp[i - 3]` is true, then the current array with the added element forms a valid partition.

      - The final answer is the value of `dp[n]`, which indicates whether there's a valid partition for the entire array
        of length n.
