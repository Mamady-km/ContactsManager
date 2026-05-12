public class ContactsManager {

    // Tableau qui va contenir les contacts
    Contact[] myFriends;

    // Variable qui compte le nombre de contacts ajoutés
    int friendsCount;

    // Constructeur de la classe ContactsManager
    ContactsManager() {

        // Initialisation du compteur à 0
        friendsCount = 0;

        // Création d'un tableau de 500 contacts
        myFriends = new Contact[500];
    }

    // Méthode pour ajouter un contact
    void addContact(Contact contact) {

        // Ajouter le contact dans le tableau
        myFriends[friendsCount] = contact;

        // Augmenter le compteur
        friendsCount++;
    }

    // Méthode pour rechercher un contact par son nom
    Contact searchContact(String searchName) {

        // Boucle pour parcourir les contacts
        for (int i = 0; i < friendsCount; i++) {

            // Vérifie si le nom correspond
            if (myFriends[i].name.equals(searchName)) {

                // Retourne le contact trouvé
                return myFriends[i];
            }
        }

        // Retourne null si aucun contact n'est trouvé
        return null;
    }
}