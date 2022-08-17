package Bai3;

public class VaccinedPatientList {
    private CovidPatient[] patientList;
    private VaccineList[] vaccineList;
    private int size;

    public VaccinedPatientList(int capacity) {
        this.patientList = new CovidPatient[20];
        this.vaccineList = new VaccineList[20];

    }
    public void  myVaccinePatient(CovidPatient patient, VaccineList vaccine){
        this.patientList[size] = patient;
        this.vaccineList[size] = vaccine;
        size++;
    }
    public void printVaccinedPatientList(){
        for(int i = 0; i < size; i++){
            System.out.println(patientList[i]);
            System.out.println(vaccineList[i]);
        }
    }
}
