package Contact;

public class Contact {
    private String phoneNumber;
    private String relationship;
    private String name;
    private String gender;
    private String date;
    private String address;
    private String email;

    public Contact(){
    }

    public Contact(String phoneNumber, String relationship, String name, String gender, String date, String address, String email) {
        this.phoneNumber = phoneNumber;
        this.relationship = relationship;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.address = address;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        StringBuilder detailContact = new StringBuilder();
        detailContact.append("Name: " + name+"\n");
        detailContact.append("- Relationship: " + relationship +"\n");
        detailContact.append("- Phone number: +" + phoneNumber+"\n");
        detailContact.append("- Gender: " + gender+"\n");
        detailContact.append("- Address: " + address+"\n");
        return detailContact.toString();
    }
}
