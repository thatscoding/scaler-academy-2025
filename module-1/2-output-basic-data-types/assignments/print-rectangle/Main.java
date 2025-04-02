
public class Main {
    public static void main(String[] args) {        
        int col=10;
        int row=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || i==4 || j==1 || j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
                System.out.println();
        }
    }
}