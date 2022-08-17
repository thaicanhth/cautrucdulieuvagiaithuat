package buoi12;


import java.util.Hashtable;

public class Main {
    //cap du lieu pair: tiếng anh sang tiếng việt
    public static void main(String[] args) {
        Hashtable<String,String> myDictionary = new Hashtable<>();
        System.out.println("Create a dictionary....");
        myDictionary.put("one", "so mot, thu nhat");
        myDictionary.put("apple", "qua tao, thuong hieu ddien thoai");
        myDictionary.put("water", "nuoc");

        //System.out.println(""+myDictionary);

        // in 1 bảng bam dùng lệnh foreach
        // myDictionary.keySet()): lưu collection of key cua bang bam
        String value;
        for (String key : myDictionary.keySet()){
            //ung với 1 key se co value
            value = myDictionary.get(key);
            System.out.println("English word: "+ key + "- has meaning: " + value );

        }
    }
}
