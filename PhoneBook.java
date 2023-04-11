import java.util.ArrayList;


public class PhoneBook {
    private ArrayList<Contact> contacts;
    private int currentSize = 0;
    public PhoneBook(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    boolean addContact(Contact contact) {
        for (Contact mokhatab : contacts) {
            if (mokhatab.getFirst_name().equals(contact.getFirst_name())&&mokhatab.getLast_name().equals(contact.getLast_name())) {
                return false;
            }
        }
        contacts.add(contact);
        return true;
    }

    boolean deleteContact(String firstName, String lastName) {
        for (Contact mokhatab : contacts) {
            if (mokhatab.getFirst_name().equals(firstName) && mokhatab.getLast_name().equals(lastName)) {
                contacts.remove(mokhatab);
                return true;
            }
        }
        return false;
    }

    Contact findContact(String firstName, String lastName) {
        for (Contact mokhatab : contacts) {
            if (mokhatab.getFirst_name().equals(firstName) && mokhatab.getLast_name().equals(lastName))
                return mokhatab;
        }
        return null;
    }

    Contact[] findContacts(String group) {
        Contact[] contacts_in_same_group = new Contact[contacts.size()];

        for (Contact mokhatab : contacts) {
            if (mokhatab.getGroup().equals(group)) {
                contacts_in_same_group[currentSize] = mokhatab;
                currentSize++;
            }
        }
        return contacts_in_same_group;
    }



    void printSpecificContact(Contact mokhatab){
        System.out.println("Contact{\ngroup: " + mokhatab.getGroup() + "\nemail: " + mokhatab.getEmail() + "\nFirstName: " + mokhatab.getFirst_name() + "\nLastName: " + mokhatab.getLast_name() + "\n" + mokhatab.getAddress() + "\n" + mokhatab.getPhoneNumber() + "\n}");
    }
    void printSameGroup(Contact[] SameGroup){
        for (int i=0;i<currentSize;i++) {
            System.out.println("Contact{\ngroup: " + SameGroup[i].getGroup() + "\nemail: " + SameGroup[i].getEmail() + "\nFirstName: " + SameGroup[i].getFirst_name() + "\nLastName: " + SameGroup[i].getLast_name() + "\n" + SameGroup[i].getAddress() + "\n" + SameGroup[i].getPhoneNumber() + "\n}");
        }
    }


    void printContacts() {
        for (Contact mokhatab : contacts) {
            System.out.println("Contact{\ngroup: " + mokhatab.getGroup() + "\nemail: " + mokhatab.getEmail() + "\nFirstName: " + mokhatab.getFirst_name() + "\nLastName: " + mokhatab.getLast_name() + "\n" + mokhatab.getAddress() + "\n" + mokhatab.getPhoneNumber() + "\n}");
        }
    }


}
