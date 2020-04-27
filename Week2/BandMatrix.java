public class BandMatrix {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= width) {
                    if (j % n == 0 && j != 0) {
                        s.append("*");
                    }
                    s.append("*");
                    s.append("  ");
                }
                else {
                    if (i % n == 0 && i != 0) {
                        s.append("0");
                    }
                    s.append("0");
                    s.append("  ");
                }
            }
            s.append("\n");
        }


        System.out.println(s.toString());

    }
}
