package org.abc.test.classoperation.interfaces;

public interface IReadOnlyRepository<T> {
    T FindByValue(T filter);

    T[] FindAll();
}
