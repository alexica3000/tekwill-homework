package com.tekwill.learning.hw;

public class ValueOfPICalculator {
    double pi = 4.0;
    double x = 3.0;

    public void calculate() {
        for (int i = 1; i <= 200000; i++) {
            this.pi = this.pi - (4 / x) + (4 / (x + 2));
            x += 4;

            System.out.printf("i = %d, pi = %.15f\n", i, this.pi);
        }
    }
}
