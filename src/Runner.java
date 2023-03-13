import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int length = Integer.parseInt(s.nextLine());
        System.out.println(getSmallestAndLargest(str, length));

        System.out.println();
        System.out.println(isAnagram("a", "a"));
        System.out.println(isAnagram("anagram", "margana"));
        System.out.println(isAnagram("Cat", "act"));
        System.out.println(isAnagram("act", "actor"));

    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int a = 0; a <= s.length()-k; a++) {
            String currentSubstring = s.substring(a, a+k);
            if (smallest.compareTo(currentSubstring) > 0) {
                smallest = currentSubstring;
            }
            if (largest.compareTo(currentSubstring) < 0) {
                largest = currentSubstring;
            }
        }
        return smallest + "\n" + largest;
    }

    public static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            String letter = a.substring(i, i+1);
            if (!b.contains(letter)) {
                return false;
            }
            else {
                b = b.substring(0, b.indexOf(letter)) + b.substring(b.indexOf(letter)+1);
            }
        }
        return b.equals("");
    }
}
