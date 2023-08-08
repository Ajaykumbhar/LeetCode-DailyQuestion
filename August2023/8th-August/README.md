## 33. Search in Rotated Sorted Array | Link <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/"><img src="https://leetcode.com/_next/static/images/logo-dark-c96c407d175e36c81e236fcfdd682a0b.png" alt="LeetCode Logo" width="18"> </a>

**Approach: Modified Binary Search**

1. **Problem Overview**: The problem provides an integer array `nums` sorted in ascending order (with distinct values), but the array might have been rotated at an unknown pivot index `k`. The task is to find the index of a given target element in the rotated sorted array `nums`. If the target is not present in the array, the algorithm should return `-1`.

2. **Binary Search**: The algorithm uses a modified version of the binary search algorithm to efficiently find the target element's index in the rotated sorted array. The binary search approach is appropriate here because it allows the algorithm to narrow down the search space in each iteration.

3. **Binary Search Loop**: The algorithm starts with two pointers, `str` and `end`, which initially point to the start and end of the array, respectively. It enters a loop that continues as long as the `str` pointer is less than or equal to the `end` pointer. This loop represents the binary search process.

4. **Calculate Midpoint**: In each iteration of the loop, the algorithm calculates the midpoint `mid` between the `str` and `end` pointers. The midpoint `mid` is calculated as `(str + end) / 2`.

5. **Check if Target Found**: The algorithm checks if the element at index `mid` is equal to the target. If it is, the target is found, and the function returns `mid`, which represents the index of the target element in the array.

6. **Comparison of Midpoint and Boundaries**: The algorithm performs a comparison of the elements at indices `str` and `mid` to determine which half of the array might be sorted.

   - If `nums[str] <= nums[mid]`, it means that the left half of the array (`str` to `mid`) is sorted in ascending order.

     - If the target is greater than or equal to `nums[str]` and less than `nums[mid]`, it must be in the left half of the array. So, the `end` pointer is updated to `mid - 1` to narrow down the search space to the left half.
     - Otherwise, the target must be in the right half of the array. So, the `str` pointer is updated to `mid + 1` to narrow down the search space to the right half.

   - If `nums[str] > nums[mid]`, it means that the right half of the array (`mid` to `end`) is sorted in ascending order.

     - If the target is greater than `nums[mid]` and less than or equal to `nums[end]`, it must be in the right half of the array. So, the `str` pointer is updated to `mid + 1` to narrow down the search space to the right half.
     - Otherwise, the target must be in the left half of the array. So, the `end` pointer is updated to `mid - 1` to narrow down the search space to the left half.

7. **Final Result**: If the loop exits without finding the target, the function returns `-1`, indicating that the target does not exist in the array.

The modified binary search algorithm efficiently narrows down the search space in each iteration, allowing for quick identification of the target element's index in the rotated sorted array. The time complexity of this algorithm is O(log n), where `n` is the number of elements in the array, which meets the requirement of O(log n) runtime complexity.