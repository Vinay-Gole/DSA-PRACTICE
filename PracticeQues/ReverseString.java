package PracticeQues;

public class ReverseString {
    public static void main(String[] args) {
        String str="Hello World";
    char [] ch=str.toCharArray();
    int left=0;
    int right=str.length()-1;
    while(left<right){
        char temp=ch[left];
        ch[left]=ch[right];
        ch[right]=temp;
        left++;
        right--;
    }
    String revString=new String(ch);
System.out.print(revString);
    }
}
