
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        ArrayList<Contact> myContacts=new ArrayList<Contact>();
        PhoneBook myPhoneBook=new PhoneBook(myContacts);

        //printing menu

        System.out.println("Say your comment like these : \n1- contacts -a <contact firstName> <contact lastName>\n" +
                "2- contacts -r <contact firstName> <contact lastName>\n" +
                "3- show -g <group name>\n" +
                "4- show -c <contact firstName> <contact lastName>\n" +
                "5- show\n" +
                "6- exit");

        String mycomment=read.nextLine();
        int cnt=0;
        while(!mycomment.equals("exit")) {
            if (cnt == 0) {
                String[] find_comment = mycomment.split(" ", 3);
                if (find_comment[0].equals("show")) {
                    if (mycomment.contains("-g")) {
                        Contact[] same_group;
                        same_group = myPhoneBook.findContacts(find_comment[2]);
                        myPhoneBook.printSameGroup(same_group);
                    } else if (mycomment.contains("-c")) {
                        String[] find_name = find_comment[2].split(" ", 2);
                        myPhoneBook.printSpecificContact(myPhoneBook.findContact(find_name[0], find_name[1]));
                    } else {
                        myPhoneBook.printContacts();
                    }
                } else if (find_comment[1].equals("-a")) {

                    String[] find_name = find_comment[2].split(" ", 2);

                    Contact contact_for_add = new Contact();

                    PhoneNumber phoneNumber_for_add = new PhoneNumber();

                    Address address_for_add = new Address();

                    contact_for_add.setFirst_name(find_name[0]);
                    contact_for_add.setLast_name(find_name[1]);

                    System.out.println("\nEnter contact's group : ");
                    String enter_group = read.nextLine();
                    contact_for_add.setGroup(enter_group);

                    System.out.println("\nEnter contact's email : ");
                    String enter_email = read.nextLine();
                    contact_for_add.setEmail(enter_email);

                    System.out.println("\nEnter contact's country code : ");
                    String enter_country_code = read.nextLine();
                    phoneNumber_for_add.setCountryCode(enter_country_code);

                    System.out.println("\nEnter contact's phone number : ");
                    String enter_phone_number = read.nextLine();
                    phoneNumber_for_add.setNumber(enter_phone_number);
                    contact_for_add.setPhoneNumber(phoneNumber_for_add);

                    System.out.println("\nEnter contact's zipCode : ");
                    String enter_zip_code = read.nextLine();
                    address_for_add.setZipCode(enter_zip_code);

                    System.out.println("\nEnter contact's country : ");
                    String enter_country = read.nextLine();
                    address_for_add.setCountry(enter_country);

                    System.out.println("\nEnter contact's city : ");
                    String enter_city = read.nextLine();
                    address_for_add.setCity(enter_city);
                    contact_for_add.setAddress(address_for_add);

                    if (myPhoneBook.addContact(contact_for_add)) {
                        System.out.println("Contact Saved!");
                    } else {
                        System.out.println("Contact has been saved recently and exist in your book!!!");
                    }

                } else if (find_comment[1].equals("-r")) {
                    String[] find_name = find_comment[2].split(" ", 2);
                    if (myPhoneBook.deleteContact(find_name[0], find_name[1])) {
                        System.out.println("Ok, your comment done!!");
                    } else {
                        System.out.println("Not found!");
                    }
                } else {
                    System.out.println("Wrong input");
                    System.exit(0);
                }
                System.out.println("\nWhat do you want to do more???");
            }

            if(cnt!=0){
                String mycomment2= read.nextLine();
                if(mycomment2.equals("exit")){
                    System.exit(0);
                }
                String[] find_comment = mycomment2.split(" ", 3);
                if (find_comment[0].equals("show")) {
                    if (mycomment2.contains("-g")) {
                        Contact[] same_group;
                        same_group = myPhoneBook.findContacts(find_comment[2]);
                        myPhoneBook.printSameGroup(same_group);
                    } else if (mycomment2.contains("-c")) {
                        String[] find_name = find_comment[2].split(" ", 2);
                        myPhoneBook.printSpecificContact(myPhoneBook.findContact(find_name[0], find_name[1]));
                    } else {
                        myPhoneBook.printContacts();
                    }
                } else if (find_comment[1].equals("-a")) {

                    String[] find_name = find_comment[2].split(" ", 2);

                    Contact contact_for_add = new Contact();

                    PhoneNumber phoneNumber_for_add = new PhoneNumber();

                    Address address_for_add = new Address();

                    contact_for_add.setFirst_name(find_name[0]);
                    contact_for_add.setLast_name(find_name[1]);

                    System.out.println("\nEnter contact's group : ");
                    String enter_group = read.nextLine();
                    contact_for_add.setGroup(enter_group);

                    System.out.println("\nEnter contact's email : ");
                    String enter_email = read.nextLine();
                    contact_for_add.setEmail(enter_email);

                    System.out.println("\nEnter contact's country code : ");
                    String enter_country_code = read.nextLine();
                    phoneNumber_for_add.setCountryCode(enter_country_code);

                    System.out.println("\nEnter contact's phone number : ");
                    String enter_phone_number = read.nextLine();
                    phoneNumber_for_add.setNumber(enter_phone_number);
                    contact_for_add.setPhoneNumber(phoneNumber_for_add);

                    System.out.println("\nEnter contact's zipCode : ");
                    String enter_zip_code = read.nextLine();
                    address_for_add.setZipCode(enter_zip_code);

                    System.out.println("\nEnter contact's country : ");
                    String enter_country = read.nextLine();
                    address_for_add.setCountry(enter_country);

                    System.out.println("\nEnter contact's city : ");
                    String enter_city = read.nextLine();
                    address_for_add.setCity(enter_city);
                    contact_for_add.setAddress(address_for_add);

                    if (myPhoneBook.addContact(contact_for_add)) {
                        System.out.println("Contact Saved!");
                    } else {
                        System.out.println("Contact has been saved recently and exist in your book!!!");
                    }

                } else if (find_comment[1].equals("-r")) {
                    String[] find_name = find_comment[2].split(" ", 2);
                    if (myPhoneBook.deleteContact(find_name[0], find_name[1])) {
                        System.out.println("Ok, your comment done!!");
                    } else {
                        System.out.println("Not found!");
                    }
                } else {
                    System.out.println("Wrong input");
                    System.exit(0);
                }
                System.out.println("\nWhat do you want to do more???");

            }
            cnt++;
        }

    }
}

