package main.compositepattern.composite;

import java.util.Iterator;

/**
 * Created by Stephen on 8/9/18.
 */
public class NullIterator implements Iterator {
    public Object next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }
}
