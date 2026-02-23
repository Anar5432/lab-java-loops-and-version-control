package org.example;

import java.io.IOException;
import java.io.FileWriter;

public class Main {
    public static void main(String [] args) throws IOException {
        Employee[] employees = {
                new Employee("Elon", "elon@gmail.com", 20, 10000),
                new Intern("Mark", "mark@gmail.com", 30, 20000),
                new Employee("Jeff", "jeff@gmail.com", 25, 15000),
                new Employee("Edy", "edy@gmail.com", 26, 40000),
                new Employee("Piter", "piter@gmail.com", 27, 60000),
                new Intern("Anar", "anar@gmail.com", 28, 20000),
                new Employee("Yusuf", "yusuf@gmail.com", 30, 17000),
                new Employee("Elnur", "elnur@gmail.com", 29, 19000),
                new Employee("Briant", "briant@gmail.com", 30, 23000),
                new Intern("Mora", "Mora@gmail.com", 20, 30000),
        };
        try (FileWriter writer = new FileWriter("employees.txt")) {
            for (Employee employee : employees) {
                String type;

                if (employee instanceof Intern) {
                     type = "Intern ";
                } else {
                     type = "Employe";
                }
                    writer.write("Type: " +  type + "\n");
                    writer.write("Name: " + employee.getName() + "\n");
                    writer.write("Email: " + employee.getEmail() + "\n");
                    writer.write("Age: " + employee.getAge() + "\n");
                    writer.write("Salary: " + employee.getSalary() + "\n");
                    writer.write("=================\n ");
                }
            }
            System.out.println("Employees.txt created!");
        }
    }
