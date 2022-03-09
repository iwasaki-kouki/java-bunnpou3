import java.util.stream.IntStream;

public class Timenum {
    public static void main(String[] args) {
    IntStream stream = IntStream.range(1,999);
    stream.forEach(System.out::println);
    }
}
