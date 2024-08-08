package com.xxham;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExecutionTimerTest {

    @Test
    void calculate() {
        int[] counts = {10, 1000, 10000};
        for (int count : counts) {
            // String `+`
            long t1 = ExecutionTimer.calculate(new StringPlus(count));
            // StringBuilder append 方法
            long t2 = ExecutionTimer.calculate(new StringBuilderAppend(count));

            assertTrue(t2 < t1);
        }
    }
}