package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
    void testContactCreationSuccess() {
        Contact contact = new Contact("12345", "Abraham", "Guerrero", "1234567890", "123 Sesame St");
        assertEquals("12345", contact.getContactId());
        assertEquals("Abraham", contact.getFirstName());
        assertEquals("Guerrero", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Sesame St", contact.getAddress());
    }
	
	@Test
    void testContactIdTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "FirstName", "LastName", "1234567890", "Address");
        });
    }
	
	@Test
	void testContactIdIsNull() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(null, "Abraham", "Guerrero", "1234567890", "123 Sesame St");
	    });
	}
	
	@Test
	void testContactFirstNameTooLong() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("12345", "ThisNameIsTooLong", "Guerrero", "1234567890", "123 Sesame St");
	    });
	}
	
	@Test
    void testFirstNameIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", null, "LastName", "1234567890", "Address");
        });
    }
	
	@Test
	void testContactLastNameIsNull() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("12345", "Abraham", null, "1234567890", "123 Sesame St");
	    });
	}

	@Test
	void testContactLastNameTooLong() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("12345", "Abraham", "ThisLastNameIsTooLong", "1234567890", "123 Sesame St");
	    });
	}
    
    @Test
    void testContactPhoneTooShort() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Abraham", "Guerrero", "123456789", "123 Sesame St");
        });
    }
    
    @Test
    void testContactPhoneTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Abraham", "Guerrero", "12345678910111213", "123 Sesame St");
        });
    }
    

	@Test
	void testContactPhoneIsNull() {
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("12345", "Abraham", "Guerrero", null, "123 Sesame St");
	    });
	}
    
    @Test
    void testContactAddressTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Abraham", "Guerrero", "1234567890", "This address is much longer than thirty characters");
        });
    }

    @Test
    void testContactAddressIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Abraham", "Guerrero", "1234567890", null);
        });
    }
    
}
