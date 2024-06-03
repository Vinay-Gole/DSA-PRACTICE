package PracticeQues;

public class PrimeNumber {
    public static void main(String[] args) {
        int num =100;
        int count=0;
        for(int i=1;i<=num;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                count++;
                
            }
        }
        System.out.print("Total Prime Numbers:"+count);

    }
    static boolean isPrime(int num){
        // boolean isprime=true;
        if(num<1){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            } 
        }
        return true;
    }
}
