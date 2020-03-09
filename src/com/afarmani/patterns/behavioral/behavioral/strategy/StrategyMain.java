package com.afarmani.patterns.behavioral.behavioral.strategy;
/** The strategy pattern provides you the ability to change the classes behaviours
 * at runtime.
 *
 * In the following example we want to store the images that our users upload.
 * We will need to compress the images, such as JPEG, PNG, GIF
 * Then add a filter to those images.
 *
 * We can create an image storage class to apply our requirements based on the filter and
 * compression types.
 *
 * Polymorphism can be used here to change the behaviour of the image storage class based
 * on the mix of filters and compression types selected.
 *
 * if we create a compressor interface and implementation classes such as JPEG compressor
 * and PNG Compressor we will use the OOP principal of "open closed principal", this allows
 * us in the future to add various compressor implementation to our application.
 * */
public class StrategyMain {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();

        //polymorphism, same method of an object changes behavior based on its inputs.
        imageStorage.store("C:/afarmani/myimage.jpeg", new JPEGCompressor(),new BWFilter());
        imageStorage.store("C:/afarmani/myimage.png", new PNGCompressor(),new WaterMarkFilter());

        /**OUTPUT:
         * Compressing JPEG to: C:/afarmani/myimage.jpeg
         * Applying BW filter to: C:/afarmani/myimage.jpeg
         * Compressing PNG to: C:/afarmani/myimage.png
         * Applying Filter WaterMark to: C:/afarmani/myimage.png
         * */
    }
}
