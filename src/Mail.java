import java.util.Date;

public abstract class Mail {
    protected Type type;
    protected Date date;
    protected String address;
    protected double price;

    public Mail(Date date, String address) {
        this.date = date;
        this.address = address;
    }

    public Date getDate() {
        return date;
    };

    public double getPrice() {
        return price;
    }

}