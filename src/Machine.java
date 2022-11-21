import java.util.List;

public class Machine {

    private List<Product> list;


    public Machine (List<Product> list ) {
        this.list = list;
    }

    public Machine () {

    }

    public List<Product> getList() {
        return list;
    }

    public Product getProdByName (String name) {
        for (Product item: this.list) {
            if (name.equals(item.getName())){
                return item;
            }
        }
        throw new IllegalStateException("Product not found");
    }

}
