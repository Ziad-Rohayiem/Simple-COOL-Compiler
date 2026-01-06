#!/bin/bash

if [ -z "$1" ]; then
    echo "Usage: ./build.sh <cool-source-file>"
    exit 1
fi

INPUT_FILE=$(realpath "$1")

echo "--- Running Phase 1: Lexer ---"
cd Phase1-Lexer && ./build.sh "$INPUT_FILE" && cd ..

echo -e "\n--- Running Phase 2: Parser ---"
cd Phase2-Parser && ./build.sh "$INPUT_FILE" && cd ..

echo -e "\n--- Running Phase 3: Semantic Analyzer ---"
cd Phase3-Semantic && ./build.sh "$INPUT_FILE" && cd ..

echo -e "\n--- All Phases Completed ---"
