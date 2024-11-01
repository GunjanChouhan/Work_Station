package Company;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class CH_102_Ps {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for (Object o: ar ){
            System.out.println(o);
        }


        HashSet<Integer> s=new HashSet<>();
        s.add(4);
        s.add(2);
        s.add(78);
        s.add(23);
        s.add(2);
        s.add(90);
        System.out.println(s);




        Date d=new Date();
        System.out.println(d.getHours() +":"+d.getMinutes()+":"+d.getSeconds());

        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) +":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        LocalDateTime dt=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("H:m:s");
        String mydate=dt.format(df);
        System.out.println(mydate);


    }
}
