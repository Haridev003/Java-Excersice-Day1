import java.util.LinkedList;
import java.util.List;

public class StudentLinkedlist {
    public static void main( String [] args){
        List<Student> St_Linkedlist = new LinkedList<>();
        for( int i =0; i<4000;i++){
            St_Linkedlist.add( new Student(i,i));
        }
        for ( Student st_obj: St_Linkedlist){
            System.out.println( st_obj.getAge());
            System.out.println(st_obj.getRollNo());
        }
        St_Linkedlist.add( new Student(4000,4000));
        float Time = System.currentTimeMillis();
        System.out.println( Time);
    }
}
