/* Peça ao usuário que digite uma frase com espaços desnecessários (ex: " * Java é legal! "). Mostre a frase:
* Sem os espaços no início e fim. Com todas as letras em maiúsculas.
* E exiba também o tamanho original e o tamanho final da string.
*/

package formatting;
import java.util.Scanner;

public class MediumFormatting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write a sentence with unnecessary space: ");
        String sentence = scn.nextLine();
        System.out.println("TIME TO TAKE OUT ALL THOSE UNNECESSARY SPACES!!");
        String toTrim = sentence.toUpperCase().trim();
        System.out.println("The original size: " + sentence + "and the final size to the sentence: >>>>>>>" + toTrim);

        scn.close();
    }
}
