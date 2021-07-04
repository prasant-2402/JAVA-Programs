package Test.Basic;

public interface IOperation<T> {
    T Add(T FirstValue, T SecondValue);
    T Subtract(T FirstValue, T SecondValue);
    T Multiply(T value, int MultiplyBy);
    T Divide (T Value, int DivideBy);
}
