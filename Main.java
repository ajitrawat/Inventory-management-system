import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<UserModule> user = new ArrayList<>();
        ArrayList<Item> item = new ArrayList<>();
        boolean exit = false;
        while (!exit){
            System.out.println("1.Enter new user\n" +
                    "2.print user list \n" +
                    "3.add item \n" +
                    "4.remove items from list\n" +
                    "5.print the item list\n" +
                    "6. search item from list\n" +
                    "7.to exit");
            int value = scanner.nextInt();

        switch (value){
            case 1: addUser(user);
            break;
            case 2:printList(user);
            break;
            case 3: addItems(item);
            break;
            case 4: removeItems(item);
                break;
            case 5: printItems(item);
                break;
            case 6: searchItems(item);
                break;
            case 7: exit= true;
        }

    }
    }
    public static void addUser(ArrayList user ){
        UserModule us = new UserModule();
        user.add(us);

    }
    public static void printList(ArrayList user){
        for(int i = 0 ; i< user.size(); i++) {

            System.out.println(i+1+"."+ user.get(i)) ;
        }

    }
    public static void addItems(ArrayList item){
        Item it = new Item();
        item.add(it);
    }
    public static void removeItems(ArrayList item){

        System.out.print("enter position to remove");
        int position = scanner.nextInt();
        if ((position - 1) <= item.size()) {
            item.remove(position - 1);
        } else
            System.out.println("WRONG ELEMENT chosen");
    }
    public static void searchItems(ArrayList item){
        System.out.print(" enter item to search ");
        scanner.nextLine();
        String searchItem = scanner.nextLine();
        int position= item.indexOf(searchItem);
        if(position>=0){
            System.out.println("item "+item.get(position)+"found at "+(position-1)+" position");
        }else
            System.out.println("item not found");
    }


     public static void printItems(ArrayList item){
        System.out.println("you have "+item.size()+" items in list");
        for(int i=0;i<item.size();i++){

            System.out.println((i+1)+" "+item.get(i));
        }
    }

}
