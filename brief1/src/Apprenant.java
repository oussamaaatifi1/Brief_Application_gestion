import java.util.List;

public class Apprenant {
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String adresse;
    private String numeroTelephone;
    private int numClasse;
    private Classe salle;

    public Apprenant(String nom, String prenom, String dateNaissance, String adresse, String numeroTelephone,int numClasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
        this.numClasse = numClasse;
    }


    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumeroTelephone() {
        return this.numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public int getNumClasse() {
        return this.numClasse;
    }

    public void numClasse(int numClasse) {
        this.numClasse = numClasse;
    }

    public Classe getSalle() {
        return this.salle;
    }

    public void setSalle(Classe salle) {
        this.salle = salle;
    }
    

    // autres méthodes pour la gestion des apprenants

    // Ajoute un apprenant dans une salle
    public void ajouteApprenant(Classe salle) {
        if (salle != null) {
            salle.ajouterApprenant(this);
        } else {
            System.out.println("Erreur : la salle est nulle");
        }
    }

    // Supprime un apprenant d'une salle
    public void supprimeApprenant(Classe salle) {
        if (salle != null) {
            salle.supprimerApprenant(this);
        } else {
            System.out.println("Erreur : la salle est nulle");
        }
    }

    // Affiche les informations d'un apprenant
    public void afficheApprenant() {
        System.out.println("Nom : " + nom + ", Prénom : " + prenom + ", Date de naissance : " + dateNaissance + ", Adresse : " + adresse + ", Numéro de téléphone : " + numeroTelephone + ", Salle : " + salle.getNom());
    }

    // Recherche un apprenant par son nom
    public Apprenant rechercheApprenant(String nom) {
        if (this.getNom().equals(nom)) {
            return this;
        } else {
            System.out.println("Erreur : aucun apprenant trouvé avec ce nom");
            return null;
        }
    }


    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", prenom='" + getPrenom() + "'" +
            ", dateNaissance='" + getDateNaissance() + "'" +
            ", adresse='" + getAdresse() + "'" +
            ", numeroTelephone='" + getNumeroTelephone() + "'" +
            ", salle='" + getSalle() + "'" +
            "}";
    }

    // Modifie les informations d'un apprenant
    public void modifieApprenant(String nom, String prenom, String dateNaissance, String adresse, String numeroTelephone, Classe salle) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
        this.salle = salle;
    }
    public void consulterApprenants() {
    List<Apprenant> apprenants = salle.getApprenants();
    if (apprenants.isEmpty()) {
        System.out.println("Erreur : la liste des apprenants est vide");
    } 
    else
    {
        System.out.println("Liste des apprenants :");
        for (Apprenant apprenant : apprenants)
        {
            apprenant.afficheApprenant();
        }
    }
    }
}