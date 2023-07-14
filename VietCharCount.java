package basicJava;
import java.util.ArrayList;
import java.util.List;


public class VietCharCount {
    public static void main(String[] args) {
        countChar("hfdawhwhcoomdd");
    }
    static void countChar(String input){
        List<String> vietChar= new ArrayList<>();
        vietChar.add("aa");
        vietChar.add("dd");
        vietChar.add("ee");
        vietChar.add("oo");
        int Pointer=0;
        int count=0;
        int lengthInput=input.length();
        while(Pointer+2<=lengthInput){
           String exam_Char= input.substring(Pointer, Pointer+2);
           if(exam_Char.contains("w")){
                count++;Pointer+=2;continue;
           }
           if(vietChar.contains(exam_Char)){
            count++;
            Pointer+=2;continue;
           }
           Pointer++;           
        }
        System.out.println(count);
        
    } 


}
