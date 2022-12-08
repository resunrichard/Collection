import java.util.ArrayList;
import java.util.List;
public class CollectionTest3
{
List<String>gamesList=new ArrayList<String>();
gamesList.add("Table tennis");
gamesList.add("Football");
gamesList.add("Cricket");
gamesList.add("Chess");
System.out.println("_________________Iterating by passing lamda expression_______________________");
gamesList.stream().forEachOrdered(System.out.println(games));
System.out.println("_________________Iterating by passing method reference_______________________");
gamesList.stream().forEachOrdered(System.out::println);
}
}
