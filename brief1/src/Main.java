class Main {
    
public static void main(String[] args) {
    
    Administrateur administrateur = new Administrateur();
    Scanner scanner = new Scanner(System.in);
    int choice;

    do
    {
        // Display menu
        System.out.println("\nMenu:");
        System.out.println("1. Ajouter une classe");
        System.out.println("2. Ajouter un apprenant");
        System.out.println("3. Associer un apprenant à une classe");
        System.out.println("4. Afficher les apprenants");
        System.out.println("5. Afficher les classes");
        System.out.println("0. Quitter");

        System.out.print("Choix: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Add class
                System.out.print("Entrez le numéro de la classe: ");
                int numeroClasse = scanner.nextInt();
                System.out.print("Entrez le nom de la classe: ");
                String nomClasse = scanner.next();
                System.out.print("Entrez l'effectif de la classe: ");
                int effectifClasse = scanner.nextInt();
                administrateur.ajouterClasse(new Classe(numeroClasse, nomClasse, effectifClasse));
                System.out.println("Classe ajoutée avec succès!");
                break;
        
            case 2:
                // Add apprenant
                System.out.print("Entrez le nom de l'apprenant: ");
                String nomApprenant = scanner.next();
                System.out.print("Entrez le prénom de l'apprenant: ");
                String prenomApprenant = scanner.next();
                administrateur.ajouterApprenant(new Apprenant(nomApprenant, prenomApprenant, "", "", ""));
                System.out.println("Apprenant ajouté avec succès!");
                break;
        
            case 3:
                // Associate apprenant with a class
                administrateur.afficherApprenants();
                System.out.print("Choisissez l'apprenant (index): ");
                int indexApprenant = scanner.nextInt();
                administrateur.afficherClasses();
                System.out.print("Choisissez la classe (index): ");
                int indexClasse = scanner.nextInt();
                administrateur.associerApprenantAClasse(administrateur.apprenants.get(indexApprenant), administrateur.classes.get(indexClasse));
                System.out.println("Apprenant associé à la classe avec succès!");
                break;
        
            case 4:
                // Display apprenants
                administrateur.afficherApprenants();
                break;
        
            case 5:
                // Display classes
                administrateur.afficherClasses();
                break;
        
            case 0:
                System.out.println("Programme terminé.");
                break;
        
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
                break;
        }
        

        } while (choice != 7);
    }
}