import java.util.HashSet;
import java.util.Set;

public class StudentHashset {
    public static void main( String [] args){
        Set<Student> St_Hashset = new HashSet<>();
        for( int i =0; i<4000;i++){
            St_Hashset.add( new Student(i,i));
        }
        for ( Student st_obj: St_Hashset){
            System.out.println( st_obj.getAge());
            System.out.println(st_obj.getRollNo());
        }
        St_Hashset.add( new Student(4000,4000));
        float Time = System.currentTimeMillis();
        System.out.println( Time);
    }
}
