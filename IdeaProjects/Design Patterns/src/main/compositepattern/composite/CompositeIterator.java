package main.compositepattern.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by Stephen on 8/9/18.
 */
public class CompositeIterator implements Iterator {
    Stack<Iterator> stack = new Stack<Iterator>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty()) {
            return false;
        }
        else {
            Iterator iterator = stack.peek();
            if(!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            }
            else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()) {
            Iterator iterator = stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            if(menuComponent instanceof Menu) {
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        }
        else {
            return null;
        }
    }
}
