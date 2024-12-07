import entities.MyAnnotationTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ReflectionTest {
    public static void main(String[] args) throws IllegalAccessException {

        Shop shop = new Shop();
        Class clazz = Shop.class;

        System.out.println(clazz.getName());

        System.out.println("Constructors:");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() + " --- arguments: ");
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.print(parameter.getName());
            }
            System.out.println();
        }

        System.out.println("\nMethods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(method.getName() + " ");
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
            }
            System.out.print(Modifier.toString(method.getModifiers()) + " ");
            System.out.println(method.getReturnType().getName());
        }


        System.out.println("\nFields:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.print(field.getName() + " ");
            System.out.print(field.getType().getName() + " ");
            System.out.println(Modifier.toString(field.getModifiers()));
        }
        Field changedField = fields[0];
        changedField.setAccessible(true);
        System.out.println("Shop number on start " + changedField.getInt(shop));
        changedField.setInt(shop, 6);
        System.out.println("Shop number on finish " + changedField.getInt(shop));
        changedField.setAccessible(false);

        System.out.println("\nAnnotations:");
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            String annotationString = annotation.toString();
            System.out.println(annotationString);
            if (annotation instanceof MyAnnotationTest myAnnotationTest) { //here I used instanceOf feature from Java14
                String message = myAnnotationTest.message();
                System.out.println(message);
            }
        }

    }
}
