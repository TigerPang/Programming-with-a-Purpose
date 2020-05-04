public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = args.length;
        int[] a = new int[n];
        int total = 0;

        for (int i = 1; i < n; i++) {
            a[i - 1] = Integer.parseInt(args[i]);
            total += a[i - 1];
        }

        while (m != 0) {
            int r = (int) (Math.random() * total);
            int index = 0;
            int sum = 0;
            while (index < n && sum <= r) {
                sum += a[index];
                index++;
            }
            System.out.print(index + " ");
            m--;
        }

    }
}
