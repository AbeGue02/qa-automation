package contact;

public class Contact {
    private final String contactId; 
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor for Contact Class: 
    // Throws IllegalArgumentException to prevent invalid objects from being created
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        // id: Not null, max 10 chars
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Invalid Contact ID");
        }
        
        // firstName: Not null, max 10 chars
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid First Name");
        }
        
        // lastName: Not null, max 10 chars
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid Last Name");
        }
        
        // phone: Not null, must be exactly 10 digits
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid Phone Number");
        }
        
        // address: Not null, max 30 chars
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid Address");
        }

        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }
    
    // Accessors
    
    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    
    // Mutators
    
    // firstName: Not null, max 10 chars
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid First Name");
        }
        this.firstName = firstName;
    }

    // lastName: Not null, max 10 chars
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid Last Name");
        }
        this.lastName = lastName;
    }

    // phone: Not null, must be exactly 10 digits
    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid Phone Number");
        }
        this.phone = phone;
    }

    // address: Not null, max 30 chars
    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid Address");
        }
        this.address = address;
    }
    
}
