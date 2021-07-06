import java.io.*;
class Newser{
 public static void main(String args[])throws Exception{
  Student s1 =new Student("ARNAB",24);

  FileOutputStream t2=new FileOutputStream("C:\\Users\\Legion\\Desktop\\IO\\test.txt");
  ObjectOutputStream out=new ObjectOutputStream(t2);

  out.writeObject(s1);
  out.flush();

  System.out.println("success");
 }
}