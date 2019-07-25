# Java-TDD_Kata_CalcStats
Simple java local application, using Test Driven Development methodology.

**Level: EASY**<br>
**Status: Development**

Setup:
 - JDK 1.8.0_191
 - IDE IntelliJ Idea
 - Maven (IntellliJ Idea)
 - JUnit 4

Reference TDD Katas: [TDD Kata](https://www.programmingwithwolfgang.com/tdd-kata/)



# 1. Introduction
  TDD is a methodology that let implement efficient code. To use TDD in a project, all team members musth think in TDD mode, from functional analist to junior developer.
  The TDD paradigm consist in:
  1. Take funtional requirements like technical test cases
  2. Implement an basic unit test case
  3. Write the minimun code to pass the test case
  4. Refactoring the code
  5. Repeat the poings 2, 3 and 4 to cover all requirements.

In this example I will develop a simple application using TDD. Imagine you take the next requirements:
___
Your task is to process a sequence of integer numbers to determine the following statistics:

* minimum value
* maximum value
* number of elements in the sequence
* average value

For example: [6, 9, 15, -2, 92, 11]

* minimum value = -2
* maximum value = 92
* number of elements in the sequence = 6
* average value = 21.833333
___
Now we must think in basic unit test to cover every cases... 

