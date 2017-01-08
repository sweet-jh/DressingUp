/**
 * Created by hjing on 1/7/17.
 */
public class Entry {

    public static void main(String[] args) {
        People Lily;
        Jeans jeans;
        Tshirt tshirt;

        Lily = new People("Lily");
        jeans = new Jeans();
        tshirt = new Tshirt();

        jeans.dressing(Lily);
        tshirt.dressing(jeans);

        tshirt.show();

    }
}
