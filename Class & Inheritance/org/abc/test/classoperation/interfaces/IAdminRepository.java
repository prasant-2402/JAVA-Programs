package org.abc.test.classoperation.interfaces;

public interface IAdminRepository<T> {
    boolean Insert(T value);

    boolean InsertAll(T[] values);

    boolean Update(T value);

    boolean UpdateAll(T[] values);
}
