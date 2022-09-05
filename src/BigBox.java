import java.util.Date;

public class BigBox extends Box {
    private static final double BIG_BOX_FLAT_PRICE = 7.99;
    private static final double BIG_BOX_PRICE_PER_MILLIGRAM = 0.99;

    public BigBox(Type type, String address, Date date, double weight) {
        this.type = type;
        this.address = address;
        this.date = date;
        this.weight = weight;
        this.price = setPrice(weight);
    }

    private double setPrice(double weight) {
        return BIG_BOX_FLAT_PRICE + (weight * BIG_BOX_PRICE_PER_MILLIGRAM);
    }
}
