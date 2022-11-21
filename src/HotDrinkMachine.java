import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine extends Machine{

    private List<HotDrink> hotDrinks;
    public HotDrinkMachine(List<HotDrink> list) {
        super();
        this.hotDrinks = list;
    }

    public List<HotDrink> getHotDrinks() {
        return hotDrinks;
    }

    public Product getProduct (String name, Double volume, Double temperature) {
        for (HotDrink item: hotDrinks) {

            if (name.equals(item.getName()) && volume.equals(item.getVolume()) && temperature.equals(item.getTemperature())){
                return item;
            }
        }
        return null;
    }
}
