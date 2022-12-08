import java.util.ArrayList;
import java.util.List;
public class CollectionTest2
{
List<String>gamesList=new ArrayList<String>();
gamesList.add("Table tennis");
gamesList.add("Football");
gamesList.add("Cricket");
gamesList.add("Chess");
System.out.println("_________________Iterating by passing method_________________");
gamesList.forEach(System.out::println);
}
}
