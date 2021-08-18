package Code.CoreJavaAdvanced.Stream;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

public class randomStream {
    @Test
    public void randomStreamTest(){
        Stream<Double> doubleStream = Stream.generate(Math::random).limit(100);
        System.out.println(Arrays.toString(doubleStream.toArray()));
        //create sequence stream with limit 100
        Stream<BigInteger> sequenceStream = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE)).limit(100);
//        System.out.println(Arrays.toString(sequenceStream.toArray()));
        Stream<BigInteger> subSequence = sequenceStream.filter(w -> w.compareTo(BigInteger.valueOf(10)) > 0);
//        subSequence.forEach(System.out::print);
        //print with lambda expression!
        subSequence.forEach(result -> System.out.print(result+","));

    }
    public void primitiveStream(){
        

    }
}
