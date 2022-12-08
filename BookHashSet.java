import java.util.*;
class BookHashSet{
public static void main(String arg[]){
HashSet<Book> hs=new HashSet<Book>();
Book b1=new Book(11,"Java","Joju",600);
Book b2=new Book(22,"Python","Raju",400);
Book b3=new Book(33,"DevOps","Anita",270);
hs.add(b1); hs.add(b2); hs.add(b3);
System.out.println(hs); }}
