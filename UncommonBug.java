public class UncommonBug {
    public static void main(String[] args) {
        int i = 0;
        try {
            while (true) {
                i++;
                if (i == Integer.MAX_VALUE) {
                    System.out.println("Integer.MAX_VALUE reached");
                    // This will not work as expected
                    i = 0; // This will cause an integer overflow
                }
            }
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}