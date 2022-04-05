package java;

public class Adressa {
    private String carrer;
    private String poblacio;
    private String codiPostal;
    private String pais;
    
    public Adressa(String carrer, String poblacio, String codiPostal, String pais) {
        this.carrer = carrer;
        this.poblacio = poblacio;
        this.codiPostal = codiPostal;
        this.pais = pais;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public String getCodiPostal() {
        return codiPostal;
    }

    public void setCodiPostal(String codiPostal) {
        this.codiPostal = codiPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Adressa\n" + 
                "   carrer     = " + this.carrer + "\n" +
                "   codiPostal = " + this.codiPostal + "\n" + 
                "   pais       = " + this.pais + "\n" + 
                "   poblacio   = " + this.poblacio + "\n";
    }


    

}
