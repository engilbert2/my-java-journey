import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IerateListuisingjavaStreamAPI {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();

        stringList.add("123");
        stringList.add("456");

        Stream<String> stream = stringList.stream();
    }
}
