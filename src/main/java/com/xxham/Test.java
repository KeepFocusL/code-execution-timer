package com.xxham;

public class Test {
    public static void main(String[] args) {
        ExecutionTimer.calculate(new Algorithm() {
            @Override
            public void execute() {
                int sum = 0;
                for (int i = 0; i < 10000; i++) {
                    sum += i;
                }
            }
        });
    }
}
