package ContactManager;

import Contact.Contact;

import java.util.Scanner;

public class Edit extends Manager implements Command {
    Scanner scan = new Scanner(System.in);
    String content;
    Contact contact;

    public Edit(ContactManager manager, String content){
        super(manager);
        this.content = content;
    }
    public Edit(ContactManager manager){
        super(manager);
    }

    @Override
    public void excute() {
        int size = this.manager.myContact.size();
        for(int i=0; i<size; i++){
            contact = this.manager.myContact.get(i);
            String nameContact = contact.getName();
            nameContact = nameContact.toUpperCase();
            content = content.toUpperCase();
            if(nameContact.contains(content)){
                System.out.println("Enter new relationship: ");
                String relationship = scan.nextLine();
                contact.setRelationship(relationship);
                System.out.println("Enter new name: ");
                String name = scan.nextLine();
                contact.setName(name);
                System.out.println("Enter new gender: ");
                String gender = scan.nextLine();
                contact.setGender(gender);
                System.out.println("Enter new address: ");
                String address = scan.nextLine();
                contact.setAddress(address);
                System.out.println("Enter new date of birth: ");
                String date = scan.nextLine();
                contact.setDate(date);
                System.out.println("Enter new email: ");
                String email= scan.nextLine();
                contact.setEmail(email);
                break;
            }
        }
    }
}
