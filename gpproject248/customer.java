
public class customer {
    private String customerID;
    private String customerName;
    private String customerPhoneNum;
    private String bouquetID;
    private String bouquetName;
    private String bouquetType;
    private double bouquetPrice;


    public customer (String customerID,String customerName,String customerPhoneNum,String bouquetID,String bouquetName,String bouquetType,double bouquetprice)
    {
        this.customerID=customerID;
        this.customerName=customerName;
        this.customerPhoneNum=customerPhoneNum;
        this.bouquetID=bouquetID;
        this.bouquetName=bouquetName;
        this.bouquetType=bouquetType;
        this.bouquetPrice=bouquetPrice;

    }
    
    
    public void setcustomer (String customerID,String customerName,String customerPhoneNum,String bouquetID,String bouquetName,String bouquetType,double bouquetprice)
    {
        this.customerID=customerID;
        this.customerName=customerName;
        this.customerPhoneNum=customerPhoneNum;
        this.bouquetID=bouquetID;
        this.bouquetName=bouquetName;
        this.bouquetType=bouquetType;
        this.bouquetPrice=bouquetPrice;

    }
    
    public String getcustomerID()
    {
        return customerID;
    }
    
    public String getcustomerName()
    {
        return customerName;
    }
    
    public String getcustomerPhoneNum()
    {
        return customerPhoneNum;
    }
    
    public String getbouquetID()
    {
        return bouquetID;
    }
    
    public String getbouquetName()
    {
        return bouquetName;
    }
    
    public String getbouquetType()
    {
        return bouquetType;
    }
    
    public double getbouquetprice()
    {
        return bouquetPrice;
    }
    
    public String toString()
    {
        return "Customer ID: " + customerID + "\nCustomer Name: " + customerName + "\nCustomer Phone Number: " 
        + customerPhoneNum + "\nBouquet ID: " + bouquetID + "\nBouquet Name: " + bouquetName + "\nBouquet Type: " 
        + bouquetType + "\nBouquet Price: " +  bouquetPrice;
    }
}
    