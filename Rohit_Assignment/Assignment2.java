import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {

        // Average For List of Integers using streams
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        float avg = (float)(list.stream().reduce(0, (a, b) -> a + b))/list.size();
        System.out.println(avg);

        OptionalDouble a = list.stream().mapToInt(Integer::intValue).average();
        System.out.println(a);

        //Find the all non-repeating character in string using streams
        String str = "iamironman";

        //Find the kth largest element in the list
        int k = 4;
        System.out.println(
                list.stream().sorted(Comparator.reverseOrder())
                        .skip(k-1).findFirst()
        );

        //Print the elements in list greater than k using streams
        k = 3;
        list.stream().filter((x)-> x > 3).forEach(System.out::println);

        // Product of positive elements in a list
        List<Integer> aList = Arrays.asList(-5,-3,-2,0,1,3,4,5);
        System.out.println(aList.stream().filter((x) -> x > 0).reduce(1, (x,y) -> x*y));

        //last question

        List<Student> students = Arrays.asList(
                new Student("Amrit" , "Computer Science"),
                new Student("Aaron" , "Mathematics"),
                new Student("Rohit", "Computer Science"),
                new Student("Gowri" , "Physics"),
                new Student("Dark", "Mathematics")
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

