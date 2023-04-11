package MyPhoneBook;

public class PhoneNumber {
    private String countryCode;
    private String number;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if(number.length()==10)
            this.number = number;
        else{
            System.out.println("Wrong phone number!its size should be 10!");
            System.exit(1);
        }
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode='" + countryCode + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
