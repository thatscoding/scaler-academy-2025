public class Main {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*"); // Print full stars in first and last row
                } else if (j == n - i + 1) {
                    System.out.print("*"); // Print diagonal star
                } else {
                    System.out.print(" "); // Print spaces
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
