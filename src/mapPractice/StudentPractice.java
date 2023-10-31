package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentPractice {

    public static void main(String[] args) {

        HashMap<String, String> student1 = new HashMap<>();
        student1.put("FirstName", "David");
        student1.put("LastName", "Pena");
        student1.put("Age", "25");
        student1.put("Gender", "M");
        student1.put("City", "Chicago");
        HashMap<String, String> student2 = new HashMap<>();
        student2.put("FirstName", "Jeremiah");
        student2.put("LastName", "Michealson");
        student2.put("Age", "15");
        student2.put("Gender", "M");
        student2.put("City", "High Park");
        HashMap<String, String> student3 = new HashMap<>();
        student3.put("FirstName", "Michael");
        student3.put("LastName", "White");
        student3.put("Age", "35");
        student3.put("Gender", "M");
        student3.put("City", "Winnetka");
        HashMap<String, String> student4 = new HashMap<>();
        student4.put("FirstName", "Sarah");
        student4.put("LastName", "Star");
        student4.put("Age", "29");
        student4.put("Gender", "F");
        student4.put("City", "Chicago");

        ArrayList<HashMap<String, String>> studentList = new ArrayList();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student4);
        studentList.add(student3);
        System.out.println(studentList);

        // [{FirstName=David, LastName=Pena, Gender=M, City=Chicago, Age=25}, {FirstName=Jeremiah, LastName=Michealson, Gender=M, City=High Park, Age=15}, {FirstName=Sarah, LastName=Star, Gender=F, City=Chicago, Age=29}, {FirstName=Michael, LastName=White, Gender=M, City=Winnetka, Age=35}]

        m1(studentList);
        System.out.println("__________________");
        m2(studentList);
    }

    public static void m1(ArrayList<HashMap<String, String>> list) {

        for (HashMap<String, String> studentMap : list) {

            if (studentMap.get("City").equalsIgnoreCase("Chicago")) {
                System.out.println(studentMap.get("FirstName") + " is living in " + studentMap.get("City"));
            }
        }
    }

    // create a method that will find out all male students who are under the age of 26


    public static void m2(ArrayList<HashMap<String, String>> list) {

        for (HashMap<String, String> student : list) {

            if (student.get("Gender").equalsIgnoreCase("M") &&  Integer.parseInt(student.get("Age")) < 26 ) {
                System.out.println(student.get("FirstName") + " is Male and age is " + student.get("Age"));
            }
        }
    }


}
