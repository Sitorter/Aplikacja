
class Product{

    private String category;
    private String name;
    private String supplierEmail;
    private int stock;
    private double price;

    public Product(String name, String category, String supplierEmail, int stock, double price){
        this.name = name;
        this.category = category;
        this.supplierEmail = supplierEmail;
        this.stock = stock;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public String getName(){
        return name;
    }


    public void restock(){ System.out.println("Uzupełniono zapasy");}

    public void sell(){ System.out.println("Sprzedano");}


}

class Inventory extends Product{
    private String department;
    private int managedProductsCount;
    public Inventory(String name, String category, String supplierEmail, int stock, double price, String department, int managedProductsCount){
        super(name, category, supplierEmail, stock, price);
        this.department = department;
        this.managedProductsCount = managedProductsCount;

    }
    public String getDepartment() {
        return department;
    }
    public int getManagedProductsCount() {
        return managedProductsCount;
    }
    public void isLogged(){
        System.out.println("Zalogowano");
    }
    public void LogOut(){
        System.out.println("Wylogowano");
    }
    public void assignProduct(){
        System.out.println("Zmieniono liczbe produktow");
    }
    public void viewReports(){
        System.out.println("Wyswietl raporty");
    }
    public void displayManagerData(){
        System.out.println("Wyswietlono dane menedzera");
    }
}


public class Main {
    public static void main(String[] args) {

        Inventory I = new Inventory("maslo", "jedzenie", "email@gmail.com", 21, 31, "Piwnica", 20 );
        System.out.println(I.getCategory());
        System.out.println(I.getName());
        System.out.println(I.getSupplierEmail());
        System.out.println(I.getStock());
        System.out.println(I.getPrice());
        I.isLogged();
        I.restock();
        I.sell();
        I.viewReports();
        I.displayManagerData();
        I.assignProduct();
        I.LogOut();
        
    }
}