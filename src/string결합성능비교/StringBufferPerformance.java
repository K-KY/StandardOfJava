package string결합성능비교;

public class StringBufferPerformance {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        long beforeTime = System.currentTimeMillis();

        for (int i = 0; i < 50000000; i++) {
            stringBuffer.append("a");
            System.out.println(i);
        }
        System.out.println("done");
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("걸린 시간(초) : "+secDiffTime);

    }
}
