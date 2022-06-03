package practice.collection.Comparble;

import lombok.Data;

@Data
public class ComparebleTest implements Comparable {
    private int stId;
    private String stName;
    private String stAge;



    public static void main(String[] args) {
        ComparebleTest test1 = new ComparebleTest();
        ComparebleTest test2 = new ComparebleTest();

    }

    @Override
    public int compareTo(Object o) {
        ComparebleTest s = (ComparebleTest)o;
        return this.stId-s.stId;
    }
}
