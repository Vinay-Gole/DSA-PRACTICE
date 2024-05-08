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
