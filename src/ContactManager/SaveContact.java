package ContactManager;

import Contact.Contact;

import java.io.*;

public class SaveContact extends Manager implements Command {
    String link;

    public SaveContact(ContactManager manager, String link) {
        super(manager);
        this.link = link;
    }
    public String changeContactToString(Contact contact){
        String content = contact.getPhoneNumber() +
                "," +
                contact.getRelationship() +
                "," +
                contact.getName() +
                "," +
                contact.getGender() +
                "," +
                contact.getDate() +
                "," +
                contact.getAddress() +
                "," +
                contact.getEmail();
        return content;
    }
    @Override
    public void excute() {
        try {
            File file = new File(link);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Contact contact: this.manager.myContact) {
                String content = changeContactToString(contact);
                bufferedWriter.write(content);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
