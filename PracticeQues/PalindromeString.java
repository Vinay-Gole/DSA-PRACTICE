package PracticeQues;

public class PalindromeString {
    public static void main(String[] args) {
        
        String str="madamm";
        System.out.println(palindromString(str));
    }

    static boolean palindromString(String str){
        char ch[]=str.toCharArray();
        int start=0;
        int end=ch.length-1;
        while(start<end){
            if(ch[start]!=ch[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}
