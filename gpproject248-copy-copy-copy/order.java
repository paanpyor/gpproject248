public class order
{
    private String receiverName;
    private String receiverLocation;
    private double deliveryDistance;
    private String deliveryMessage;
    private String deliveryStatus;

    public order ( String receiverName, String receiverLocation, double deliveryDistance,  String deliveryMessage, String deliveryStatus)
    {
        this.receiverName = receiverName;
        this.receiverLocation = receiverLocation;
        this.deliveryDistance = deliveryDistance;
        this.deliveryMessage = deliveryMessage;
        this.deliveryStatus = deliveryStatus;
    }

    public void setorder( String receiverName, String receiverLocation, double deliveryDistance,  String deliveryMessage, String deliveryStatus)
    {
        this.receiverName = receiverName;
        this.receiverLocation = receiverLocation;
        this.deliveryDistance = deliveryDistance;
        this.deliveryMessage = deliveryMessage;
        this.deliveryStatus = deliveryStatus;
    }

    public String getReciverName()
    {
        return receiverName;
    }

    public String getReceiverLocation()
    {
        return receiverLocation;
    }

    public double getDeliveryDistance()
    {
        return deliveryDistance;
    }

    public String getDeliveryMessage()
    {
        return deliveryMessage;
    }

     public String getDeliveryStatus()
    {
        return deliveryStatus;
    }

    //any comments

    public String toString()
    {
        return  "\nReceiver Name: " + receiverName + "\nReceiver Location: " 
        + receiverLocation + "\nDelivery Distance: " + deliveryDistance +  "\nDelivery Message: " + deliveryMessage + "\nDelivery Status: " + deliveryStatus;
    }
}
