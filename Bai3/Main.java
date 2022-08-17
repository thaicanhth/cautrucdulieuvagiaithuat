package Bai3;

public class Main {
    public static void main(String[] args) {
        CovidPatient c1 = new CovidPatient(1, "Nguyen Van A");
        CovidPatient c2 = new CovidPatient(2, "Nguyen Van B");

        VaccineType v1 = new VaccineType("V1", "Vaccine 1","02/12/2022");
        VaccineType v2 = new VaccineType("V2", "Vaccine 2","02/11/2022");

        VaccineList vl = new VaccineList(2);
        vl.addVaccine(v1);
        vl.addVaccine(v2);
        vl.printVaccineList();
        vl.printVaccineList("V1");
        vl.printVaccineList("V1", "Vaccine 1");

        VaccinedPatientList vpl = new VaccinedPatientList(2);
        vpl.myVaccinePatient(c1, vl);
        vpl.myVaccinePatient(c2, vl);
        vpl.printVaccinedPatientList();
    }
}
