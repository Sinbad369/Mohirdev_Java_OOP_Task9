public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Person Class below: ");
        Person person = new Person("Rubin Baldoro","Maison de Rubin Baldoro");
        System.out.println(person);

        person.setAddress("456 House of Puccini");
        System.out.println("Updated Person: " + person);

        System.out.println("\nTesting Student Class below: ");
        Student student = new Student("Serikpay", "Do'rmon", 95.900, "Computer Science", 2022);
        System.out.println(student);

        student.setProgram("Mathematics");
        student.setYear(3);
        student.setFee(12000.0);
        System.out.println("Updated Student: " + student); // Expected: Student[Person[name=Bob,address=789 Elm St],program=Mathematics,year=3,fee=12000.0]
        System.out.println("Student Program: " + student.getProgram()); // Expected: Mathematics
        System.out.println("Student Year: " + student.getYear()); // Expected: 3
        System.out.println("Student Fee: " + student.getFee()); // Expected: 12000.0

        System.out.println("\nTesting Staff Class below: ");
        Staff staff = new Staff("Bozorbek", "Qoraqamish", 32332, "FCIT");
        System.out.println(staff);

        // Testing getters and setters in Staff
        staff.setSchool("Math Dept");
        staff.setPay(55000.0);
        System.out.println("Updated Staff: " + staff); // Expected: Staff[Person[name=Carol,address=321 Oak St],school=Math Dept,pay=55000.0]
        System.out.println("Staff School: " + staff.getSchool()); // Expected: Math Dept
        System.out.println("Staff Pay: " + staff.getPay()); // Expected: 55000.0
    }
}