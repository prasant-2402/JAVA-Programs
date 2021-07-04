package src.Test.Basic;

public class BasicOperation {

    public static void main(String[] args) {
        MathOperation _math;
        _math = new MathOperation();
        Integer first = 45;
        Integer Second = 50;
        Integer Result = _math.Add(first, Second);
        System.out.printf("Result: %d%n", Result);
    }
}
