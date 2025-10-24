public class armstrong0to999check {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 0 and 999 are: ");

        for (int number = 0; number <= 999; number++) {
            int temp = number;
            int length = 0;

            while (temp > 0) {
                temp = temp / 10;
                length++;
            }
            if (number == 0) {
                length = 1; //for 0 case as if 0>0 it will terminate it and 0 is a armstrong no.
            }
            int temp2 = number;
            int sum = 0;
            while (temp2 > 0) {
                int rem = temp2 % 10;
                int multiply = 1;
                for (int i = 1; i <= length; i++) {
                    multiply = multiply * rem;
                }

                sum = sum + multiply;
                temp2 = temp2 / 10;
            }
            if (number == sum) {
                System.out.println(number);
            }
        }
    }
}


