public class UncommonBugSolution {
    public static void main(String[] args) {
        long i = 0;
        try {
            while (true) {
                i++;
                if (i == Long.MAX_VALUE) {
                    System.out.println("Long.MAX_VALUE reached");
                    break; // Exit the loop when Long.MAX_VALUE is reached.
                }
            }
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}