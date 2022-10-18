package linecomparison;

public class EqualityOfTwoLines {
        public static double firstLineLength;
        public static double secondLineLength;

        /**
         * Method for calculating the length of line.
         */
        private static double EqualityOfTwoLines(int x1, int x2, int y1, int y2) {
            double lineLength;
            lineLength = Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));
            return lineLength;
        }

        /**
         * Method for checking equality of two lines.
         */
        private static void EqualityOfTwoLines() {
            if (firstLineLength == secondLineLength) {
                System.out.println("Both Lines are equal");
            } else {
                System.out.println("Lines are not equal");
            }
        }

    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program on Master Branch");
        firstLineLength = EqualityOfTwoLines(3, 2, 6, 8);
        System.out.println(firstLineLength);
        secondLineLength = EqualityOfTwoLines(5,3,6,2);
        System.out.println(secondLineLength);
        EqualityOfTwoLines();
    }
}

