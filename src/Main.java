import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){



        List<Product> Products = new ArrayList<Product>(
                Arrays.asList(
                new Product("Snicers", 123.1),
                new Product("Mars", 123.1),
                new Product("Coka Cola", 120.1)
                        ));

        Machine machine = new Machine(Products);
        String key = "Mars";
        System.out.println(machine.getProdByName(key));


        List<HotDrink> listHDrinks = new ArrayList<>(

                Arrays.asList(
                        new HotDrink("latte", 123.1, 0.4, 80.5),
                        new HotDrink("esspresso", 123.1,0.4, 80.5),
                        new HotDrink("capuchino", 120.1,0.4, 80.5),
                        new HotDrink("latte", 150.1, 0.6, 80.5),
                        new HotDrink("esspresso", 150.1,0.6, 80.5),
                        new HotDrink("capuchino", 150.1,0.6, 80.5)

                ));


        HotDrinkMachine g = new HotDrinkMachine(listHDrinks);
        String keyHotDrink = "capuchino";
        System.out.println(g.getProduct(keyHotDrink, 0.6,80.5));
    }
}
