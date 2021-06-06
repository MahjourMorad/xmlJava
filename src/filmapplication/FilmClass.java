
package filmapplication;

import java.io.Serializable;


public class FilmClass implements Serializable{
    private String titre;
    private String genre;
    private String pays;
    private String annee;
    private String mes;
    private String resume;
    
    public FilmClass(){}
    
    public FilmClass(String titre, String genre, String pays, String annee, String mes, String resume) {
        this.titre = titre;
        this.genre = genre;
        this.pays = pays;
        this.annee = annee;
        this.mes = resume;
    }
    
    public FilmClass(FilmClass f) {
        this.titre = f.titre;
        this.genre = f.genre;
        this.pays = f.pays;
        this.annee = f.annee;
        this.mes = f.resume;
    }
    
    //getters
    public String getTitre() {
        return titre;
    }

    public String getGenre() {
        return genre;
    }

    public String getPays() {
        return pays;
    }

    public String getannee() {
        return annee;
    }

    public String getMes() {
        return mes;
    }

    public String getResume() {
        return resume;
    }
    
    //setters
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setannee(String annee) {
        this.annee = annee;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
    
    public String toString() {
        return "Donneurs{" + "Titre=" + titre + ", Genre=" + genre + ", Pays=" + pays + ", annee=" + annee + ", Mes=" + mes + '}';
    }
}
