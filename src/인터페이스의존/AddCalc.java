package 인터페이스의존;

public class AddCalc implements Calculator {

    @Override
    public Integer calc(Integer x, Integer y) {
        return x + y;
    }
}
