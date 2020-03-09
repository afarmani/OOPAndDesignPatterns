package com.afarmani.patterns.behavioral.behavioral.iterator;

/** iterator is composed of the browse history
 * An interface is used to define the methods needed to traverse the different types of classes
 * We use generics here so that we can pass the domain type at run time.*/

public interface Iterator<E> {
    boolean hasNext();
    E current();
    void next();
    void previous();
}
