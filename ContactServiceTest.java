package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
    void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "Abraham", "Guerrero", "1234567890", "123 West St");
        service.addContact(contact);
        
        assertNotNull(service.getContact("123"));
        assertEquals("Abraham", service.getContact("123").getFirstName());
    }

    @Test
    void testDeleteContactVerification() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "Abraham", "Guerrero", "1234567890", "123 West St");
        service.addContact(contact);
        
        service.deleteContact("123");
        
        assertNull(service.getContact("123"));
    }

    @Test
    void testUpdateContactVerification() {
        ContactService service = new ContactService();
        Contact contact = new Contact("123", "Abraham", "Guerrero", "1234567890", "123 West St");
        service.addContact(contact);
        
        service.updateContact("123", "Abe", "G", "0987654321", "456 East St");
        
        Contact updated = service.getContact("123");
        assertEquals("Abe", updated.getFirstName());
        assertEquals("G", updated.getLastName());
        assertEquals("0987654321", updated.getPhone());
        assertEquals("456 East St", updated.getAddress());
    }

}
