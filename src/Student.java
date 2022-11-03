import java.util.Objects;

/**
 * The type Student.
 */
class Student{
    private int age;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets roll no.
     *
     * @param rollNo the roll no
     */
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }


    private int rollNo;

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets roll no.
     *
     * @return the roll no
     */
    public int getRollNo() {
        return rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getAge() == student.getAge() && getRollNo() == student.getRollNo() && getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getRollNo(), getName());
    }

    private  String name;

    /**
     * Instantiates a new Student.
     *
     * @param a the a
     * @param b the b
     */
    Student (int a, int b){
        setAge(a);
        setRollNo(b);
    }
}

