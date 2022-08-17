package buoi012;

public class SimpleHashtable {
    private Employee[] hashtable;

    public SimpleHashtable() {
        hashtable = new Employee[10];
    }

    public void putEmployeeToHashTable(String key, Employee employee) {
        // viết 1 hàm để generte 1 index su dung hash function
        int hashedKeyIndex = hashKey(key);
        System.out.println("" + hashedKeyIndex);
        // xu lí collision: 2 phan tư có cùng 1 key
        // hay là sau khi minh generate key ra
        // key đó là cái value
        if (hashtable[hashedKeyIndex]!=null) {
            System.out.println("Already has the value with this index");
            System.out.println("Collision happened-> Not added to the hashtable");
        } else { // key chua có value don gian là add vao bang bam
            hashtable[hashedKeyIndex] = employee;
            System.out.println("Added to the hashtable");

        }
    }

    private int hashKey(String key) {
        // tuy vao yeu cau su dung ham bam gì
        int keyIndexTmp;
        keyIndexTmp = key.length() % hashtable.length;
        return keyIndexTmp;
    }
    public void printHashTable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println("index"+i+" has the " +hashtable[i]);
        }
    }
    public Employee lookUp(String key){
        int hashedKeyIndex = hashKey(key);
        return hashtable[hashedKeyIndex];
    }
}
