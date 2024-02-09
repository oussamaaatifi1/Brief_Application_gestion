import java.util.ArrayList;
import java.util.List;

public class Classe {
    private int numero;
    private String nom;
    private int effectif;
    private List<Apprenant> apprenants;

    public Classe(int numero, String nom, int effectif) {
        this.numero = numero;
        this.nom = nom;
        this.effectif = effectif;
        this.apprenants = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }
    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    public List<Apprenant> getApprenants() {
        return apprenants;
    }

    public void ajouterApprenant(Apprenant apprenant) {
        apprenants.add(apprenant);
    }

    public void supprimerApprenant(Apprenant apprenant) {
        apprenants.remove(apprenant);
    }

    public void modifierClasse(int numero, String nom, int effectif) {
        this.numero = numero;
        this.nom = nom;
        this.effectif = effectif;
    }

    public void supprimerClasse() {
        apprenants.clear();
    }

    public List<Apprenant> filtrerApprenantsParClasse() {
        return apprenants;
    }

    public void consulterApprenants() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consulterApprenants'");
    }
}