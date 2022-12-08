import java.util.*;
class BookExample {
private int bookid;
private String bookname;
private String author;
private long price;
BookExample(int bookid,String bookname, String author, long price){
this.bookid=bookid;
this.bookname=bookname;
this.author=author;
this.price=price; }
@Override
public String toString() {
return "[bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", 
price=" + price+ "]";}}
class BookHashSet{
public static void main(String arg[]){
HashSet<BookExample> hs=new HashSet<BookExample>();
BookExample b1=new BookExample(11,"Java","Joju",600);
BookExample b2=new BookExample(22,"Python","Raju",400);
BookExample b3=new BookExample(33,"DevOps","Anita",270);
hs.add(b1);
hs.add(b2);
hs.add(b3);
System.out.println(hs); }}