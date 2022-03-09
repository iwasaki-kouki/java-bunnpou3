import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.*;

public class TextReader {
    private String path;
    private static Logger logger = Logger.getLogger(TextReader.class.getName());
    private enum StaEND{
        START,END
    }
    TextReader(String path) {
        this.path = path;
    }
    private void execute() {
        List <Integer> valueList = new ObjectList<>();
        try (FileReader fr = new FileReader(path);BufferedReader br = new BufferedReader(fr);){
            String line =null;
            while ((line = br.readLine()) != null) {
                valueList.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Integer i:valueList) {
            System.out.println(i);
        }
    }
    public static void main(String... args) {
        logger.info(StaEND.START.name());
        new TextReader(args[0]).execute();
        logger.info(StaEND.START.name());
    }
}