package linecomparison;

public class LengthOfaLine {
        public static double lineLength;

        /**
         * Method for calculating the length of line.
         */
        private static void LengthOfaLine(int x1, int x2,int y1 , int y2 ) {
            lineLength = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        }

        public static void main(String[] args) {
            LengthOfaLine(3,2,6,8);
            System.out.println(lineLength);
        }
    }

