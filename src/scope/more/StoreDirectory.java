package scope.more;

public class StoreDirectory {
    private Bookstore bookstore;
    private Market market;
    public StoreDirectory(String custId){
        bookstore = new Bookstore(custId);
        market = new Market();
    }

    public int getNumberOfBooks() {

        return bookstore.getNumBooks();
    }
    public int getNumberOfBookstoreEmployees() {
        //implement
        return this.bookstore.getNumEmployees();
    }
    public boolean addNewEmployee(String employeeId){
        //implement
        return this.bookstore.addNewEmployee(employeeId);
    }
    public boolean bookIsInStock(String bookId){
        //implement
        return this.bookstore.bookIsInStock(bookId);
        //return true;
    }
    public boolean addNewBook(String bookId){
        //implement
        return this.bookstore.addNewBook2(bookId);
        //return true;
    }
    public boolean marketCarriesFoodItem(String foodItem){
        //implement
        return this.market.carriesFoodItem(foodItem);
        //return true;
    }
}
