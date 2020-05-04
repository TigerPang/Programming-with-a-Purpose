public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] times = new int[n + 2];
        int r;

        for (int t = 0; t <= trials; t++) {
            boolean[] birthdays = new boolean[n];
            for (int i = 0; i <= n; i++) {
                r = (int) (Math.random() * (n - 1));
                if (!birthdays[r]) {
                    birthdays[r] = true;
                } else {
                    times[i]++;
                    break;
                }
            }
        }

        int j = 0;
        int i = 1;
        int sum = 0;
        while (true) {
            double fraction = (double) sum / trials;
            System.out.print(i + "\t" + times[j] + "\t" + fraction);
            System.out.println();
            j++;
            sum = sum + times[j];
            i++;
            if (fraction >= 0.5) {
                break;
            }
        }
    }
}
