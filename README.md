# COOL Compiler Project

This project is a multi-phase implementation of a compiler for the **COOL (Classroom Object Oriented Language)** programming language. The compiler is built using **Java** and **ANTLRv4**.

## Project Motivation
The goal of this project is to build a fully functional compiler that translates COOL source code into executable instructions, covering lexical analysis, parsing, semantic validation, and eventually code generation.

---

## Directory Structure

Each phase of the compiler is organized into its own directory with a consistent internal structure:

```text
PhaseX-Name/
├── src/             # Handwritten source code and ANTLR grammars (.g4)
├── gen/             # Generated ANTLR recognizers (excluded from Git)
├── out/             # Compiled Java classes (excluded from Git)
├── Testing/         # Sample .cl files for testing
└── build.sh         # Simplified build and run script
```

> **Note:** The `gen/` and `out/` directories are not included in the repository to keep it clean. They are automatically generated and populated by the build scripts.

---

## Phases Overview

### [Phase 1: Lexical Analysis (Lexer)](./Phase1-Lexer)
The Lexer's job is to read the raw characters of a COOL program and group them into meaningful **tokens** (e.g., keywords like `if`, identifiers, integers, and operators).
- **Technology**: ANTLR4 Lexer grammar (`src/cool_grammar.g4`).
- **Output**: A list of tokens with their corresponding types (e.g., `CLASS : KEYWORD`).

### [Phase 2: Syntax Analysis (Parser)](./Phase2-Parser)
The Parser takes the tokens from Phase 1 and ensures they follow the grammatical rules of COOL. It builds a **Parse Tree** representing the structure of the program.
- **Technology**: ANTLR4 Parser grammar (`src/cool_syntax.g4`).
- **Key Feature**: Custom error handling for syntax errors.

### [Phase 3: Semantic Analysis (Type Checker)](./Phase3-Semantic)
The Semantic Analyzer validates the "meaning" of the code. It ensures that the program is logically sound, even if it is syntactically correct.
- **Key Tasks**:
    - **Class Hierarchy**: Validates that classes don't have circular inheritance.
    - **Scope Management**: Tracks variable and method declarations.
    - **Type Checking**: Ensures types match in assignments, method calls, and expressions (e.g., can't add an `Int` to a `String`).
    - **LUB Calculation**: Determines the Least Upper Bound for joint types in `if` and `case` expressions.

---

## Prerequisites

To build and run this project, you need:
- **Java Development Kit (JDK)**: Version 11 or higher recommended.
- **Bash Environment**: (Linux, macOS, or WSL on Windows).
- **ANTLR Jar**: The project expects the ANTLR jar to be located at `lib/antlr-4.13.1-complete.jar`.

---

## How to Run

### Running the Whole Pipeline
You can run all three phases sequentially on a single COOL file using the root `build.sh` script:
```bash
chmod +x build.sh
./build.sh Testing/fact.cl
```

### Running Individual Phases
Each phase contains its own `build.sh` script for independent testing.

#### Phase 1 (Lexer)
```bash
cd Phase1-Lexer
chmod +x build.sh
./build.sh Testing/fact.cl
```

#### Phase 2 (Parser)
```bash
cd Phase2-Parser
chmod +x build.sh
./build.sh Testing/fact.cl
```

#### Phase 3 (Semantic Analyzer)
```bash
cd Phase3-Semantic
chmod +x build.sh
./build.sh Testing/simple.cl
```

---

## Development Details

- **ANTLR Generation**: Grammars are stored in `src/`. The build scripts run ANTLR to generate Java code into `gen/`.
- **Compilation**: The Java compiler (`javac`) compiles both the handwritten code in `src/` and the generated code in `gen/` into the `out/` directory.
- **Execution**: The `java` command executes the `Main` class using the `out` directory and the ANTLR jar in the classpath.
