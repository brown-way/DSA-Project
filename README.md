# DSA-Project
2024 DSA Phonebook Project
DESCRIPTION OF PROJECT
Our project is a Phone Book it allows to user enter and interact with the contact details, in the program.  the user is able to manipulate the contact list with feature to Add, Delete, update, sort and display contact details by using a Graphical User Interface.  


User Requirements
1.Allow the user to enter contact details the system.
2.It allows the user to manipulate the data by adding, editing, deleting and display.
3. the system can also store records of data.
4. it writes the code to a secured database using a LinkedList.

PROGRAMMING LANGUAGES/TOOLS USED
Write the name of the programming languages/tools you used here.
E.g. 	
Programming languages used: Java.
		Platform Used:  IntelliJ
Modules:
1.	 Insert Contact
2.	Search Contact
3.	Display All Contacts
4.	Delete Contact
5.	Update contact
6.	Sort Contacts

Functions:
Insert Contact: 
Purpose: Adds a new contact to the phone directory. 
Description: This function adds a new contact item to the phonebook list. 

Search Contact: 
Purpose: Finds a contact using either their name or phone number. 
Description: Uses a linear search of the phonebook to discover a matching contact depending on the query. 

Display all contacts: 
The purpose is to output all contacts saved in the phonebook. 
This function checks if the phonebook is empty and, if not, iterates through the contacts and prints their information.

Delete Contact: 
Purpose: Removes a specific contact from the phonebook. 
Description: This function looks for a contact using a query and deletes it if found. 

Update Contact: 
The purpose is to update an existing contact's information. 
Description: The function finds a contact using a query and then updates its name and phone number with the new information. 


Sort Contacts: 
Purpose: Sort contacts alphabetically by name. 
This optional function employs a merge sort method to arrange contacts in alphabetical order, which improves search efficiency.

Analyse your search algorithm's efficiency: Searching an unsorted list takes O(n) time because each item must be checked individually. Sorting the list first provides for faster binary searches, but the sorting process requires O(n log n) time. Sorting only makes sense if you want to search the list several times, as it requires an initial time investment.
