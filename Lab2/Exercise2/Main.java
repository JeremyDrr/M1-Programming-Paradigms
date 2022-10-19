package Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
         * Create a class Employee with name and other attributes. Populate an ArrayList with 10 Employees. From
         * the list populate a map<name, employee>. Use Scanner to get a name from the keyboard and show the
         * corresponding employee if it exists.
         */

        //Instance of the objects
        Employee emp1 = new Employee("Baily", "Morefield", "bmorefield0@un.org", "048 Summer Ridge Street", 1910.81);
        Employee emp2 = new Employee("Guido", "Derycot", "gderycot1@netlog.com", "39 Starling Place", 1912.65);
        Employee emp3 = new Employee("Theda", "Lippitt", "tlippitt2@amazon.de", "886 Mitchell Pass", 1331.44);
        Employee emp4 = new Employee("Bell", "Behnecken", "bbehnecken3@bandcamp.com", "4 Troy Way", 1755.35);
        Employee emp5 = new Employee("Rand", "Vian", "rvian4@forbes.com", "7343 Vidon Trail", 2242.6);
        Employee emp6 = new Employee("Beau", "Gregersen", "bgregersen5@qq.com", "27 Fieldstone Court", 1661.4);
        Employee emp7 = new Employee("Milissent", "McColm", "mmccolm6@etsy.com", "03 Dahle Plaza", 1211.57);
        Employee emp8 = new Employee("Lanie", "Polini", "lpolini7@amazon.co.jp", "088 Luster Park", 1623.32);
        Employee emp9 = new Employee("Lindsay", "Giottini", "lgiottini8@ovh.net", "1644 Hansons Hill", 2074.4);
        Employee emp10 = new Employee("Lucilia", "Culy", "lculy9@cnbc.com", "29 Mandrake Drive", 1260.73);

        //Declaration of the ArrayList of Employees
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.println("Please enter the name of the employee you are looking for");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();

        //Adding each instance to the ArrayList
        for (Employee employee : Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10)) {
            employees.add(employee);

            //Checking if the name entered matches with the objects contained in the ArrayList
            if(search.equalsIgnoreCase(employee.getlName())){
                System.out.println(employee.getfName() + " " + employee.getlName() + "\t" + employee.getEmail() + "\t\t" + employee.getAddress() + "\t" + employee.getSalary());
            }
        }
    }
}