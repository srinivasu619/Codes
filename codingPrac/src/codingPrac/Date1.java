package codingPrac;
import java.util.Calendar;
import java.util.Date;
public class Date1 {

	public static void addDays(Date date, int days)
	{
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    cal.add(Calendar.DATE, days); //minus number would decrement the days
	    String s="";
	    s+=cal.getTime();
	    System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date=new Date();
		addDays(date,60);
	}

}
