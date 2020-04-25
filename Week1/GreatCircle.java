public class GreatCircle {
    public static void main(String[] args) {
        double a = Math.toRadians(Double.parseDouble(args[0]));
        double b = Math.toRadians(Double.parseDouble(args[1]));
        double c = Math.toRadians(Double.parseDouble(args[2]));
        double d = Math.toRadians(Double.parseDouble(args[3]));

        double sqrt = Math.pow(Math.sin((c - a)/2), 2)
                + Math.cos(a) * Math.cos(c) * Math.pow(Math.sin((d - b)/2), 2);

        double distance = 6371 * 2 * Math.asin(Math.sqrt(sqrt));

        System.out.println(distance + " kilometers");


    }
}
