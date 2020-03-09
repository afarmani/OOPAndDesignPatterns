package com.afarmani.patterns.behavioral.behavioral.strategy;

public class WaterMarkFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Filter WaterMark to: " + fileName);
    }
}
