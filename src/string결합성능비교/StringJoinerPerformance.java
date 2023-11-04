package string결합성능비교;

import java.util.StringJoiner;

public class StringJoinerPerformance {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner("");
        long beforeTime = System.currentTimeMillis();

        for (int i = 0; i < 5000000; i++) {
            stringJoiner.add("a");
            System.out.println(i);
        }
        System.out.println("done");
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("걸린 시간(초) : "+secDiffTime);

    }
}
