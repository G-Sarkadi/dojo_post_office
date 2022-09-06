import java.util.Date;

public abstract class Box extends Mail{
    protected double weight;

    public Box(Date date, String address, double weight) {
        super(date, address);
        this.weight = weight;
    }
}
