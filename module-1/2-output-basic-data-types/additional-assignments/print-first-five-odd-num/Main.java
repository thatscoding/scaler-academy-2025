
public class Main {

    public static void main(String[] args) {

        int count=0;
        for (int i = 1; i <= 2 * 5; i=i+2) {
           count++;

           if(count==5){
            System.out.print(i);
           }else{
            System.out.print(i+" ");
           }
        }

    }
}
