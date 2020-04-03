import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date; 

public class Eggrafi {
    	
	private Date hmeromEggrafis;
	private String akadExamino;
	private float vathmos;
	private Mathima mathima;

    public Eggrafi(Date hmerom, String akadExam, Mathima mathima) {
        this.hmeromEggrafis = hmerom;
        this.akadExamino = akadExam;
        this.mathima = mathima;
    }
    public Eggrafi() {
    	
    }
    public Date getHmerom() {
  	
        return hmeromEggrafis;
    }

    public Mathima getMathima() {
        return mathima;
    }
    
    public int getKwdikosMathima() {
        return mathima.getKwdikos();
    }
    private String dateToStr() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String str = df.format(this.hmeromEggrafis);
        return str;
    }
    @Override
    public String toString() {
        return "Eggrafi{" + "hmerom=" + dateToStr() + ", akadExam=" + akadExamino + ", vathmos=" + vathmos + '}';
    }
    
    public void addVathmos(float vathmos) {
    	this.vathmos = vathmos;
    }
    
}
