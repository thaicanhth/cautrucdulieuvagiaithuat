package Bai3;

public class VaccineType {
    private String vaccineCode;
    private String vaccineName;
    private String vaccineDate;

    public VaccineType(String vaccineCode,String vaccineName,String vaccineDate){
        this.vaccineCode = vaccineCode;
        this.vaccineName = vaccineName;
        this.vaccineDate = vaccineDate;

    }

    public String getVaccineCode() {
        return vaccineCode;
    }

    public void setVaccineCode(String vaccineCode) {
        this.vaccineCode = vaccineCode;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineDate() {
        return vaccineDate;
    }

    public void setVaccineDate(String vaccineDate) {
        this.vaccineDate = vaccineDate;
    }
    @Override
    public String toString(){
        return "VaccineCode: "+vaccineCode+"\nVaccineName: "+vaccineName+"\nVaccineDate: "+vaccineDate;
    }
}
