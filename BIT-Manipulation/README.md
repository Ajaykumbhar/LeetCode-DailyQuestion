# Bit Manipulation Guide and 50 Practice Questions

This repository is designed to provide a complete guide to bit manipulation, covering all essential concepts and offering a rich set of practice questions. Bit manipulation is a fundamental skill in Data Structures and Algorithms (DSA) and is often used to optimize problem-solving by performing low-level operations on binary representations.

## 📋 Table of Contents

1. [Overview](#overview)
2. [Comprehensive Bit Manipulation Concepts](#comprehensive-bit-manipulation-concepts)
   - Bitwise Operators
   - Common Bit Manipulation Tricks
   - Masking and Clearing Bits
   - Applications
   - Advanced Bit Manipulation Techniques
   - Number Theory and Bit Manipulation
3. [50 Practice Questions](#50-practice-questions)
   - Easy Questions
   - Medium Questions
   - Hard Questions
4. [Contributing](#contributing)
5. [License](#license)

---

## 📖 Overview

Bit manipulation allows for efficient computation by working directly with bits of numbers. It is especially useful for optimizing space and time complexity in algorithmic problems. This guide covers all essential bit manipulation concepts, tricks, and applications, accompanied by 50 carefully curated practice questions from LeetCode and GeeksforGeeks.

---

## ✨ Comprehensive Bit Manipulation Concepts

### 1. Bitwise Operators

- **AND (`&`)**: Compares each bit of two numbers and returns `1` only when both bits are `1`.
  - [Study Link](https://www.geeksforgeeks.org/bitwise-and-or-xor-not-operators-in-c/)

- **OR (`|`)**: Compares each bit and returns `1` if at least one of the bits is `1`.
  - [Study Link](https://www.geeksforgeeks.org/bitwise-and-or-xor-not-operators-in-c/)

- **NOT (`~`)**: Flips the bits of a number (`1` becomes `0` and `0` becomes `1`).
  - [Study Link](https://www.geeksforgeeks.org/bitwise-and-or-xor-not-operators-in-c/)

- **XOR (`^`)**: Returns `1` if the bits are different, otherwise returns `0`.
  - [Study Link](https://www.geeksforgeeks.org/bitwise-and-or-xor-not-operators-in-c/)

- **Left Shift (`<<`)**: Shifts bits to the left by a certain number of positions, effectively multiplying the number by powers of 2.
  - [Study Link](https://www.geeksforgeeks.org/left-shift-right-shift-operators-c-cpp/)

- **Right Shift (`>>`)**: Shifts bits to the right by a certain number of positions, effectively dividing the number by powers of 2.
  - [Study Link](https://www.geeksforgeeks.org/left-shift-right-shift-operators-c-cpp/)

---

### 2. Common Bit Manipulation Tricks

- **Check if Number is Even or Odd**: Use `n & 1` to determine if a number is odd or even.
  - [Study Link](https://www.geeksforgeeks.org/program-to-find-whether-a-given-number-is-odd-or-even/)

- **Swap Two Numbers Without Temporary Variable**: Use XOR to swap numbers.
  - [Study Link](https://www.geeksforgeeks.org/swap-two-numbers-without-using-temporary-variable/)

- **Count Set Bits**: Count the number of `1`s in a binary representation using Kernighan's algorithm.
  - [Study Link](https://www.geeksforgeeks.org/count-set-bits-in-an-integer/)

- **Check if a Number is Power of 2**: A number is a power of 2 if `n & (n - 1) == 0`.
  - [Study Link](https://www.geeksforgeeks.org/program-to-find-whether-a-no-is-power-of-two/)

- **Clear the Lowest Set Bit**: Use `n & (n - 1)` to clear the lowest set bit.
  - [Study Link](https://www.geeksforgeeks.org/clear-the-lowest-set-bit/)

- **Find the Rightmost Different Bit**: `x ^ y` can be used to find the rightmost different bit between two numbers.
  - [Study Link](https://www.geeksforgeeks.org/rightmost-different-bit/)

---

### 3. Masking and Clearing Bits

- **Set ith Bit**: Set the ith bit using `n = n | (1 << i)`.
  - [Study Link](https://www.geeksforgeeks.org/set-clear-and-toggle-a-given-bit-of-a-number-in-c/)

- **Clear ith Bit**: Clear the ith bit using `n = n & ~(1 << i)`.
  - [Study Link](https://www.geeksforgeeks.org/set-clear-and-toggle-a-given-bit-of-a-number-in-c/)

- **Toggle ith Bit**: Toggle the ith bit using `n = n ^ (1 << i)`.
  - [Study Link](https://www.geeksforgeeks.org/set-clear-and-toggle-a-given-bit-of-a-number-in-c/)

- **Check ith Bit**: Check the ith bit using `(n >> i) & 1`.
  - [Study Link](https://www.geeksforgeeks.org/check-whether-k-th-bit-set-not/)

---

### 4. Applications

- **Find Single Number in Array**: Use XOR to find the unique number in an array of duplicates.
  - [LeetCode Problem](https://leetcode.com/problems/single-number/)

- **Reverse Bits**: Reverse the bits in a binary representation of a number.
  - [LeetCode Problem](https://leetcode.com/problems/reverse-bits/)

- **Bitmasking for Subsets**: Use bitmasking to generate subsets of a set or solve problems involving state space optimization.
  - [Study Link](https://www.geeksforgeeks.org/bit-manipulation-to-generate-all-possible-subsets/)

- **Find Missing Number**: XOR all numbers from 1 to n and the array to find the missing number.
  - [LeetCode Problem](https://leetcode.com/problems/missing-number/)

---

### 5. Advanced Bit Manipulation Techniques

- **Gray Code**: Generate Gray Code sequences using bit manipulation.
  - [LeetCode Problem](https://leetcode.com/problems/gray-code/)

- **Hamming Distance**: Calculate the number of differing bits between two numbers.
  - [LeetCode Problem](https://leetcode.com/problems/hamming-distance/)

- **Divide and Multiply Using Bitwise Operators**: Multiply and divide numbers using shifts instead of arithmetic operations.
  - [Study Link](https://www.geeksforgeeks.org/divide-two-integers-without-using-multiplication-division-mod-operator/)

- **Modulo Power of Two**: Calculate modulo with a power of 2 using `n & (m - 1)` where `m` is a power of 2.
  - [Study Link](https://www.geeksforgeeks.org/find-modulus-power-2-number/)

---

### 6. Number Theory and Bit Manipulation

- **Find GCD Using Bitwise Operations**: Use binary GCD algorithms to find the greatest common divisor.
  - [Study Link](https://www.geeksforgeeks.org/binary-gcd-algorithm/)

- **Count Trailing Zeros**: Use `n & -n` to isolate the lowest set bit and count trailing zeros.
  - [Study Link](https://www.geeksforgeeks.org/count-trailing-zeroes-binary-number/)

- **Fast Exponentiation Using Bitwise Operations**: Efficiently calculate power using bitwise operations.
  - [Study Link](https://www.geeksforgeeks.org/exponentiation-using-bitwise-operators/)

---

## 📝 50 Practice Questions

### Easy Questions

1. [Single Number - LeetCode](https://leetcode.com/problems/single-number/)
    - **Concepts Covered**: XOR to find the unique element in an array where every other element appears twice.

2. [Number of 1 Bits - LeetCode](https://leetcode.com/problems/number-of-1-bits/)
    - **Concepts Covered**: Counting set bits (1s) in the binary representation of a number.

3. [Power of Two - LeetCode](https://leetcode.com/problems/power-of-two/)
    - **Concepts Covered**: Checking if a number is a power of two using bitwise operations.

4. [Bit Difference - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/bit-difference/0)
    - **Concepts Covered**: Counting differing bits between two numbers.

5. [Hamming Distance - LeetCode](https://leetcode.com/problems/hamming-distance/)
    - **Concepts Covered**: Finding the Hamming distance (number of differing bits) between two integers.

6. [Binary Watch - LeetCode](https://leetcode.com/problems/binary-watch/)
    - **Concepts Covered**: Bitwise representation of time on a binary clock, counting set bits to generate valid times.

7. [Counting Bits - LeetCode](https://leetcode.com/problems/counting-bits/)
    - **Concepts Covered**: Efficient computation of the number of 1 bits for all numbers from 0 to n.

8. [Reverse Bits - LeetCode](https://leetcode.com/problems/reverse-bits/)
    - **Concepts Covered**: Reversing the bits of a 32-bit unsigned integer.

9. [Find the Duplicate Number - LeetCode](https://leetcode.com/problems/find-the-duplicate-number/)
    - **Concepts Covered**: Cycle detection using bitwise operations to find a duplicate element in an array.

10. [Complement of Base 10 Integer - LeetCode](https://leetcode.com/problems/complement-of-base-10-integer/)
    - **Concepts Covered**: Finding the binary complement of a base-10 integer using bitwise NOT and masks.

---

### Medium Questions

11. [Missing Number - LeetCode](https://leetcode.com/problems/missing-number/)
    - **Concepts Covered**: Using XOR to find the missing number in an array of integers from 0 to n.

12. [XOR Queries of a Subarray - LeetCode](https://leetcode.com/problems/xor-queries-of-a-subarray/)
    - **Concepts Covered**: Prefix XOR and range queries to efficiently find the XOR of subarrays.


13. [Sum of Two Integers - LeetCode](https://leetcode.com/problems/sum-of-two-integers/)
    - **Concepts Covered**: Addition using bitwise operators (without using `+` and `-`).

14. [Binary Number with Alternating Bits - LeetCode](https://leetcode.com/problems/binary-number-with-alternating-bits/)
    - **Concepts Covered**: Binary pattern checking, bitwise shifting.

15. [Total Hamming Distance - LeetCode](https://leetcode.com/problems/total-hamming-distance/)
    - **Concepts Covered**: Hamming distance between integers, counting differing bits.

16. [Single Number II - LeetCode](https://leetcode.com/problems/single-number-ii/)
    - **Concepts Covered**: Using XOR to find non-repeated numbers, bit manipulation tricks.

17. [Gray Code - LeetCode](https://leetcode.com/problems/gray-code/)
    - **Concepts Covered**: Gray code generation using bitwise operations, sequence generation.

18. [Binary Gap - LeetCode](https://leetcode.com/problems/binary-gap/)
    - **Concepts Covered**: Distance between 1s in binary representation, bit counting.

19. [Prime Number of Set Bits in Binary Representation - LeetCode](https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/)
    - **Concepts Covered**: Counting set bits, prime number identification using bitwise operators.

20. [Find XOR of All Numbers from 1 to n - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/xor-of-all-numbers-from-1-to-n)
    - **Concepts Covered**: XOR operations to find cumulative result from 1 to n.

---

### Hard Questions

21. [Maximum XOR of Two Numbers in an Array - LeetCode](https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/)
    - **Concepts Covered**: Finding the maximum XOR pair, Trie data structure for optimization.


22. [Maximum Product of Word Lengths - LeetCode](https://leetcode.com/problems/maximum-product-of-word-lengths/)
23. [Minimum XOR Value Pair - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-xor-value-pair/0)
24. [Sum of Bit Differences Among All Pairs - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-bit-differences-among-all-pairs/0)
25. [Triplets with Bitwise AND Zero - LeetCode](https://leetcode.com/problems/triplets-with-bitwise-and-zero/)
26. [Count Total Set Bits in All Numbers from 1 to N - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-total-set-bits-in-all-numbers-from-1-to-n/0)
27. [Concatenation of Consecutive Binary Numbers - LeetCode](https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/)
28. [Smallest Sufficient Team - LeetCode](https://leetcode.com/problems/smallest-sufficient-team/)
29. [Find Minimum XOR between Two Elements - LeetCode](https://leetcode.com/problems/minimum-xor-between-two-elements-in-an-array/)
30. [Maximum XOR Queries - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-xor-queries/1)

### Advanced Problems
31. [Beautiful Arrangement - LeetCode](https://leetcode.com/problems/beautiful-arrangement/)
32. [XOR Paths in Matrix - LeetCode](https://leetcode.com/problems/xor-paths-in-a-grid/)
33. [Shortest Path Visiting All Nodes - LeetCode](https://leetcode.com/problems/shortest-path-visiting-all-nodes/)
34. [Bitwise AND of Numbers Range - LeetCode](https://leetcode.com/problems/bitwise-and-of-numbers-range/)
35. [Smallest Integer Divisible by K - LeetCode](https://leetcode.com/problems/smallest-integer-divisible-by-k/)
36. [Maximum AND Value - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-and-value/0)
37. [Maximum XOR Subarray - LeetCode](https://leetcode.com/problems/maximum-xor-subarray/)
38. [Maximize the Minimum - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximize-the-minimum/0)
39. [Minimum Flips to Make a OR b Equal to c - LeetCode](https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/)
40. [Find the Longest Subarray XOR - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-subarray-with-xor-value-K/0)

### Challenging Problems
41. [Largest Rectangle in Histogram - LeetCode](https://leetcode.com/problems/largest-rectangle-in-histogram/)
42. [Find XOR from 1 to N Efficiently - LeetCode](https://leetcode.com/problems/xor-operation-in-an-array/)
43. [XOR Subsets Sum - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/xor-subsets-sum/0)
44. [Palindrome Partitioning IV - LeetCode](https://leetcode.com/problems/palindrome-partitioning-iv/)
45. [XOR Maximum Queries - LeetCode](https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/)
46. [Range XOR Queries - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/range-xor-queries/0)
47. [Super Palindromes - LeetCode](https://leetcode.com/problems/super-palindromes/)
48. [Maximum XOR of Two Numbers - LeetCode](https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/)
49. [Count the Number of Valid Words in a String - LeetCode](https://leetcode.com/problems/count-the-number-of-valid-words-in-a-string/)
50. [All Possible Full Binary Trees - LeetCode](https://leetcode.com/problems/all-possible-full-binary-trees/)

---
