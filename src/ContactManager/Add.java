package ContactManager;

import Contact.Contact;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Add extends Manager implements Command {
    Contact contact;

    public Add(ContactManager manager, Contact contact){
        super(manager);
        this.contact = contact;
    }
    public Add(ContactManager manager){
        super(manager);
    }

    public Contact addContact(){
        final String REGEX_PHONE_NUMBER = "[0-9]{10}";
        final String REGEX_NAME = "[A_Za-z]+";
        Pattern patternName= Pattern.compile(REGEX_NAME);
        Pattern patternNumber = Pattern.compile(REGEX_PHONE_NUMBER);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter new phone number (not optional): ");
        String number = scan.nextLine();
        Matcher matcherNumber = patternNumber.matcher(number);
        while (!matcherNumber.matches()){
            System.out.println("Enter new phone number (not optional): ");
            number = scan.nextLine();
            matcherNumber = patternNumber.matcher(number);
        }
        System.out.println("Enter new relationship (optional): ");
        String relation = scan.nextLine();
        System.out.println("Enter new name (not optional): ");
        String name = scan.nextLine();
        Matcher matcherName = patternName.matcher(name);
        while (!matcherName.matches()){
            System.out.println("Enter new name (not optional): ");
            name = scan.nextLine();
            matcherName = patternNumber.matcher(number);
        }
        System.out.println("Enter new gender (optional): ");
        String gender = scan.nextLine();
        System.out.println("Enter new date (optional): ");
        String date = scan.nextLine();
        System.out.println("Enter new address phone number (optional): ");
        String address = scan.nextLine();
        System.out.println("Enter new email (optional): ");
        String email = scan.nextLine();
        String num = number;
        Contact contact = new Contact(num , relation, name, gender, date, address, email);
        this.contact = contact;
        return this.contact;
    }

    @Override
    public void excute() {
        contact = addContact();
        this.manager.myContact.add(contact);
    }
}
