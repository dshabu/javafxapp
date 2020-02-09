package sample;

import java.util.UUID;

public class Employee implements Worker {
    private String fname;
    private String lname;
    private UUID id;
    private boolean isActive;
    private int birthYear;

    public Employee() {
        setFname(null);
        setLname(null);
    }

    public Employee(String fN, String lN, int bY) {
        setFname(fN);
        setLname(lN);
        setBirthYear(bY);
    }

    public Employee(String c, String d) {
        setFname(c);
        setLname(d);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", getLname(), getFname());
    }

    @Override
    public void hire() {
        setActive(true);
    }

    @Override
    public void fire() {
        setActive(false);
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
