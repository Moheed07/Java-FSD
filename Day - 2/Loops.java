class Loops {
    public static void main(String[] args) {
        // Using a for loop to print "Kodnest" 5 times
        System.out.println("Using a for loop:");
        for (int i = 0; i <= 4; i++) {
            // The line `System.out.println("Kodnest");` is responsible for printing the string
            // "Kodnest" to the console output. In this context, it is being used inside different
            // types of loops to print "Kodnest" 5 times.
            System.out.println("Kodnest");
        }
        // Using a while loop to print "Kodnest" 5 times
        System.out.println("Using a while loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("Kodnest");
            j++;
        }
        // Using a do-while loop to print "Kodnest" 5 times
        System.out.println("Using a do-while loop:");
        int k = 0;
        do {
            System.out.println("Kodnest");
            k++;
        } while (k < 5);
    }
}