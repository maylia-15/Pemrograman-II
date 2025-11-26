import java.util.ArrayList;

public class StudentRepository {
    private ArrayList<Student> data = new ArrayList<>();

    public void add (Student s){
        data.add(s);
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

    public ArrayList<Student> getAll(){
        return data;
    }
}
