package practice.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

enum gender {
    MALE, FEMALE
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class HashExam {
    private String name;
    private int age;
    private gender gender;

    @Override
    public int hashCode() {
        return 250252 * age + 4459; // custom algorithm for hashcode
    }
}

public class HashCodeExample {
    public static void main(String[] args) {

        HashExam h1 = new HashExam("Ram",25,gender.MALE);
        HashExam h2 = new HashExam("Sita",23,gender.FEMALE);

        System.out.println(h1.hashCode());
        System.out.println(h2.hashCode());
    }
}
