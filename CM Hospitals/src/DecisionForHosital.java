

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import data.Data;
import data.Patient;

public class DecisionForHosital {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		int bcount=0,ocount=0,input=0;
		String sDate1="13/06/2021";  
		String sDate2="18/06/2021"; 
	    ArrayList<String> Doc = new ArrayList<String>();
		String ch;
	    Date from=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    Date to=new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);  
	    
	    List<Patient> allPatient =Data.setData();
	    
	    int sizeAll=allPatient.size();
	    for(int i=0;i<allPatient.size();i++){
	    	if(allPatient.get(i).getlocation()=="Bangalore"){
	    		if(allPatient.get(i).getdate1().compareTo(from)>=0 && allPatient.get(i).getdate1().compareTo(to)<=0){
	    			bcount++;
	    		}
	    		else{
	    		sizeAll--;
	    		}
	    	}else{
	    		if(allPatient.get(i).getdate1().compareTo(from)>=0 && allPatient.get(i).getdate1().compareTo(to)<=0){
	    			ocount++;
	    		}
	    		else{
	    		sizeAll--;
	    		}
	    	}
	    }
	    
	    Scanner sc=new Scanner(System.in);
	    while(true){
		    System.out.println("----------MENU---------");
		    System.out.println("-----------------------");

		    System.out.println("1-All Patient");
		    System.out.println("2-Banalore Patient");
		    System.out.println("3-Outstation Patient");
		    System.out.println("4-Check By Percentae");
		    System.out.println("5-Number of Patient By Doctor");
		    System.out.println("6-Exit");
		    System.out.println("-----------------------");
		    System.out.println("Enter Your Choice:");
		    input =sc.nextInt();
		    switch(input){
		    case 1:
		    	System.out.println("NAME \t LOCTION \t DATE \t\t\t\t DOCTORE");
		    	System.out.println("---- \t ------- \t ---- \t\t\t\t -------");

		    	for(int i=0;i<allPatient.size();i++){
		    		if(allPatient.get(i).getdate1().compareTo(from)>=0 && allPatient.get(i).getdate1().compareTo(to)<=0){
					    System.out.println(allPatient.get(i).getName() +"\t"+ allPatient.get(i).getlocation() +"\t"+ allPatient.get(i).getdate1() +"\t"+ allPatient.get(i).getDocName() );
		
		    		}
		    	}
		    	System.out.println("------------------------------------------------------------------");

		    	break;
		    case 2:
			    System.out.println("Bangalore Patients:"+bcount);
			    break;
		    case 3:
			    System.out.println("Outstation  Patients:"+ocount);
			    break;
		    case 4:
		    	Double inPatientPercentage = Double.valueOf(bcount * 100 / sizeAll);
		        Double outPatientPercentage = Double.valueOf(ocount * 100 / sizeAll);
			    System.out.println("Bangalore Patients in Percentage: "+inPatientPercentage);
			    System.out.println("Outstation  Patients in Percentage:"+outPatientPercentage);
			    break;
		    case 5:
		    	for(int i=0;i<allPatient.size();i++){
		    		if(allPatient.get(i).getdate1().compareTo(from)>=0 && allPatient.get(i).getdate1().compareTo(to)<=0){
		    			Doc.add(allPatient.get(i).getDocName());
		    			
		    		}
		    	}

		        Map<String, Integer> duplicates = new HashMap<String, Integer>(); 
		   
		        for (String str : Doc) { 
		           if (duplicates.containsKey(str)) { 
		              duplicates.put(str, duplicates.get(str) + 1); 
		           } else { 
		              duplicates.put(str, 1); 
		           } 
		        } 
		   
		        for (Map.Entry<String, Integer> entry : duplicates.entrySet()) { 
		           System.out.println(entry.getKey() + " = " + entry.getValue()); 
		        } 
		    	
		    	break;
		    case 6:
		    	System.exit(0);
		    	
		    }
		    
		    System.out.println("Are you want to continue(Y/N):");
		    ch =sc.next();
		    if(ch.equals("n")){
		    	System.exit(0);

		    }

	    }
	    
	    
	    
	    
	}

	

}
