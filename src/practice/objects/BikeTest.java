package practice.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

enum company{
    BAJAJ,ROYALENFIELD, HERO,HONDA,TVS
}
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
class Bike{
    private String registration_Number;
    private String ownerName;
    private company company;
}

public class BikeTest {
    public static void main(String[] args){
        Bike b1 = new Bike("HERO12345","Mohit",company.HERO);
        Bike b2 = new Bike("Royal12345","Deendyal",company.ROYALENFIELD);
        Bike b3 = new Bike("HONDA12345","Nishant",company.HONDA);
        Bike b4 = new Bike("BAJAJ12345","Ram",company.BAJAJ);

        // == or equal method
        // == means comparison with reference in stack
        // equal() means comparison with object in heap

        System.out.println(b1 == b2);//false
        System.out.println(b1.equals(b2));//false
        System.out.println();
    }
}
