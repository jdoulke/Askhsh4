import java.util.Date;
import java.text.*;

public class Foititis {
    
    private static int auxwnArithmos = 0;
    private String AM;
    private String onomatEpwnymo;
    private Date hmeromGennisis;
    private Eggrafi[] eggrafes= new Eggrafi[5];


   
    
    public Foititis(int etos, String onomatEpwnymo, Date hmeromGennisis) {
    	
        auxwnArithmos+=1;
        DecimalFormat mf = new DecimalFormat("0000");
        String tempArithm = mf.format(auxwnArithmos);
        this.AM= (etos + tempArithm); 
        this.onomatEpwnymo = onomatEpwnymo;
        this.hmeromGennisis = hmeromGennisis;
        
    }
     
    public void addEggrafi(Date hmerom, String akadExam, Mathima mathima) {
                   Eggrafi eggrafi = new Eggrafi(hmerom, akadExam, mathima);
                   for(int i = 0; i < eggrafes.length; i++) {
                	   if(eggrafes[i] == null) {
                		    eggrafes[i] = eggrafi;
                	   	    break;
                	   }
                   }
    }
    public String [] GetEggrafesStr() {
    	String getter[] = new String[10];
    	
    	for(int i = 0; i < eggrafes.length && eggrafes[i] != null; i++) {
    		getter[i] = dateToStr(eggrafes[i].getHmerom()) + " " + eggrafes[i].getKwdikosMathima() + " " + eggrafes[i].getMathima().getTitlos();
    	}
    	return getter;

    }
    public Eggrafi GetEggrafi(int kwdikos) {
    	Eggrafi temp = new Eggrafi();
    	for(int i = 0; i < eggrafes.length; i++) {
    		if(eggrafes[i] != null && eggrafes[i].getKwdikosMathima() == kwdikos) {
    	    	
    	    	temp = eggrafes[i];
    		}
    	}
    	return temp;


    }
    
    public Eggrafi exeiEggrafeiStoMathima(int kwdikos) {
        for (int i = 0; i < eggrafes.length; i++) {

	}
        return null;
    }
        
    public String toString() {
        StringBuffer sb = new StringBuffer(this.AM + " ");
        sb.append(this.onomatEpwnymo + " ");
        sb.append(dateToStr(this.hmeromGennisis));
        return sb.toString();
    }
    
    public String dateToStr(Date hmeromGennisis) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String str = df.format(this.hmeromGennisis);
        return str;
    }

    public String getOnomatEpwnymo() {
        return onomatEpwnymo;
    }

    
    public void setVathmos(Eggrafi eggrafi, float vathmos) {
    	for(int i = 0; i < eggrafes.length; i++) {
    		if(eggrafes[i].getKwdikosMathima() == eggrafi.getKwdikosMathima() && eggrafes[i] != null)
    				eggrafes[i].addVathmos(vathmos);
    	}
    }

    public String getAM() {
        return AM;
    }
         
}
