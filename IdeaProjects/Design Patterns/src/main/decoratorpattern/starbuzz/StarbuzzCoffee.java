package main.decoratorpattern.starbuzz;

import main.decoratorpattern.beverage.Beverage;
import main.decoratorpattern.beverage.DarkRoast;
import main.decoratorpattern.beverage.Espresso;
import main.decoratorpattern.beverage.HouseBlend;
import main.decoratorpattern.decorator.Mocha;
import main.decoratorpattern.decorator.Soy;
import main.decoratorpattern.decorator.Whip;

/**
 * Created by Stephen on 8/3/18.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());


    }

}
