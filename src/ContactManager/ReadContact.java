package ContactManager;

import Contact.Contact;

import java.io.*;

public class ReadContact extends Manager implements Command {
    String link;

    public ReadContact(ContactManager manager, String link) {
        super(manager);
        this.link = link;
    }

    @Override
    public void excute() {
        try {
            File file = new File(link);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String content;
            while ((content = bufferedReader.readLine())!= null){
                String[] line = content.split(",");
                String phoneNumber = line[0];
                String relationship = line[1];
                String name = line[2];
                String gender = line[3];
                String date = line[5];
                String address = line[4];
                String email = line[6];
                Contact contact = new Contact(phoneNumber, relationship, name, gender, date, address, email );
                this.manager.myContact.add(contact);
                System.out.println(this.manager.myContact.size());
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
