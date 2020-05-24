package demo06.lambda;

public class RunCalc {

    public static void main(String[] args) {
        invokeCalc(120, 130, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        invokeCalc(120, 130, (int a, int b) -> a + b);
    }

    public static void invokeCalc(int a, int b, Calculator calculator)
    {
        int result = calculator.calc(a, b);
        System.out.println(result);
    }
}
