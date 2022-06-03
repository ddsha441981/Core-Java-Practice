package practice.collection.comprator;

import lombok.*;

import java.util.ArrayList;
import java.util.Comparator;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class StudentInfo {
    private int sid;
    private String sname;
    private String email;
}

class BySid implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        StudentInfo s1 = (StudentInfo) o1;
        StudentInfo s2 = (StudentInfo) o2;

        return 0;
    }
}

class BySname implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        StudentInfo s1 = (StudentInfo) o1;
        StudentInfo s2 = (StudentInfo) o2;

        return 1;
    }
}

class ByEmail implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        StudentInfo s1 = (StudentInfo) o1;
        StudentInfo s2 = (StudentInfo) o2;
        return 0;
    }
}

public class Comparators {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        StudentInfo s1 = new StudentInfo(22, "dd", "cc@gmail.com");
        StudentInfo s2 = new StudentInfo(22, "dd", "cc@gmail.com");
        StudentInfo s3 = new StudentInfo(22, "dd", "cc@gmail.com");
        StudentInfo s4 = new StudentInfo(22, "dd", "cc@gmail.com");
        StudentInfo s5 = new StudentInfo(22, "dd", "cc@gmail.com");
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);

    }

}
