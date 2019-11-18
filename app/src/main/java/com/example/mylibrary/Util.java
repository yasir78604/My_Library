package com.example.mylibrary;

import java.util.ArrayList;

public class Util {
    private static ArrayList<Book> allBooks;
    private static ArrayList<Book> currentlyReadingBooks;
    private static ArrayList<Book> wantToReadBooks;
    private static ArrayList<Book> alreadyReadBooks;

    private static int id = 0;

    public Util() {
        if(allBooks == null){
            allBooks = new ArrayList<>();
            initAllBooks();
        }
        if (currentlyReadingBooks == null){
            currentlyReadingBooks = new ArrayList<>();
        }
        if (null == wantToReadBooks){
            wantToReadBooks = new ArrayList<>();
        }
        if(null == alreadyReadBooks){
            alreadyReadBooks = new ArrayList<>();
        }
    }


    public static ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public static ArrayList<Book> getCurrentlyReadingBooks() {
        return currentlyReadingBooks;
    }

    public static ArrayList<Book> getWantToReadBooks() {
        return wantToReadBooks;
    }

    public static ArrayList<Book> getAlreadyReadBooks() {
        return alreadyReadBooks;
    }

    public boolean addCurrentlyReadingBook (Book book){
        return currentlyReadingBooks.add(book);
    }

    public boolean addWantToReadBook (Book book){
        return wantToReadBooks.add(book);
    }

    public boolean addAlreadyReadBook (Book book){
        return alreadyReadBooks.add(book);
    }

    public boolean removeCurrentlyReadingBook (Book book){
        return currentlyReadingBooks.remove(book);
    }

    public boolean removeWantToReadBook (Book book){
        return wantToReadBooks.remove(book);
    }

    public boolean removeAlreadyReadBook (Book book){
        return alreadyReadBooks.remove(book);
    }


    private static void initAllBooks(){


        String name = "";
        String author = "";
        int pages = 0;
        String imageUrl = "";
        String description = "";


        id++;
        name = "P. Vergili Maronis Opera: The works of Virgil";
        author = "Publius Vergilius Maro";
        pages = 900;
        imageUrl = "https://archive.org/download/coloritsapplicat00andriala/page/cover_thumb.jpg";
        description = "Google is proud Io parlner with libraries Io digili/e public domain malerials and make ihem widely accessible. Public domain books belong io thc \n" +
                "public and wc arc merely iheir cuslodians. Neveilheless. this work is expensive. so in order Io keep providing lliis resource. we have laken sleps Io \n" +
                "preveni abuse by commercial parlies. mcliidiiig placmg leclmical reslriclions ori aulomaled uuerying.";
        allBooks.add(new Book(id , name , author , pages ,description , imageUrl));


        id++;
        name = "Alton Locke";
        author = "Charles Kingsley";
        pages = 521;
        imageUrl = "https://covers.openlibrary.org/w/id/8235267-M.jpg";
        description = "Google is proud Io parlner with libraries Io digili/e public domain malerials and make ihem widely accessible. Public domain books belong io thc \n" +
                "public and wc arc merely iheir cuslodians. Neveilheless. this work is expensive. so in order Io keep providing lliis resource. we have laken sleps Io \n" +
                "preveni abuse by commercial parlies. mcliidiiig placmg leclmical reslriclions ori aulomaled uuerying.";
        allBooks.add(new Book(id , name , author , pages ,description , imageUrl));



        id++;
        name = "Interview With the Vampire";
        author = "Anne Rice";
        pages = 320;
        imageUrl = "https://covers.openlibrary.org/w/id/8401488-M.jpg";
        description = "Google is proud Io parlner with libraries Io digili/e public domain malerials and make ihem widely accessible. Public domain books belong io thc \n" +
                "public and wc arc merely iheir cuslodians. Neveilheless. this work is expensive. so in order Io keep providing lliis resource. we have laken sleps Io \n" +
                "preveni abuse by commercial parlies. mcliidiiig placmg leclmical reslriclions ori aulomaled uuerying.";
        allBooks.add(new Book(id , name , author , pages ,description , imageUrl));



        id++;
        name = "Psychology";
        author = "Wayne Weiten";
        pages = 579;
        imageUrl = "https://covers.openlibrary.org/w/id/4665311-M.jpg";
        description = "Google is proud Io parlner with libraries Io digili/e public domain malerials and make ihem widely accessible. Public domain books belong io thc \n" +
                "public and wc arc merely iheir cuslodians. Neveilheless. this work is expensive. so in order Io keep providing lliis resource. we have laken sleps Io \n" +
                "preveni abuse by commercial parlies. mcliidiiig placmg leclmical reslriclions ori aulomaled uuerying.";
        allBooks.add(new Book(id , name , author , pages ,description , imageUrl));



        id++;
        name = "Allan Quatermain: being an account of his further adventures and discoveries in company with Sir Henry Curtis, Bart., Commander John Good, R.N., and one Umslopogaas";
        author = "H. Rider Haggard";
        pages = 800;
        imageUrl = "https://covers.openlibrary.org/w/id/8243262-M.jpg";
        description = "Google is proud Io parlner with libraries Io digili/e public domain malerials and make ihem widely accessible. Public domain books belong io thc \n" +
                "public and wc arc merely iheir cuslodians. Neveilheless. this work is expensive. so in order Io keep providing lliis resource. we have laken sleps Io \n" +
                "preveni abuse by commercial parlies. mcliidiiig placmg leclmical reslriclions ori aulomaled uuerying.";
        allBooks.add(new Book(id , name , author , pages ,description , imageUrl));




        id++;
        name = "P. Vergili Maronis Opera: The works of Virgil";
        author = "Publius Vergilius Maro";
        pages = 900;
        imageUrl = "https://archive.org/download/coloritsapplicat00andriala/page/cover_thumb.jpg";
        description = "Google is proud Io parlner with libraries Io digili/e public domain malerials and make ihem widely accessible. Public domain books belong io thc \n" +
                "public and wc arc merely iheir cuslodians. Neveilheless. this work is expensive. so in order Io keep providing lliis resource. we have laken sleps Io \n" +
                "preveni abuse by commercial parlies. mcliidiiig placmg leclmical reslriclions ori aulomaled uuerying.";
        allBooks.add(new Book(id , name , author , pages ,description , imageUrl));


        id++;
        name = "P. Vergili Maronis Opera: The works of Virgil";
        author = "Publius Vergilius Maro";
        pages = 900;
        imageUrl = "https://archive.org/download/coloritsapplicat00andriala/page/cover_thumb.jpg";
        description = "Google is proud Io parlner with libraries Io digili/e public domain malerials and make ihem widely accessible. Public domain books belong io thc \n" +
                "public and wc arc merely iheir cuslodians. Neveilheless. this work is expensive. so in order Io keep providing lliis resource. we have laken sleps Io \n" +
                "preveni abuse by commercial parlies. mcliidiiig placmg leclmical reslriclions ori aulomaled uuerying.";
        allBooks.add(new Book(id , name , author , pages ,description , imageUrl));



        id++;
        name = "P. Vergili Maronis Opera: The works of Virgil";
        author = "Publius Vergilius Maro";
        pages = 900;
        imageUrl = "https://archive.org/download/coloritsapplicat00andriala/page/cover_thumb.jpg";
        description = "Google is proud Io parlner with libraries Io digili/e public domain malerials and make ihem widely accessible. Public domain books belong io thc \n" +
                "public and wc arc merely iheir cuslodians. Neveilheless. this work is expensive. so in order Io keep providing lliis resource. we have laken sleps Io \n" +
                "preveni abuse by commercial parlies. mcliidiiig placmg leclmical reslriclions ori aulomaled uuerying.";
        allBooks.add(new Book(id , name , author , pages ,description , imageUrl));


        id++;
        name = "P. Vergili Maronis Opera: The works of Virgil";
        author = "Publius Vergilius Maro";
        pages = 900;
        imageUrl = "https://archive.org/download/coloritsapplicat00andriala/page/cover_thumb.jpg";
        description = "Google is proud Io parlner with libraries Io digili/e public domain malerials and make ihem widely accessible. Public domain books belong io thc \n" +
                "public and wc arc merely iheir cuslodians. Neveilheless. this work is expensive. so in order Io keep providing lliis resource. we have laken sleps Io \n" +
                "preveni abuse by commercial parlies. mcliidiiig placmg leclmical reslriclions ori aulomaled uuerying.";
        allBooks.add(new Book(id , name , author , pages ,description , imageUrl));



        id++;
        name = "P. Vergili Maronis Opera: The works of Virgil";
        author = "Publius Vergilius Maro";
        pages = 900;
        imageUrl = "https://archive.org/download/coloritsapplicat00andriala/page/cover_thumb.jpg";
        description = "Google is proud Io parlner with libraries Io digili/e public domain malerials and make ihem widely accessible. Public domain books belong io thc \n" +
                "public and wc arc merely iheir cuslodians. Neveilheless. this work is expensive. so in order Io keep providing lliis resource. we have laken sleps Io \n" +
                "preveni abuse by commercial parlies. mcliidiiig placmg leclmical reslriclions ori aulomaled uuerying.";
        allBooks.add(new Book(id , name , author , pages ,description , imageUrl));


        id++;
        name = "P. Vergili Maronis Opera: The works of Virgil";
        author = "Publius Vergilius Maro";
        pages = 900;
        imageUrl = "https://archive.org/download/coloritsapplicat00andriala/page/cover_thumb.jpg";
        description = "Google is proud Io parlner with libraries Io digili/e public domain malerials and make ihem widely accessible. Public domain books belong io thc \n" +
                "public and wc arc merely iheir cuslodians. Neveilheless. this work is expensive. so in order Io keep providing lliis resource. we have laken sleps Io \n" +
                "preveni abuse by commercial parlies. mcliidiiig placmg leclmical reslriclions ori aulomaled uuerying.";
        allBooks.add(new Book(id , name , author , pages ,description , imageUrl));


        id++;
        name = "P. Vergili Maronis Opera: The works of Virgil";
        author = "Publius Vergilius Maro";
        pages = 900;
        imageUrl = "https://archive.org/download/coloritsapplicat00andriala/page/cover_thumb.jpg";
        description = "Google is proud Io parlner with libraries Io digili/e public domain malerials and make ihem widely accessible. Public domain books belong io thc \n" +
                "public and wc arc merely iheir cuslodians. Neveilheless. this work is expensive. so in order Io keep providing lliis resource. we have laken sleps Io \n" +
                "preveni abuse by commercial parlies. mcliidiiig placmg leclmical reslriclions ori aulomaled uuerying.";
        allBooks.add(new Book(id , name , author , pages ,description , imageUrl));


        id++;
        name = "P. Vergili Maronis Opera: The works of Virgil";
        author = "Publius Vergilius Maro";
        pages = 900;
        imageUrl = "https://archive.org/download/coloritsapplicat00andriala/page/cover_thumb.jpg";
        description = "Google is proud Io parlner with libraries Io digili/e public domain malerials and make ihem widely accessible. Public domain books belong io thc \n" +
                "public and wc arc merely iheir cuslodians. Neveilheless. this work is expensive. so in order Io keep providing lliis resource. we have laken sleps Io \n" +
                "preveni abuse by commercial parlies. mcliidiiig placmg leclmical reslriclions ori aulomaled uuerying.";
        allBooks.add(new Book(id , name , author , pages ,description , imageUrl));




    }
}
