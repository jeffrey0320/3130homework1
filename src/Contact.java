public class Contact implements Comparable<Contact>{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String stAddress;
    private String city;
    private String state;

    //an update method that allows the user to change all information
    public void updateInfo(String firstName, String lastName, String phoneNumber, String stAddress, String city, String state){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.stAddress = stAddress;
        this.city = city;
        this.state = state;
    }
    //An overridden equals() method that can tell if one Contact is the same as another.
    public boolean equals(Object obj) {

        if(!(obj instanceof Contact))
            return false;
        Contact c = (Contact)obj;

        return this.compareTo(c)==0;
    }
    //A comparison method
    @Override
    public int compareTo(Contact another) {
        if(this.lastName.compareTo(another.lastName) > 0)
            return 1;
        else if(this.lastName.compareTo(another.lastName) < 0)
            return -1;
        else if(this.lastName.compareTo(another.lastName) == 0){
            if(this.firstName.compareTo(another.firstName) == 0)
                return 0;
            else
                return this.firstName.compareTo(another.firstName);
        }
        return 0;
    }
    //An overridden toString() method that creates a printable representation for a
    //Contact object.
    @Override
    public String toString() {
        return  firstName + " " + lastName + "       " + " phoneNumber: " + phoneNumber + "\n" +
                stAddress + "\n" +
                city + ", " + state;
    }
    //A constructor that initializes all the fields with information.
    public Contact(String firstName, String lastName, String phoneNumber, String stAddress, String city, String state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.stAddress = stAddress;
        this.city = city;
        this.state = state;
    }
    //A constructor that initializes only the name and phone number.
    public Contact(String firstName, String phoneNumber) {
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }
    //accessor (getter) methods for all of the data members.
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getStAddress() {
        return stAddress;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
}
