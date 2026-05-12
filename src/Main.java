public class Main {

    public static void main(String[] args) {

        // Affichage du titre du programme
        System.out.println("=== Gestionnaire de Contacts ===\n");

        // Création du gestionnaire de contacts
        ContactsManager myContactsManager = new ContactsManager();

        // ================= CONTACT 1 =================

        // Création du premier contact
        Contact contact1 = new Contact();

        // Définition du nom
        contact1.name = "Ali";

        // Définition du numéro
        contact1.phoneNumber = "01020304";

        // Ajout du contact
        myContactsManager.addContact(contact1);

        // ================= CONTACT 2 =================

        Contact contact2 = new Contact();

        contact2.name = "Balo";

        contact2.phoneNumber = "05060708";

        myContactsManager.addContact(contact2);

        // ================= CONTACT 3 =================

        Contact contact3 = new Contact();

        contact3.name = "Jenuma";

        contact3.phoneNumber = "07080910";

        myContactsManager.addContact(contact3);

        // ================= CONTACT 4 =================

        Contact contact4 = new Contact();

        contact4.name = "Ange";

        contact4.phoneNumber = "11121314";

        myContactsManager.addContact(contact4);

        // ================= CONTACT 5 =================

        Contact contact5 = new Contact();

        contact5.name = "Foto";

        contact5.phoneNumber = "15161718";

        myContactsManager.addContact(contact5);

        // ================= RECHERCHE =================

        // Message affiché avant la recherche
        System.out.println("Recherche du contact 'Balo'...\n");

        // Recherche du contact Balo
        Contact contactTrouve =
                myContactsManager.searchContact("Balo");

        // Vérifie si le contact existe
        if (contactTrouve != null) {

            // Affichage des informations du contact
            System.out.println("Contact trouvé !");
            System.out.println("-----------------");
            System.out.println("Nom : "
                    + contactTrouve.name);

            System.out.println("Téléphone : "
                    + contactTrouve.phoneNumber);

        } else {

            // Message si aucun contact n'est trouvé
            System.out.println("✘ Contact introuvable.");
        }
    }
}