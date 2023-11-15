package 인터페이스의존;

public class Call {
    public static void main(String[] args) {
        Calculator calculator = new SubCalc();
        int result = calculator.calc(10 , 5);
        System.out.println(result);
    }
}
