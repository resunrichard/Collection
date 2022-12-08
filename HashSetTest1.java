import java.util.*;
import java.util.stream.Collectors;
public class HashSetTest1 {
public static void main(String args[]) {
HashSet<Integer> ht=new HashSet<Integer>();
ht.add(10);
ht.add(20);
ht.add(50);
ht.add(60);
ht.add(90);
System.out.println(ht);
List<Integer> s=ht.stream().filter(m->m>=35).collect(Collectors.toList());
List<Integer> s1=ht.stream().map(n->n*n).collect(Collectors.toList());
long s3=ht.stream().filter(m-> m<500).count();
System.out.println(s);
System.out.println(s1);
System.out.println(s3);
List<Integer> result =ht.stream().sorted().collect(Collectors.toList());
System.out.println(result);}}