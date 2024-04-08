import java.util.ArrayList;
import java.util.List;

class Lampe {

    private String nom;
    private boolean allume;

    public Lampe(String nom) {
        this.nom = nom;
        this.allume = false; // Initialiser la lampe éteinte
    }

    public void allumer() {
        this.allume = true;
    }

    public void eteindre() {
        this.allume = false;
    }

    public boolean isAllume() {
        return this.allume;
    }

    @Override
    public String toString() {
        String etat = allume ? "On" : "Off";
        return nom + ": " + etat;
    }
}
