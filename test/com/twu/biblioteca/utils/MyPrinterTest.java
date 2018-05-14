package com.twu.biblioteca.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.OutputStream;
import java.io.PrintStream;

public class MyPrinterTest {

    @Test
    public void shouldPrintMessage() {
        PrinterAPIJavaMock printerAPIJavaMock = new PrinterAPIJavaMock(System.out);
        MyPrinter myPrinter = new MyPrinter(printerAPIJavaMock);
        myPrinter.print("Test");
        Assert.assertTrue(printerAPIJavaMock.didCallJavaPrinter);
    }

    private class PrinterAPIJavaMock extends PrintStream {
        boolean didCallJavaPrinter;

        public PrinterAPIJavaMock(OutputStream out) {
            super(out);
        }

        @Override
        public void println(Object x) {
            didCallJavaPrinter = true;
        }
    }

}
