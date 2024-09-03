
class Marker{
    String name;
    String color;
    int year;
    int price;
    public Marker(String name, String color, int year, int price){
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}

class Invoice{
    private Marker marker;
    private int quantity;
    public Invoice(Marker marker, int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }
    public int calculateTotal(){
        int price = ((marker.price)*this.quantity);
        return price;
    }
}

class InvoiceDao{
    Invoice invoice;
    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }
    public void saveToDB(){
        //save to DB
    }
    public void saveToFile(String filename){
        //save Invoice in the file with the given name;
    }
}


public class WithoutOpenClosed{
    public static void main(String[] args) {
        Marker marker = new Marker("Blue Marker","Blue",2019,2);
        Invoice inv = new Invoice(marker, 2);
        System.out.println(inv.calculateTotal());
    }
}
