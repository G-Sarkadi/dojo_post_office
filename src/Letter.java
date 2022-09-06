import java.util.Date;

public class Letter extends Mail{
    private static final double LETTER_PRICE = 1.99;

    public Letter(String address, Date date){
        super(date, address);
        this.type = Type.LETTER;
        this.address = address;
        this.date = date;
        this.price = LETTER_PRICE;
    }
}
