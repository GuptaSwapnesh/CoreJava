package string.immutable;

import java.lang.reflect.Field;

public class ImmutableWithMutableFieldTest {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        ImmutableWithMutableField immutable = ImmutableWithMutableField.getInstance("Abc", "Xyz", "Pune");
        System.out.println(immutable);

        // Breaking Immutablity using Reflection
        Class<?> classReflection = immutable.getClass();
        Field field = classReflection.getDeclaredField("fName");
        field.setAccessible(true);
        field.set(immutable, "Pqr");
        System.out.println(immutable);


    }
}
