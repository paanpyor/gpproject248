import java.util.*;
import javax.swing.JOptionPane;

public class MainApp{
    public static void main (String[] args)
    {
        LinkedList florist  = new LinkedList();
        LinkedList flocust  = new LinkedList();
        Queue fq = new Queue();
        Queue custq = new Queue();
        Queue fqTemp = new Queue();
        Queue custqTemp = new Queue();

        String choice ="";

        do
        {
            choice = JOptionPane.showInputDialog ("This is Menu" + "\nA. Add Data" + "\nB. Delete Data" + "\nC. Modify Data" + "\nD. Display Data" + "\nE. Exit");

            if (choice.equalsIgnoreCase("A"))
            {
                //add data

                String customerID = JOptionPane.showInputDialog("Enter Customer ID: ");
                String customerName = JOptionPane.showInputDialog("Enter Customer Name: ");
                String scustomerPhoneNum = JOptionPane.showInputDialog("Enter Customer Phone Number: ");
                String bouquetID = JOptionPane.showInputDialog("Enter Bouquet ID: ");
                String bouquetName = JOptionPane.showInputDialog("Enter Bouquet Name: ");
                String bouquetType = JOptionPane.showInputDialog("Enter Bouquet Type: ");
                String sbouquetPrice = JOptionPane.showInputDialog("Enter Bouquet Price: ");
                String receiverName = JOptionPane.showInputDialog("Enter Receiver Name: ");
                String receiverLocation = JOptionPane.showInputDialog("Enter Receiver Location: ");
                String sDeliveryDistance = JOptionPane.showInputDialog("Enter Delivery Distance: ");
                String sDeliveryDate = JOptionPane.showInputDialog("Enter Delivery Date: ");
                String deliveryMonth = JOptionPane.showInputDialog("Enter Delivery Month: ");
                String sDeliveryYear = JOptionPane.showInputDialog("Enter Delivery Year: ");
                String deliveryMessage = JOptionPane.showInputDialog("Enter Delivery Message: ");
                String deliveryStatus = JOptionPane.showInputDialog("Enter Delivery Status: ");

                //any comments

                double dBouquetPrice = Double.parseDouble(sbouquetPrice);
                double dDeliveryDistance = Double.parseDouble(sDeliveryDistance);
                int iDeliveryYear = Integer.parseInt (sDeliveryYear);

                customer cust = new customer (customerID,customerName, scustomerPhoneNum,  bouquetID ,bouquetName , bouquetType, dBouquetPrice);
                order ord = new order ( receiverName, receiverLocation, dDeliveryDistance, sDeliveryDate, deliveryMonth, iDeliveryYear, deliveryMessage, deliveryStatus);
                
                flocust.insertAtBack(cust);
                florist.insertAtBack(ord);
            }

            if (choice.equalsIgnoreCase("B"))
            {
                //Delete Data
                //Delete data at specific location based on value entered by user
                //when customer cancel order
            }

            if (choice.equalsIgnoreCase("C"))
            {
                //Modify Data
                //modify data at specific location node
            }

            if (choice.equalsIgnoreCase("D"))
            {
                //Display Data
                //display data 
            }
            
            

        }    
        while(!choice.equalsIgnoreCase("E"));//exit the first process.

        //transfer all data from LinkedList to Queue
        // remove data 
        
        order ord = (order) florist.getFirst();
        while (!florist.isEmpty()){
            fq.enqueue(florist.removeFromFront());
        }
        
        customer cust = (customer) florist.getFirst();
        while (!florist.isEmpty()){
            custq.enqueue(florist.removeFromFront());
        }
        
        // insert data
        ord = (order) fq.getFront();
        while(!fq.isEmpty()){
            ord = (order) fq.dequeue();
            System.out.println(ord);
            fqTemp.enqueue(ord);
        }
        
        cust = (customer) custq.getFront();
        while(!custq.isEmpty()){
            ord = (order) custq.dequeue();
            System.out.println(cust);
            custqTemp.enqueue(cust);
        }
        
        //restore in queue
        ord = (order) fqTemp.getFront();
        while(!fqTemp.isEmpty()){
            ord = (order) fqTemp.dequeue();
            fq.enqueue(ord);
        }
        
        cust = (customer) custqTemp.getFront();
        while(!custqTemp.isEmpty()){
            ord = (order) custqTemp.dequeue();
            custqTemp.enqueue(ord);
        }
        //*while loop

    }
}
