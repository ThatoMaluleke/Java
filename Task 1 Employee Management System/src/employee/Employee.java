/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;





import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Employee {

    int id;
    String name;
    int salary;

    static ArrayList<Employee> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Constructor
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void InsertEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();

        Employee emp = new Employee(id, name, salary);
        list.add(emp);

        System.out.println("Employee inserted successfully ✅");
       
    }

    public static void ViewEmployees() {
        if (list.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee e : list) {
                System.out.println(e);
            }
        }
    }
    
    public static void DeleteEmployee() {

    System.out.print("Enter the ID you want to delete: ");
    int choice = sc.nextInt();

    Iterator <Employee> it = list.iterator();
    while (it.hasNext()) {
        Employee e = it.next();
        if (e.id == choice) {
            it.remove();   
            System.out.println("Employee successfully removed ");
            return;
        }
        
    }

    System.out.println("Employee ID not found ");
}
    
    
    public static void Update(){
        
        System.out.println("Enter the id you want to Update");
        int choice = sc.nextInt();
        
        for (Employee e : list) {
            if(e.id == choice){
                System.out.println("Update Name");
                e.name = sc.next();
                System.out.println("Update Salary");
                e.salary = sc.nextInt();
                return;
            }
        }
        System.out.println("Employee ID not found ");
        
        
        
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Salary: " + salary;
    }

    public static void main(String[] args) {
        int option;
        
        do {
        System.out.println("Welcome to the Employee Management System");
        System.out.println("1) Insert new employee");
        System.out.println("2) View available employees");
        System.out.println("3) Delete Employee by ID");
        System.out.println("4) Update Employee by ID");
        System.out.println("5) Exit");
        System.out.print("Select your option: ");

        option = sc.nextInt();

        
        
        switch (option) {
            case 1 -> InsertEmployee();

            case 2 -> ViewEmployees();

            case 3 -> DeleteEmployee();
            case 4 -> Update();
                
            case 5 -> System.out.println("Exiting system...");
            default -> System.out.println("Invalid option ❌");
        }
        
        }while(option!=5);
        
    }
}

