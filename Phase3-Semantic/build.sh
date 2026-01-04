#!/bin/bash

# Update this path to where your ANTLR jar is located
ANTLR_JAR="../lib/antlr-4.13.1-complete.jar"
CLASSPATH=".:src:$ANTLR_JAR"

echo "1. Generating ANTLR recognizers..."
java -jar "$ANTLR_JAR" *.g4 -visitor -o src

echo "2. Compiling Java..."
javac -cp "$CLASSPATH" src/*.java

echo "3. Running Semantic Analysis..."
# Run on the file passed as argument, or default to internal test
if [ -z "$1" ]; then
    echo "Usage: ./build.sh <cool-source-file>"
else
    java -cp "$CLASSPATH:src" Main "$1"
fi
