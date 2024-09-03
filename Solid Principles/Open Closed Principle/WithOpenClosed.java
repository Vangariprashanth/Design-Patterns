interface InvoiceDao{
    public void save(Invoice invoice);
}
class DatabaseInvoiceDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice){

    }
}

class FileInvoiceDao implements InvoiceDao{
    @Override 
    public void save(Invoice invoice){
        //saves 
    }

}

public class WithOpenClosed {
    
}
