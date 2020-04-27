public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int step = 0;
        int distance = 0;
        if (r == 0) {
            System.out.println("(" + x + ", " + y + ")");
            System.out.println("steps = 0");
        }
        else {
            while (distance < r) {
                System.out.println("(" + x + ", " + y + ")");
                distance = Math.abs(x) + Math.abs(y);
                double randStep = Math.random();
                if (randStep < 0.25) {
                    x += 1;
                }
                else if (randStep <= 0.5) {
                    y += 1;
                }
                
                else if (randStep <= 0.75) {
                    x -= 1;
                }
                else {
                    y -= 1;
                }
                step += 1;
                
            }
            System.out.println("steps = " + (step - 1));
        }

    }
}
