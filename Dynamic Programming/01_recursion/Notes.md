# Dynamic Programming

## Day 1 - Recursion Fundamentals

### What is Recursion?

Recursion is a problem-solving technique where a problem is solved by breaking it into smaller instances of the same problem until a base case is reached.

---

## Components of Recursion

1. Base Case
2. Recursive Call
3. Current Answer

---

## Why Base Case?

- Stops recursion
- Prevents Stack Overflow
- Starts the return journey

---

## Call Stack

Each recursive function call creates a stack frame containing:
- Parameters
- Local Variables
- Return Address

---

## Important Concepts

### Optimal Substructure

A larger problem depends on smaller subproblems.

Example:

Fib(n) = Fib(n-1) + Fib(n-2)

---

### Overlapping Subproblems

The same subproblem gets solved multiple times.

Example:

Fib(3) is calculated twice in Fib(5).

---

## Interview Questions

✔ What is recursion?

✔ Why do we need a base case?

✔ What is stored in the call stack?

✔ Why does recursion use extra memory?

✔ Why is Fibonacci slow?

---

## Mistakes

- Forgetting the base case
- Wrong recursive call
- Infinite recursion