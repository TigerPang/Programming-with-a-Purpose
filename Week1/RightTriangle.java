public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int minLine = Math.min(Math.min(a, b), c);
        int maxLine = Math.max(Math.max(a, b), c);
        int midLine = a + b + c - minLine - maxLine;
        boolean answer = a > 0 && b > 0 && c > 0;
        System.out.println(answer && minLine * minLine + midLine * midLine == maxLine * maxLine);
        
    }
}

