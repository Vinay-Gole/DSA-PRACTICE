package PatternQuestion;

public class Lefthalfpyramid {
    public static void main(String[] args) {
        // lefthalfPyramid();
        int n=6;
        for(int i=1;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print("  ");
            }

            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void lefthalfPyramid(){
        int n=6;
        for(int i=n;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// *
// * *
// * * *
// * * * *
// * * * * *