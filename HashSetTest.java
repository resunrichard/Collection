import java.util.*;
public class HashSetTest {
public static void main(String args[]) {
HashSet<String> ht=new HashSet<String>();
ht.add("Mahesh");
ht.add("Rajesh");
ht.add("Ramesh");
ht.add("Mahesh");
ht.add("Suresh");
/*Iterator<String> itr=ht.iterator(); 
while(itr.hasNext()) {
System.out.println(itr.next());}*/
System.out.println("Hash Set Elements are: "+ht);
ht.forEach(names-> System.out.println(names));
System.out.println("--using method reference--");
ht.forEach(System.out::println);}}