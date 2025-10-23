import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Employee {
    private String EmpName;
    private int EmpId;
    private String empRole;

    // public Employee(){}

    public Employee(String EmpName, int EmpId, String empRole){
        this.EmpName = EmpName;
        this.EmpId = EmpId;
        this.empRole = empRole;
    }

    public String getName(){
        return EmpName;
    }
    public int getEmpId(){
        return EmpId;
    }
    public String getEmpRole(){
        return empRole;
    }

    public String setempName(String EmpName){
        return EmpName;
        
    }

       public String toString() {
        return "Employee [ID=" + EmpId + ", Name=" + EmpName + ", Role=" + empRole + "]";
    }


    public static void AddEmployee(ArrayList<Employee> emp, Scanner sc){
        System.out.println("Enter Employee ID");
        int empid = sc.nextInt();
        System.out.println("Enter Employee Name");
        String empname = sc.next();
        System.out.println("Enter Employee EmpRole");
        String emprole = sc.next();
        Employee e = new Employee(empname, empid, emprole);
        emp.add(e);

        System.out.println("Employee Added Succsfully..........");
    }

    public static void DisplayEmp(ArrayList<Employee> emp){
        for(int i = 0; i < emp.size(); i++){
            System.out.println(emp.get(i));
        }
    }

    public static void RemoveEmployee(ArrayList<Employee> emp, Scanner sc){
        System.out.println("Enter Employee Id To Delete");
        int Id = sc.nextInt();
        for(int i = 0; i < emp.size(); i++){
            if(emp.get(i).getEmpId() == Id){
                emp.remove(i);
                System.out.println("Employee Deleted Succssfully");
            }
         
        }
    }

    
public static void ShowSortedEmployees(ArrayList<Employee> emp) {
    if (emp.isEmpty()) {
        System.out.println(" No employees to display.");
        return;
    }

    Collections.sort(emp, (e1, e2) -> Integer.compare(e1.getEmpId(), e2.getEmpId()));

    System.out.println("\n📋 Employees Sorted by ID:");
    for (Employee e : emp) {
        System.out.println(e);
    }
}

    public static void FindByName(ArrayList<Employee> emp, Scanner sc){
        System.out.println("Enter Name To Find");
        String findName = sc.next();
        for(int i = 0; i < emp.size(); i++){
            if(findName.equals(emp.get(i).getName())){
                System.out.println(emp.get(i));
            }
            
        }
    }

    public static void UpdateById(ArrayList<Employee> emp, Scanner sc){
        System.out.println("Enter Emp ID");
        int upId = sc.nextInt();
        for(int i = 0; i < emp.size(); i++){
            if(emp.get(i).getEmpId() == upId){
                System.out.println("Enter New Name");
                String newName = sc.next();
                emp.get(i).setempName(newName);
                System.out.println("Employee Updated Sucssfully");
            }
        }
        System.out.println("Emp Not Found");
       
    }

    public static void SaveToFile(ArrayList<Employee> emp){
        if(emp.isEmpty()){
            System.out.println("List Is Empty");
        }
        try{
            FileWriter writer = new FileWriter("employee.txt");
            for(Employee e : emp){
                writer.write(e.toString() + "\n");
            }
            writer.close();
            System.out.println("Written In File........");

        }catch(Exception e){
            e.printStackTrace();
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> emp = new ArrayList<>();
        
        while (true) {
            System.out.println("1. Add Employee to list\r\n" + 
                            "2. Remove Employee list\r\n" + 
                            "3. Show all Employee\r\n" + 
                            "4. Show all Employee in sorted order (sort on the basis of empID)\r\n" + 
                            "5. Find a Employee with empName\r\n" + 
                            "6. Save all Employees into file\r\n" + 
                            "7. Update By Id\r/n " +
                            "8. Quit");
            System.out.println("Enter Choice");
            int Choice = sc.nextInt();
            switch (Choice) {
                case 1:
                AddEmployee(emp, sc);
                break;

                case 2:
                RemoveEmployee(emp, sc);
                break;

                case 3:
                DisplayEmp(emp);
                break;

                case 4:
                ShowSortedEmployees(emp);
                break;

                case 5:
                FindByName(emp, sc);
                break;

                case 6:
                SaveToFile(emp);
                break;

                case 7:


                case 8:
                System.exit(0);
            
                default:
                    break;
            }
            // System.out.println("DO You Want To Continue Yes/No");
            // String con = sc.next();
            // if (!con.equals("Yes")) {
            //     break;                
            // }
        }
    }
}
