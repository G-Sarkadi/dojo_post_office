import java.util.Date;

public class Letter extends Mail{
    private static final double LETTER_PRICE = 1.99;

    public Letter(Type type, String address, Date date){
        this.type = type;
        this.address = address;
        this.date = date;
        this.price = LETTER_PRICE;
    }
}
