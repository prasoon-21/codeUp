import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner xy = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = xy.nextLine();
        xy.close();
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                boolean hasDuplicate = false;
                for (int k = 0; k < sub.length(); k++) {
                    for (int l = k + 1; l < sub.length(); l++) {
                        if (sub.charAt(k) == sub.charAt(l)) {
                            hasDuplicate = true;
                            break;
                        }
                    }
                    if (hasDuplicate) break;
                }
                if (!hasDuplicate && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        
        System.out.println("Longest substring without repeating : " + longest);
    }
}