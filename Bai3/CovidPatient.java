package Bai3;

public class CovidPatient {
    private int code;
    private String patinerName;

    public CovidPatient(int code, String patinerName) {
        this.code = code;
        this.patinerName = patinerName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPatinerName() {
        return patinerName;
    }

    public void setPatinerName(String patinerName) {
        this.patinerName = patinerName;
    }

    @Override
    public String toString() {
        return "Code: " + code + "\nPatinerName: " + patinerName;

    }

}
