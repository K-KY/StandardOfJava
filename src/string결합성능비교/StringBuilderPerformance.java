package string결합성능비교;

public class StringBuilderPerformance {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        long beforeTime = System.currentTimeMillis();

        for (int i = 0; i < 5000000; i++) {
            stringBuilder.append("a");
            System.out.println(i);
        }
        System.out.println("done");
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("걸린 시간(초) : "+secDiffTime);

    }
}
