public class Contact {
    private String group;
    private String email;
    private String first_name;
    private String last_name;
    private Address address;
    private PhoneNumber phoneNumber;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        if(group.equals("")){
            this.group="---";
        }
        else{
            this.group = group;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.equals("")){
            this.email="---";
        }
        else{
            this.email = email;
        }
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

