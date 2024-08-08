package com.xxham;

public class StringBufferAppend extends Algorithm {
    int count;

    public StringBufferAppend(int count) {
        this.count = count;
    }

    @Override
    public void execute() {
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb1.append(i);
        }
    }
}
