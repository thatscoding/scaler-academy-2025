public class Main {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            int j=1;
            for(;j<=n-i;j++){
                System.out.print(" ");
            }
            for(;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}