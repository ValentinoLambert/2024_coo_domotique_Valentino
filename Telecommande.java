import java.util.ArrayList;
import java.util.List;
class Telecommande {
    private List<Lampe> lampes;

    public Telecommande() {
        this.lampes = new ArrayList<>();
    }

    // Méthodes
    public void ajouterLampe(Lampe lampe) {
        lampes.add(lampe);
    }

    public void activerLampe(int indiceLampe) {
        if (indiceLampe >= 0 && indiceLampe < lampes.size()) {
            lampes.get(indiceLampe).allumer();
        } else {
            System.out.println("Indice de lampe invalide !");
        }
    }

    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe >= 0 && indiceLampe < lampes.size()) {
            lampes.get(indiceLampe).eteindre();
        } else {
            System.out.println("Indice de lampe invalide !");
        }
    }

    public void activerTout() {
        for (Lampe lampe : lampes) {
            lampe.allumer();
        }
    }

    @Override
    public String toString() {
        return "Telecommande{" +
                "lampes=" + lampes +
                '}';
    }
}