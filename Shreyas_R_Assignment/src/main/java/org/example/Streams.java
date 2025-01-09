package org.example;

import java.util.*;

import java.util.stream.Collectors;

class Student {
    private String name;
    private String department;

    // Constructor
    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name + " (" + department + ")";
    }
}

public class Streams {

    public static void main(String[] args) {
        // Average For List of Integers using stream

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 220, 10, 9, 67, 34, 89));

        int average = list.stream().reduce(0, (a, b) -> a + b)/list.size();

        System.out.println(average);

        // Find the Kth largest number in list using streams concept.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of k : ");
        int k = scanner.nextInt();
        int kThLargest = list.stream().sorted((a, b) -> (b - a)).skip(k-1).findFirst()
                .orElseThrow(() -> new NoSuchElementException("Not enought elements in the list"));

        System.out.println("kth_largest " + kThLargest);

        // Print the elements in list greater than k using streams

        System.out.println("Enter the threshold ");
        int threshold = scanner.nextInt();

        list.stream().filter(x -> x > threshold).forEach(System.out::println);

        // Find the product of all non-negative numbers in list.

        int product = list.stream()
                .filter(x -> x >= 0)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product " + product);

        // You have a List of student objects, where each object contains name, department.
        // Find the Map of department and list of students
        // Count the number of students in each department

        Student student1 = new Student("Shreyas", "CSE");
        Student student2 = new Student("Ullas", "CSE");
        Student student3 = new Student("Tejas", "ECE");
        Student student4 = new Student("Rohit", "ECE");
        Student student5 = new Student("Rocky", "CSE");

        List<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5));

        // 1. Map of department to list of students
        Map<String, List<Student>> departmentToStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));

        System.out.println("Department to Students:");
        departmentToStudents.forEach((department, studentList) -> {
            System.out.println(department + ": " + studentList);
        });

        // 2. Count of students in each department
        Map<String, Long> departmentToCount = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));

        System.out.println("\nCount of Students in Each Department:");
        departmentToCount.forEach((department, count) -> {
            System.out.println(department + ": " + count);
        });



    }
}
