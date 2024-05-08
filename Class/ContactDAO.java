// SingleTon class:The class which allows us to create only  onc  Object of the  class is called singleton class.
// That means it restrict to create unecessary objects
// Whenever the request is made it uses the existing object instead of creating new one.


// 1.Declare static data member which is instance of class
// 2. Create private constructor which  restrict to create the instance of singleton class
// 3.Create static factory method which allows us to  create and access  the object and also 
// restric to  create more than object one.
// 

public class ContactDAO {

    private static ContactDAO contactDao = null;

    private ContactDAO() {

    }

    public static ContactDAO getInstance() {

        if (contactDao == null) {
            contactDao = new ContactDAO();

        }
        return contactDao;
    }

    public static void main(String[] args) {

        ContactDAO obj = ContactDAO.getInstance();
        ContactDAO obj2 = ContactDAO.getInstance();
        System.out.println(obj);
        System.out.println(obj2);

    }

    public   void getContactDetails() {
        System.out.println("Contact Details");
    }
}
