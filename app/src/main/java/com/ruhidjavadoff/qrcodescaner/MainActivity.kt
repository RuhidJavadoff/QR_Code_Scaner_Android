package com.ruhidjavadoff.qrcodescaner

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.ruhidjavadoff.qrcodescaner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // HeaderFragment çağırılması
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.headerFragmentContainer, HeaderFragment())
                .commit()
        }
    }

    // Menu-nu şişiririk
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    // Menu item-ə klik olunanda nə olacaq
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.settings -> {
                // Ayarlar səhifəsinə keçmək
                // Burada Settings Activity-ni açmaq və ya başqa bir əməliyyat etmək olar
                true
            }
            R.id.help -> {
                // Yardım səhifəsinə keçmək
                // Yardım üçün yeni bir səhifə açmaq olar
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
