# Readme

This is my attempt at solving a problem where it is required to solve a problem where a tree of numbers is traversed to find the minimal summation path. The language chosen is kotlin since I wanted to get to know a little better the language and at the same time I feel it is better suited then java to write functional oriented code.

## Approach overview

The approach taken in this case is a bottom-up approach this resulted to be an efficient approach in solving the problem in an efficient manner.

## Building the application

To build the application checkout a copy of the repository on your machine and make sure you have at least JDK 8 installed and your path and you also need at least maven version 3 installed and on your path.

To build open a terminal and go in the project folder and run the following:

mvn install

## Running the application

After the module is built you can then try run it using the following command:

cat << EOF | java -jar target/MinTrianglePath.jar

This will allow you to enter the structure of the tree on the input

as an alternative you can also run the application using the provided dataset by running:

cat dataset1.txt | java -jar target/MinTrianglePath.jar