public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, double fee, String program, int year) {
        super(name, address);
        this.fee = fee;
        this.program = program;
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return "Student[ " + super.toString() + ", program = " + program + ", year = " + year + ", fee = " + fee + "]";
    }
}
