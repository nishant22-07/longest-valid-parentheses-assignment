# longest-valid-parentheses-assignment
# Longest Valid Parentheses

Java solution for finding the length of the longest valid (well-formed) parentheses substring.

## Problem

Given a string containing only `(` and `)`, return the length of the longest valid parentheses substring.

### Examples

**Input:** `(()`  
**Output:** `2`

**Input:** `)()())`  
**Output:** `4`

## Approach

- Uses a stack of indices.
- Pushes `-1` as the initial base index.
- For every `(`, stores its index.
- For every `)`:
  - Pops the top index.
  - If the stack becomes empty, pushes the current index as the new base.
  - Otherwise, computes the current valid substring length.
- Tracks the maximum length throughout the traversal.

## Time Complexity

- **O(n)**

## Space Complexity

- **O(n)**

## Language

- Java