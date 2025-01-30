package AllPrograms;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class getCurrentDate 
{
	public static void main(String[] args) 
	{
		System.out.println(LocalDate.now());
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Date d=new Date();
		System.out.println(sdf.format(d));
	}

}
