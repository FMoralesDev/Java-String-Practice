// Peca ao usuario que digite o nome completo e: Mostre o nome em minúsculas, mas sem espaços extras no início e no fim. (use toLowerCase() e trim())

package formatting;
import java.util.Scanner;

public class HardFormatting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write your FULL name: ");
        String fullName = scn.nextLine();
        String lowerCase = fullName.toLowerCase().trim();
        System.out.println("WOW! TIME TO LOWER CASE:");
        System.out.println("-" + lowerCase + "-");
        scn.close();
    }
}
