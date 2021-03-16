public class Main {

    public Main() {
    }
    public static void main (String[]args){

        Calculator calc = (Calculator) Calculator.instance.get();
        int a = (Integer) calc.plus.apply(1, 2);
        int b = (Integer) calc.minus.apply(7, 5);
        int c = (Integer) calc.divide.apply(a, b);
        calc.println.accept(c);
        calc.println.accept(calc.abs.apply(0));
        calc.println.accept(calc.abs.apply(-7));
        calc.println.accept(calc.abs.apply(7));
        calc.println.accept(calc.abs.apply(-2147483648));
        calc.println.accept(calc.abs.apply(2147483647));
    }

}

