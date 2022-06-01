import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        addGroups(phoneBook);
        addContacts(phoneBook);

        System.out.println(phoneBook);

        System.out.println("\nВсе контакты группы >Friends<");
        final List<Contact> family = phoneBook.searchByGroup("Family");
        for (Contact contact : family) {
            System.out.println(contact);
        }

        System.out.println("\nПоиск по номеру контакта >555444333<");
        final Contact searchNum = phoneBook.searchByNumber(555444333);
        System.out.println(searchNum);

    }

    private static void addGroups(PhoneBook phoneBook) {
        phoneBook.newGroup("Family");
        phoneBook.newGroup("Friends");
        phoneBook.newGroup("BlackList");
    }

    private static void addContacts(PhoneBook phoneBook) {
        phoneBook.newRecord(PhoneBook.createNewContact("Petya", 555222111), "BlackList", "Family");
        phoneBook.newRecord(PhoneBook.createNewContact("Olya", 555333222), "Friends", "Family");
        phoneBook.newRecord(PhoneBook.createNewContact("Kolya", 555444333), "BlackList", "Family");
        phoneBook.newRecord(PhoneBook.createNewContact("Vova", 555111666), "Friends", "Family");
        phoneBook.newRecord(PhoneBook.createNewContact("Dima", 550012111), "BlackList", "Friends");

    }
}
