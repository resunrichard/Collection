import java.util.*; 
public class LinkedListTest1{ 
public static void main(String args[]){ 
 LinkedList<String> al=new LinkedList<String>(); 
 al.add("Ravi"); 
 al.add("Vijay"); 
 al.add("Ravi"); 
 al.add("Ajay"); 
 /*Iterator<String> itr=al.iterator(); 
 while(itr.hasNext()){ 
 System.out.println(itr.next());}*/
 // al.forEach(names->System.out.println(names));
 //al.forEach(System.out::println);
 al.stream().forEachOrdered(System.out::println); }}