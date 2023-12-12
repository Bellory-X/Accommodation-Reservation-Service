package com.example.application.util;

import java.util.List;
import java.util.Objects;

public class TablePage<T> {

    public final List<T> rows;
    public final Integer pageNumber;
    public final Integer pageSize;
    public final Integer pageCount;

    public TablePage(List<T> rows, Integer pageNumber, Integer pageSize, Integer pageCount) {
        this.rows = rows;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TablePage<?> tablePage = (TablePage<?>) o;
        return rows.equals(tablePage.rows) && pageNumber.equals(tablePage.pageNumber) && pageSize.equals(tablePage.pageSize) && pageCount.equals(tablePage.pageCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rows, pageNumber, pageSize, pageCount);
    }

    public List<T> rows() {
        return rows;
    }

    public Integer pageNumber() {
        return pageNumber;
    }

    public Integer pageSize() {
        return pageSize;
    }

    public Integer pageCount() {
        return pageCount;
    }
}
