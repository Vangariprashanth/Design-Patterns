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
    public void printInvoice(){
        //print the invoice
    }
    public void saveToDB(){
        // save the data into DB
    }
}

public class WithoutSingleRespMarker{
    public static void main(String[] args) {
        Marker marker = new Marker("Blue Marker","Blue",2019,2);
        Invoice inv = new Invoice(marker, 2);
        System.out.println(inv.calculateTotal());
    }
}