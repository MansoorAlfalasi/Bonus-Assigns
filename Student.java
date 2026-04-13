Public class Student { 
   private String name; 
   private int marks; 
   public Student(String name, int marks) { 
       this.name = name; 
       this.marks = marks; 
   } 
 public String getName() { 
       return name; 
   }  
  public int getMarks() { 
       return marks; 
   } 
public void setMarks(int newMarks) { 
marks = newMarks; 
} 
} 
public class StudentAnalyzer { 
private ArrayList<Student> studentList; 
public StudentAnalyzer(ArrayList<Student> list) { 
studentList = list; 
}
