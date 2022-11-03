import java.util.*;

/**
 * The type Student arraylist.
 */
public class Performace_check {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main( String [] args){
            List<Student> stArraylist = new ArrayList<>();
            for( int i =0; i<4000;i++){
              stArraylist.add( new Student(i,i));
            }
            for ( Student stObj: stArraylist){
                System.out.println( stObj.getAge());
                System.out.println(stObj.getRollNo());
            }
            stArraylist.add( new Student(4000,4000));
            long time = System.currentTimeMillis();

            List<Student> stLinkedlist = new LinkedList<>();
            for( int i =0; i<4000;i++){
                stLinkedlist.add( new Student(i,i));
            }
            for ( Student stObj: stLinkedlist){
                System.out.println( stObj.getAge());
                System.out.println(stObj.getRollNo());
            }
            stLinkedlist.add( new Student(4000,4000));
            long time1 = System.currentTimeMillis();

            Set<Student> stHashset = new HashSet<>();
            for( int i =0; i<4000;i++){
                stHashset.add( new Student(i,i));
            }
            for ( Student st_obj: stHashset){
                System.out.println( st_obj.getAge());
                System.out.println(st_obj.getRollNo());
            }
            stHashset.add( new Student(4000,4000));
            long time2 = System.currentTimeMillis();
            System.out.println( time);
            System.out.println( time1);
            System.out.println( time2);
        }

}

