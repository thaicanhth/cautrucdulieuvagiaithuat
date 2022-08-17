package buoi012;

public class Main {
    public static void main(String[] args) {
        Employee mrA = new Employee("A", "Jones", 123);
        Employee mrB = new Employee("B", "Doe", 4567);
        Employee mrC = new Employee("C", "Smith", 22);
        Employee mrD = new Employee("D", "Wilson", 345);
        Employee mrE = new Employee("E", "End", 78);
        // lưu 5 người này vào trong 1 cái bảng bam
        // 5 người này là chính là value
        // Minh sẽ xay dung 1 bang bam, dua tren lastName de tao ra
        //Key:
        SimpleHashtable myHashTableEmployee = new SimpleHashtable();
        // sau khi dung ham bam, bam Jones ra
        myHashTableEmployee.putEmployeeToHashTable("Jones",mrA);
        myHashTableEmployee.putEmployeeToHashTable("Doe",mrB);
        myHashTableEmployee.printHashTable();
        // khúc tìm kiếm
        System.out.println("Fount: "+ myHashTableEmployee.lookUp("Doe"));
    }
}
