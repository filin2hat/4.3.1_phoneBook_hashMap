import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, List<Contact>> phoneBook = new HashMap<>();

    public static Contact createNewContact(String name, int number) {
        return new Contact(name, number);
    }

    public boolean newGroup(String groupName) {
        if (phoneBook.containsKey(groupName))
            return false;
        phoneBook.put(groupName, new ArrayList<>());
        return true;

    }

    public boolean newRecord(Contact contact, String... groupNames) {
        for (String groupName : groupNames) {
            if (!phoneBook.containsKey(groupName))
                return false;
            phoneBook.get(groupName).add(contact);
        }
        return true;
    }

    public List<Contact> searchByGroup(String groupName) {
        return phoneBook.get(groupName);
    }

    public Contact searchByNumber(int number) {
        for (List<Contact> listRecord : phoneBook.values()) {
            for (Contact record : listRecord) {
                if (record.getNumber() == number)
                    return record;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<Contact>> group : phoneBook.entrySet()) {
            sb.append(group.getKey());
            sb.append("\n");
            for (Contact contact : group.getValue()) {
                sb.append("\t");
                sb.append(contact);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}

