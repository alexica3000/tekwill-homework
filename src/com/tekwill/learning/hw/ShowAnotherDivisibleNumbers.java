package com.tekwill.learning.hw;

public class ShowAnotherDivisibleNumbers {
    private int nrOutputs = 0;

    public void printDivisibleNumbers(int from, int to, int perLine) {
        for (int i = from; i <= to; i++) {
            if (i % 5 == 0 || i % 6 == 0) {
                System.out.print(i + " ");
                this.nrOutputs++;
                this.printLine(perLine);
            }
        }
    }

    private void printLine(int perLine) {
        if (this.nrOutputs % perLine == 0) {
            System.out.println();
        }
    }
}
