package main.compositepattern.waitress;

import main.compositepattern.composite.MenuComponent;

import java.util.Iterator;

/**
 * Created by Stephen on 8/8/18.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while(iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if(menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            }
            catch(UnsupportedOperationException e) {}
        }
    }
}
