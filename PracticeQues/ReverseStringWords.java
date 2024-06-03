package PracticeQues;

public class ReverseStringWords {
public static void main(String[] args) {
    String str="Hello world this the sample code";

    
    System.out.println(reverseWorld(str));
    
}

static String reverseWorld(String str){

    
    String [] words=str.split(" +");

    StringBuffer sb=new StringBuffer();
 
    for(int i= words.length-1;i>=0;i--){
        sb.append(words[i]);
        sb.append(' ');
    }
return sb.toString().trim();
    
}
}
