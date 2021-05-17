package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Data {

	public static List<Patient> setData() throws ParseException{
		List<Patient> allPatient = new ArrayList<>();

	    Patient p=new Patient();
	    p.setDocName("Dr.Surash");
	    p.setName("sayrah");
	    p.setlocation("Bangalore");
	    p.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("13/06/2021"));
	    allPatient.add(p);
	    Patient p2=new Patient();
	    p2.setDocName("Dr.Ramesh");
	    p2.setName("Kame");
	    p2.setlocation("kundapur");
	    p2.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("14/06/2021"));
	    allPatient.add(p2);
	    Patient p3=new Patient();
	    p3.setDocName("Dr.Surash");
	    p3.setName("Shubam");
	    p3.setlocation("Bangalore");
	    p3.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("15/06/2021"));
	    allPatient.add(p3);
	    Patient p4=new Patient();
	    p4.setDocName("Dr.Mahesh");
	    p4.setName("Shan");
	    p4.setlocation("Mangalore");
	    p4.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("16/06/2021"));
	    allPatient.add(p4);
	    Patient p5=new Patient();
	    p5.setDocName("Dr.Ramesh");
	    p5.setName("Rish");
	    p5.setlocation("Bangalore");
	    p5.setdate1(new SimpleDateFormat("dd/MM/yyyy").parse("17/06/2021"));
	    allPatient.add(p5);
	    
	    return allPatient;
	}
}
