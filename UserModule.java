import java.util.Scanner;

public class UserModule {
    static Scanner scanner = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private String gender;
    private String mobileNumber;
    private String email;
    private String address;
    private String role;
    private String status;

    public UserModule() { // Constructor that prompt user to input details.

        System.out.print("Enter the first name -->");
        this.firstName = scanner.nextLine();
        scanner.nextLine();// clear input buffer.
        System.out.print("Enter the last name -->");
        this.lastName = scanner.nextLine();
        this.gender = takeGender();   // taking the return string value of take gender method.
        System.out.println("enter your mobile number-->");
        this.mobileNumber = scanner.nextLine();

        scanner.nextLine();// clear input buffer
        System.out.println("enter your email -->");
        this.email = scanner.nextLine();
        System.out.println("enter your address -->");
        this.address = scanner.nextLine();
        this.role = selectRole();
        this.status = status();
    }
    @Override
    public String toString() {
        return "user name: " + this.firstName + this.lastName +
                ", gender: " + this.gender +
                ", mobile number: " + this.mobileNumber +
                ", email id: " + this.email +
                ", address: " + this.address +
                ", role: " + this.role +
                ", status: " + this.status;
    }
private String takeGender(){
    System.out.println("Select your gender\n" +
            "1.MALE\n" +
            "2.FEMALE\n" +
            "3.OTHERS");
    int genderNumber=scanner.nextInt();
    switch (genderNumber) {
        case 1:
            return "MALE";

        case 2:
            return "FEMALE";

        case 3:
            return "OTHERS";

        default:
            return " Gender not selected";
    }
}
private String selectRole(){
    System.out.println("Select your role\n" +
            "1.employee\n" +
            "2.customer ");
    int roleNumber = scanner.nextInt();
    switch (roleNumber){
        case 1:
            return "employee";
        case 2:
            return "customer";
        default:
            return "role not selected";
    }
}
private String status(){
        if(this.role=="employee"){
            System.out.println("entre the status\n" +
                    "1.manager\n" +
                    "2.customer service \n" );
            int statusNumber = scanner.nextInt();
            switch (statusNumber){
                case 1:
                    return "Manager";
                case 2:
                    return " customer service ";
                default:
                    return " status not selected ";
            }
        }
        else
            System.out.println("No status for customer");
        return null;
}


}
