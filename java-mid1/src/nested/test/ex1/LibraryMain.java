package com.example.nested.test.ex1;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(5);
        library.addbook("첵111", "저자1");
        library.addbook("첵112", "저자2");
        library.addbook("첵123", "저자3");
        library.addbook("첵45", "저자4");
        library.addbook("첵555", "저자5");
        library.addbook("첵555", "저자5");
        library.showBooks();
    }
}
