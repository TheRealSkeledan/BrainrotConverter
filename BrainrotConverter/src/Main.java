import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("Enter Term: ");
            String term = scan.nextLine();
            if(term.isEmpty()) {
                System.out.println("Thank you Pruzz (Programmer Huzz)");
                System.exit(0);
            }
            term = formatString(term);
            System.out.println(term.substring(0, findLastVowel(term)) + "uzz");
        }
    }

    public static int findLastVowel(String str) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(int i = 0; i < str.length(); i++) {
            for(char c : vowels) {
                if(str.charAt(i) == c) {
                    return i;
                }
            }
        }
        return 1;
    }

    public static String formatString(String str) {
        char first = str.toUpperCase().charAt(0);
        str = first + str.substring(1).toLowerCase();
        return str;
    }
}