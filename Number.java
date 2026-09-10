class Number {

    private double num;

    Number(double num) {
        this.num = num;
    }

    boolean isZero() {
        return num == 0;
    }

    boolean isPositive() {
        return num > 0;
    }

    boolean isNegative() {
        return num < 0;
    }

    boolean isOdd() {
        return num % 2 != 0;
    }

    boolean isEven() {
        return num % 2 == 0;
    }

    boolean isPrime() {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    boolean isArmstrong() {

        int n = (int) num;
        int original = n;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            sum = sum + digit * digit * digit;
            n = n / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Number n = new Number(153);

        System.out.println("Zero = " + n.isZero());
        System.out.println("Positive = " + n.isPositive());
        System.out.println("Negative = " + n.isNegative());
        System.out.println("Odd = " + n.isOdd());
        System.out.println("Even = " + n.isEven());
        System.out.println("Prime = " + n.isPrime());
        System.out.println("Armstrong = " + n.isArmstrong());
    }
}
