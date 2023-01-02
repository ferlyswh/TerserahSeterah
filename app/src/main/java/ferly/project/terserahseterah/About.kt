package ferly.project.terserahseterah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.Toast
import kotlin.system.exitProcess

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //FULLSCREEN
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        setContentView(R.layout.activity_about)

        val btn_exit: Button = findViewById(R.id.btn_exit)
        btn_exit.setOnClickListener { onBackPressed() };





    }






    //Pindah ke Layout Main
    fun pindah_main(view: View?) {
        val intent = Intent(this@About, MainActivity::class.java)
        startActivity(intent)
    }




    //Toast sama tombol Keluar
    private var backPressedTime:Long = 1
    lateinit var backToast: Toast
    override fun onBackPressed() {

        backToast = Toast.makeText(this, "Tekan tombol KELUAR sekali lagi, untuk keluar dari Aplikasi", Toast.LENGTH_LONG)


        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel()
            super.onBackPressed()
            finishAffinity() //Close APP
        } else {
            backToast.show()
        }
        backPressedTime = System.currentTimeMillis()

    }

}