public class Main{
    public static void main(String[] args){
        int n=7;
        int m=6;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || i==4 || i==n || (j==1 && i<=4) || (j==m && i>4)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }                
            }
            System.out.println();
        }       
    }
}