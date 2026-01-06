#!/bin/bash
ANTLR_JAR="../lib/antlr-4.13.1-complete.jar"
CLASSPATH=".:out:gen:$ANTLR_JAR"

# Clean
rm -rf gen/* out/*
mkdir -p gen out

echo "1. Generating ANTLR recognizers..."
cd src
java -jar "../$ANTLR_JAR" *.g4 -visitor -listener -o ../gen
cd ..

echo "2. Compiling Java..."
javac -cp "$CLASSPATH" -d out src/*.java gen/*.java

echo "3. Running Syntax Analysis..."
if [ -z "$1" ]; then
    echo "Usage: ./build.sh <cool-source-file>"
else
    # Update Main.java to take argument if needed, but for now just run
    java -cp "$CLASSPATH" Main "$1"
fi
