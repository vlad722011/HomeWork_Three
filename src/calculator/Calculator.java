package calculator;

public class Calculator {

    public static <T extends Number > double sum(T argument1, T argument2){
        return argument1.doubleValue() + argument2.doubleValue();
    }
    public static <T extends Number > double multiply(T argument1, T argument2){
        return argument1.doubleValue() * argument2.doubleValue();
    }
    public static <T extends Number > double divide(T argument1, T argument2){
        return argument1.doubleValue() / argument2.doubleValue();
    }
    public static <T extends Number >  double subtract(T argument1, T argument2){
        return argument1.doubleValue() - argument2.doubleValue();
    }

}
