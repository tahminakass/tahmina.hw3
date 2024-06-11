
    public class Main {
        public static void main(String[] args) {
            double[] numbers = { 1,1, 2,5, -2,3, -3,1, -4,7, -5,1, 6,2, 8,7, 9,3, 10,1, 11,8, 12,9, 13,7, 18,7};
            System.out.println("Ваш массив" + numbers);
            boolean negative = false;
            double sum = 0.0;
            int count = 0;
            for (double number: numbers) {
                if (!negative) {
                    if (number < 0) {
                        negative = true;
                    }
                } else {
                    if (number > 0) {
                        sum += number;
                        count++;

                    }
                }
            }
            if (count > 0) {
                double summ = sum/count;
                System.out.println(sum + "/" + count + "или" + summ);
            }
        }
    }

