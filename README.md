# COOL Compiler Project

This project is a simple implementation of a compiler for the COOL (Classroom Object Oriented Language) programming language. It is developed in phases, utilizing **ANTLRv4** for generating the lexer and parser, with **Java** as the host language.

## Project Structure

The project is organized into two main phases:

### Phase 1: Lexical Analysis
Located in the `Phase-1` directory.
- **Focus**: Tokenizing the input COOL source code.
- **Key Files**:
    - `src/cool_grammar.g4`: The ANTLR4 Lexer grammar defining tokens (keywords, identifiers, literals, operators).
    - `src/Main.java`: The entry point that reads an input file, tokenizes it, and outputs the tokens.

### Phase 2: Syntax Analysis
Located in the `Phase-2` directory.
- **Focus**: building the Abstract Syntax Tree (AST) or Parse Tree from the tokens.
- **Key Files**:
    - `cool_grammar.g4`: The Lexer grammar.
    - `cool_syntax.g4`: The ANTLR4 Parser grammar defining the language rules (classes, features, expressions).
    - `src/Main.java`: The entry point that parses the input, generates a parse tree, and handles errors.
    - `src/ErrorHandling.java`: Custom error listener for syntax errors.

## Prerequisites

*   **Java Development Kit (JDK)** (Version 8 or higher)
*   **ANTLRv4**: Required to generate the Java code from the `.g4` grammar files.
*   **IntelliJ IDEA** (Optional but recommended, as project files are included).

## How to Run

### Setup
1.  Ensure ANTLR4 libraries are added to your classpath.
2.  Generate the ANTLR recognizers (Lexer and Parser) from the `.g4` files.

### Running Phase 1 (Lexer)
1.  Navigate to `Phase-1`.
2.  Provide a COOL source file (e.g., `Testing/fact.cl`).
3.  Run `src/Main.java`.
4.  The output will be written to `Testing/output.txt`, listing all identified tokens.

### Running Phase 2 (Parser)
1.  Navigate to `Phase-2`.
2.  Provide a COOL source file (e.g., `Testing/fact.cl`).
3.  Run `src/Main.java`.
4.  The program will parse the code and produce a parse tree string or display a graphical inspector (via `Trees.inspect`).
5.  Output is also saved to `Testing/fact.cl-ast`.

## Testing
The `Testing` directory in each phase contains sample COOL programs (like `fact.cl`) used to verify the correctness of the lexer and parser.
