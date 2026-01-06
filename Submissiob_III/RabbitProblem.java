class RabbitProblem {

    static int rabbit(int n) {
        if (n <= 2)
            return 1;
        return rabbit(n - 1) + rabbit(n - 2);
    }

    public static void main(String[] args) {
        int month = 6;
        System.out.println("Rabbit pairs after " + month + " months: " + rabbit(month));
    }
}
