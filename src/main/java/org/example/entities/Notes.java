package org.example.entities;

import java.util.Objects;

public class Notes {
    private int  bookNo;
    private String name;
    private int pages;

    public Notes() {
    }

    public Notes(int bookNo, String name, int pages) {
        this.bookNo = bookNo;
        this.name = name;
        this.pages = pages;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notes notes = (Notes) o;
        return bookNo == notes.bookNo && pages == notes.pages && Objects.equals(name, notes.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookNo, name, pages);
    }
}
