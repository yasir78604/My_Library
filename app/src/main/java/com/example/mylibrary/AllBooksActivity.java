package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {
    private static final String TAG = "AllBooksActivity";

    private RecyclerView booksRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        overridePendingTransition(R.anim.in, R.anim.out);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Log.d(TAG, "onCreate: started");

        booksRecView = (RecyclerView) findViewById(R.id.booksRecView);

        BooksRecViewAdapter adapter = new BooksRecViewAdapter(this);
        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new GridLayoutManager(this,2));



    //    books.add(new Book("1Q84", "Haruki Murakami" , 1350, "books Which open your eyes",
    //            "https://archive.org/download/coloritsapplicat00andriala/page/cover_thumb.jpg"));
    //    books.add(new Book("Dark World", "nougat" , 1000, "books Which open your eyes",
    //            "https://archive.org/download/coloritsapplicat00andriala/page/cover_thumb.jpg"));
    //    books.add(new Book("Lightning", "oreo" , 1550, "books Which open your eyes",
    //            "https://archive.org/download/coloritsapplicat00andriala/page/cover_thumb.jpg"));
    //    books.add(new Book("Horror", "pineapple" , 350, "books Which open your eyes",
    //            "https://archive.org/download/coloritsapplicat00andriala/page/cover_thumb.jpg"));


        Util util = new Util();
        ArrayList<Book> books = new ArrayList<>();
        books= util.getAllBooks();
        adapter.setBooks(books);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                super.onBackPressed();
                break;

                default:
                    break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.close_in, R.anim.close_out);
    }
}
