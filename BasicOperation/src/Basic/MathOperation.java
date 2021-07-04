package Basic;

public class MathOperation implements IOperation<Integer> {
    @Override
    public Integer Add(Integer FirstValue, Integer SecondValue) {
        return FirstValue + SecondValue;
    }

    @Override
    public Integer Subtract(Integer FirstValue, Integer SecondValue) {
        return FirstValue - SecondValue;
    }

    @Override
    public Integer Multiply(Integer value, int MultiplyBy) {
        return value * MultiplyBy;
    }

    @Override
    public Integer Divide(Integer Value, int DivideBy) {
        if (DivideBy == 0)
            return 0;
        else
            return Value/DivideBy;
    }
}
