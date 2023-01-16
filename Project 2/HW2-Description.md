# Assignment 2: Prototype-based Inheritance and Higher-Order Functions in JavaScript


### Goals for This Assignment
By the time you have completed this work, you should be able to:

- Understand a code's specification from a test suite
- Work with the basics of the syntax of JavaScript
- Use prototype-based inheritance to reuse code
- Use virtual dispatch to encode different behaviors
- Use higher-order functions in JavaScript

### Provided files:
list.js
collaborators.txt
Step-by-Step Instructions
## Step 1: Get JavaScript Working
For this assignment, you'll be using JavaScript. It's possible to make this assignment work in any Web browser, though it may require some modification to make the output reasonable. It's recommended to use Node.js as your implementation, which can be installed on all major platforms. Node.js can also be run directly in the browser here, if you prefer.

## Step 2: Implement a Singly-Linked List
A significant of code has been provided in list.js, including a test suite of significant size. Your goal with this assignment is to get all the tests passing, without modifying any of the testing code. The comments in the file provide further details. Note that the tests themselves are a rich source of information, both in terms of defining what you need to implement (i.e., they serve as a specification), and how JavaScript works.

Specific to the filter and map functions, these are based on the usual functional definitions of filter and map, respectively. The only difference is that these are implemented as methods on a list, so they are called like so:

list.filter(function (e) { return e % 2 == 0; }); // returns list of all even numbers
list.map(function (e) { return e + 1; }); // returns list where all numbers are incremented by one
Step 3: Turn in Your Code Using Canvas
Log into Canvas, and go to the COMP 333 class. Click “Assignments” on the left pane, then click “Assignment 2”. From here, you need to upload the following files:

list.js
**In addition, if you collaborated with anyone else, be sure to download collaborators.txt and write the names of the people you collaborated with in the file, one per line. Please submit this file along with the other files.**

You can turn in the assignment multiple times, but only the last version you submitted will be graded.
