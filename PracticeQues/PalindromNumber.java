package PracticeQues;

public class PalindromNumber {
    public static void main(String[] args) {
        int  num= 23121;
        System.out.println(isPalindrom(num));
    }

    static boolean isPalindrom(int num){
        int OriginalNumber=num;
        int ReverseNumber=0;
        while (num>0){
            int remainder=num%10;
            ReverseNumber=ReverseNumber*10+remainder;
            num/=10;

        }
        return OriginalNumber==ReverseNumber;
    }
}
