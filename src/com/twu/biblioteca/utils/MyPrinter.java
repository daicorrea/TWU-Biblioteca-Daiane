package com.twu.biblioteca.utils;

import java.io.PrintStream;

public class MyPrinter {

    private PrintStream printStream;

    public MyPrinter(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void print(Object message) {
        printStream.println(message);
    }
}
