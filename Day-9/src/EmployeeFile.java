import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeFile implements Serializable{
    private static ArrayList<EmployeeDetails> employeeDetails = new ArrayList<>();
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int choice = 0;
        EmployeeFile employeeFile = new EmployeeFile();

        while (choice != 4) {
            System.out.println("\n1. View Existing Employees \n2. Add new Employee \n3. Update Existing Employee \n4. Quit");
            System.out.println("\nEnter your choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    try {
                        FileReader fileReader = new FileReader("C:\\Users\\91892\\Documents\\UST\\UST Prograd Training\\Day-9\\EmployeeFile.txt");
                        BufferedReader bufReader = new BufferedReader(fileReader);
                        String name;
                        while ((name = bufReader.readLine()) != null) {
                            Object newName = (Object) (name.toString());
                            System.out.println(newName);
                        }
                        bufReader.close();
                        fileReader.close();
                    }
                    catch(FileNotFoundException e){
                        System.out.println("\nERROR : File not Found !!!");
                    }

                    break;
                case 2:
                    System.out.println("\nEnter the new UserId: ");
                    String newId = scanner.next();
                    System.out.println("\nEnter the new UserName: ");
                    String newUserName = scanner.next();
                    System.out.println("\nEnter the new User Address: ");
                    String newAddress = scanner.next();
                    EmployeeDetails newDetails = new EmployeeDetails(newId, newUserName, newAddress);
                    employeeFile.WriteToFile(newDetails);
                    break;

                case 3:
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
    }
    public void WriteToFile(Object newDetails) throws IOException {
        try {
            String filepath = "C:\\Users\\91892\\Documents\\UST\\UST Prograd Training\\Day-9\\EmployeeFile.txt";
            FileOutputStream fileOutputStream = new FileOutputStream(filepath, true);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(newDetails);
            outputStream.close();
            System.out.println("\nNew Employee Added Successfully!");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}


class EmployeeDetails implements Serializable{
   public String empId, empName, empAddress;
   public EmployeeDetails(String id, String name, String address){
       this.empId=id;
       this.empName=name;
       this.empAddress=address;
   }
   public String toString(){
       return empId+empName+empAddress;
   }
}
