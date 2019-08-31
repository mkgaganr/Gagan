import java.util.*;
class Book
{
  public String name;
  public String author;
  public int price;
  public int num_pages;
  Book()
   {
   }
   public void read_data()
   {
     Scanner s =new Scanner(System.in);
     System.out.println("enter name,AUTHOR,price,number pages:");
     name=s.next();
     author=s.next();
     price=s.nextInt();
     num_pages=s.nextInt(); 
   }
   public void print_data(Book g)
  { 
    System.out.println("name= " +g.name+"   author=" +g.author+ "   price= " +g.price+ "          num_pages=" +g.num_pages);
   }
public static void main(String args[])
 {
  int i,n;
   Scanner s=new Scanner(System.in);
   System.out.println("enter the number of books");
    n=s.nextInt();
     for(i=0;i<n;i++)
     {
      Book B[]=new Book[n];
      B[i]=new Book();Develop
      B[i].read_data();
      B[i].print_data(B[i]);
     }
 } 
}
