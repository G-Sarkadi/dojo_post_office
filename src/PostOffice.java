import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class PostOffice {

    private ArrayList<Mail> packages;

    public PostOffice() {
        this.packages = new ArrayList<Mail>();
    }

    public void createItem(Type type, String address, Date date, double weight) {
        if (type == Type.SMALL) {
            storeItem(new SmallBox(Type.SMALL, address, date, weight));
        } else if (type == Type.BIG) {
            storeItem(new SmallBox(Type.BIG, address, date, weight));
        } else if (type == Type.LETTER) {
            storeItem(new Letter(Type.LETTER, address, date));
        }
    }

    public void storeItem(Mail mail) {
        packages.add(mail);
    }

    public double totalIncome() {
        double income = 0;
        for (Mail mail: packages) {
            income += mail.getPrice();
        }
        return income;
    }

    public ArrayList<Mail> filterByDate(Date date) {
        ArrayList<Mail> mailsOnDate = new ArrayList<>();
        for (Mail mail:packages) {
            if (Objects.equals(mail.getDate(), date)) {
                mailsOnDate.add(mail);
            }
        }
        return mailsOnDate;
    }
}
