import java.util.Date;

public class SmallBox extends Box {
    private static final double SMALL_BOX_PRICE = 7.99;

    public SmallBox(String address, Date date, double weight) {
        super(date, address, weight);
        this.type = Type.SMALL;
        this.address = address;
        this.date = date;
        this.weight = weight;
        this.price = SMALL_BOX_PRICE;
    }
}
