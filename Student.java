import java.io.Serializable;  
public class Student implements Serializable{  
 String firstname;
int id;  
 public Student(String fname,int id) {
System.out.println("student name: "+  fname+", student ID: "+ id);  
 }  
}  