public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalSteps = 0;
        
        for (int i = 0; i < trials; i++) {
            int distance = 0;
            int steps = 0;
            int x = 0;
            int y = 0;
            while (distance < r) {
                distance = Math.abs(x) + Math.abs(y);
                double randStep = Math.random();
                if (randStep < 0.25) {
                    x += 1;
                }
                else if (randStep < 0.5) {
                    y += 1;
                }
                
                else if (randStep < 0.75) {
                    x -= 1;
                }
                else {
                    y -= 1;
                }
                steps += 1;
            }
            steps = steps - 1;
            totalSteps += steps;
            
        }
        double averageSteps = (double) totalSteps / (double) trials;
        
        if (r == 0) {
            System.out.println("average number of steps = " + 0.0);
        } else {
            System.out.println("average number of steps = " + averageSteps);
        }
    }
}

