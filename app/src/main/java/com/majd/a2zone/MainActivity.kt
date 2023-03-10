package com.majd.a2zone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.majd.a2zone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), BookClickListener
{
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(booklist, mainActivity)
        }

    }

    override fun onClick(book: Book) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(BOOK_ID_EXTRA, book.id)
        startActivity(intent)
    }
}

    private fun populateBooks()
    {
            val book1 = Book(
                R.drawable.japanesehoodie,
                "Japanese Hoodie",
                "Applicable Season :Four Seasons, Applicable Scene :Casual, Type :oversized, Detachable Part :NONE, material :80%cotton ,20%polyester"
            )
            booklist.add(book1)

            val book2 = Book(
                R.drawable.greekneon,
                "Greek Neon Style",
                "Applicable Season :Four Seasons, Applicable Scene :Casual, Type :oversized, Detachable Part :NONE, material :80%cotton ,20%polyester"
            )
            booklist.add(book2)

            val book3 = Book(
                R.drawable.greekcyan,
                "Greek Cyan Style",
                "Applicable Season :Four Seasons, Applicable Scene :Casual, Type :oversized, Detachable Part :NONE, material :80%cotton ,20%polyester"
            )
            booklist.add(book3)

            val book4 = Book(
                R.drawable.greekyellow,
                "Greek Bright Style",
                "Applicable Season :Four Seasons, Applicable Scene :Casual, Type :oversized, Detachable Part :NONE, material :80%cotton ,20%polyester",
            )
            booklist.add(book4)


            booklist.add(book1)
            booklist.add(book2)
            booklist.add(book3)
            booklist.add(book4)

        }




