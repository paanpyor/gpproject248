public class customer {
    private String purchasingID;
    private String customerName;
    private String membership;
    private String bouquetName;
    private int bouquetquantity;
    private double bouquetPrice;
    
    //constructor
    public customer (String purchasingID,String customerName, String membership, String bouquetName,int bouquetquantity,double bouquetPrice)
    {
        this.purchasingID=purchasingID;
        this.customerName=customerName;
        this.membership=membership;
        this.bouquetName=bouquetName;
        this.bouquetquantity=bouquetquantity;
        this.bouquetPrice=bouquetPrice;

    }
    
    //setter
    public void setcustomer (String purchasingID,String customerName,String membership, String bouquetName,int bouquetquantity, double bouquetPrice)
    {
        this.purchasingID=purchasingID;
        this.customerName=customerName;
        this.membership=membership;
        this.bouquetName=bouquetName;
        this.bouquetquantity=bouquetquantity;
        this.bouquetPrice=bouquetPrice;

    }
    
    //getter
    
    public String getpurchasingID()
    {
        return purchasingID;
    }
    
    public String getCustomerName()
    {
        return customerName;
    }
    
    public String getMembership()
    {
        return membership;
    }
    
    public String getBouquetName()
    {
        return bouquetName;
    }
    
    public int getBouquetquantity()
    {
        return bouquetquantity;
    }
    
    public double getBouquetprice()
    {
        return bouquetPrice;
    }
    
    //calculation
    double totalprice = 0;
    public double totalprice()
    {
        totalprice=  bouquetPrice * bouquetquantity;
       return totalprice;
    }
    
    
    
    public String toString()
    {
        return "Purchasing ID: " + purchasingID + "\nCustomer Name: " + customerName + "\nCustomer Membership Status(NORMAL/VIP): " + membership + "\nBouquet Name: " + bouquetName + "\nBouquet Quantity: " 
        + bouquetquantity + "\nBouquet Price: " +  bouquetPrice;
    }
    
    public String toString2()
    {
        return "Purchasing ID: " + purchasingID + "\nCustomer Name: " + customerName + "\nCustomer Membership Status(NORMAL/VIP): " + membership + "\nBouquet Name: " + bouquetName + "\nBouquet Quantity: " 
        + bouquetquantity + "\nBouquet Price: " +  bouquetPrice + "\ntotalprice" + totalprice();
    }
    
}
    