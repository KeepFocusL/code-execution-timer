package com.xxham;

public class StringBuilderAppend extends Algorithm {
    int count;

    public StringBuilderAppend(int count) {
        this.count = count;
    }

    @Override
    public void execute() {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb2.append(i);
        }
    }
}
