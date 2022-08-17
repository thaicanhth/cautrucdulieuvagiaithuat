package Bai3;

public class VaccineList {
    private VaccineType[] vaccineList;
    private int size;
    private int capacity;

    public VaccineList(int capacity){
        this.capacity = capacity;
        this.vaccineList = new VaccineType[capacity];
        this.size = 0;
    }

    public void addVaccine(VaccineType vaccine){
        if(size == capacity){
            capacity = capacity * 2;
            VaccineType[] newVaccineList = new VaccineType[capacity];
            for(int i = 0; i < size; i++){
                newVaccineList[i] = vaccineList[i];
            }
            vaccineList = newVaccineList;
        }
        vaccineList[size] = vaccine;
        size++;
    }

    public void printVaccineList(){
        for(int i = 0; i < size; i++){
            System.out.println(vaccineList[i]);
        }
    }

    public void printVaccineList(String vaccineCode){
        for(int i = 0; i < size; i++){
            if(vaccineList[i].getVaccineCode().equals(vaccineCode)){
                System.out.println(vaccineList[i]);
            }
        }
    }

    public void printVaccineList(String vaccineCode, String vaccineName){
        for(int i = 0; i < size; i++){
            if(vaccineList[i].getVaccineCode().equals(vaccineCode) && vaccineList[i].getVaccineName().equals(vaccineName)){
                System.out.println(vaccineList[i]);

            }
        }

    }
}
