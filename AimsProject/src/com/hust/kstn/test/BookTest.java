package com.hust.kstn.test;

import com.hust.kstn.models.BookAuthor;
import com.hust.kstn.models.Book;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("Nguyen Nhat Anh", 1960, "Tac gia sach bup sen xanh");
        BookAuthor author2 = new BookAuthor("Nguyen Cong Son", 1970, "Tac gia sach nghin le mot dem");
        BookAuthor author3 = new BookAuthor("Nguyen Dang Khoa", 1980, "Tac gia bach tuyet va 7 chu lun");

        BookAuthor[] authors1 = {author1, author2};
        Book book1 = new Book("Giai tich 1", 149000.0, "giao duc", 10000, authors1);

        System.out.println(book1);

        BookAuthor[] authors2 = {author3};
        Book book2 = new Book("Thanh Giong", 49000.0, "Giao duc", 1000, authors2);


        System.out.println(book2);
    }
}