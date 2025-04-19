public class TheRemainderOfTheBooks {

//Условие:
    //В библиотеку привезли N книг, которые нужно поровну распределить на M полок.
    // Напишите программу, которая возвращает количество книг, которые не поместятся (остаток от деления)./*
    //Формат ввода:
    //Два целых числа: N (книги) и M (полки).

    public int library(int book, int shelves) {
        return book % shelves;
    }

    public static void main(String[] args) {
        TheRemainderOfTheBooks c = new TheRemainderOfTheBooks();
        System.out.println(c.library(1000, 5));
    }

}
