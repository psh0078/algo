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
