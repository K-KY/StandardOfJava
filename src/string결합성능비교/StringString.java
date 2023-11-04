package string결합성능비교;

public class StringString {
    public static void main(String[] args) {
        String str = "";
        long beforeTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            str += "a";
            System.out.println(i);
        }
        System.out.println("done");
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("걸린 시간(초) : "+secDiffTime);

    }
}
