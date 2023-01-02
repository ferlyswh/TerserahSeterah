package ferly.project.terserahseterah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN
import android.content.Intent
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //FULLSCREEN
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main)
    }


    //Pindah ke Layout Makanan
    fun pindah_makanan(view: View?) {
        val intent = Intent(this@MainActivity, Makanan::class.java)
        startActivity(intent)
    }

    //Pindah ke Layout Minuman
    fun pindah_minuman(view: View?) {
        val intent = Intent(this@MainActivity, Minuman::class.java)
        startActivity(intent)
    }

    //Pindah ke Layout Wisata
    fun pindah_wisata(view: View?) {
        val intent = Intent(this@MainActivity, Wisata::class.java)
        startActivity(intent)
    }

    //Pindah ke Layout About
    fun pindah_about(view: View?) {
        val intent = Intent(this@MainActivity, About::class.java)
        startActivity(intent)
    }
}