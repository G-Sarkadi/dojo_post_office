import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class PostOffice {

    private List<Mail> packages;

    public PostOffice() {
        this.packages = new ArrayList<>();
    }

    public void createItem(Type type, String address, Date date, double weight) {
        if (type == Type.SMALL) {
            storeItem(new SmallBox(address, date, weight));
        } else if (type == Type.BIG) {
            storeItem(new SmallBox(address, date, weight));
        } else if (type == Type.LETTER) {
            storeItem(new Letter(address, date));
        }
    }

    public void storeItem(Mail mail) {
        packages.add(mail);
    }

    public double calculateTotalIncome() {
        double income = 0;
        for (Mail mail: packages) {
            income += mail.getPrice();
        }
        return income;
    }

    public List<Mail> filterByDate(Date date) {
        List<Mail> mailsOnDate = new ArrayList<>();
        for (Mail mail:packages) {
            if (mail.getDate().equals(date)) {
                mailsOnDate.add(mail);
            }
        }
        return mailsOnDate;
    }
}
