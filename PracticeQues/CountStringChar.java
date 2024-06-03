package PracticeQues;

/**
 * CountStringChar
 */
public class CountStringChar {

    public static void main(String[] args) {
        String str="Hello Worlde";
        int count=0;
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}