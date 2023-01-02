package ferly.project.terserahseterah

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_minuman.*
import org.jetbrains.anko.find


class Minuman : AppCompatActivity() {

    lateinit var minuman_Image : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //FULLSCREEN
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        setContentView(R.layout.activity_minuman)

        //Button Cari Minuman
        val btn_cari_minuman: Button = findViewById(R.id.btn_cari_minuman)

        btn_cari_minuman.setOnClickListener { random_minuman_img()};
        minuman_Image = findViewById(R.id.img_minuman)


    }


    fun random_minuman_img() {
        var requestOptions = RequestOptions()
        requestOptions = requestOptions.transforms(CenterCrop(), RoundedCorners(265))
        
        val text_random_minuman = findViewById<TextView>(R.id.nama_minuman)
        val randomInt = (1..34).random()


        val urlmin1 = "https://apiterserah.ferlyswh.xyz/Minuman/Chatime.jfif"
        val namamin1 = "Chatime"

        val urlmin2 = "https://apiterserah.ferlyswh.xyz/Minuman/Goola.jpg"
        val namamin2 = "Goola"

        val urlmin3 = "https://apiterserah.ferlyswh.xyz/Minuman/Gooma.jpg"
        val namamin3 ="Gooma"

        val urlmin4 = "https://apiterserah.ferlyswh.xyz/Minuman/Gulu%20Gulu.jpg"
        val namamin4 ="Gulu Gulu"

        val urlmin5 = "https://apiterserah.ferlyswh.xyz/Minuman/Haus.jpg"
        val namamin5 ="HAUS"

        val urlmin6 = "https://apiterserah.ferlyswh.xyz/Minuman/Jelly%20Potter.jpg"
        val namamin6 ="Jelly Potter"

        val urlmin7 = "https://apiterserah.ferlyswh.xyz/Minuman/Kokumi.jpg"
        val namamin7 ="Kokumi"

        val urlmin8 = "https://apiterserah.ferlyswh.xyz/Minuman/Kopi%20Janji%20Jiwa.jpg"
        val namamin8 ="Janji Jiwa"

        val urlmin9 = "https://apiterserah.ferlyswh.xyz/Minuman/Kopi%20Kenangan.jpg"
        val namamin9 ="Kopi Kenangan"

        val urlmin10 = "https://apiterserah.ferlyswh.xyz/Minuman/Kopi%20Kulo.jpg"
        val namamin10 ="Kopi Kulo"

        val urlmin11 = "https://apiterserah.ferlyswh.xyz/Minuman/Meenum.jpeg"
        val namamin11 ="Meenum"

        val urlmin12 = "https://apiterserah.ferlyswh.xyz/Minuman/Sasame%20Coffee.jpg"
        val namamin12 ="Sasame Coffee"

        val urlmin13 = "https://apiterserah.ferlyswh.xyz/Minuman/Teguk.jpeg"
        val namamin13 ="Teguk"

        val urlmin14 = "https://apiterserah.ferlyswh.xyz/Minuman/Xiboba.jpg"
        val namamin14 ="Xiboba"

        val urlmin15 = "https://apiterserah.ferlyswh.xyz/Minuman/Xing%20Fu%20Tang.jfif"
        val namamin15 ="Xing Fu Tang"

        val urlmin16 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_air_mineral.jpg"
        val namamin16 ="Air Mineral"

        val urlmin17 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_es_jeruk.jpeg"
        val namamin17 ="Es Jeruk"

        val urlmin18 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_es_kepala.jpg"
        val namamin18 ="Es Kelapa"

        val urlmin19 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_es_teh.jpg"
        val namamin19 ="Es Teh"

        val urlmin20 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_fresh_milk.jpg"
        val namamin20="Fresh Milk"

        val urlmin21 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_fruit_juice.jpg"
        val namamin21 ="Fruit Juice"

        val urlmin22 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_fruit_yogurt.jpg"
        val namamin22 ="Fruit Yogurt"

        val urlmin23 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_hot_hocolate.jpg"
        val namamin23 ="Hot Chocolate"

        val urlmin24 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_ice_blend.jpg"
        val namamin24 ="Ice Blend"

        val urlmin25 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_ice_drink.jfif"
        val namamin25 ="Ice Drink"

        val urlmin26 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_jeruk_hangat.jpg"
        val namamin26 ="Jeruk Hangat/Panas"

        val urlmin27 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_keliling.jpg"
        val namamin27 ="Minuman Keliling"

        val urlmin28 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_latte.jpeg"
        val namamin28 ="Latte"

        val urlmin29 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_lemari_es_minimarket.jpg"
        val namamin29 ="Minuman yang ada di Minimarket"

        val urlmin30 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_macchiato.jpg"
        val namamin30 ="Macchiato"

        val urlmin31 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_milk_shake.jfif"
        val namamin31 ="Milk Shake"

        val urlmin32 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_milk_tea.jpg"
        val namamin32 ="Milk Tea"

        val urlmin33 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_smoothie.jpg"
        val namamin33 ="Smoothie"

        val urlmin34 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_stmj.jpg"
        val namamin34 ="STMJ"

        val urlmin35 = "https://apiterserah.ferlyswh.xyz/Minuman/minuman_teh_panas.jpg"
        val namamin35 ="Teh Hangat/Panas"


        when (randomInt){
            1-> text_random_minuman.setText(namamin1)
            2-> text_random_minuman.setText(namamin2)
            3-> text_random_minuman.setText(namamin3)
            4-> text_random_minuman.setText(namamin4)
            5-> text_random_minuman.setText(namamin5)
            6-> text_random_minuman.setText(namamin6)
            7-> text_random_minuman.setText(namamin7)
            8-> text_random_minuman.setText(namamin8)
            9-> text_random_minuman.setText(namamin9)
            10-> text_random_minuman.setText(namamin10)
            11-> text_random_minuman.setText(namamin11)
            12-> text_random_minuman.setText(namamin12)
            13-> text_random_minuman.setText(namamin13)
            14-> text_random_minuman.setText(namamin14)
            15-> text_random_minuman.setText(namamin15)
            16-> text_random_minuman.setText(namamin16)
            17-> text_random_minuman.setText(namamin17)
            18-> text_random_minuman.setText(namamin18)
            19-> text_random_minuman.setText(namamin19)
            20-> text_random_minuman.setText(namamin20)
            21-> text_random_minuman.setText(namamin21)
            22-> text_random_minuman.setText(namamin22)
            23-> text_random_minuman.setText(namamin23)
            24-> text_random_minuman.setText(namamin24)
            25-> text_random_minuman.setText(namamin25)
            26-> text_random_minuman.setText(namamin26)
            27-> text_random_minuman.setText(namamin27)
            28-> text_random_minuman.setText(namamin28)
            29-> text_random_minuman.setText(namamin29)
            30-> text_random_minuman.setText(namamin30)
            31-> text_random_minuman.setText(namamin31)
            32-> text_random_minuman.setText(namamin32)
            33-> text_random_minuman.setText(namamin33)
            34-> text_random_minuman.setText(namamin34)
            else -> text_random_minuman.setText(namamin35)
        }



        when (randomInt){


            1 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin1)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            2 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin2)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            3 -> {
                Glide.with(getApplicationContext())

                    .load(urlmin3)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            4 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin4)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            5 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin5)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            6 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin6)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            7 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin7)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            8 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin8)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            9 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin9)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            10 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin10)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            11 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin11)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            12 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin12)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            13 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin13)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            14 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin14)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            15 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin15)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            16 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin16)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            17 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin17)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            18 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin18)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            19 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin19)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            20 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin20)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            21 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin21)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            22 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin22)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            23 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin23)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            24 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin24)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            25 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin25)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            26 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin26)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            27 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin27)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            28 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin28)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            29 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin29)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            30 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin30)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            31 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin31)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            32 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin32)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            33 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin33)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            34 -> {
                Glide.with(getApplicationContext())
                    .load(urlmin34)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

            else -> {
                Glide.with(getApplicationContext())
                    .load(urlmin35)
                    .centerCrop()
                    .apply(requestOptions)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(minuman_Image);
            }

        }

    }


    fun openMapsMinuman(view: View?) {
        val cariminuman = "Minuman"
        val intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.google.com/maps/search/"+cariminuman)
        )
        startActivity(intent)
    }

    //Pindah ke Layout Main
    fun pindah_main(view: View?) {
        val intent = Intent(this@Minuman, MainActivity::class.java)
        startActivity(intent)
    }
}




//val myUrl = "https://static.wikia.nocookie.net/virtualyoutuber/images/8/8b/Hoshimachi_Suisei_2019_Portrait.png/revision/latest?cb=20191205132210"
//val myUr2 = "https://github.com/bumptech/glide/raw/master/static/glide_logo.png"
//
//Glide.with(getApplicationContext())
//.load(myUrl)
//.into(makanan_Image);