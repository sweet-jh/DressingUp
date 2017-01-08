/**
 * Created by hjing on 1/7/17.
 */
public class Entry {

    public static void main(String[] args) {
        People Lily;
        Jeans jeans;
        Shoes shoes;
        Tshirt tshirt;

        Lily = new People("Lily");
        jeans = new Jeans();
        shoes = new Shoes();
        tshirt = new Tshirt();

        jeans.dressing(Lily);
        shoes.dressing(jeans);
        tshirt.dressing(shoes);

        tshirt.show();

    }
}
