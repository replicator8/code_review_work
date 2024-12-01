public class Calculator {
    public static void main(String[] args) {}

    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return b != 0 ? a / b : null;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        return times(div(dif(10, 2), 4), add(36, 6));
    }
}