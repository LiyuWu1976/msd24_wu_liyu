# Log-filter
## Overview

This project implements a Java program that reads and filters a given log file (`program.log`) based on a user-specified tag. The filtered content is then written to a new file, with the filename also specified by the user. If the output file already exists, the user is prompted to decide whether to overwrite it or not.

Additionally, there is a `bonus` implementation that allows the program to be called with command-line arguments, providing more flexibility and automation.

## Features

* Interactive Mode: The program prompts the user for a tag to filter and a filename to save the filtered logs. If the file already exists, the user can choose to overwrite it.
* Command-Line Interface (Bonus): The program can be executed with CLI arguments for input file, tag, output file, and an optional `--force` flag to overwrite the output file without prompting.
* Error Handling: The program handles errors gracefully, ensuring that resources like file readers are properly closed.
* Git Integration: The project includes a `.gitignore` file to ignore all log files except `program.log`.

## Getting Started
### Prerequisites

* Java Development Kit (JDK) installed on your machine.
* A terminal or command prompt to run the Java program.

### Installation

1. Clone the Repository:
```
bash
git clone https://github.com/LiyuWu1976/log-filter.git
cd log-filter
```
2. Compile the Java Program:
```
bash
javac LogFilter.java
```
3. Run the Program:
```
bash
java LogFilter.java
```

## Usage

1. Run the Program:
```
bash
java LogFilter.java
```
2. Enter the Tag to Filter:
```
please enter a tag to filter for: warn
```
3. Enter the Output Filename:
```
please enter a file name: filtered.log
```
4. Enter File Overwrite option (if applicable):
```
filtered.log already exists, do you want to overwrite it?
[y]es [N]o: yes
```
5. View the Output:
```
written 105 lines into filtered.log
```

## Command-Line Interface (Bonus)

1. Run the Program with CLI Arguments:
```
java LogFilter --input program.log --output filtered.log --tag debug --force
```
2. View the Output:
```
written 104 lines into filtered.log
```

## Project Structure

* LogFilter.java: The main Java file containing the implementation of the log filtering program.
* LogFilterWithArgs.java: The bonus Java file implementing the CLI argument functionality.
* program.log: The sample log file provided for testing.
* .gitignore: A file to ignore all log files except program.log.



## TODOs

- update the @author in the top docstring in LogFilter.java
- add .gitignore to ignore all log files except of program.log
- checkout Pattern Format and Examples
- implement getTag method
- implement readFile method
- implement filterByTag method
- implement writeFile method
- implement main method

## Exercises

- [Exercise 1](./exercise1.md): A Markdown file with additional elements like images, links, and lists.
- [Exercise 2](./exercise2.md): A Markdown file with usage of the Git commands.
- [Exercise 3](./exercise3.md): a brief step-by-step guide to complete Exercise 3.

## Reference
[//]: # (These are reference links used in the program)
[Make a README](http://www.Makeareadme.com)

## Information about Author
[Link to GitHub Profilpage](https://github.com/LiyuWu1976/msd24_wu_liyu.git)\
[Link to School](https://www.fh-joanneum.at/)
