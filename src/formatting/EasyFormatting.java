//  Peça ao usuário que digite uma frase e: Mostre a frase toda em letras maiúsculas. (use toUpperCase())

package formatting;
import java.util.Scanner;

public class EasyFormatting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String sentence = scn.nextLine();
        System.out.println("WOW. NO IT'S TIME TO UPPER CASE!!!!!");
        String uppercase = sentence.toUpperCase();
        System.out.println(uppercase);
        scn.close();
    }
}
