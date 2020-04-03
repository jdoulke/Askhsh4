import java.text.*;
import java.util.Date;
import java.util.Scanner;

public class MAIN {
   
    private static Foititis [] pinFoitites;
    private static Mathima [] mathimata = new Mathima[2];
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String args[]) {
        pinFoitites = new Foititis[10];
        pinFoitites[0] = new Foititis(18, "Papadopoulos Giwrgos",strToDate("10/10/1999"));
        pinFoitites[1] = new Foititis(18, "Gewrgiou Faidwn",strToDate("10/8/2000"));
        pinFoitites[2] = new Foititis(18, "Filippou Danai",strToDate("6/12/1999"));
        pinFoitites[3] = new Foititis(18, "Stergiou Kalliopi",strToDate("16/07/1999"));
        pinFoitites[4] = new Foititis(18, "Alexandridis Savvas",strToDate("23/09/2000"));
        mathimata[0] = new Mathima();
        mathimata[1] = new Mathima();
        
        mathimata[0].setKwdiko(201); 
        mathimata[0].setEx('B');
        mathimata[0].setTitlo("Αντικειμενοστρεφής Προγραμματισμός");
        mathimata[1].setKwdiko(102); 
        mathimata[1].setEx('A');
        mathimata[1].setTitlo("Αλγοριθμική και Προγραμματισμός");
        pinFoitites[1].addEggrafi(strToDate("27/2/2018"), "2018-19E",mathimata[1]);
        pinFoitites[1].addEggrafi(strToDate("28/2/2018"), "2018-19E",mathimata[0]);
        pinFoitites[3].addEggrafi(strToDate("28/2/2018"), "2018-19E",mathimata[0]);
        
        String [] temp = new String[10];
        
        for(int i = 0; i < pinFoitites.length && pinFoitites[i] != null; i++) {
        	temp = pinFoitites[i].GetEggrafesStr();
        	for(int k = 0; k < temp.length && temp[k] != null; k++) {
        		System.out.println(temp[k]);
        	}
        }
        System.out.println(pinFoitites[3].GetEggrafi(201).getHmerom());
        eisagwgiVathmol();

        
    }
    
        

	private static void eisagwgiVathmol() {
    	Eggrafi eggrafi = new Eggrafi();
    	System.out.println("Δώσε κωδικό μαθήματος: ");
    	boolean flag = false;
    	int kwdikos = scan.nextInt();
		for(int i = 0; i < mathimata.length; i++) {
			if(mathimata[i].getKwdikos() == kwdikos) {
				System.out.println( kwdikos + " " + mathimata[i].getTitlos());
				flag = true;
				break;
				}
		
		}
		if(flag == false)
			System.out.println("Δεν υπαρχει μαθημα με τον κωδικο που δωσατε");
		if(flag == true) {
		for(int j = 0; j < pinFoitites.length; j++) {
			if(pinFoitites[j] != null) {
				eggrafi = pinFoitites[j].GetEggrafi(kwdikos);
				if(eggrafi != null) {
					System.out.println("AM: " + pinFoitites[j].getAM() + ", Ονομ/μο: " + pinFoitites[j].getOnomatEpwnymo());
					System.out.println("Ημερ/νια εγγραφης: " + pinFoitites[j].GetEggrafi(kwdikos).getHmerom());
					System.out.println("Δωσε βαθμο: ");
					float vathmos = scan.nextFloat();
					pinFoitites[j].setVathmos(eggrafi, vathmos);
					}
							
				}
			}
		}
	}


	private static Date strToDate(String hmeromStr) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hmerom = null;
        try {
            hmerom = df.parse(hmeromStr);
        }
        catch (Exception ex ){
            System.out.println(ex);
        }
        return hmerom;
    }
    
    
    
}
