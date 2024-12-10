package opdrachten.opdracht1;

public class Student extends Persoon {
    private int leerkrediet;
    private String studentennummer;
    private String opleiding;

    public Student(String naam, String voornaam) {
        super(naam, voornaam);
    }

    public Student() {
        super();
    }

    public void wijzigLeerkrediet(int aantal) {
        setLeerkrediet(leerkrediet + aantal);
    }

    public String getOpleiding() {
        return opleiding;
    }

    public void setOpleiding(String opleiding) {
        this.opleiding = opleiding;
    }

    public int getLeerkrediet() {
        return leerkrediet;
    }

    public void setLeerkrediet(int leerkrediet) {
        this.leerkrediet = Math.min(140, Math.max(0, leerkrediet));
    }

    public String getStudentennummer() {
        return studentennummer;
    }

    public void setStudentennummer(String studentennummer) {
        this.studentennummer = studentennummer;
    }
}
