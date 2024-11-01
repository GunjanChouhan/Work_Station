package Company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CH_102_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now(); //This is a date
        System.out.println(dt);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");//This is a format
        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;
        String mydate=dt.format(df); //Creating date String using date and format
        System.out.println(mydate);
    }
}
