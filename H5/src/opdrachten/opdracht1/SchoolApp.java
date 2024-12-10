package opdrachten.opdracht1;

public class SchoolApp {

    public static void main(String[] args) {
        Student student = new Student();
        student.setNaam("Franssen");
        student.setVoornaam("Thibo");

        System.out.println(student.getNaam());
        System.out.println(student.getVoornaam());
    }

}
