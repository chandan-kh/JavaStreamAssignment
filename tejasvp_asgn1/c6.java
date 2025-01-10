import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class c6 {
    public static void main(String[] args) {
        // Sample list of students with Indian names and departments
        List<Student> students = Arrays.asList(
            new Student("Aarav", "Computer Science"),
            new Student("Priya", "Mechanical"),
            new Student("Rohan", "Computer Science"),
            new Student("Ananya", "Electrical"),
            new Student("Kabir", "Mechanical"),
            new Student("Ishita", "Electrical")
        );

        // a. Map of department and list of students
        Map<String, List<Student>> departmentToStudents = students.stream()
            .collect(Collectors.groupingBy(Student::getDepartment));

        // b. Count of students in each department
        Map<String, Long> departmentToCount = students.stream()
            .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));

        // Output both results
        System.out.println("Department to Students Map:");
        departmentToStudents.forEach((department, studentList) ->
            System.out.println(department + ": " + studentList)
        );

        System.out.println("\nCount of Students in Each Department:");
        departmentToCount.forEach((department, count) ->
            System.out.println(department + ": " + count)
        );
    }
}
