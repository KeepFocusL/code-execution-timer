package com.xxham;

/**
 * The core class for calculating the running time of a specific algorithm.
 */
public class ExecutionTimer {
    /**
     * Returns the execution time of algorithms in milliseconds.
     *
     * @param algorithm the specific algorithm
     * @return execution time of algorithms in milliseconds
     */
    public static long calculate(Algorithm algorithm) {
        long start = System.currentTimeMillis();
        algorithm.execute();
        long end = System.currentTimeMillis();
        
        long elapsedTime = end - start;
        //System.out.println("Execution time: " + elapsedTime + " ms");
        return elapsedTime;
    }
}
