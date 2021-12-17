import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeFile implements Serializable {
    public static ArrayList<EmployeeDetails> employeeDetails = new ArrayList<>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int choice = 0;
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
                        String getLine;
                        while ((getLine = bufReader.readLine()) != null) {
                            String[] splitLine = getLine.split("-");
                            EmployeeDetails employee = new EmployeeDetails();
                            employee.empId = splitLine[0];
                            employee.empName = splitLine[1];
                            employee.empAddress = splitLine[2];
                            employeeDetails.add(employee);
                            System.out.println(getLine + "\n");
                        }
                        bufReader.close();
                        fileReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("\nERROR : File not Found !!!");
                    }
                    break;
                case 2:
                    FileWriter fileWriter = new FileWriter("C:\\Users\\91892\\Documents\\UST\\UST Prograd Training\\Day-9\\EmployeeFile.txt", true);
                    System.out.println("\nEnter the new UserId: ");
                    String newId = scanner.next();
                    System.out.println("\nEnter the new UserName: ");
                    String newUserName = scanner.next();
                    System.out.println("\nEnter the new User Address: ");
                    String newAddress = scanner.next();
                    String newDetails = newId + "-" + newUserName + "-" + newAddress + "\n";
                    fileWriter.write(newDetails);
                    System.out.println("New user added successfully");
                    fileWriter.close();
                    break;

                case 3:
                    FileWriter fileWriter1 = new FileWriter("C:\\Users\\91892\\Documents\\UST\\UST Prograd Training\\Day-9\\EmployeeFile.txt");
                    System.out.println("EmployeeId for updating: ");
                    String updateId = scanner.next();
                    boolean isExist = false;
                    EmployeeDetails employee1 = new EmployeeDetails();
                    for (int i = 0; i < employeeDetails.size(); i++) {
                        if (employeeDetails.get(i).empId.equals(updateId)) {
                            System.out.println("\n1. Update Id, 2. Update Name, 3. Update Address, 4. Quit");
                            System.out.println("\nEnter your update choice: ");
                            int updateChoice = scanner.nextInt();
                            switch (updateChoice) {
                                case 1:
                                    System.out.println("\nEnter the new Employee Id: ");
                                    employeeDetails.get(i).empId = scanner.next();
                                    System.out.println("Updated Employee Id Successfully!");
                                    for (EmployeeDetails e :
                                            employeeDetails) {
                                        String updatedDetails=e.empId+"-"+e.empName+"-"+e.empAddress+"\n";
                                        fileWriter1.append(updatedDetails);
                                    }
                                    fileWriter1.close();
                                    break;

                                case 2:
                                    System.out.println("\nEnter the new Employee Name: ");
                                    employeeDetails.get(i).empName = scanner.next();
                                    System.out.println("Updated Employee Name Successfully!");
                                    for (EmployeeDetails e :
                                            employeeDetails) {
                                        String updatedDetails=e.empId+"-"+e.empName+"-"+e.empAddress+"\n";
                                        fileWriter1.append(updatedDetails);
                                    }
                                    fileWriter1.close();
                                    break;

                                case 3:
                                    System.out.println("\nEnter the new Employee Address: ");
                                    employeeDetails.get(i).empAddress = scanner.next();
                                    System.out.println("Updated Employee Address Successfully!");
                                    for (EmployeeDetails e :
                                            employeeDetails) {
                                        String updatedDetails=e.empId+"-"+e.empName+"-"+e.empAddress+"\n";
                                        fileWriter1.append(updatedDetails);
                                    }
                                    fileWriter1.close();
                                    break;

                                case 4:
                                    System.out.println("No more Updating");
                                    break;

                                default:
                                    System.out.println("Invalid choice!");
                                    break;
                            }
                            isExist = true;
                        }
                    }
                    if (isExist == false) {
                        System.out.println("Invalid EmployeeId!");
                    }
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
}


class EmployeeDetails {
    public String empId, empName, empAddress;

    public EmployeeDetails(String id, String name, String address) {
        this.empId = id;
        this.empName = name;
        this.empAddress = address;
    }

    public EmployeeDetails() {

    }
}
