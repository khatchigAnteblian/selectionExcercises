public class Question1 {
    public static void main(String[] args) {
        // A 80-100
        // B 70-79
        // C 60-69
        // D 50-59
        // F <50
        int[] grades = {25, 62, 83, 44};

        for (int i : grades) {
            if (i >= 80) {
                System.out.println("You got an A!");
            } else if (i >= 70) {
                System.out.println("You got a B!");
            } else if (i >= 60) {
                System.out.println("You got a C!");
            } else if (i >= 50) {
                System.out.println("You got a D!");
            } else {
                System.out.println("You got an F!");
            }
        }

    }
}
