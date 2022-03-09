import java.util.stream.IntStream;
import java.time.LocalTime;


public class Timenum {
    public static void main(String[] args) {
    LocalTime time =LocalTime.now();
    IntStream stream = IntStream.range(1,10000);
    stream.forEach(num -> System.out::println(time+" "+num;));
    }
}
