## 74. Search a 2D Matrix | Link <a href="https://leetcode.com/problems/search-a-2d-matrix/"><img src="https://leetcode.com/_next/static/images/logo-dark-c96c407d175e36c81e236fcfdd682a0b.png" alt="LeetCode Logo" width="18"> </a>


### Approach: Binary Search

 > We will use the binary search algorithm to efficiently find the target element in the 2D matrix. 
####  Why?
 > The binary search approach is applicable because the rows are sorted, and each row's first element is greater than the last element of the previous row.

####  How?

#####  Mapping Midpoint to Matrix Indices

> To access the element at position (i, j) in the matrix, we need to map the midpoint back to the matrix indices i and j.

> This is done using the division and modulo operations: i = mid / n and j = mid % n, where n is the number of columns in the matrix.

#####  Then the only thing left is  Comparison

- If the element at position (i, j) is equal to the target, then the target is found, and the function returns true.
- If the element at position (i, j) is less than the target, the target must be in the right half of the search space. So, the left pointer l is updated to mid + 1.
- If the element at position (i, j) is greater than the target, the target must be in the left half of the search space. So, the right pointer r is updated to mid.
