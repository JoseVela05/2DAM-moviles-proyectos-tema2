package com.example.lefishe

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

data class Fish{
    val id: Int,
    val name: String,
    val scientificName: String,
    val waterType: String,
    val fishDiet:String,
    val protectedSpecies: Boolean
}

object fishList{
    val fishes= mutableListOf(
        Fish(1, "Trucha", "Amphiprion ocellaris", "Salada", "Omnívoro", false),
        Fish(2, "Carpa común", "Cyprinus carpio", "Dulce", "Omnívoro", false),
        Fish(3, "Tiburón blanco", "Carcharodon carcharias", "Salada", "Carnívoro", false)
    )
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}