import java.util.Scanner;

public class Item {
    static Scanner scanner = new Scanner(System.in);
    private String itemName;
    private String Category;
    private int quantity;
    private double unitPrice;
    private String status;
public Item(){
    System.out.print("enter the item name-->");
    this.itemName = scanner.nextLine();
    scanner.nextLine();
    this.Category = selectCategory();
    System.out.print("enter the quantity available-->");
    this.quantity = scanner.nextInt();
    System.out.print("enter the unit price of item-->");
    this.unitPrice = scanner.nextDouble();
    this.status = availableStatus();
}

    @Override
    public String toString() {
        return "item name: " + this.itemName +
                ", Category: " + this.Category +
               ", quantity: " + this.quantity +
                ", unit price: " + this.unitPrice +
                ", status: " + this.status ;
    }

    private static String selectCategory(){
       System.out.println("select the category of item\n" +
               "1.bread\n" +
               "2.dairy product\n" +
               "3.grain food \n" +
               "4.poultry ");
       int categoryNumber = scanner.nextInt();
       switch (categoryNumber){
           case 1:
               return "bread";
           case 2:
               return "dairy product";
           case 3:
               return "grain food";
           case 4:
               return "poultry";
           default:
               return "no category selected";
       }
   }
   private String availableStatus(){
    if(this.quantity!= 0 ){
        return "available";
    }else
        return "not available";
   }
}
