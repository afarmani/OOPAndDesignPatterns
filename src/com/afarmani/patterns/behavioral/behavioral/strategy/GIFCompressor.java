package com.afarmani.patterns.behavioral.behavioral.strategy;

public class GIFCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing GIF to: " + fileName);
    }
}
