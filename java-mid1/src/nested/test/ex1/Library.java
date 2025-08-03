package com.example.nested.test.ex1;

public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addbook(String book, String auth) {

        //검증 로직을 다 처리하고
        if (bookCount >= books.length){
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
        //정상 로직을 처리
        books[bookCount++]  = new Book(book, auth);

        //정상로직과 검증 로직을 함께
        if (bookCount < books.length){
            books[bookCount++]  = new Book(book, auth);
        }else{
            System.out.println("도서관 저장 공간이 부족합니다.");
        }

    }

    public void showBooks() {
        System.out.println(" == 책 목록 출력 == ");
        for(int i = 0; i < bookCount; i++){
            Book book = books[i];
            System.out.println("도서 제목 : " + book.title+ " 저자 : " + book.author);
            System.out.println("도서 제목 : " + books[i].title+ " 저자 : " + books[i].author);

        }
    }


    public static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

    }

/*    class addbook(String book, String auth){

    }

    public class showBooks(){

    }*/
}
