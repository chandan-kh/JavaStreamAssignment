import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
    private String name;
    private String department;

    public Student(String name, String department){
        this.name = name;
        this.department = department;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public String toString(){
        return name;
    }
}



public class ListOfStudents {
    public static void main(String[] args){
        List<Student> students = Arrays.asList(
                new Student("Alice" , "Computer Science"),
                new Student("Bob" , "Mathematics"),
                new Student("Charlie", "Computer Science"),
                new Student("David" , "Physics"),
                new Student("Eve", "Mathematics")
        );

        Map<String,List<Student>> deptMap = students.stream().collect(Collectors.groupingBy(Student::getDepartment));
        deptMap.forEach((department,studentList) -> {
            System.out.println(department + " : " + studentList);
        });

        deptMap.forEach((department,studentList) -> {
            System.out.println(department + " : " + studentList.stream().count());
        });


    }
}
