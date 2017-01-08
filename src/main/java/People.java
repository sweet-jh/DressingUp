
/**
 * Created by hjing on 1/7/17.
 */
public class People {
    String name;

    public People() {

    }

    public People(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Decorate: "+this.name);
    }
}
