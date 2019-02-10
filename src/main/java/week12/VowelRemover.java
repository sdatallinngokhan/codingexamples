package week12;

import java.util.Scanner;

public class VowelRemover {

    public String removeVowels(String input){
        String result = input.replaceAll("[a,e,i,o,u]", "");
        return result;
    }

    public static void main(String[] args) {
        VowelRemover vowelRemover = new VowelRemover();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your input : ");
        String input = scanner.nextLine();

        String result = vowelRemover.removeVowels(input);

        System.out.println(result);
    }
}
