import java.util.*;
import javax.swing.JOptionPane;

public class flowerStudioMainApp{
    public static void main (String[] args)
    {        
        LinkedList flocust  = new LinkedList();
        LinkedList order    = new LinkedList();

        Queue fq = new Queue();
        Queue custq = new Queue();
        Queue fqTemp = new Queue();
        Queue custqTemp = new Queue();

        //WELCOMING MESSAGE
        JOptionPane.showMessageDialog(null,"Welcome! This is system to manage and keep track customer order.","Flower Studio Malaysia", JOptionPane.PLAIN_MESSAGE);

        
        
        //prompt user for input. 1=proceed, 2=exit
        //apply do-while loop
        boolean flag = false;
        do {
            // code inside the loop
            int userInput = JOptionPane.showOptionDialog(null, "Enter '1' to proceed or '2' to exit: ", "Option Dialog", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if(userInput == JOptionPane.YES_OPTION) 
            {
                //Maksudnya sini user pilih proceed. So sini aku letak if coniditon. Tak guna if else if sebab there are no else option.
                //aku nk buat, if choice=5 the, flag=true OR guna break; suoaya dapat kelaur dari this do-while loop and go to next process.
                int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "This is Menu" + "\n\t1. Add Data" + "\n\t2. Delete Data" + "\n\t3. Modify Data" + "\n\t4. Display Data" + "\n\t5. Exit"));
                if(choice== 1)
                {
                    //USER CHOOSE TO ADD DATA
                    String purchasingID = JOptionPane.showInputDialog("Enter Purchasing ID: ");
                    String customerName = JOptionPane.showInputDialog("Enter Customer Name: ");
                    String membership = JOptionPane.showInputDialog("Enter Customer Membership Status (VIP/NORMAL): ");
                    String bouquetName = JOptionPane.showInputDialog("Enter Bouquet Name: ");
                    String sbouquetquantity = JOptionPane.showInputDialog("Enter Bouquet Quantity: ");
                    String sbouquetPrice = JOptionPane.showInputDialog("Enter Bouquet Price: ");

                    double dBouquetPrice = Double.parseDouble(sbouquetPrice);
                    int    dBouquetquantity =Integer.parseInt(sbouquetquantity);

                    //create new object name 'cust' in class 'customer' AND put all values (stored in their respective variables) into the object.
                    customer cust = new customer (purchasingID,customerName,membership, bouquetName , dBouquetquantity, dBouquetPrice);
                    //to put in LinkedList
                    //using insertAtFront & insertAtBack method.
                    if(flocust == null)
                    {
                        //if flocust list empty, insert at front.
                        //passing cust as parameter
                        flocust.insertAtFront(cust);

                        //print the added data
                        System.out.println("DATA ADDED:");
                        System.out.println(cust.toString());
                    }
                    else 
                    {
                        //flocust list not empty(dah ada data), so insert at back.
                        //passing cust as parameter.
                        flocust.insertAtBack(cust);

                        //print the added data
                        System.out.println("DATA ADDED:");
                        System.out.println(cust.toString());
                    }

                    //ADD DATA-FINISH
                }

                if(choice== 2)
                {
                    //USER CHOOSE TO DELETE DATA

                    //prompt user for input
                    //user need to enter the purchasingId that she/he want to delete
                    String wantToDelete= JOptionPane.showInputDialog("Please enter the Purchasing ID that you wish to delete its data: ");

                    //using removeFromFront.
                    //pasing value stored in variable 'wantToDelete' as parameter
                    Object removed = flocust.removeFromFront(wantToDelete);

                    //kan return value and stored in 'removed'
                    //nk check and nk display the deleted data.
                    if (flocust.isEmpty( ))
                    { 
                        customer C = null;
                        C = (customer)removed;
                        System.out.println("DATA DELETED");
                        System.out.println(C.toString()); 
                    }
                    else
                    {
                        System.out.println("CANNOT DELETE - LIST EMPTY");
                    }

                    //DELETE DATA-FINISH
                }

                if(choice== 3)
                {
                    //USER CHOOSE TO MODIFY DATA
                    String purchasingId = JOptionPane.showInputDialog("Enter Purchasing ID of the data you want to modify: ");
                    customer cust = (customer) flocust.removeFromFront(purchasingId);
                    if (cust != null) 
                    {
                        System.out.println("DATA TO BE MODIFIED:");
                        System.out.println(cust.toString());
                        String newCustomerName = JOptionPane.showInputDialog("Enter new customer name: ");
                        String newMembership = JOptionPane.showInputDialog("Enter new membership status: (VIP/NORMAL) ");
                        String newBouquetName = JOptionPane.showInputDialog("Enter new bouquet name: ");
                        String newBouquetquantity = JOptionPane.showInputDialog("Enter new bouquet quantity: ");
                        String newSBouquetPrice = JOptionPane.showInputDialog("Enter new bouquet price: ");
                        double newDBouquetPrice = Double.parseDouble(newSBouquetPrice);
                        int    newDBouquetquantity= Integer.parseInt(newBouquetquantity);
                        cust.setcustomer(purchasingId, newCustomerName, newMembership, newBouquetName, newDBouquetquantity, newDBouquetPrice);
                        flocust.insertAtBack(cust);
                        System.out.println("MODIFIED DATA:");
                        System.out.println(cust.toString());
                    } 
                    else 
                    {
                        System.out.println("Cannot modify - data not found");
                    }

                }
                if(choice== 4)
                {
                    //USER CHOOSE TO DISPLAY DATA

                    System.out.println("LIST OF BOUQUET PURCHASING RECORD.:");
                    customer C = null;
                    Object data = flocust.getFirst();
                    while (data != null)
                    { 
                        C = (customer) data;
                        System.out.println(C.toString());
                        data = flocust.getNext();
                    } //using while loop
                }

                if(choice== 5)
                {
                    //USER CHOOSE TO EXIT
                    //exit, then masuk second process.
                    //letak value flag as true supaya boleh keluar dari do-while loop ni. Sebab user nak exit.
                    flag = true;
                    break;
                }

                else if(userInput == JOptionPane.NO_OPTION) {
                    // code if user select '2' to exit
                    flag = true; // set flag to true to exit the loop
                }
            }
        }while (!flag);

        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");

        // NEW PROCESS/ SECOND PROCESS
        //after user exit the first process, now will enter the second process.

        //transfer all data from LinkedList to Queue
        
        customer cust =(customer) flocust.getFirst();
        while (!flocust.isEmpty()) 
        {
            custq.enqueue(flocust.removeFromFront());
        }
        
        //the code above will iterate through the entire LinkedList and transfer all elements from the LinkedList to the Queue 
        //using the removeFromFront1() method. In each iteration of the while loop, the first element of the LinkedList is removed double totalSale=0.00;
        double totalprice=0.00;
        double percentage=0.00;
        double percentageN=0.00;
        double totalsales=0.00;
        int vipCount=0;
        int totalCount=0;
        int normalCount=0;

        //CALCULATION 1-Percentage of vip customer

        for(customer currentCust = (customer) custq.dequeue(); currentCust != null; currentCust = (customer) custq.dequeue())
        {
            if (currentCust.getMembership().equalsIgnoreCase("VIP")) {
                vipCount++;
            }
            else 
            {
                normalCount++;
            }
            totalprice += (currentCust.getBouquetprice() * currentCust.getBouquetquantity());
            totalCount++;
        }
        
        
        for(customer currentCust = (customer) custq.dequeue(); currentCust != null; currentCust = (customer) custq.dequeue()) 
        {
            totalsales += currentCust.getBouquetprice() ;
        }
        

        percentage = (vipCount * 100) / totalCount;
        percentageN = (normalCount * 100) / totalCount;
        System.out.println("Total customer:  "+  totalCount);
        System.out.println("Percentage of normal customer:  " + percentage + "%");
        System.out.println("Percentage of vip customer: " + percentage + "%");
        System.out.println("Total Sale: " + totalprice);

    }
} 
/*
order ord = (order) florist.getFirst();
while (!florist.isEmpty()){
fq.enqueue(florist.removeFromFront());
}

customer cust = (customer) florist.getFirst();
while (!florist.isEmpty()){
custq.enqueue(flocust.removeFromFront());
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
     */
