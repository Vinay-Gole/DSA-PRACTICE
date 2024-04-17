public class CheckPalindromString {
    public static void main(String[] args) {
        String word="madam";
        System.out.println(isPalindrom(word));

    }

    static boolean isPalindrom(String word){
        
        char[] charArray=word.toCharArray();

        int start=0;
        int end=charArray.length-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}
