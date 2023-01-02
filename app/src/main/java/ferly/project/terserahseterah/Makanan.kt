package ferly.project.terserahseterah

import MainApi.PostResponse
import MainApi.PostAdapter
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
import kotlinx.android.synthetic.main.activity_makanan.*
import kotlinx.android.synthetic.main.activity_minuman.*


class Makanan : AppCompatActivity() {

    lateinit var makanan_Image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //FULLSCREEN
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        setContentView(R.layout.activity_makanan)

        //Button Cari Makanan
        val btn_cari_makanan: Button = findViewById(R.id.btn_cari_makanan)

        btn_cari_makanan.setOnClickListener { random_makanan_img()};
        makanan_Image = findViewById(R.id.img_makanan)


    }

        fun random_makanan_img() {
            var requestOptions = RequestOptions()
            requestOptions = requestOptions.transforms(CenterCrop(), RoundedCorners(256))

            val text_random_makanan = findViewById<TextView>(R.id.nama_makanan)
            val randomInt = (1..71).random()

            val urlmkn1 = "https://apiterserah.ferlyswh.xyz/Makanan/AW.jpg"
            val mkn1 = "Restoran AW"

            val urlmkn2 = "https://apiterserah.ferlyswh.xyz/Makanan/Ayam%20Bakar.jpg"
            val mkn2 = "Ayam Bakar"

            val urlmkn3 = "https://apiterserah.ferlyswh.xyz/Makanan/Ayam%20Betutu.jpeg"
            val mkn3 = "Ayam Betutu"

            val urlmkn4 = "https://apiterserah.ferlyswh.xyz/Makanan/Ayam%20Geprek.jpg"
            val mkn4 = "Ayam Geprek"

            val urlmkn5 = "https://apiterserah.ferlyswh.xyz/Makanan/Bakmi%20Jogja.jpg"
            val mkn5 = "Bakmi Jogja"

            val urlmkn6 = "https://apiterserah.ferlyswh.xyz/Makanan/Bakso.jpg"
            val mkn6  = "Bakso"

            val urlmkn7 = "https://apiterserah.ferlyswh.xyz/Makanan/Bakso%20Beranak.jpeg"
            val mkn7  = "Bakso Beranak"

            val urlmkn8 = "https://apiterserah.ferlyswh.xyz/Makanan/Bakso%20Malang.jpg"
            val mkn8  = "Bakso Malang"

            val urlmkn9 = "https://apiterserah.ferlyswh.xyz/Makanan/Batagor.jpg"
            val mkn9  = "Batagor"

            val urlmkn10 = "https://apiterserah.ferlyswh.xyz/Makanan/Bubur%20Ayam.jpg"
            val mkn10  = "Bubur Ayam"

            val urlmkn11 = "https://apiterserah.ferlyswh.xyz/Makanan/CFC.png"
            val mkn11  = "Restoran CFC"

            val urlmkn12 = "https://apiterserah.ferlyswh.xyz/Makanan/Dominos.jpg"
            val mkn12  = "Pizza Domino's"

            val urlmkn13 = "https://apiterserah.ferlyswh.xyz/Makanan/Gado-Gado.jpg"
            val mkn13  = "Gado Gado"

            val urlmkn14 = "https://apiterserah.ferlyswh.xyz/Makanan/Gorengan.jpg"
            val mkn14  = "Goreng Gorengan"

            val urlmkn15 = "https://apiterserah.ferlyswh.xyz/Makanan/Gudeg.jpg"
            val mkn15  = "Gudeg Jogja"

            val urlmkn16 = "https://apiterserah.ferlyswh.xyz/Makanan/Gulai.jpg"
            val mkn16  = "Gulai"

            val urlmkn17 = "https://apiterserah.ferlyswh.xyz/Makanan/Ikan%20balado.jpg"
            val mkn17  = "Ikan Balado"

            val urlmkn18 = "https://apiterserah.ferlyswh.xyz/Makanan/Kerak%20Telor.jpg"
            val mkn18  = "Kerak Telor"

            val urlmkn19 = "https://apiterserah.ferlyswh.xyz/Makanan/Ketroprak.jpg"
            val mkn19  = "Ketoprak"

            val urlmkn20 = "https://apiterserah.ferlyswh.xyz/Makanan/Ketupat%20Sayur.jpeg"
            val mkn20  = "Ketupat Sayur"

            val urlmkn21 = "https://apiterserah.ferlyswh.xyz/Makanan/KFC.jpg"
            val mkn21  = "Restoran KFC"

            val urlmkn22 = "https://apiterserah.ferlyswh.xyz/Makanan/Lumpia%20Semarang.jpeg"
            val mkn22  = "Lumpia Semarang"

            val urlmkn23 = "https://apiterserah.ferlyswh.xyz/Makanan/Makanan%20Angkringan.jpeg"
            val mkn23  = "Makanan Angkringan"

            val urlmkn24 = "https://apiterserah.ferlyswh.xyz/Makanan/Makanan%20Warteg.jpeg"
            val mkn24  = "Makanan Warteg"

            val urlmkn25 = "https://apiterserah.ferlyswh.xyz/Makanan/Martabak%20Aceh.jpg"
            val mkn25  = "Martabak Aceh"

            val urlmkn26 = "https://apiterserah.ferlyswh.xyz/Makanan/Martabak%20Manis.jpg"
            val mkn26  = "Martabak Manis"

            val urlmkn27 = "https://apiterserah.ferlyswh.xyz/Makanan/Martabak%20Mesir.jpg"
            val mkn27  = "Martabak Telor"

            val urlmkn28 = "https://apiterserah.ferlyswh.xyz/Makanan/Mendoan.jpeg"
            val mkn28  = "Mendoan"

            val urlmkn29 = "https://apiterserah.ferlyswh.xyz/Makanan/Mie%20Aceh.jpg"
            val mkn29  = "Mie Aceh"

            val urlmkn30 = "https://apiterserah.ferlyswh.xyz/Makanan/Nasi%20Bebek.jpeg"
            val mkn30  = "Nasi Bebek"

            val urlmkn31 = "https://apiterserah.ferlyswh.xyz/Makanan/Nasi%20Goreng.jpg"
            val mkn31  = "Nasi Goreng"

            val urlmkn32 = "https://apiterserah.ferlyswh.xyz/Makanan/Nasi%20Goreng%20Gila.jpg"
            val mkn32  = "Nasi Goreng Gila"

            val urlmkn33 = "https://apiterserah.ferlyswh.xyz/Makanan/Nasi%20Goreng%20Kambing.jpg"
            val mkn33  = "Nasi Goreng Kambing"

            val urlmkn34 = "https://apiterserah.ferlyswh.xyz/Makanan/Nasi%20Kebuli.jpg"
            val mkn34  = "Nasi Kebuli"

            val urlmkn35 = "https://apiterserah.ferlyswh.xyz/Makanan/Nasi%20Kuning.jpg"
            val mkn35  = "Nasi Kuning"

            val urlmkn36 = "https://apiterserah.ferlyswh.xyz/Makanan/Nasi%20Lemak.jpeg"
            val mkn36  = "Nasi Lemak"

            val urlmkn37 = "https://apiterserah.ferlyswh.xyz/Makanan/Nasi%20Padang.jpeg"
            val mkn37  = "Nasi Padang"

            val urlmkn38 = "https://apiterserah.ferlyswh.xyz/Makanan/Nasi%20Pecel.jpg"
            val mkn38  = "Nasi Pecel"

            val urlmkn39 = "https://apiterserah.ferlyswh.xyz/Makanan/Nasi%20Uduk.jpg"
            val mkn39  = "Nasi Uduk"

            val urlmkn40 = "https://apiterserah.ferlyswh.xyz/Makanan/Pecak%20Gurame.jpe"
            val mkn40  = "Ikan Gurame Goreng"

            val urlmkn41 = "https://apiterserah.ferlyswh.xyz/Makanan/Pecel%20Ayam.jpg"
            val mkn41  = "Pecel Ayam"

            val urlmkn42 = "https://apiterserah.ferlyswh.xyz/Makanan/Pecel%20Lele.jpeg"
            val mkn42  = "Pecel Lele"

            val urlmkn43 = "https://apiterserah.ferlyswh.xyz/Makanan/Pempek%20Kapal%20Selam.jpg"
            val mkn43  = "Pempek Kapal Selam"

            val urlmkn44 = "https://apiterserah.ferlyswh.xyz/Makanan/Pergedel%20Jagung.jpg"
            val mkn44  = "Perkedel Jagung"

            val urlmkn45 = "https://apiterserah.ferlyswh.xyz/Makanan/Pizza%20Hut.jpeg"
            val mkn45  = "Pizza HUT"

            val urlmkn46 = "https://apiterserah.ferlyswh.xyz/Makanan/Rawon.jpg"
            val mkn46  = "Rawon"

            val urlmkn47 = "https://apiterserah.ferlyswh.xyz/Makanan/Richesse%20Factory.jpg"
            val mkn47  = "Richesse Factory"

            val urlmkn48 = "https://apiterserah.ferlyswh.xyz/Makanan/Roti%20Bakar.jpg"
            val mkn48  = "Roti Bakar"

            val urlmkn49 = "https://apiterserah.ferlyswh.xyz/Makanan/Sate%20Ayam.jpg"
            val mkn49  = "Sate Ayam"

            val urlmkn50 = "https://apiterserah.ferlyswh.xyz/Makanan/Sate%20Kambing.jpg"
            val mkn50  = "Sate Kambing"

            val urlmkn51 = "https://apiterserah.ferlyswh.xyz/Makanan/Sate%20Kelinci.jpg"
            val mkn51  = "Sate Kelinci"

            val urlmkn52 = "https://apiterserah.ferlyswh.xyz/Makanan/Sate%20Kikil.jpg"
            val mkn52  = "Sate Kikil"

            val urlmkn53 = "https://apiterserah.ferlyswh.xyz/Makanan/Sate%20Padang.jpg"
            val mkn53  = "Sate Padang"

            val urlmkn54 = "https://apiterserah.ferlyswh.xyz/Makanan/MCD.png"
            val mkn54  = "Restoran MCD"

            val urlmkn55 = "https://apiterserah.ferlyswh.xyz/Makanan/Semur%20Jengkol.jpg"
            val mkn55  = "Semur Jengkol"

            val urlmkn56 = "https://apiterserah.ferlyswh.xyz/Makanan/Semur%20Terong%20Betawi.jpg"
            val mkn56  = "Semur Terong"

            val urlmkn57 = "https://apiterserah.ferlyswh.xyz/Makanan/Sop%20Kaki%20Kambing.jpg"
            val mkn57  = "Sop Kaki Kambing/Sapi"

            val urlmkn58 = "https://apiterserah.ferlyswh.xyz/Makanan/Soto%20Ambengan.jpg"
            val mkn58  = "Soto Ambengan"

            val urlmkn59 = "https://apiterserah.ferlyswh.xyz/Makanan/Semur%20Betawi.jpg"
            val mkn59  = "Soto Betawi"

            val urlmkn60 = "https://apiterserah.ferlyswh.xyz/Makanan/Soto%20Kudus.jpg"
            val mkn60  = "Soto Kudus"

            val urlmkn61 = "https://apiterserah.ferlyswh.xyz/Makanan/Soto%20Kuning.jpg"
            val mkn61  = "Soto Kuning"

            val urlmkn62 = "https://apiterserah.ferlyswh.xyz/Makanan/Soto%20Lamongan.jpg"
            val mkn62  = "Soto Lamongan"

            val urlmkn63 = "https://apiterserah.ferlyswh.xyz/Makanan/Soto%20Medan.jpg"
            val mkn63  = "Soto Medan"

            val urlmkn64 = "https://apiterserah.ferlyswh.xyz/Makanan/Soto%20Mi.jpeg"
            val mkn64  = "Soto Mie"

            val urlmkn65 = "https://apiterserah.ferlyswh.xyz/Makanan/Surabi.jpg"
            val mkn65  = "Serabi"

            val urlmkn66 = "https://apiterserah.ferlyswh.xyz/Makanan/Tahu%20Gejrot.png"
            val mkn66  = "Tahu Gejrot"

            val urlmkn67 = "https://apiterserah.ferlyswh.xyz/Makanan/Tahu%20Sumedang.jpg"
            val mkn67  = "Tahu Sumedang"

            val urlmkn68 = "https://apiterserah.ferlyswh.xyz/Makanan/Taoge%20Goreng.jpg"
            val mkn68  = "Taoge Goreng"

            val urlmkn69 = "https://apiterserah.ferlyswh.xyz/Makanan/Telur%20Asin.jpg"
            val mkn69  = "Telor Asin"

            val urlmkn70 = "https://apiterserah.ferlyswh.xyz/Makanan/Tongseng.jpg"
            val mkn70  = "Tongseng"

            val urlmkn71 = "https://apiterserah.ferlyswh.xyz/Makanan/Kebab.jpg"
            val mkn71  = "Kebab"



            when (randomInt){
                1 -> text_random_makanan.setText(mkn1)
                2 -> text_random_makanan.setText(mkn2)
                3 -> text_random_makanan.setText(mkn3)
                4 -> text_random_makanan.setText(mkn4)
                5 -> text_random_makanan.setText(mkn5)
                6 -> text_random_makanan.setText(mkn6)
                7 -> text_random_makanan.setText(mkn7)
                8 -> text_random_makanan.setText(mkn8)
                9 -> text_random_makanan.setText(mkn9)
                10-> text_random_makanan.setText(mkn10)
                11-> text_random_makanan.setText(mkn11)
                12-> text_random_makanan.setText(mkn12)
                13-> text_random_makanan.setText(mkn13)
                14-> text_random_makanan.setText(mkn14)
                15-> text_random_makanan.setText(mkn15)
                16-> text_random_makanan.setText(mkn16)
                17-> text_random_makanan.setText(mkn17)
                18-> text_random_makanan.setText(mkn18)
                19-> text_random_makanan.setText(mkn19)
                20-> text_random_makanan.setText(mkn20)
                21-> text_random_makanan.setText(mkn21)
                22-> text_random_makanan.setText(mkn22)
                23-> text_random_makanan.setText(mkn23)
                24-> text_random_makanan.setText(mkn24)
                25-> text_random_makanan.setText(mkn25)
                26-> text_random_makanan.setText(mkn26)
                27-> text_random_makanan.setText(mkn27)
                28-> text_random_makanan.setText(mkn28)
                29-> text_random_makanan.setText(mkn29)
                30-> text_random_makanan.setText(mkn30)
                31-> text_random_makanan.setText(mkn31)
                32-> text_random_makanan.setText(mkn32)
                33-> text_random_makanan.setText(mkn33)
                34-> text_random_makanan.setText(mkn34)
                35-> text_random_makanan.setText(mkn35)
                36-> text_random_makanan.setText(mkn36)
                37-> text_random_makanan.setText(mkn37)
                38-> text_random_makanan.setText(mkn38)
                39-> text_random_makanan.setText(mkn39)
                40-> text_random_makanan.setText(mkn40)
                41-> text_random_makanan.setText(mkn41)
                42-> text_random_makanan.setText(mkn42)
                43-> text_random_makanan.setText(mkn43)
                44-> text_random_makanan.setText(mkn44)
                45-> text_random_makanan.setText(mkn45)
                46-> text_random_makanan.setText(mkn46)
                47-> text_random_makanan.setText(mkn47)
                48-> text_random_makanan.setText(mkn48)
                49-> text_random_makanan.setText(mkn49)
                50-> text_random_makanan.setText(mkn50)
                51-> text_random_makanan.setText(mkn51)
                52-> text_random_makanan.setText(mkn52)
                53-> text_random_makanan.setText(mkn53)
                54-> text_random_makanan.setText(mkn54)
                55-> text_random_makanan.setText(mkn55)
                56-> text_random_makanan.setText(mkn56)
                57-> text_random_makanan.setText(mkn57)
                58-> text_random_makanan.setText(mkn58)
                59-> text_random_makanan.setText(mkn59)
                60-> text_random_makanan.setText(mkn60)
                61-> text_random_makanan.setText(mkn61)
                62-> text_random_makanan.setText(mkn62)
                63-> text_random_makanan.setText(mkn63)
                64-> text_random_makanan.setText(mkn64)
                65-> text_random_makanan.setText(mkn65)
                66-> text_random_makanan.setText(mkn66)
                67-> text_random_makanan.setText(mkn67)
                68-> text_random_makanan.setText(mkn68)
                69-> text_random_makanan.setText(mkn69)
                70-> text_random_makanan.setText(mkn70)
                else -> text_random_makanan.setText(mkn71)
            }


//            val drawableResource = when (randomInt) {
                 when (randomInt) {
                1 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn1)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                2 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn2)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                3 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn3)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                4 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn4)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                5 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn5)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                6 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn6)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                7 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn7)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                8 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn8)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                9 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn9)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                10 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn10)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                11 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn11)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                12 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn12)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                13 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn13)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                14 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn14)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                15 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn15)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                16 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn16)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                17 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn17)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                18 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn18)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                19 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn19)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                20 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn20)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                21 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn21)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                22 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn22)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                23 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn23)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                24 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn24)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                25 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn25)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                26 -> {
                    Glide.with(getApplicationContext())

                        .load(urlmkn26)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                27 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn27)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                28 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn28)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                29 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn29)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                30 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn30)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                31 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn31)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                32 -> {
                    Glide.with(getApplicationContext())

                        .load(urlmkn32)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                33 -> {
                    Glide.with(getApplicationContext())

                        .load(urlmkn33)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                34 -> {
                    Glide.with(getApplicationContext())

                        .load(urlmkn34)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                35 -> {
                    Glide.with(getApplicationContext())

                        .load(urlmkn35)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                36 -> {
                    Glide.with(getApplicationContext())

                        .load(urlmkn36)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                37 -> {
                    Glide.with(getApplicationContext())

                        .load(urlmkn37)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                38 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn38)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                39 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn39)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                40 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn40)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                41 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn41)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                42 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn42)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                43 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn43)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                44 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn44)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                45 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn45)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                46 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn46)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                47 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn47)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                48 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn48)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                49 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn49)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                50 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn50)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                51 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn51)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                52 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn52)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                53 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn53)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                54 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn54)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                55 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn55)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                56 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn56)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                57 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn57)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                58 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn58)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                59 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn59)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                60 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn60)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                61 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn61)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                62 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn62)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                63 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn63)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                64 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn64)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                65 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn65)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                66 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn66)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                67 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn67)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                68 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn68)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                69 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn69)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                70 -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn70)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
                else -> {
                    Glide.with(getApplicationContext())
                        .load(urlmkn71)
                        .centerCrop()
                        .apply(requestOptions)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                        .into(makanan_Image);
                }
            }

        }


    fun openMapsMakanan(view: View?) {
        val carimakanan = "Makanan"
        val intent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://www.google.com/maps/search/"+ "")
        )
        startActivity(intent)
    }

    //Pindah ke Layout Main
    fun pindah_main(view: View?) {
        val intent = Intent(this@Makanan, MainActivity::class.java)
        startActivity(intent)
    }


}













//==============================================
//BACK UP

//package ferly.project.terserahseterah
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.view.Window
//import android.view.WindowManager
//import android.widget.Button
//import android.widget.ImageView
//import android.widget.TextView
//import com.bumptech.glide.Glide
//import kotlinx.android.synthetic.main.activity_makanan.*
//import org.jetbrains.anko.image
//import kotlin.random.Random
//
//
//class Makanan : AppCompatActivity() {
//
//    lateinit var makanan_Image : ImageView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        //FULLSCREEN
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(
//            WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN
//        );
//
//        setContentView(R.layout.activity_makanan)
//
//        //Button Cari Makan
//        val btn_cari_makanan: Button = findViewById(R.id.btn_cari_makanan)
//
//        btn_cari_makanan.setOnClickListener { random_makanan_img()};
//        makanan_Image = findViewById(R.id.img_makanan)
//
//
//    }
//
//    fun random_makanan_img() {
//        val text_random_makanan = findViewById<TextView>(R.id.nama_makanan)
//
//        val randomInt = (1..70).random()
//
//
//        val mkn1 = "Restoran AW"
//        val mkn2 = "Ayam Bakar"
//        val mkn3 = "Ayam Betutu"
//        val mkn4 = "Ayam Geprek"
//        val mkn5 = "Bakmi Jogja"
//        val mkn6  = "Bakso"
//        val mkn7  = "Bakso Beranak"
//        val mkn8  = "Bakso Malang"
//        val mkn9  = "Batagor"
//        val mkn10  = "Bubur Ayam"
//        val mkn11  = "Restoran CFC"
//        val mkn12  = "Pizza Domino's"
//        val mkn13  = "Gado Gado"
//        val mkn14  = "Goreng Gorengan"
//        val mkn15  = "Gudeg Jogja"
//        val mkn16  = "Gulai"
//        val mkn17  = "Ikan Balado"
//        val mkn18  = "Kerak Telor"
//        val mkn19  = "Ketoprak"
//        val mkn20  = "Ketupat Sayur"
//        val mkn21  = "Restoran KFC"
//        val mkn22  = "Lumpia Semarang"
//        val mkn23  = "Makanan Angkringan"
//        val mkn24  = "Makanan Warteg"
//        val mkn25  = "Martabak Aceh"
//        val mkn26  = "Martabak Manis"
//        val mkn27  = "Martabak Telor"
//        val mkn28  = "Mendoan"
//        val mkn29  = "Mie Aceh"
//        val mkn30  = "Nasi Bebek"
//        val mkn31  = "Nasi Goreng"
//        val mkn32  = "Nasi Goreng Gila"
//        val mkn33  = "Nasi Goreng Kambing"
//        val mkn34  = "Nasi Kebuli"
//        val mkn35  = "Nasi Kuning"
//        val mkn36  = "Nasi Lemak"
//        val mkn37  = "Nasi Padang"
//        val mkn38  = "Nasi Pecel"
//        val mkn39  = "Nasi Uduk"
//        val mkn40  = "Ikan Gurame Goreng"
//        val mkn41  = "Pecel Ayam"
//        val mkn42  = "Pecel Lele"
//        val mkn43  = "Pempek Kapal Selam"
//        val mkn44  = "Perkedel Jagung"
//        val mkn45  = "Pizza HUT"
//        val mkn46  = "Rawon"
//        val mkn47  = "Richesse Factory"
//        val mkn48  = "Roti Bakar"
//        val mkn49  = "Sate Ayam"
//        val mkn50  = "Sate Kambing"
//        val mkn51  = "Sate Kelinci"
//        val mkn52  = "Sate Kilil"
//        val mkn53  = "Sate Padang"
//        val mkn54  = "Semur Betawi"
//        val mkn55  = "Semur Jengkol"
//        val mkn56  = "Semur Terong"
//        val mkn57  = "Sop Kaki Kambing/Sapi"
//        val mkn58  = "Soto Ambengan"
//        val mkn59  = "Soto Betawi"
//        val mkn60  = "Soto Kudus"
//        val mkn61  = "Soto Kuning"
//        val mkn62  = "Soto Lamongan"
//        val mkn63  = "Soto Medan"
//        val mkn64  = "Soto Mie"
//        val mkn65  = "Serabi"
//        val mkn66  = "Tahu Gejrot"
//        val mkn67  = "Tahu Sumedang"
//        val mkn68  = "Taoge Goreng"
//        val mkn69  = "Telor Asin"
//        val mkn70  = "Tongseng"
//
//        when (randomInt){
//            1 -> text_random_makanan.setText(mkn1)
//            2 -> text_random_makanan.setText(mkn2)
//            3 -> text_random_makanan.setText(mkn3)
//            4 -> text_random_makanan.setText(mkn4)
//            5 -> text_random_makanan.setText(mkn5)
//            6 -> text_random_makanan.setText(mkn6)
//            7 -> text_random_makanan.setText(mkn7)
//            8 -> text_random_makanan.setText(mkn8)
//            9 -> text_random_makanan.setText(mkn9)
//            10-> text_random_makanan.setText(mkn10)
//            11-> text_random_makanan.setText(mkn11)
//            12-> text_random_makanan.setText(mkn12)
//            13-> text_random_makanan.setText(mkn13)
//            14-> text_random_makanan.setText(mkn14)
//            15-> text_random_makanan.setText(mkn15)
//            16-> text_random_makanan.setText(mkn16)
//            17-> text_random_makanan.setText(mkn17)
//            18-> text_random_makanan.setText(mkn18)
//            19-> text_random_makanan.setText(mkn19)
//            20-> text_random_makanan.setText(mkn20)
//            21-> text_random_makanan.setText(mkn21)
//            22-> text_random_makanan.setText(mkn22)
//            23-> text_random_makanan.setText(mkn23)
//            24-> text_random_makanan.setText(mkn24)
//            25-> text_random_makanan.setText(mkn25)
//            26-> text_random_makanan.setText(mkn26)
//            27-> text_random_makanan.setText(mkn27)
//            28-> text_random_makanan.setText(mkn28)
//            29-> text_random_makanan.setText(mkn29)
//            30-> text_random_makanan.setText(mkn30)
//            31-> text_random_makanan.setText(mkn31)
//            32-> text_random_makanan.setText(mkn32)
//            33-> text_random_makanan.setText(mkn33)
//            34-> text_random_makanan.setText(mkn34)
//            35-> text_random_makanan.setText(mkn35)
//            36-> text_random_makanan.setText(mkn36)
//            37-> text_random_makanan.setText(mkn37)
//            38-> text_random_makanan.setText(mkn38)
//            39-> text_random_makanan.setText(mkn39)
//            40-> text_random_makanan.setText(mkn40)
//            41-> text_random_makanan.setText(mkn41)
//            42-> text_random_makanan.setText(mkn42)
//            43-> text_random_makanan.setText(mkn43)
//            44-> text_random_makanan.setText(mkn44)
//            45-> text_random_makanan.setText(mkn45)
//            46-> text_random_makanan.setText(mkn46)
//            47-> text_random_makanan.setText(mkn47)
//            48-> text_random_makanan.setText(mkn48)
//            49-> text_random_makanan.setText(mkn49)
//            50-> text_random_makanan.setText(mkn50)
//            51-> text_random_makanan.setText(mkn51)
//            52-> text_random_makanan.setText(mkn52)
//            53-> text_random_makanan.setText(mkn53)
//            54-> text_random_makanan.setText(mkn54)
//            55-> text_random_makanan.setText(mkn55)
//            56-> text_random_makanan.setText(mkn56)
//            57-> text_random_makanan.setText(mkn57)
//            58-> text_random_makanan.setText(mkn58)
//            59-> text_random_makanan.setText(mkn59)
//            60-> text_random_makanan.setText(mkn60)
//            61-> text_random_makanan.setText(mkn61)
//            62-> text_random_makanan.setText(mkn62)
//            63-> text_random_makanan.setText(mkn63)
//            64-> text_random_makanan.setText(mkn64)
//            65-> text_random_makanan.setText(mkn65)
//            66-> text_random_makanan.setText(mkn66)
//            67-> text_random_makanan.setText(mkn67)
//            68-> text_random_makanan.setText(mkn68)
//            69-> text_random_makanan.setText(mkn69)
//            else -> text_random_makanan.setText(mkn70)
//        }
//
//
//        val drawableResource = when (randomInt) {
//            1 -> R.drawable.makanan_aw
//            2 -> R.drawable.makanan_ayam_bakar
//            3 -> R.drawable.makanan_ayam_betutu
//            4 -> R.drawable.makanan_ayam_geprek
//            5 -> R.drawable.makanan_bakmi_jogja
//            6 -> R.drawable.makanan_bakso
//            7 -> R.drawable.makanan_bakso_beranak
//            8 -> R.drawable.makanan_bakso_malang
//            9 -> R.drawable.makanan_batagor
//            10 ->R.drawable.makanan_bubur_ayam
//            11-> R.drawable.makanan_cfc
//            12-> R.drawable.makanan_dominos
//            13-> R.drawable.makanan_gado_gado
//            14-> R.drawable.makanan_gorengan
//            15-> R.drawable.makanan_gudeg
//            16-> R.drawable.makanan_gulai
//            17-> R.drawable.makanan_ikan_balado
//            18-> R.drawable.makanan_kerak_telor
//            19-> R.drawable.makanan_ketoprak
//            20-> R.drawable.makanan_ketupat_sayur
//            21-> R.drawable.makanan_kfc
//            22-> R.drawable.makanan_lumpia_semarang
//            23-> R.drawable.makanan_makanan_angkringan
//            24-> R.drawable.makanan_makanan_warteg
//            25-> R.drawable.makanan_martabak_aceh
//            26-> R.drawable.makanan_martabak_manis
//            27-> R.drawable.makanan_martabak_mesir
//            28-> R.drawable.makanan_mendoan
//            29-> R.drawable.makanan_mie_aceh
//            30-> R.drawable.makanan_nasi_bebek
//            31-> R.drawable.makanan_nasi_goreng
//            32-> R.drawable.makanan_nasi_goreng_gila
//            33-> R.drawable.makanan_nasi_goreng_kambing
//            34-> R.drawable.makanan_nasi_kebuli
//            35-> R.drawable.makanan_nasi_kuning
//            36-> R.drawable.makanan_nasi_lemak
//            37-> R.drawable.makanan_nasi_padang
//            38-> R.drawable.makanan_nasi_pecel
//            39-> R.drawable.makanan_nasi_uduk
//            40-> R.drawable.makanan_pecak_gurame
//            41-> R.drawable.makanan_pecel_ayam
//            42-> R.drawable.makanan_pecel_lele
//            43-> R.drawable.makanan_pempek_kapal_selam
//            44-> R.drawable.makanan_pergedel_jagung
//            45-> R.drawable.makanan_pizza_hut
//            46-> R.drawable.makanan_rawon
//            47-> R.drawable.makanan_richesse_factory
//            48-> R.drawable.makanan_roti_bakar
//            49-> R.drawable.makanan_sate_ayam
//            50-> R.drawable.makanan_sate_kambing
//            51-> R.drawable.makanan_sate_kelinci
//            52-> R.drawable.makanan_sate_kikil
//            53-> R.drawable.makanan_sate_padang
//            54-> R.drawable.makanan_semur_betawi
//            55-> R.drawable.makanan_semur_jengkol
//            56-> R.drawable.makanan_semur_terong_betawi
//            57-> R.drawable.makanan_sop_kaki_kambing
//            58-> R.drawable.makanan_soto_ambengan
//            59-> R.drawable.makanan_soto_betawi
//            60-> R.drawable.makanan_soto_kudus
//            61-> R.drawable.makanan_soto_kuning
//            62-> R.drawable.makanan_soto_lamongan
//            63-> R.drawable.makanan_soto_medan
//            64-> R.drawable.makanan_soto_mi
//            65-> R.drawable.makanan_surabi
//            66-> R.drawable.makanan_tahu_gejrot
//            67-> R.drawable.makanan_tahu_sumedang
//            68-> R.drawable.makanan_taoge_goreng
//            69-> R.drawable.makanan_telur_asin
//            else -> R.drawable.makanan_tongseng
//        }
//
//        makanan_Image.setImageResource(drawableResource)
//    }
//
//
//
//
//    //Pindah ke Layout Main
//    fun pindah_main(view: View?) {
//        val intent = Intent(this@Makanan, MainActivity::class.java)
//        startActivity(intent)
//    }
//
//
//}
