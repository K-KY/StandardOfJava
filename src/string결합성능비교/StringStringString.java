package string결합성능비교;

public class StringStringString {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        long beforeTime = System.currentTimeMillis();

        String d = "대충 30만줄" ;
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("걸린 시간(초) : "+secDiffTime);

        String c = a + b + a + b +a + b + a + b +a + b + a + b +a + b + a + b +a + b + a + b +a + b + a + b +a + b + a + b;
        String e = new String("a" + "b" +"a" + "b" +"a" + "b" +"a" + "b" +"a" + "b" +"a" + "b" +"a" + "b" +"a" + "b" +"a" + "b" +"a" + "b" +"a" + "b" +"a" + "b");
        String f = new String();
        System.out.println(d);
    }
}
