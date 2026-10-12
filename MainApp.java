public class MainApp {
    public static void main(String[] args) {
        // 1. Création des clients
        Client c1 = new Client("07123456", "Ben Salah", "Sonia", "98765432");
        Client c2 = new Client("09876543", "Kacem", "Ahmed", "50112233");

        // 2. Création des comptes bancaires
        CompteBancaire compte1 = new CompteBancaire("CB-1001", 500.0, c1);
        CompteBancaire compte2 = new CompteBancaire("CB-1002", 1500.0, c2);

        // 3. Affichage initial
        compte1.afficherDetails();
        compte2.afficherDetails();

        // 4. Tests dépôts / retraits
        compte1.deposer(200.0);     // → 700.0
        compte1.retirer(1000.0);    // → échec (solde insuffisant)
        compte1.retirer(300.0);     // → 400.0

        // 5. Test virement (500 de compte2 vers compte1)
        compte2.virement(compte1, 500.0);

        // 6. État final
        compte1.afficherDetails();
        compte2.afficherDetails();

        System.out.println("\n Nombre total de comptes créés : " + CompteBancaire.getNombreComptes());
    }
}