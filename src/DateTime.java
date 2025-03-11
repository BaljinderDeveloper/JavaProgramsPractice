import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class DateTime {
    public static void main(String[] args){
        String format = "dd/MM/yyyy hh:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String myDate = sdf.format(new Date());
        System.out.println(myDate);

    }
}
