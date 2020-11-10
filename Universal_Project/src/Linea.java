
public class Linea {
   
   private int cod_linea;
   private String nom_linea;

    public Linea(int cod_linea, String nom_linea) {
        this.cod_linea = cod_linea;
        this.nom_linea = nom_linea;
    }

    public int getCod_linea() {
        return cod_linea;
    }

    public void setCod_linea(int cod_linea) {
        this.cod_linea = cod_linea;
    }

    public String getNom_linea() {
        return nom_linea;
    }

    public void setNom_linea(String nom_linea) {
        this.nom_linea = nom_linea;
    }

    @Override
    public String toString() {
        return "Linea{" + "cod_linea=" + cod_linea + ", nom_linea=" + nom_linea + '}';
    }
   
}
