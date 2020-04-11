import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1){
            System.out.println("no army");
        }
        if(n>=1 && n<=19){
            System.out.println("pack");
        }
        if(n>=20 && n<=249){
            System.out.println("throng");
        }
        if(n>=250 && n<=999){
            System.out.println("zounds");
        }
        if(n>=1000){
            System.out.println("legion");
        }
    }
}
