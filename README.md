# Integer Overflow Bug in Java

This repository demonstrates an uncommon integer overflow bug that can occur in Java when working with the `int` data type. The code attempts to reset a counter after reaching `Integer.MAX_VALUE`, causing an unexpected integer overflow.

## Bug Description

The `UncommonBug.java` file contains code that uses a `while` loop to increment a counter. When the counter reaches `Integer.MAX_VALUE`, it attempts to reset to 0.  However, this results in an integer overflow, causing the counter to wrap around to its minimum value and continue unexpectedly.

## Solution

The `UncommonBugSolution.java` file provides a corrected version of the code.  The solution uses a `long` data type to handle larger integer values, thus avoiding the overflow issue. 