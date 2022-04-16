#! /bin/bash

javac src/main/java/com/codecool/scc/ConverterApplication.java -d target/classes
jar cfe app.jar com.codecool.scc.ConverterApplication -C target/classes  com/codecool/scc/ConverterApplication.class
