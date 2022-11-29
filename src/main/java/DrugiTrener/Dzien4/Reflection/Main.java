package DrugiTrener.Dzien4.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Dummy dummy = new Dummy(1, "n1");

        Class<Dummy> clazz = (Class<Dummy>) dummy.getClass();
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        Dummy d1 = (Dummy) constructors[0].newInstance("abc");
        System.out.println(d1);

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        fields[0].setAccessible(true);
        fields[0].setInt(dummy, 99);
        System.out.println(dummy);

        ////
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));

        Method method = methods[0];
        String name = (String) method.invoke(dummy);
        System.out.println(name);

    }
        //
        public static void printMethods() throws InvocationTargetException, IllegalAccessException {
            Dummy dummy = new Dummy(10,"aa");
            Class<Dummy> clazz = (Class<Dummy>) dummy.getClass();
            Method[] methods = clazz.getMethods();
            Method method = methods[0];
            String name = (String) method.invoke(dummy);
            System.out.println(name);
        }
    }

