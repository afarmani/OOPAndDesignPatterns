package com.afarmani.patterns.behavioral.behavioral.observer;

/** Observer pattern is useful when the state of an object changes and other objects need to
 * be notified about these changes. For the following example we have a spreedsheet and when
 * the values of the spreedsheet are updated, than the chart needs to also be updated.
 *
 * This pattern is useful because at the time of writing your code you are not aware about
 * how many objects need to be subscribed to changes. This pattern decouples the subscribing
 * objects from the producer.
 *
 * We have a datasource, spreadsheet and chart object. We should create an observer interface
 * that is implemented by the spreadsheet and chart objects, the datasource will communicate
 * to the other objects using the Observer interface.
 *
 * Observer pattern can have two type, push or pull types.
 * On push types we "push" the values to the subscribed objects
 * On pull types we "pull" the values.
 * */


public class ObserverMain {

    public static void main(String[] args) {
        //**PUSH METHOD**
        doPushMethod();
        doPullMethod();

    }

    private static void doPushMethod() {
        DataSource ds = new DataSource();
        SpreedSheet s1 = new SpreedSheet();
        SpreedSheet s2 = new SpreedSheet();
        SpreedSheet s3 = new SpreedSheet();
        Chart chart = new Chart();

        //tell the datasource to register the spreedsheet and chart objects as observers.
        ds.addObserver(s1);
        ds.addObserver(s2);
        ds.addObserver(s3);
        ds.addObserver(chart);

        //now when we call the set value method of the datasource, all the registered objects will be notified.
        ds.setValuePush(1);
        /**OUTPUT:
         spreedsheet have been update. Value: 1
         spreedsheet have been update. Value: 1
         spreedsheet have been update. Value: 1
         Chart has been updated. Value: 1
         * */
    }

    private static void doPullMethod() {
        DataSource ds = new DataSource();
        //this time we pass the datasource
        SpreedSheet s1 = new SpreedSheet(ds);
        SpreedSheet s2 = new SpreedSheet(ds);
        SpreedSheet s3 = new SpreedSheet(ds);
        Chart chart = new Chart(ds);

        //tell the datasource to register the spreedsheet and chart objects as observers.
        ds.addObserver(s1);
        ds.addObserver(s2);
        ds.addObserver(s3);
        ds.addObserver(chart);

        //now when we call the set value method of the datasource, all the registered objects will be notified.
        ds.setValuePull(1);
        /**OUTPUT:
         spreedsheet have been update. Value: 1
         spreedsheet have been update. Value: 1
         spreedsheet have been update. Value: 1
         Chart has been updated. Value: 1
         * */
    }
}
