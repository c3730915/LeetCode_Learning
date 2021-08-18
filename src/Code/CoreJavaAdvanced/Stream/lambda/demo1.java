package Code.CoreJavaAdvanced.Stream.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        var arrayList = new String[] { "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune" };
        Arrays.sort(arrayList,(first,second) -> first.length() -second.length());
        System.out.println(Arrays.toString(arrayList));


    }
}
