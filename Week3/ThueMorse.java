public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] pattern = new int[n];
        pattern[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                pattern[i] = pattern[i / 2];
            } else {
                pattern[i] = 1 - pattern[i - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j < n; j++) {
                if (pattern[i] == pattern[j]) {
                    s += "+  ";
                } else {
                    s += "-  ";
                }
            }
            System.out.println(s);

        }
    }
}
