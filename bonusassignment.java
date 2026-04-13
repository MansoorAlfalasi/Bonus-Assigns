
import java.util.ArrayList;

public class bonusassignment {
    public ArrayList<Student> student = new ArrayList<>();
    
    public static void main(String[] args) {
        //took 20 minutes to figure out i needed to name it the same as the class, nice java.
        bonusassignment student = new bonusassignment();
        student.student.add(new Student("Alice", 85));
        student.student.add(new Student("Bob", 78));
        student.student.add(new Student("Charlie", 92));
        student.student.add(new Student("David", 65));
        student.student.add(new Student("Eve", 88));
        student.student.add(new Student("Alice", 85));
        student.student.add(new Student("Bob", 78));
        student.student.add(new Student("Charlie", 92));
        student.student.add(new Student("David", 65));
        student.student.add(new Student("Eve", 88));
        
    }
    public int countAbove(int threshold){
        int count=0;
        for(int i=0; i<student.size(); i++){
            if(student.get(i).getMarks() > threshold){
                count++;
            }
        }
        return count;
    }
    public void removeFailing(int passMark){
        for(int i=0; i<student.size(); i++){
            if(student.get(i).getMarks() >= passMark){
                student.remove(i);
            }
        }
    }
    public Student findTopStudent(){
        Student topStudent = student.get(0);

        for(int i=1; i<student.size(); i++){
            if(student.get(i).getMarks() > topStudent.getMarks()){
                topStudent = student.get(i);
            }
        }
        return topStudent;
    }
    public ArrayList<Student> getTopStudents(int threshold){
        ArrayList<Student> TopStudents = new ArrayList<>();

        for(int i=0; i<student.size(); i++){
            if(student.get(i).getMarks() > threshold){
                TopStudents.add(student.get(i));
            }
        }
        return TopStudents;
    }
    public boolean hasDuplicateNames(){
        for(int i=0; i<student.size(); i++){

            for(int j=i+1; j<student.size(); j++){
                if(student.get(i).getName().equals(student.get(j).getName())){
                    return true;
                    }
                }
            }
            return false;
        }
    public boolean isSorted(){
        for(int i=1; i<student.size(); i++){
            if(student.get(i).getMarks() < student.get(i-1).getMarks()){
                return false;
            }
            }
            return true;
        }
        public int countimproving(){
            int count = 0;
            for(int i=1; i<student.size(); i++){
                if(student.get(i).getMarks() > student.get(i-1).getMarks()){
                    count++;
                }
            }
            return count;
        }
    }
