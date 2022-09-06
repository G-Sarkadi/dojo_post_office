import java.util.Date;

public abstract class Mail {
    protected Type type;
    protected Date date;
    protected String address;
    protected double price;

    public Date getDate() {
        return date;
    };

    public double getPrice() {
        return price;
    }

}