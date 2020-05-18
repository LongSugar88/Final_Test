package ContactManager;

import Contact.Contact;

public class Find extends Manager implements Command {
    String content;
    Contact contact;

    public Find(ContactManager manager, String content){
        super(manager);
        this.content = content;
    }
    public boolean findProduct(){
        boolean isHaveProduct = false;
        int size = this.manager.myContact.size();
        for(int i=0; i<size; i++){
            contact = this.manager.myContact.get(i);
            StringBuilder phoneNumber = new StringBuilder();
            phoneNumber.append(contact.getPhoneNumber());
            String myPhoneNumber = phoneNumber.toString();
            if(myPhoneNumber.contains(content)){
                isHaveProduct = true;
                break;
            }
            else if(contact.getName().contains(content)){
                isHaveProduct = true;
                break;
            }
        }
        return isHaveProduct;
    }
    @Override
    public void excute() {
        int size = this.manager.myContact.size();
        for(int i=0; i<size; i++){
            contact = this.manager.myContact.get(i);
            String myPhoneNumber = contact.getName();
            myPhoneNumber = myPhoneNumber.toUpperCase();
            content = content.toUpperCase();
            if(myPhoneNumber.contains(content)){
                System.out.println(contact.toString());
            }
        }
    }
}
