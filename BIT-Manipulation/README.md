# Bit Manipulation Guide and Practice Questions

Welcome to the **Bit Manipulation Guide and Practice Questions** repository! This repository provides a comprehensive guide to understanding bit manipulation in Data Structures and Algorithms (DSA). It includes detailed explanations of all key bit manipulation concepts along with practice problems to help solidify your understanding.

## 📋 Table of Contents

1. [Overview](#overview)
2. [Concepts](#concepts)
   - Bitwise Operators
   - Common Tricks
   - Masking and Clearing Bits
   - Applications
3. [Practice Questions](#practice-questions)
   - Bitwise Operators
   - Counting Set Bits
   - Power of Two
4. [Contributing](#contributing)
5. [License](#license)

---

## 📖 Overview

Bit manipulation is an important concept in DSA that involves operating directly on individual bits of numbers. Mastery of bit manipulation can lead to more optimized solutions for many algorithmic problems. This guide covers all necessary bit manipulation concepts, along with their practical use cases.

We also provide links to relevant LeetCode and GeeksforGeeks problems to help you practice and apply these concepts.

---

## ✨ Concepts

### 1. Bitwise Operators

Bitwise operators work directly on bits of integers and are commonly used in optimization problems. Here are the most used bitwise operators:

- **AND (`&`)**: Bitwise AND compares corresponding bits of two numbers and returns `1` if both bits are `1`, otherwise returns `0`.  
  - [Study Bitwise AND Operator](https://www.geeksforgeeks.org/bitwise-and-or-xor-not-operators-in-c/)
  
- **OR (`|`)**: Bitwise OR compares corresponding bits and returns `1` if at least one bit is `1`.  
  - [Study Bitwise OR Operator](https://www.geeksforgeeks.org/bitwise-and-or-xor-not-operators-in-c/)
  
- **NOT (`~`)**: Bitwise NOT flips the bits of a number, converting `1` to `0` and vice versa.  
  - [Study Bitwise NOT Operator](https://www.geeksforgeeks.org/bitwise-and-or-xor-not-operators-in-c/)
  
- **XOR (`^`)**: Bitwise XOR returns `1` if the bits are different, otherwise returns `0`.  
  - [Study Bitwise XOR Operator](https://www.geeksforgeeks.org/bitwise-and-or-xor-not-operators-in-c/)
  
- **Left Shift (`<<`)**: Shifts bits to the left, effectively multiplying the number by powers of 2.  
  - [Study Left Shift Operator](https://www.geeksforgeeks.org/left-shift-right-shift-operators-c-cpp/)
  
- **Right Shift (`>>`)**: Shifts bits to the right, dividing the number by powers of 2.  
  - [Study Right Shift Operator](https://www.geeksforgeeks.org/left-shift-right-shift-operators-c-cpp/)

---

### 2. Common Bit Manipulation Tricks

- **Check if a Number is Even or Odd**: Use `n & 1` to determine if a number is even (`0`) or odd (`1`).  
  - [Study Even or Odd](https://www.geeksforgeeks.org/program-to-find-whether-a-given-number-is-odd-or-even/)
  
- **Swap Two Numbers Without Temporary Variable**: Use XOR to swap numbers efficiently.  
  - [Study XOR Swap](https://www.geeksforgeeks.org/swap-two-numbers-without-using-temporary-variable/)
  
- **Count Set Bits**: Count the number of `1`s in a binary representation using algorithms like Brian Kernighan’s method.  
  - [Study Count Set Bits](https://www.geeksforgeeks.org/count-set-bits-in-an-integer/)
  
- **Check if a Number is Power of 2**: A number is a power of 2 if `(n & (n - 1)) == 0`.  
  - [Study Power of Two Check](https://www.geeksforgeeks.org/program-to-find-whether-a-no-is-power-of-two/)

---

### 3. Masking and Clearing Bits

- **Set the ith Bit**: `n = n | (1 << i)`  
  - [Set ith Bit](https://www.geeksforgeeks.org/set-clear-and-toggle-a-given-bit-of-a-number-in-c/)
  
- **Clear the ith Bit**: `n = n & ~(1 << i)`  
  - [Clear ith Bit](https://www.geeksforgeeks.org/set-clear-and-toggle-a-given-bit-of-a-number-in-c/)
  
- **Toggle the ith Bit**: `n = n ^ (1 << i)`  
  - [Toggle ith Bit](https://www.geeksforgeeks.org/set-clear-and-toggle-a-given-bit-of-a-number-in-c/)

---

### 4. Applications of Bit Manipulation

- **Find the Single Number in an Array**: Use XOR to find a unique number in an array of duplicates.  
  - [Study Single Number Problem](https://leetcode.com/problems/single-number/)
  
- **Reverse Bits of a Number**: Reverse the bits in a binary representation.  
  - [Study Reverse Bits Problem](https://leetcode.com/problems/reverse-bits/)
  
- **Find the ith Bit of a Number**: Extract the ith bit of a number using the formula `(n >> i) & 1`.  
  - [Study Find ith Bit](https://www.geeksforgeeks.org/find-the-number-of-set-bits-at-even-positions/)

- **Bitmask Dynamic Programming (DP)**: Solve problems using bitmasking to represent states or subsets.  
  - [Study Bitmask DP](https://www.geeksforgeeks.org/bitmasking-and-dynamic-programming-set-1-count-ways-to-assign-unique-cap-to-every-person/)

---

## 📝 Practice Questions

### 1. Bitwise Operators
- [Single Number - LeetCode](https://leetcode.com/problems/single-number/)
- [Bit Difference - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/bit-difference/0)

### 2. Counting Set Bits
- [Number of 1 Bits - LeetCode](https://leetcode.com/problems/number-of-1-bits/)
- [Count Set Bits - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/set-bits/0)

### 3. Power of Two
- [Power of Two - LeetCode](https://leetcode.com/problems/power-of-two/)
- [Power of 2 - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1)

---

## 🤝 Contributing

Contributions are welcome! If you have any suggestions, improvements, or additional questions that you think would be helpful for this guide, feel free to open an issue or submit a pull request. All contributions will be reviewed, and feedback will be provided.

---


Happy Coding! 🚀

