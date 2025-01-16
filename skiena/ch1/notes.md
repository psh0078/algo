# Chapter 1

## 1. Robot Arm Example 

Problem: Robot Tour Optimization
Input: A set S of n points in the plane.
Output: What is the shortest cycle tour that visits each point in the set S?

Nearest-neighbours heuristic was the most intuitive approach, but turns out it is local and does not take into account some other cases. It does not give the optimal answer.

Closest-pair heuristic also fails to give the shortest possible tour in some cases.

There's a fundamental difference between algorithms and heuristics. Algorithms give you a correct answer, whereas heuristics may or may not give you a correct answer.

## 2. Selecting the Right Jobs

Problem: Movie Scheduling Problem
Input: A set I of n intervals on the line.
Output: What is the largest subset of mutually non-overlapping intervals that can be selected from I?

I would pick one interval and do the nearest-neighbor by time. Basically pick a movie that is closest to but greater than the end date of the current movie.

With the TSP problem, exhaustive search is correct.

## 3. Reasoning about Correctness

Narrow the set of allowable instances until there is a correct and efficient algorithm.
Two things to keep in mind when demonstrating incorrectness of an algorithm are verifiability and simplicity. Verifiability means that you should be able to calculate what answer your algorithm will give in this instance and display a better answer to prove that the algorithm didn't find it. Simplicity menas stripping away all unnecessary details.

Hunt for counterexamples!

## 4. Induction and Recursion

What is induction?
- Prove P(n) is true for every natural number by first proving a simple case.
- First, prove a base case for n = 0.
- Assume P(n) is true for n = k.
- Prove P(k+1) is true.
Recursion is mathematical induction in action.

## 5. Modeling the Problem

Fundamental structures used to model problems:
- Permutations: arrangements, orderings.
- Subsets: selections from a set of items.
- Trees: hierarchical relationships between items.
- Graphs: relationships between arbitrary pairs of objects.
- Points: locations in some geometric space.
- Polygons: regions in some geometric space.
- Strings: sequences of characters, or patterns.

These structures are recursive objects that has both decomposition rules and basis cases where the decomposition stops.

## 6. Proof by Contradiction

How does it work?
- Assume that the hypothesis is false.
- Develop some logical consequences of this assumption.
- Show that one consequence is demonstrably false, thereby showing that the assumption is incorrect and the hypothesis is true.

## 7. War Stories

## 8. Psychic Modeling

## 9. Estimation

Try to solve the problem in different ways and see if the answers generally agree in magnitude.
