import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class demo {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println (d);
		GregorianCalendar gc =new GregorianCalendar(2009,1,28);
		gc.add(GregorianCalendar.DATE, 1);
		Date d2=gc.getTime();
		DateFormat dt=DateFormat.getInstance();
		String sd=dt.format(d2);
		System.out.print(sd);

	}

}
