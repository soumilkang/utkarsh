public class Q4_REVERSE_STRING {

    public static void reverseString(char[] s) {

        for (int i = 0; i < s.length / 2; i++) {

            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverseString(s);

        System.out.print("[");

        for (int i = 0; i < s.length; i++) {
            System.out.print("'" + s[i] + "'");

            if (i < s.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
    }
}

