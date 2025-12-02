#!/usr/bin/env bash
set -e
# Compile Java sources
echo "Compiling sources..."
javac -d out src/Main.java

echo "Running application..."
java -cp out Main
