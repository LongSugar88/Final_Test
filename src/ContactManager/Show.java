package ContactManager;

import Contact.Contact;
import ContactManager.Command;
import ContactManager.Manager;

public class Show extends Manager implements Command {
    Contact contact;

    public Show(ContactManager manager){
        super(manager);
    }

    @Override
    public void excute() {
        int size = this.manager.myContact.size();
        System.out.println("size " + size);
        for(int i=0; i< size; i++){
            contact = this.manager.myContact.get(i);

            System.out.println(contact.toString());
        }
    }
}
