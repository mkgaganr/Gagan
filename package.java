import CIE.*;
import SEE.*;
import java.util.*;
class package
{
public static void main(String args[])
{
     
      Scanner sc=new Scanner(System.in);
       System.out.println("enter the no of student");
        int n=sc.nextInt();
 Internal in[]=new Internal[n];
  External ex[]=new External[n];
      for(int i=0;i<n;i++)
      {   
      
          in[i]=new Internal();
          in[i].getdata();
          in[i].display(); 
	ex[i]=new External();
      ex[i].getdata();
      ex[i].display();
   }
    }
 }
