import java.util.LinkedList;
import java.util.Scanner;

class Contact {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Email: " + email + ", Phone Number: " + phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class ContactManager {
    private LinkedList<Contact> contacts = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addContact() {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        Contact contact = new Contact(firstName, lastName, email, phoneNumber);
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    public void searchContact() {
        System.out.print("Enter search keyword: ");
        String keyword = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getFirstName().toLowerCase().contains(keyword) ||
                    contact.getLastName().toLowerCase().contains(keyword) ||
                    contact.getEmail().toLowerCase().contains(keyword) ||
                    contact.getPhoneNumber().contains(keyword)) {
                System.out.println("Contact found: " + contact);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    public void displayAllContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void deleteContact() {
        System.out.print("Enter the first name of the contact to delete: ");
        String firstName = scanner.nextLine();
        contacts.removeIf(contact -> contact.getFirstName().equalsIgnoreCase(firstName));
        System.out.println("Contact deleted successfully.");
    }

    public void sortContacts() {
        contacts.sort((c1, c2) -> c1.getFirstName().compareToIgnoreCase(c2.getFirstName()));
        System.out.println("Contacts sorted by first name.");
    }

    public void updateContact() {
        System.out.print("Enter the first name of the contact to update: ");
        String firstName = scanner.nextLine();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.print("Enter new first name: ");
                String newFirstName = scanner.nextLine();
                System.out.print("Enter new last name: ");
                String newLastName = scanner.nextLine();
                System.out.print("Enter new email: ");
                String newEmail = scanner.nextLine();
                System.out.print("Enter new phone number: ");
                String newPhoneNumber = scanner.nextLine();
                contact.setFirstName(newFirstName);
                contact.setLastName(newLastName);
                contact.setEmail(newEmail);
                contact.setPhoneNumber(newPhoneNumber);
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nContact Manager Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Delete Contact");
            System.out.println("5. Update Contact");
            System.out.println("6. Sort Contacts");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    contactManager.addContact();
                    break;
                case 2:
                    contactManager.searchContact();
                    break;
                case 3:
                    contactManager.displayAllContacts();
                    break;
                case 4:
                    contactManager.deleteContact();
                    break;
                case 5:
                    contactManager.updateContact();
                    break;
                case 6:
                    contactManager.sortContacts();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}