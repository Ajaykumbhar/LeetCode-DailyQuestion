## DP-Notes:

### Identifying whether a problem can be solved using dynamic programming (DP):

- Here are some common characteristics and approaches to look for when trying to determine if a problem might have a DP solution:

  #### 1. <u>Optimal Substructure:</u>
  
     - DP problems often involve breaking down a larger problem into smaller subproblems. If the optimal solution to the larger problem can be constructed from optimal solutions to its subproblems, it's a good indicator that DP might be applicable.


  #### 2. **Overlapping Subproblems:**
  
     - Look for patterns where the same subproblems are solved multiple times. If solving these subproblems repeatedly can       be avoided by storing and reusing their solutions, DP is likely a good fit.

  #### 3. **Memoization and Tabulation:**
  
    - DP can be approached using either the top-down approach (memoization) or the bottom-up approach (tabulation). The       problem might lend itself to one of these approaches, which involves storing solutions in a data structure (like an array) to avoid redundant          calculations.


  #### 4. **Counting or Optimization:**
  
  - DP is often used for problems involving counting possibilities, optimizing a value (minimizing or maximizing), or       finding the number of ways to achieve a certain outcome.


  #### 5. **Breaking Down Problem:**
    - If you can break down a problem into smaller subproblems that are related and can help you build the solution for the       larger problem, DP might be a good approach.


  #### 6. **Recursive Structure:**
    - Problems that naturally have a recursive structure, where the solution for a larger instance depends on the solutions         for smaller instances, often suggest a DP approach.


  #### 7. **Memoization Opportunities:**
    - If you notice that you're solving the same problem multiple times or that you're making similar recursive calls,       it's a sign that DP could be beneficial to store and reuse these solutions.


  #### 8. **Combinatorial Problems:**
    - Problems involving combinations, permutations, or ways to arrange or select elements often have DP solutions.


  #### 9. **Pathfinding and Sequences:**
    - Problems related to finding paths, sequences, or arrangements can often be tackled using DP.


  #### 10. **Dependency on Previous Steps:**
    - If the problem requires making decisions at each step based on the previous steps' results, DP might be a           suitable approach.

#### Remember, identifying DP solutions becomes easier with practice. It's helpful to study and solve various DP problems to become familiar with the patterns and techniques commonly used. As you gain experience, you'll develop an intuition for recognizing when DP might be applicable to a problem.

# Dynamic Programming Problems

This repository contains a collection of dynamic programming problems categorized for easy reference.

## Table of Contents

- [Fibonacci Style](#fibonacci-style)
- [Matrix](#matrix)
- [Knapsack](#knapsack)
- [Longest Common Subsequence / Subarray / Substring](#longest-common-subsequence--subarray--substring)
- [Edit Distance / String Matching](#edit-distance--string-matching)
- [Palindrome](#palindrome)
- [Game Theory](#game-theory)
- [Tree / Graph DP](#tree--graph-dp)
- [Sequence](#sequence)
- [Other / Miscellaneous](#other--miscellaneous)

## Problems

### Fibonacci Style

- **Characteristics**: Problems where the solution depends on the sum of previous results. They often involve steps, paths, or sequences.
- **Example Problems**: Climbing Stairs, House Robber, Unique Paths
- **Common Identifiers**:
  - Problems asking for the number of ways to reach a specific state.
  - Problems where each step/state is derived from one or more previous steps/states.

| Problem name                             | Problem Link   |
|------------------------------------------|----------------|
| Climbing Stairs                          | [LeetCode-70](https://leetcode.com/problems/climbing-stairs/description/)  |
| House Robber                             | [LeetCode-198](https://leetcode.com/problems/house-robber/description/) |
| House Robber II                          | [LeetCode-213](https://leetcode.com/problems/house-robber-ii/description/) |
| Unique Paths                             | [LeetCode-62](https://leetcode.com/problems/unique-paths/description/)  |
| Minimum Path Sum                         | [LeetCode-64](https://leetcode.com/problems/minimum-path-sum/description/)  |
| Decode Ways                              | [LeetCode-91](https://leetcode.com/problems/decode-ways/description/)  |
| Unique Paths II                          | [LeetCode-63](https://leetcode.com/problems/unique-paths-ii/description/)  |
| N-th Tribonacci Number                   | [LeetCode-1137](https://leetcode.com/problems/n-th-tribonacci-number/description/)  |

### Matrix

Characteristics: Problems that involve operations on a 2D grid or matrix, where the solution typically involves calculating values based on the values in neighboring cells. These problems often involve paths, sums, or transformations within the matrix.

Example Problems: Unique Paths, Minimum Path Sum, Unique Paths II, Triangle, Minimum Falling Path Sum, Maximal Square

Common Identifiers:

Problems involving finding the number of ways to reach a specific cell in a matrix.
Problems asking for the minimum or maximum path sum from one cell to another.
Problems involving transformations or operations that must be applied to each cell in the matrix.
Problems that require calculating values based on adjacent cells (up, down, left, right, or diagonally).
Example Problems and Links:
| Problem name                             | Problem Link   |
|------------------------------------------|----------------|
| Ninja's Training                          | [Coding Ninja-Ninja’s Training](https://www.naukri.com/code360/problems/ninja-s-training_3621003)  |
| Unique Paths                             | [LeetCode-62](https://leetcode.com/problems/unique-paths/description/)|
| Minimum Path Sum                         | [LeetCode-64](https://leetcode.com/problems/minimum-path-sum/description/)  |
| Unique Paths II                          | [LeetCode-63](https://leetcode.com/problems/unique-paths-ii/description/)  |
| Triangle                                 | [LeetCode-120](https://leetcode.com/problems/triangle/description/)  |
| Minimum Falling Path Sum                 | [LeetCode-931](https://leetcode.com/problems/minimum-falling-path-sum/description/)  |
| Maximal Square                           | [LeetCode-221](https://leetcode.com/problems/maximal-square/description/)  |


### Knapsack

- **Characteristics**: Optimization problems that involve selecting items with given weights and values to maximize/minimize a total value without exceeding a capacity.
- **Example Problems**: Coin Change, Partition Equal Subset Sum, Combination Sum IV
- **Common Identifiers**:
  - Problems involving selecting items from a list to achieve a target value or weight.
  - Problems that involve subsets or partitions of a given set.


| Problem name                             | Problem Link   |
|------------------------------------------|----------------|
| Coin Change                              | [LeetCode-322](https://leetcode.com/problems/coin-change/description/)  |
| Partition Equal Subset Sum               | [LeetCode-416](https://leetcode.com/problems/partition-equal-subset-sum/description/)  |
| Combination Sum IV                       | [LeetCode-377](https://leetcode.com/problems/combination-sum-iv/description/)  |
| Profitable Schemes                       | [LeetCode-879](https://leetcode.com/problems/profitable-schemes/description/)  |
| Partition to K Equal Sum Subsets         | [LeetCode-698](https://leetcode.com/problems/partition-to-k-equal-sum-subsets/description/)  |
| Minimum Cost to Merge Stones             | [LeetCode-1000](https://leetcode.com/problems/minimum-cost-to-merge-stones/description/)  |
| Minimum Cost to Cut a Stick              | [LeetCode-1547](https://leetcode.com/problems/minimum-cost-to-cut-a-stick/description/)  |
| Maximum Profit in Job Scheduling         | [LeetCode-1235](https://leetcode.com/problems/maximum-profit-in-job-scheduling/description/)  |
| Minimum Difficulty of a Job Schedule     | [LeetCode-1335](https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/description/)  |

### Longest Common Subsequence / Subarray / Substring

- **Characteristics**: Problems that require finding the longest sequence or subsequence that satisfies certain conditions in one or more strings/arrays.
- **Example Problems**: Longest Common Subsequence, Longest Palindromic Substring, Maximum Length of Repeated Subarray
- **Common Identifiers**:
  - Problems asking for the longest sequence or subsequence within a given string/array.
  - Problems that involve comparisons between characters or elements in strings/arrays.


| Problem name                             | Problem Link   |
|------------------------------------------|----------------|
| Longest Common Subsequence               | [LeetCode-1143](https://leetcode.com/problems/longest-common-subsequence/description/)  |
| Longest Increasing Subsequence           | [LeetCode-300](https://leetcode.com/problems/longest-increasing-subsequence/description/)  |
| Longest Palindromic Substring            | [LeetCode-5](https://leetcode.com/problems/longest-palindromic-substring/description/)  |
| Maximum Length of Repeated Subarray      | [LeetCode-718](https://leetcode.com/problems/maximum-length-of-repeated-subarray/description/)  |
| Distinct Subsequences                    | [LeetCode-115](https://leetcode.com/problems/distinct-subsequences/description/)  |
| Number of Longest Increasing Subsequence | [LeetCode-673](https://leetcode.com/problems/number-of-longest-increasing-subsequence/description/)  |
| Longest Arithmetic Subsequence of Given Difference | [LeetCode-1218](https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/description/)  |
| Longest Valid Parentheses                | [LeetCode-32](https://leetcode.com/problems/longest-valid-parentheses/description/)  |

### Edit Distance / String Matching

- **Characteristics**: Problems that involve transforming one string into another using a minimum number of operations, or matching patterns within strings.
- **Example Problems**: Edit Distance, Regular Expression Matching, Wildcard Matching
- **Common Identifiers**:
  - Problems involving operations like insertions, deletions, or substitutions on strings.
  - Problems that require matching patterns or sequences within strings.


| Problem name                             | Problem Link   |
|------------------------------------------|----------------|
| Edit Distance                            | [LeetCode-72](https://leetcode.com/problems/edit-distance/description/)  |
| Regular Expression Matching              | [LeetCode-10](https://leetcode.com/problems/regular-expression-matching/description/)  |
| Wildcard Matching                        | [LeetCode-44](https://leetcode.com/problems/wildcard-matching/description/)  |
| Minimum ASCII Delete Sum for Two Strings | [LeetCode-712](https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/description/)  |
| Delete Operation for Two Strings         | [LeetCode-583](https://leetcode.com/problems/delete-operation-for-two-strings/description/)  |

### Palindrome

- **Characteristics**: Problems focused on identifying or modifying palindromic sequences within strings.
- **Example Problems**: Longest Palindromic Substring, Palindrome Partitioning II, Minimum Insertion Steps to Make a String Palindrome
- **Common Identifiers**:
  - Problems that ask about palindromic sequences or substrings.
  - Problems requiring operations to form or identify palindromes.


| Problem name                             | Problem Link   |
|------------------------------------------|----------------|
| Longest Palindromic Substring            | [LeetCode-5](https://leetcode.com/problems/longest-palindromic-substring/description/)  |
| Palindrome Partitioning II               | [LeetCode-132](https://leetcode.com/problems/palindrome-partitioning-ii/description/)  |
| Palindrome Partitioning III              | [LeetCode-1278](https://leetcode.com/problems/palindrome-partitioning-iii/description/)  |
| Minimum Insertion Steps to Make a String Palindrome | [LeetCode-1312](https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/description/)  |

### Game Theory

- **Characteristics**: Problems that involve making optimal moves in competitive scenarios, often modeled as games.
- **Example Problems**: Predict the Winner, Stone Game, Burst Balloons
- **Common Identifiers**:
  - Problems involving two or more players making alternating moves.
  - Problems that ask for the optimal strategy to win or maximize/minimize a score.


| Problem name                             | Problem Link   |
|------------------------------------------|----------------|
| Predict the Winner                       | [LeetCode-486](https://leetcode.com/problems/predict-the-winner/description/)  |
| Stone Game                               | [LeetCode-877](https://leetcode.com/problems/stone-game/description/)  |
| Burst Balloons                           | [LeetCode-312](https://leetcode.com/problems/burst-balloons/description/)  |
| New 21 Game                              | [LeetCode-837](https://leetcode.com/problems/new-21-game/description/)  |
| Soup Servings                            | [LeetCode-808](https://leetcode.com/problems/soup-servings/description/)  |

### Tree / Graph DP

- **Characteristics**: Problems that involve traversing or optimizing paths in trees or graphs.
- **Example Problems**: Binary Tree Maximum Path Sum, Minimum Cost to Connect All Points, Parallel Courses II
- **Common Identifiers**:
  - Problems involving nodes and edges, often with constraints on paths or connections.
  - Problems asking for the shortest, longest, or optimal path in a tree or graph.


| Problem name                             | Problem Link   |
|------------------------------------------|----------------|
| Binary Tree Maximum Path Sum             | [LeetCode-124](https://leetcode.com/problems/binary-tree-maximum-path-sum/description/)  |
| Parallel Courses II                      | [LeetCode-1494](https://leetcode.com/problems/parallel-courses-ii/description/)  |
| Transform to Chessboard                  | [LeetCode-782](https://leetcode.com/problems/transform-to-chessboard/description/)  |
| Minimum Cost to Connect All Points       | [LeetCode-1584](https://leetcode.com/problems/minimum-cost-to-connect-all-points/description/)  |
| Minimum Number of Flips to Convert Binary Matrix to Zero Matrix | [LeetCode-1284](https://leetcode.com/problems/minimum-number-of-flips-to-convert-binary-matrix-to-zero-matrix/description/)  |

### Sequence

- **Characteristics**: Problems involving sequences or arrays where the solution involves segmenting or manipulating the sequence to achieve a desired outcome.
- **Example Problems**: Split Array Largest Sum, Shortest Common Supersequence, Frog Jump
- **Common Identifiers**:
  - Problems involving dividing or segmenting an array or sequence.
  - Problems that ask for the optimal way to split or rearrange elements.


| Problem name                             | Problem Link   |
|------------------------------------------|----------------|
| Split Array Largest Sum                  | [LeetCode-410](https://leetcode.com/problems/split-array-largest-sum/description/)  |
| Split Array with Same Average            | [LeetCode-805](https://leetcode.com/problems/split-array-with-same-average/description/)  |
| Shortest Common Supersequence            | [LeetCode-1092](https://leetcode.com/problems/shortest-common-supersequence/description/)  |
| Frog Jump                                | [LeetCode-403](https://leetcode.com/problems/frog-jump/description/)  |

### Other / Miscellaneous

- **Characteristics**: Problems that don't fit neatly into the other categories but still involve dynamic programming techniques.
- **Example Problems**: Word Break, Minimum Number of Removals to Make Mountain Array, Count All Valid Pickup and Delivery Options
- **Common Identifiers**:
  - Problems that involve breaking down a larger problem into smaller subproblems.
  - Problems that involve a mix of operations or constraints that require dynamic programming for optimal solutions.


| Problem name                             | Problem Link   |
|------------------------------------------|----------------|
| Word Break                               | [LeetCode-139](https://leetcode.com/problems/word-break/description/)  |
| Word Break II                            | [LeetCode-140](https://leetcode.com/problems/word-break-ii/description/)  |
| Minimum Number of Removals to Make Mountain Array | [LeetCode-1671](https://leetcode.com/problems/minimum-number-of-removals-to-make-mountain-array/description/)  |
| Number of Ways to Stay in the Same Place After Some Steps | [LeetCode-1269](https://leetcode.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps/description/)  |
| Russian Doll Envelopes                   | [LeetCode-354](https://leetcode.com/problems/russian-doll-envelopes/description/)  |
| Paint House                              | [LeetCode-256](https://leetcode.com/problems/paint-house/description/)  |
| Paint House II                           | [LeetCode-265](https://leetcode.com/problems/paint-house-ii/description/)  |
| Paint Fence                              | [LeetCode-276](https://leetcode.com/problems/paint-fence/description/)  |
| Freedom Trail                            | [LeetCode-514](https://leetcode.com/problems/freedom-trail/description/)  |
| Constrained Subset Sum                   | [LeetCode-1425](https://leetcode.com/problems/constrained-subset-sum/description/)  |
| Domino and Tromino Tiling                | [LeetCode-790](https://leetcode.com/problems/domino-and-tromino-tiling/description/)  |
| Number of Ways to Paint N × 3 Grid       | [LeetCode-1411](https://leetcode.com/problems/number-of-ways-to-paint-n-3-grid/description/)  |
| Minimum Swaps to Make Sequences Increasing | [LeetCode-801](https://leetcode.com/problems/minimum-swaps-to-make-sequences-increasing/description/)  |
| Painting a Grid with Three Different Colors | [LeetCode-1931](https://leetcode.com/problems/painting-a-grid-with-three-different-colors/description/)  |
| Knight Dialer                            | [LeetCode-935](https://leetcode.com/problems/knight-dialer/description/)  |
| Strange Printer                          | [LeetCode-664](https://leetcode.com/problems/strange-printer/description/)  |
| Removing Minimum Number of Magic Beans   | [LeetCode-2171](https://leetcode.com/problems/removing-minimum-number-of-magic-beans/description/)  |
| Count All Valid Pickup and Delivery Options | [LeetCode-1359](https://leetcode.com/problems/count-all-valid-pickup-and-delivery-options/description/)  |
| Make Array Strictly Increasing           | [LeetCode-1187](https://leetcode.com/problems/make-array-strictly-increasing/description/)  |
| Interleaving String                      | [LeetCode-97](https://leetcode.com/problems/interleaving-string/description/)  |
| Scramble String                          | [LeetCode-87](https://leetcode.com/problems/scramble-string/description/)  |


- Please note that these links lead to external websites, and you might need an account on some platforms to access the problems. 
- Always ensure that you respect the terms and conditions of the platforms you're using for practice. Happy problem-solving!
