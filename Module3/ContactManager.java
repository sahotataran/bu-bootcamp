package Module3;

import java.util.ArrayList;
import java.util.HashMap;

public class ContactManager {
    
    public static void main(){
        Contact c1 = new Contact("Thor", "1-111-111-1111");
        Contact c2 = new Contact("Ethan Hunt", "2-222-222-2222");
        Contact c3 = new Contact("Captain America", "3-333-333-3333");
        Contact c4 = new Contact("Black Widow", "4-444-444-4444");
        Contact c5 = new Contact("Superman", "5-555-555-5555");

        HashMap<String, Contact> contacts = new HashMap<>();
        contacts.put(c1.getName(), c1);
        contacts.put(c2.getName(), c2);
        contacts.put(c3.getName(), c3);
        contacts.put(c4.getName(), c4);
        contacts.put(c5.getName(), c5);

        Contact searchContact = contacts.get(c3.getName());
        printContact(searchContact);

        searchContact = contacts.get("Random name");
        printContact(searchContact);

        ArrayList<Contact> contactArray = new ArrayList<>(contacts.values());
        contactArray.sort((a,b) -> a.getName().compareTo(b.getName()));

        System.out.println("=========== All Contacts ==========");
        for( Contact c : contactArray){
            printContact(c);
        }


    }

    public static void printContact( Contact c ){
        if( c != null){
            System.out.println(c);
        } else {
            System.out.println("Name not found!");
        }
    }

}
