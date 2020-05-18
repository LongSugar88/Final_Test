package ContactManager;

import Contact.Contact;

public class Delete extends Manager implements Command {
    String content;
    Contact contact;
    boolean isDelete = false;

    public Delete(ContactManager manager, String content){
        super(manager);
        this.content = content;
    }

    public boolean isDelete() {
        return isDelete;
    }

    @Override
    public void excute() {
        int size = this.manager.myContact.size();
        for(int i=0; i<size; i++){
            contact = this.manager.myContact.get(i);
            StringBuilder phoneNumber = new StringBuilder();
            phoneNumber.append(contact.getPhoneNumber());
            String myPhoneNumber = phoneNumber.toString();
            if(myPhoneNumber.contains(content)){
                this.manager.myContact.remove(i);
                isDelete = true;
                System.out.println(contact.toString());
            }
            else if(contact.getName().contains(content)){
                this.manager.myContact.remove(i);
                isDelete = true;
                System.out.println(contact.toString());
            }
        }
    }
}
