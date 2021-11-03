package test.reflection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class getEnumClass {
    public static void main(String[] args) {
        List<String> collect = Arrays.stream(LanguageEnum.class.getEnumConstants()).
                map(LanguageEnum::getKey).collect(Collectors.toList());
        collect.forEach(System.out::println);


    }
}
