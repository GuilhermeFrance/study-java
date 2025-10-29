package OOP.entities;

public class StudentEntity {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double getAverage() {
        return ((grade1 + grade2 + grade3));
    }

    public double MissingNote() {
        return (60 - getAverage());
    }
}
