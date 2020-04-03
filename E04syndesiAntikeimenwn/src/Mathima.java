
public class Mathima {

    private int kwdikos;
    private String titlos;
    private char examinoPS;
    
    public Mathima(int kwdikos, char examinoPS, String titlos) {
        this.kwdikos = kwdikos;
        this.examinoPS = examinoPS;
        this.titlos = titlos;
    }
    public Mathima() {
    	
    }

    public String getTitlos() {
        return titlos;
    }

    public int getKwdikos() {
        return kwdikos;
    }
    public void setKwdiko(int kwdikos) {
    	this.kwdikos = kwdikos;
    }
    public void setTitlo(String titlos) {
    	this.titlos = titlos;
    }
    public void setEx(char examinoPS) {
    	this.examinoPS = examinoPS;
    }
    @Override
    public String toString() {
        return "Mathima{" + "kwdikos=" + kwdikos + ", titlos=" + titlos 
                + ", examinoPS=" + examinoPS + '}';
    }
    
    
    
}
