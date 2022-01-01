package com.example.herdi_cinema;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CinemaDatabaseHelper extends SQLiteOpenHelper{
    private static final String DB_NAME = "herdi_cinema.db";
    private static final int DB_VERSION = 2;


    CinemaDatabaseHelper(Context context) { super(context, DB_NAME, null, DB_VERSION); }
    @Override
    public void onCreate(SQLiteDatabase db) { updateMyDatabase(db, 0, DB_VERSION);}


        @Override
        public void onUpgrade (SQLiteDatabase db,int oldVersion, int newVersion){
            updateMyDatabase(db, oldVersion, newVersion);
            }
            private static void insertFilm (SQLiteDatabase db,String name, String description,
            int resourceId){
                ContentValues cinemaValues = new ContentValues();
                cinemaValues.put("NAME", name);
                cinemaValues.put("DESCRIPTION", description);
                cinemaValues.put("IMAGE_RESOURCE_ID", resourceId);
                db.insert("FILM", null, cinemaValues);
            }

            private void updateMyDatabase (SQLiteDatabase db,int oldVersion, int newVersion){
                 System.out.println("ini lo old version=========================="+oldVersion);
                if (oldVersion < 2) {
                    db.execSQL("CREATE TABLE FILM(_id INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT,DESCRIPTION TEXT, IMAGE_RESOURCE_ID INTEGER)");
                    insertFilm (db,"Petualangan Sherina","Pemeran : \n" +
                            "* Sherina Munaf sebagai Sherina Melodi Darmawan\n" +
                            "* Derby Romero sebagai Sadam\n" +
                            "* Uci Nurul sebagai ibu Sherina  Dll\nMathias Muchus sebagai ayah Sherina\n" +
                            "* Didi Petet sebagai Pak Ardiwilaga, papi Sadam\n" +
                            "* Ratna Riantiarno sebagai Bu Ardiwilaga, mami Sadam\n" +
                            "* Dewi Hughes sebagai guru\n" +
                            "* Henidar Amroe sebagai Sis Natasya\n" +
                            "* Djaduk Ferianto sebagai Kertarajasa \nButet Kertaradjasa sebagai Pak Raden, bos penculik\n" +
                             "* Yadi Timo sebagai penculik\n" +
                             "* Sas Widjanarko sebagai penculik\n" +
                             "* Nova \"Omes\" Nugraha sebagai penculik\n" +
                             "* Epy Kusnandar sebagai Upay\n" +
                              "* Ray Burhanuddin sebagai Dudung\n" +
                              "* Arry Variantsyah sebagai Icang\n" +
                             "* Alyssa Soebandono sebagai teman Sherina di Jakarta\n" +
                              "* Galabby Tahira Pahlevi sebagai teman Sherina di Jakarta\n" +
                            "\n" +
                            "Sinopsis :\n " +
                            "Ayah Sherina (Sherina Munaf), yaitu Darmawan (Mathias Muchus), " +
                            "insinyur pertanian, mendapatkan kerja pertanian sesuai dengan impiannya, " +
                            "Sherina ikut pindah ke Bandung Utara. Di sekolahnya yang baru, ia mendapat musuh, " +
                            "Sadam (Derby Romero), yang ternyata anak dari majikan Darmawan, Ardiwilaga (Didi Petet). " +
                            "Sadam yang adalah anak nakal di sekolah, sebenarnya sangat manja di rumah.Hal ini diketahui Sherina saat berliburan ke rumah Ardiwilaga. Dalam kesempatan ini " +
                            "permusuhan kedua anak tadi berubah menjadi persahabatan, karena keduanya diculik oleh Pak Raden (Butet Kertaradjasa), " +
                            "suruhan Kertarejasa (Djaduk Ferianto), yang ingin menguasai tanah pertanian Ardiwilaga, untuk proyek propertinya.\n" +
                            "\n" +
                            "Sutradara: \t Riri Riza\n" +
                            "Tanggal rilis : \t 14 Juni 2000\n" +
                             "Durasi :  \t114 menit\n" +
                              "Negara : \tIndonesia",
                            R.drawable.petualanganserina);
                    insertFilm(db,"Ratu Buaya Putih",
                            "Pemeran : \n" +
                                    "* Soendjoto Adibroto\n" +
                                    "* Vera Magdalena\n" +
                                    "* Suzanna\n" +
                                    "* Jeffry Waworuntu\n" +
                                    "* Rita Sheba\n" +
                                    "* Dorman Borisman\n" +
                                    "* Bokir\n" +
                                    "* Atin Martino\n" +
                                    "* HIM Damsyik\n" +
                                    "* Yulie Soleh\n" +
                                    "* Ratih Moortri\n" +
                                    "* Lina Sagita\n" +
                                    "* Chris Salam\n" +
                                    "* Rudy Wahab\n" +
                                    "* Amin Ansari \n" +
                                    "\n" +
                                    "Sinopsis : \n" +
                                    "Sumarna (Soendjoto Adibroto), pawang buaya, merebut jimat teman seperguruannya y" +
                                    "ang bisa membuat pawang menundukkan buaya seganas apapun. Meski mendapat jimat, " +
                                    "ia kena kutukan. 20 tahun kemudian, dua anaknya meninggal. " +
                                    "Yang pertama mati di kolam buaya hingga buaya-buaya disitu dibunuhi, " +
                                    "dan yang kedua mati tertabrak motornya sendiri. Tinggal anak perempuannya Murti (Vera Magdalena), " +
                                    "yang juga dibayang-bayangi maut. Sumarna lalu mengeluh pada janda muda di desa itu, Larsih Suzanna, " +
                                    "yang ternyata Ratu Buaya Putih dan dirasuki arwah rekan seperguruan yang dibunuh Sumarna. " +
                                    "Rahasia Ratu Buaya Putih ini diungkap oleh Parlan, tokoh alim desa itu, " +
                                    "yang juga adik suami-istri yang dibunuh Sumarna. Akhirnya Buaya Putih bisa dikalahkan, " +
                                    "dan Murti dan Jeffry (Jeffry Waworuntu), rekan bisnis jual-beli buaya, yang sempat ditahan bisa selamat. \n" +
                                    "\n" +
                                    "Sutradara\t :Naryono Prayitno\n" +
                                    "Produser\t : Ram Soraya\n" +
                                    "Penulis\t : Tim Soraya Film"
                            , R.drawable.horor_buaya);
                    insertFilm (db,"Epen Cupen",
                            "Pemeran : \n" +
                                    "* Klemens Awi sebagai Cello & Bomel\n" +
                                    "* Babe Cabiita sebagai Babe\n" +
                                    "* Marissa Nasution sebagai Stella\n" +
                                    "* Edward Gunawan sebagai John\n" +
                                    "* Nato Beko sebagai Nato Beko\n" +
                                    "* Fico Fahriza sebagai Fico\n" +
                                    "* Pierre Gruno sebagai William Waru\n" +
                                    "* Dedy Mahendra Desta sebagai Peramal\n" +
                                    "* Temon sebagai Somad\n" +
                                    "* David Nurbianto sebagai Hansip\n" +
                                    "* Abdur Arsyad sebagai Supir Bajaj\n" +
                                    "* Uus sebagai Sales Tukang Obat\n" +
                                    "\n" +
                                    "Sinopsis : \n" +
                                    "Cello seorang pemuda dari Papua, disuruh ayahnya untuk pergi mencari saudara kembarnya yang " +
                                    "hilang sejak kecil. Cello berangkat dengan mengikuti petunjuk dari mimpi ayahnya yang melihat " +
                                    "saudara kembarnya berada di medan perang." +
                                    "Setibanya di kota Jayapura, tanpa sengaja Cello bertemu dengan Babe, seorang pengusaha bangkrut dari" +
                                    " Medan dan meminta bantuannya untuk mencari di mana medan perang itu. Babe yang terlibat banyak utang justru membuat masalah Cello bertambah ribet. Mereka dikejar debt collector dan bersembunyi di dalam gudang kargo bandara, tanpa sadar mereka terbawa pesawat sampai ke Jakarta.\n" +
                                    "Di Jakarta, Cello dan Babe terlibat banyak masalah baru, apalagi waktu mereka dikejar Nato Beko, " +
                                    "kelompok geng Biawak yang lagi memperebutkan harta warisan geng Rusa Jantan milik William." +
                                    "Cello yang jujur selain harus mencari saudara kembarnya, ia pun terlibat konflik antar geng perkotaan, " +
                                    "sementara Babe yang licik juga terus memanfaatkan Cello untuk mendapatkan keinginannya\n" +
                                    "\n" +
                                    "Sutradara   :Irham Acho Bachtiar\n" +
                                    "Produser :  Gope T Samtani"
                            ,R.drawable.sci_epen_cupen);
                    insertFilm  (db,"Mentalis",
                            "Pemeran :\n"
                                    +"* Deddy Corbuzier\n" +
                                    "* Limbad\n" +
                                    "* Meiditha Badawijaya\n" +
                                    "* Denaya Bintang Azmi\n" +
                                    "* Vista Putri \n" +
                                    "\n" +
                                    "Sinopsis : \n" +
                                    "Berkisah tentang 2 Mentalis, Deddy Corbuzier dan Ronggo Sewu " +
                                    "(Limbad) yang bersaing untuk menunjukan siapa yang paling hebat di antara keduanya. " +
                                    "Ronggo Sewu (Limbad) yang dulunya bekas asistant Deddy Corbuzier memfitnah Deddy Corbuzier " +
                                    "menggunakan ilmu sihir dalam setiap aksi/atraksi sulapnya. Tentu hal ini tidak bisa diterima oleh " +
                                    "Deddy Corbuzier yang akhirnya membuat permusuhan dan dendam di antara keduanya tidak bisa dihindarkan lagi. " +
                                    "Merekapun terjun ke dalam permainan yang berbahaya di mana nyawa menjadi taruhanya.\n" +
                                    "\n" +
                                    "\n" +
                                    "Sutradara\t :Walmer Sitohang\n" +
                                    "Produser\t :Hengky Kurniawan\n" +
                                    "\t Marwan Hoesin"
                            ,R.drawable.sci_mentalist);
                    insertFilm  (db,"Prefosionalish",
                            "Pemeran : \n" +
                                    "* Fachri Albar sebagai Abi\n" +
                                    "* Arifin Putra sebagai Reza\n" +
                                    "* Lukman Sardi sebagai Cokro, ayah Tomi\n" +
                                    "* Cornelio Sunny sebagai Ferry\n" +
                                    "* Richard Kyle sebagai Joe\n" +
                                    "* Melayu Nicole Hall sebagai Sophie\n" +
                                    "* Imelda Therinne sebagai Nicole\n" +
                                    "* Dimas Aditya sebagai Tomi\n" +
                                    "* Emil Kusumo sebagai Toha\n" +
                                    "* Iang Darmawan sebagai Pak Karta\n" +
                                    "* Ramon Y. Tungka sebagai Dani\n" +
                                    "* Viviane sebagai istri Abi\n" +
                                    "* Sandra Olga sebagai sekretaris Reza\n" +
                                    "* Emil Kusumo sebagai Toha\n" +
                                    "\n" +
                                    "The Professionals menceritakan tentang seorang yang bernama Abi (Fachri Albar), " +
                                    "Dia ternyata juga merupakan seorang pengusaha yang harus menjalani kehidupan di " +
                                    "penjara karena dijatuhkan dan dimasukan ke dalam penjara oleh lawan atau pesaing" +
                                    " bisnisnya yang bernama Reza (Arifin Putra).\n" +
                                    "\n" +
                                    "Setelah beberapa waktu di Abi pun akhirnya bisa keluar dari penjara tersebut, " +
                                    "Ia juga berencana untuk balas dendam kepada Reza. Suatu ketika Abi merencanakan " +
                                    "sebuah perampokan besar dengan target yaitu perusahaannya Reza. Abi hanya ingin" +
                                    " Reza mengalami hal yang ia rasakan waktu dulu.\n" +
                                    "\n" +
                                    "Abi mengajak teman temannya yaitu Cokro (Lukman Sardi), Ferry (Cornelio Sunny), " +
                                    "Jo (Richard Kyle), Nicole (Imelda Therinne), dan Sophie (Melayu Nicole Hall). " +
                                    "Tak ingin tinggal diam, Reza pun melakukan berbagai upaya untuk menghentikan aksi " +
                                    "Abi yang dapat membahayakan posisinya dan juga perusahaaannya.\n" +
                                    "\n" +
                                    "Dari situlah pertarungan strategi dilakukan, anggota team Reza yang tidak ingin " +
                                    "kalah licik dari Abi mencoba melindungi perusahaan milik Reza. Tapi rupanya Abi " +
                                    "merekrut para perampok profesional yang sudah sering melakukan aksi kriminal." +
                                    "\n" +
                                    "Sutradara\t : Affandi Abdul Rachman\n" +
                                    "Produser\t :Toha Essa"
                            ,R.drawable.sci_profesionals);
                    insertFilm (db,"Semesta Mendukung",
                            "Pemeran : \n" +
                                    "* Sayef Muhammad Billah sebagai Muhammad Arief\n" +
                                    "* Revalina S. Temat sebagai Ibu Tari Hayat\n" +
                                    "* Lukman Sardi sebagai Muslat\n" +
                                    "* Helmalia Putri sebagai Salmah\n" +
                                    "* Sudjiwo Tedjo sebagai Cak Alul\n" +
                                    "* Ferry Salim sebagai Pak Tio Yohanes\n" +
                                    "* Febby Febiola sebagai Deborah Sinaga\n" +
                                    "* Angga Putra sebagai Muhammad Thamrin\n" +
                                    "* Dinda Hauw sebagai Clara Annabela\n" +
                                    "* Sheina Abdat sebagai Cut Muthia\n" +
                                    "* Marco Dandy sebagai Husni Arsyad\n" +
                                    "* Rendy Ahmad sebagai Erwi\n" +
                                    "* Rangga Raditya sebagai Bima\n" +
                                    "* Indro Warkop sebagai Cak Kumis\n" +
                                    "* Jan Shulga sebagai Juri Olimpiade\n" +
                                    "\n" +
                                    "Sinopsis : \n" +
                                    "Muhammad Arief (Sayef Muhammad Billah), anak dari sebuah keluarga miskin dari" +
                                    " Sumenep, Madura, sangat menggemari sains, khususnya fisika. Meski tinggal " +
                                    "jauh dari kota besar dan bersekolah dengan fasilitas yang serbaminim, " +
                                    "Arief tetap menekuni fisika.\n" +
                                    "\n" +
                                    "Arief tinggal bersama ayahnya, Muslat (Lukman Sardi), " +
                                    "mantan petani garam yang beralih profesi menjadi sopir truk serabutan " +
                                    "karena ladang garam sedang dilanda paceklik akibat anomali cuaca. " +
                                    "Hal ini diperparah dengan kegemaran Muslat berjudi. Lantaran kondisi " +
                                    "ekonomi keluarga yang serba kekurangan itu, ibu Arief, Salmah (Helmalia Putri), " +
                                    "terpaksa bekerja sebagai TKW di Singapura. Setelah bertahun-tahun belum juga kembali, " +
                                    "dan tidak pernah memberi kabar, Arief sangat merindukannya. Arief bekerja di " +
                                    "bengkel sepulang sekolah dengan cita-cita mengumpulkan uang untuk mencari ibunya. " +
                                    "Arief akan dibantu oleh Cak Alul (Sudjiwo Tedjo).\n" +
                                    "\n" +
                                    "Ibu Tari Hayat (Revalina S. Temat), seorang guru fisika," +
                                    " melihat bakat besar yang dimiliki Arief ketika ia sedang menolong temannya untuk " +
                                    "mengambil bola yang tersangkut di pohon menggunakan konsep roket air. Berkat dorongan " +
                                    "Ibu Tari, Arief ikut seleksi olimpiade sains yang akan diadakan di Singapura. Namun, " +
                                    "sesungguhnya Arief memiliki agenda tersembunyi: menemukan ibunya di sana.\n" +
                                    "\n" +
                                    "Seleksi dilakukan oleh Pak Tio Yohanes (Ferry Salim) di Jakarta, yang dibantu " +
                                    "oleh Deborah Sinaga (Febby Febiola). Para peserta bersaing untuk lolos, sekaligus " +
                                    "menjalin persahabatan. Arief menjalin persahabatan dengan Muhammad Thamrin (Angga Putra)," +
                                    " dan Clara Annabela (Dinda Hauw).Dengan kerja keras dan dukungan banyak orang itulah, " +
                                    "akhirnya Arif menjadi salah satu peraih medali emas dan ia kembali bertemu ibunya setelah " +
                                    "pulang ke Madura.\n" +
                                    "\n" +
                                    "Sutradara\t :John De Rantau\n" +
                                    "Produser\t :Putut Widjanarko"
                            ,R.drawable.sci_semesta);
                    insertFilm (db,"Zathura","Pemeran \n" +
                                    "Josh Hutcherson sebagai Walter\n" +
                                    "* Jonah Bobo sebagai Danny\n" +
                                    "* Dax Shepard sebagai Astronaut/Walter masa depan\n" +
                                    "* Kristen Stewart sebagai Lisa\n" +
                                    "* Tim Robbins sebagai Ayah\n" +
                                    "* John Alexander (Frank Oz, suara) sebagai Robot\n" +
                                    "* Derek Mears sebagai Lead Zorgon\n" +
                                    "* Douglas Tait sebagai Kepala Zorgon\n" +
                                    "* Jeff Wolfe sebagai Master Zorgon\n" +
                                    "* Adam Wills sebagai Kapten Zorgon\n" +
                                    "\n" +
                                    "Sinopsis : \n" +
                                    "Bersaudara Walter (Josh Hutcherson) dan Danny (Jonah Bobo) " +
                                    "tidak pernah bisa bergaul satu sama lain, atau dengan kakak " +
                                    "perempuan remaja mereka, Lisa (Kristen Stewart). Selama tinggal di " +
                                    "rumah ayah bercerai mereka, ketika ia pergi bekerja dan Lisa sedang " +
                                    "tidur, anak-anak menemukan permainan clockwork-driven space-bertema " +
                                    "papan tua yang disebut \"Zathura\" di ruang bawah tanah. Keduanya mulai " +
                                    "memainkan permainan, dengan tujuan untuk menjadi yang pertama untuk mencapai " +
                                    "ruang terakhir bernama Zathura. Selama tiap giliran, permainan memberikan kartu " +
                                    "dengan instruksi, tetapi dua cepat menyadari kartu mempengaruhi kenyataannya. Mereka " +
                                    "segera menemukan rumah itu mengambang di sebuah batu kecil di luar angkasa. " +
                                    "Sementara itu, Lisa melihat ke luar jendela, dan percaya itu hanyalah gelap, " +
                                    "dan pergi mandi untuk kencannya. Ketika mereka mencoba untuk memperingatkan " +
                                    "Lisa tentang apa yang telah terjadi, mereka menemukan dia beku dalam tidur " +
                                    "cryonic sebagai akibat dari salah satu kartu. Mereka menyadari bahwa satu-satunya " +
                                    "cara adalah mengakhiri permainan dan mudah-mudahan kembali ke bumi dan mencapai " +
                                    "ruang akhir Zathura.\n" +
                                    "\n" +
                                    "Sutradara : \tJon Favreau\n" +
                                    "Produser :  \tMichael De Luca Dkk.\n" +
                                    "Tanggal rilis : \t" +
                                    "11 November 2005 (Amerika Serikat)\n" +
                                    "Durasi  : \t113 menit",
                            R.drawable.zathura);
                    insertFilm (db,"The Lord of The Ring",
                            "Pemeran : \n" +
                                    "\t\n" +
                                    "* Elijah Wood\n" +
                                    "* Ian McKellen\n" +
                                    "* Liv Tyler\n" +
                                    "* Viggo Mortensen\n" +
                                    "* Sean Astin\n" +
                                    "* Cate Blanchett\n" +
                                    "* John Rhys-Davies\n" +
                                    "* Bernard Hill\n" +
                                    "* Billy Boyd\n" +
                                    "* Dominic Monaghan\n" +
                                    "* Orlando Bloom\n" +
                                    "* Christopher Lee\n" +
                                    "* Hugo Weaving\n" +
                                    "* Miranda Otto\n" +
                                    "* David Wenham\n" +
                                    "* Brad Dourif\n" +
                                    "* Karl Urban\n" +
                                    "* John Noble\n" +
                                    "* Andy Serkis\n" +
                                    "* Ian Holm\n" +
                                    "* Sean Bean\n" +
                                    "* Lawrence Makoare\n" +
                                    "* Paul Norell\n" +
                                    "* Marton Csokas\n" +
                                    "* Craig Parker\n " +
                                    "\n" +
                                    "Sinopsis :  \n" +
                                    "film ini menceritakan cerita hobbit Frodo Baggins (Elijah Wood) ketika dia dan " +
                                    "Sembilan Pembawa Cincin melakukan perjalanan untuk menghancukan One Ring, dan dengan " +
                                    "itu menghancurkan pembuatnya, Dark Lord Sauron. Para Pembawa Cincin terbelah " +
                                    "dan Frodo meneruskan perjalanan dengan teman setianya Sam (Sean Astin) dan " +
                                    "makhluk pengkhianat Gollum (Andy Serkis). Sementara itu, Aragorn (Viggo Mortensen), putra mahkota " +
                                    "Gondor, dan penyihir Gandalf (Ian McKellen) mempersatukan Orang-orang bebas Dunia\n " +
                                    "Tengah dalam Perang Cincin." +
                                    "\n" +
                                    "Sutradara :  \tPeter Jackson" +
                                    "Produser :  Peter Jackson Dkk.\n" ,
                            R.drawable.lordofthering);
                    insertFilm (db,"Jumanji",
                            "Pemeran : \n" +
                                    "* Dwayne Johnson sebagai Dr. Smolder Bravestone, avatar Spencer\n" +
                                    "* Jack Black sebagai Profesor Sheldon \"Shelly\" Oberon, avatar Bethany\n" +
                                    "* Karen Gillan sebagai Ruby Roundhouse, avatar Martha\n" +
                                    "* Kevin Hart sebagai Franklin \"Mouse\" Finbar, avatar Fridge\n" +
                                    "* Nick Jonas sebagai Jefferson \"Seaplane\" McDonough, avatar Alex Vreeke[8]\n" +
                                    "* Bobby Cannavale sebagai Van Pelt\n" +
                                    "* Rhys Darby sebagai Nigel Billingsley\n" +
                                    "* William Tokarsky sebagai pedagang\n" +
                                    "* Rohan Chand sebagai anak kecil di bazar\n" +
                                    "\n" +
                                    "Sinopsis  : \n" +
                                    "Jumanji: Welcome to the Jungle adalah film komedi petualangan Amerika Serikat tahun 2017 " +
                                    "yang disutradarai oleh Jake Kasdan dan diproduseri oleh Matt Tolmach dan William Teitler. " +
                                    "Naskah film ini ditulis oleh Jake Kasdan, Chris McKenna, Erik Sommers, Scott Rosenberg dan Jeff Pinkner," +
                                    " sementara ceritanya ditulis oleh Chris McKenna berdasarkan buku Jumanji karya Chris Van Allsburg. Film ini" +
                                    " dibintangi oleh Dwayne Johnson, Jack Black, Kevin Hart, Karen Gillan, Nick Jonas dan Bobby Cannavale.\n" +
                                    "\n" +
                                    "Sutradara : \tJake Kasdan\n" +
                                    "Produser :\tMatt Tolmach\n" +
                                    "\t William Teitler\n",
                            R.drawable.jumanji);
                    insertFilm(db, "beranak dalam kubur",
                            "Pemeran : \n" +
                                    "* Suzanna sebagai Lila\n" +
                                    "* Mieke Widjaja sebagai Dhora\n" +
                                    "* Dicky Suprapto sebagaI Robby\n" +
                                    "* Ami Prijono sebagai Bapak\n" +
                                    "* Sofia Amang sebagai Ibu\n" +
                                    "* Djohan Subandrio\n" +
                                    "* Deddy Mudjito\n" +
                                    "* Azwar Noor\n" +
                                    "* Robby Hart\n" +
                                    "* Suhaimi Said\n" +
                                    "* Kiki S.\n" +
                                    "* Fifi S.\n" +
                                    "* F. X. Sutono\n" +
                                    "\n" +
                                    "Sinopsis : \n" +
                                    "Disebuah desa bernama Ciganyar terdapat sebuah perkebunan yang menjadi sumber mata " +
                                    "pencaharian warga setempat. Perkebunan tersebut adalah milik sebuah keluarga kaya " +
                                    "raya yang terdiri dari seorang Bapak (Ami Prijono), Ibu (Sofia Amang), dan dua anak " +
                                    "gadisnya, Dhora (Mieke Widjaya) dan Lila (Suzanna). Dhora, sang kakak, adalah seorang" +
                                    " gadis yang berhati kejam dan berwatak keras sedangkan Lila adalah gadis yang berhati " +
                                    "lembut. Karena tidak pernah akur, kedua gadis itu akhirnya dipisahkan oleh sang Ayah. " +
                                    "Lila dibawa ke kota untuk tinggal bersama dengan tantenya sedangkan Dhora tetap di" +
                                    " perkebunan bersama Ayah dan Ibunya. Tahun demi tahun berlalu, Dhora dan " +
                                    "Lila sudah bertumbuh dewasa. Lila tumbuh menjadi wanita yang cantik rupawan" +
                                    " dan bersuamikan Robby (Dicky Suprapto) seorang pria tampan dan gagah. " +
                                    "Karena mendengar kabar bahwa ibu tirinya meninggal dunia dan karena sang " +
                                    "suami akan pergi ke luar negeri, Lila akhirnya pulang ke Ciganyar. Dhora " +
                                    "yang tumbuh menjadi wanita yang berdarah dingin ternyata sudah mempersiapkan " +
                                    "rencana jahat untuk Lila setibanya di Ciganyar. Bukan hanya berencana jahat " +
                                    "kepada Lila, Dhora juga ternyata sudah dengan tega membunuh ibunya sendiri " +
                                    "dan membuat ayahnya menjadi lumpuh, juga menyengsarakan dan menindas warga " +
                                    "Ciganyar. Sepeninggalan Robby ke luar negeri, Dhora mulai menggencarkan rencana " +
                                    "busuknya untuk menyingkirkan Lila. Dalam melancarkan tindak kejahatannya, Dhora " +
                                    "selalu dibantu orang kepercayaanya, seorang lelaki misterius yang akrab dengan" +
                                    " hewan-hewan buas seperti ular. Suatu hari Dhora mengajak Lila ke danau tempat " +
                                    "mereka biasa bermain saat kecil. Alih-alih ingin mempersilakan Lila yang sedang " +
                                    "hamil besar untuk duduk di sebuah batu di tepi danau, Dhora malah mendorong Lila " +
                                    "hingga hampir tenggelam. Malam hari setelah kejadian itu Lila merasakan kontraksi " +
                                    "namun ternyata Dhora tidak membantu Lila melahirkan tapi malah menyiram muka adik " +
                                    "tirinya itu dengan air keras. Dhora menugasi bawahannya untuk mengubur " +
                                    "Lila hidup-hidup namun ternyata bayi Lila justru lahir di dalam kuburan. " +
                                    "Sejak saat itu daerah Ciganyar jadi angker karena penampakan hantu yang" +
                                    " beranak dalam kubur. Di akhir film, Robby pulang dari luar negeri dan " +
                                    "memecahkan misteri hantu pengganggu. Hantu tadi adalah " +
                                    "Lila yang menakut-nakuti penduduk Ciganyar, padahal sebenarnya ia " +
                                    "hanya berurusan dengan Dhora. Kegemparan pun terjadi ketika Robby " +
                                    "beserta para buruh perkebunan melabrak rumah Dhora. Dhora yang merasa " +
                                    "terjepit mencoba menembak orang-orang tersebut. Sang ayah berusaha mencegahnya, " +
                                    "tetapi ia bersama Dhora malah terjatuh dari balkon rumah dan mereka berdua tewas.\n" +
                                    "\n" +
                                    "Sutradara \t : Awaludin, Ali Shahab\n" +
                                    "Produser\t :Dicky Suprapto", R.drawable.hor_beranak);
                    insertFilm(db,"Ratu Buaya Putih",
                            "Pemeran : \n" +
                                    "* Soendjoto Adibroto\n" +
                                    "* Vera Magdalena\n" +
                                    "* Suzanna\n" +
                                    "* Jeffry Waworuntu\n" +
                                    "* Rita Sheba\n" +
                                    "* Dorman Borisman\n" +
                                    "* Bokir\n" +
                                    "* Atin Martino\n" +
                                    "* HIM Damsyik\n" +
                                    "* Yulie Soleh\n" +
                                    "* Ratih Moortri\n" +
                                    "* Lina Sagita\n" +
                                    "* Chris Salam\n" +
                                    "* Rudy Wahab\n" +
                                    "* Amin Ansari \n" +
                                    "\n" +
                                    "Sinopsis : \n" +
                                    "Sumarna (Soendjoto Adibroto), pawang buaya, merebut jimat teman seperguruannya y" +
                                    "ang bisa membuat pawang menundukkan buaya seganas apapun. Meski mendapat jimat, " +
                                    "ia kena kutukan. 20 tahun kemudian, dua anaknya meninggal. " +
                                    "Yang pertama mati di kolam buaya hingga buaya-buaya disitu dibunuhi, " +
                                    "dan yang kedua mati tertabrak motornya sendiri. Tinggal anak perempuannya Murti (Vera Magdalena), " +
                                    "yang juga dibayang-bayangi maut. Sumarna lalu mengeluh pada janda muda di desa itu, Larsih Suzanna, " +
                                    "yang ternyata Ratu Buaya Putih dan dirasuki arwah rekan seperguruan yang dibunuh Sumarna. " +
                                    "Rahasia Ratu Buaya Putih ini diungkap oleh Parlan, tokoh alim desa itu, " +
                                    "yang juga adik suami-istri yang dibunuh Sumarna. Akhirnya Buaya Putih bisa dikalahkan, " +
                                    "dan Murti dan Jeffry (Jeffry Waworuntu), rekan bisnis jual-beli buaya, yang sempat ditahan bisa selamat. \n" +
                                    "\n" +
                                    "Sutradara\t :Naryono Prayitno\n" +
                                    "Produser\t : Ram Soraya\n" +
                                    "Penulis\t : Tim Soraya Film"
                            , R.drawable.horor_buaya);
                    insertFilm(db, "Malam Jumat Kliwon",
                            "Pemeran : \n" +
                                    "* Suzanna\n" +
                                    "* Alan Nuari\n" +
                                    "* Amith Abidin\n" +
                                    "* Rukman Herman\n" +
                                    "* Soendjoto Adibroto\n" +
                                    "* Doddy Kusuma\n" +
                                    "* Yorita Murni\n" +
                                    "* Bokir\n" +
                                    "* Karsiman Gada\n" +
                                    "* Johny Matakena\n" +
                                    "* Sudarmi Suyadi\n" +
                                    "* Evie Susanto\n" +
                                    "* Elly Kristina\n" +
                                    "* Neneng Rosita Irmawati\n" +
                                    "* Ali Albar\n" +
                                    "* Dorman Borisman\n" +
                                    "\n" +
                                    "Alur : \n" +
                                    "Film dimulai dengan seorang wanita di suatu rumah yang sedang hamil tua. Ia disantet. " +
                                    "Lalu, tiba-tiba perutnya bergejolak dan bayinya berpindah ke belakang perut. " +
                                    "Di belakang perut itulah, bulatan tempat bayinya menggembung hebat dan meletus." +
                                    " Mengeluarkan darah dan seorang bayi dari sana.\n" +
                                    "\n" +
                                    "Ayu Trisnaningrat (Suzanna) adalah seorang novelis misteri. " +
                                    "Ia merasa bahwa di tengah penulisan novel terbarunya ini, " +
                                    "ia tidak dapat berkonsentrasi penuh seperti biasanya. " +
                                    "Setelah mengutarakan hal itu kepada kekasihnya Anton (Alan Nuari), " +
                                    "Anton mengajak Ayu untuk menulis novelnya di luar kota. Iseng untuk mencari jalan baru, " +
                                    "mereka malah terhenti di jalur buntu yang berdekatan dengan sungai. " +
                                    "Karena masih terhanyut perasaan senang, mereka melanjutkan perjalanan dengan jalan kaki " +
                                    "dan menemukan sebuah rumah yang cukup besar. Ayu berkata kepada Anton " +
                                    "bahwa ia seperti pernah mengenal rumah itu. Mereka berduapun masuk saat " +
                                    "mengetahui bahwa pintunya tidak terkunci. Rumah itu sudah seperti tidak " +
                                    "ada penghuninya, tetapi masih tetap bersih, kecuali satu kamar, kamar itu" +
                                    " adalah kamar yang ada di awal film. Ayu mulai menyadari ada yang aneh di rumah itu, " +
                                    "tetapi merasa rumah itu sudah “menyamankan” dirinya. Ayu ingin menulis disana. Kemudian " +
                                    "mereka berangkat kembali ke mobil dan memutar hingga sampai ke sebuah rumah dekat rumah besar itu. " +
                                    "Mereka bertemu dengan seseorang bernama Pak Tomo yang merawat Raden Ngabey Arya Tejo, seorang yang" +
                                    " sudah sepuh usianya, yang kelihatannya adalah pemilik rumah. Saat Ayu dan Anton bertandang ke rumah, " +
                                    "Raden merasa ketakutan saat melihat Ayu. Beberapa hari kemudian, Ayu telah diijinkan. Ia akan tinggal " +
                                    "menulis sendiri dirumah itu hanya bersama pembantu rumah, Pak Ardan. Setelah diantar Anton, Ayupun mulai menulis.\n" +
                                    "\n" +
                                    "Ditengah penulisannya, ia kerap diganggu hal-hal yang menakutkan. Hal itu membuatnya menanyakan apa" +
                                    " yang sebenarnya terjadi di rumah itu dengan Pak Ardan yang bersikap tidak bersahabat." +
                                    " Tiba-tiba Pak Ardan berniat memerkosa dan membunuh Ayu. Ayu kontan kaget dan berlari hingga keatas, " +
                                    "disana, Pak Ardan dikejar Sundel Bolong hingga tenggelam di sungai. Hal itu membuat Ayu semakin ketakutan, " +
                                    "sekaligus penasaran. Saat perbincangan singkat dengan Pak Ardan dulu, Pak Ardan pernah menyebut nama Karsiman. " +
                                    "Orang itu ditemui Ayu akhirnya disebuah pertenakan ayam.Karsiman, saat ditanyai oleh Ayu " +
                                    "juga bertindak sangat kasar hingga mengejar Ayu dengan mobil. Ayu yang saat itu mengendarai motor, " +
                                    "nyaris ditabrak oleh Karsiman, sebelum Sundel Bolong menghadang mobil Karsiman dan membuat Karsiman" +
                                    " kecelakaan. Ayu menghampiri mobil Karsiman, Karsiman bangkit dan disaat ia terluka di kepala, " +
                                    "ia masih ingin membunuh Ayu. Ayu dikejar hingga disebuah pabrik batu bata. " +
                                    "Di mana akhirnya saat Ayu nyaris dibunuh oleh sekop, Sundel Bolong melayangkan sekop itu ke dada Karsiman.\n" +
                                    "\n" +
                                    "Pak Tomo pergi ke rumah saat pagi hari, memberikan berita ditemukannya mayat Pak Ardan dan Karsiman, " +
                                    "dan Ayu akan menjadi saksi. Pak Tomo menduga itu semua dilakukan oleh arwah Minati," +
                                    " kakak ipar Pak Tomo yang ternyata adalah adik Raden, Minati tewas karena melahirkan dari punggung " +
                                    "yang ada di awal film. Ayu memberikan keterangan bahwa pembunuhan itu benar, dan Ayu berkata bahwa " +
                                    "ia dan Minati sangat mirip, apalagi Ayu sejak kecil dititipkan di panti asuhan. Anton ditelepon dan" +
                                    " dipanggil ke rumah Raden untuk diceritakan tentang hal itu oleh Raden. Raden menceritakan bahwa di" +
                                    " Malam Jumat Kliwon saat kelahiran Ayu, selir Raden bekerjasama dengan seorang dukun teluh serta Ardan " +
                                    "dan Karsiman, menyantet Minati karena mereka benci dengannya." +
                                    " Raden mengetahui hal itu dan membunuh dukun dan selirnya. Kemudian, " +
                                    "Ardan dan Karsiman yang tahu hal itu memaksa Raden untuk menyerahkan sepertiga dari " +
                                    "kekayaannya untuk mereka berdua, agar pembunuhan itu tidak diketahui pihak berwajib." +
                                    " Raden akhirnya meninggal setelah bercerita. Di sisi Ayu, ia diceritakan hal yang sama oleh Minati " +
                                    "yang kemudian menghilang selesai berpelukan dengan anaknya. Dan itu bisa disimpulkan bahwa Minati adalah " +
                                    "Sundel Bolong yang meninggal saat melahirkan sedangkan Ayu adalah anaknya Minati.\n" +
                                    "\n" +
                                    "Film berakhir dengan Ayu melukis potret dirinya bersama Raden dan Minati, didampingi " +
                                    "oleh Anton yang ternyata sudah memperistri Ayu. Mereka memulai hidup bahagia mereka dirumah " +
                                    "Raden dan Minati, rumah kelahiran Ayu.\n" +
                                    "\n" +
                                    "Sutradara\t :Sisworo Gautama Putra\n" +
                                    "Produser\t : Ram Soraya" +
                                    "", R.drawable.horor_kliwon);
                    insertFilm(db, "Malam Satu Suro",
                            "Pemeran : \n" +
                                    "\tSuzanna\n" +
                                    "* Fendy Pradhana\n" +
                                    "* Johny Matakena\n" +
                                    "* Soendjoto Adibroto\n" +
                                    "* Nurnaningsih\n" +
                                    "* Belkiez Rachman\n" +
                                    "* Karsiman Gada\n" +
                                    "* Eddy Gunawan\n" +
                                    "* Bokir\n" +
                                    "* Dorman Borisman\n" +
                                    "* Rengga Takengon\n" +
                                    "* Rachelle\n" +
                                    "* Ratih Moortri\n" +
                                    "* Diana Suarkom\n" +
                                    "* Henky Nero\n" +
                                    "\n" +
                                    "Sinopsis : " +
                                    "\nDi awal film, di tengah sebuah hutan, arwah seorang wanita yang gentayangan berwujud sundel " +
                                    "bolong dibangkitkan dari kuburannya oleh Ki Rengga, seorang dukun Jawa sakti untuk dijadikan " +
                                    "anak angkatnya. Dukun Jawa itu berkata: \"Suketi, manuta nduk, kowé arep takdadikké anak angkatku.\" " +
                                    "(\"Suketi, menurutlah nak, engkau akan kujadikan anak angkatku\"). Dia kemudian menancapkan paku keramat " +
                                    "ke kepala Suketi (Suzanna), arwah penasaran tersebut, merapal mantra kuno berbahasa Jawa dan sundel bolong " +
                                    "itu pun menjadi manusia kembali. Suatu hari dua orang pemuda dari Jakarta sedang berburu kelinci di hutan " +
                                    "tersebut. Bardo Ardiyanto (Fendy Pradana), sang pemburu tersebut, bersama temannya Hari, nyaris membunuh" +
                                    " buruannya, tetapi dihalangi oleh seorang wanita cantik, dia pun penasaran akan wanita tersebut dan " +
                                    "akhirnya bertemu dengan Suketi. Bardo dan Suketi langsung saling jatuh cinta dan Bardo berniat melamar " +
                                    "Suketi. Awalnya lamarannya ditolak oleh Ki Rengga, ayah angkat Suketi, tetapi akhirnya disetujui setelah " +
                                    "permohonan Bardo yang tulus dan dorongan Suketi ke orang tua angkatnya. Bardo mengikuti syarat Ki Rengga," +
                                    " bahwa pernikahan harus diadakan pada \"Malam satu Suro\" (Tanggal 1 Sura, tahun baru dalam penanggalan Jawa) " +
                                    "di tengah Alas Roban (\"Hutan Roban\") tanpa dihadiri siapa pun kecuali sang dukun Jawa dan pasangan pengantin " +
                                    "tersebut dalam sebuah adegan ritual mistik Jawa kuno yang diiringi tari-tarian peri.\n" +
                                    "\n" +
                                    "Beberapa tahun kemudian Suketi dan Bardo hidup berkeluarga dengan bahagia di Jakarta dengan kedua anak mereka, " +
                                    "Rio dan Preti. Keluarga mereka juga menjadi kaya raya karena konon bila menikahi Sundel bolong maka seseorang " +
                                    "akan menjadi kaya raya. Suatu hari Joni, seorang pengusaha licik menawarkan perjanjian bisnis di kantor Bardo," +
                                    " tetapi ditolak karena taktiknya yang kotor. Joni menyimpan dendam dan berniat menjatuhkan Bardo. Joni datang" +
                                    " ke Mak Talo, seorang dukun lain, dan mengetahui bahwa istri bardo dulunya adalah Sundel Bolong. Mak Talo dan" +
                                    " Joni mendatangi rumah Bardo dan mencabut paku yang menancap di kepala Suketi, sehingga Suketi berubah " +
                                    "menjadi Sundel Bolong kembali. Malamnya Bardo yang kebingungan menemui mertuanya di Alas Roban dan " +
                                    "mengetahui latar belakang Suketi yang sesungguhnya. Suketi dulunya adalah seorang wanita muda yang mati " +
                                    "bunuh diri setelah diperkosa dan hamil, arwahnya tidak beristirahat dengan tenang dan menjelma menjadi " +
                                    "hantu Sundel Bolong yang penuh dendam. Setelah membalas dendam, dia kemudian dibangkitkan kembali oleh" +
                                    " Ki Rengga untuk menjadi anak angkatnya.\n" +
                                    "\n" +
                                    "Suketi yang sekarang kembali menjadi Sundel Bolong sangat sedih karena" +
                                    " kehidupannya yang telah bahagia bersama keluarganya dirusak. Situasi bertambah tegang ketika Preti" +
                                    " kemudian diculik oleh kawanan penjahat Joni yang berkomplot dengan dukun Mak Talo. Komplotan Joni" +
                                    " meminta uang tebusan, tetapi dalam prosesnya, Preti terbunuh secara tidak sengaja oleh salah satu " +
                                    "penjahat. Suketi menjadi marah besar dan mengamuk setelah tahu bahwa anaknya terbunuh. Sundel Bolong " +
                                    "Suketi mulai melangsungkan balas dendamnya kepada komplotan penjahat tersebut dengan cara-cara yang " +
                                    "kejam namun unik.\n" +
                                    "\n" +
                                    "Suketi yang sedih berniat untuk kembali ke keluarganya, dia bermain piano dengan menyanyikan lagu " +
                                    "\"Selamat Malam\" Vina Panduwinata, sehingga Rio dan ayahnya terbangun. Mereka dengan sedih berpisah" +
                                    " dengan Suketi dan menyatakan bahwa alam mereka berbeda. Suketi kemudian berkata \"Arwahku akan gentayangan " +
                                    "sebelum dendamku terbalas\" sebelum pergi. Suketi yang dirundung duka dan dendam kemudian menggali kuburan" +
                                    " anak perempuannya, memasukkan jasad Preti ke sebuah peti mati bersama boneka kesayangan Preti, kemudian berjalan " +
                                    "perlahan dengan menyeret peti mati tersebut dalam sebuah adegan yang diinspirasi film koboi Itali Django. " +
                                    "Sundel Bolong Suketi kemudian mulai mengganggu masyarakat di sekitar kuburan tersebut dalam adegan-adegan" +
                                    " yang seram namun lucu, yang pertama adalah seorang tukang bakpau Tionghoa-Indonesia yang sedang pulang " +
                                    "dari berjualan. Korban keduanya adalah penyanyi dangdut Bokir yang berdandan ala John Lennon dan pengawal " +
                                    "pribadinya Dorman Borisman yang dipancing untuk menyanyikan lagu \"Tembok Derita\" di kuburan. Setelah Bokir " +
                                    "dan Dorman lari ketakutan, mereka kemudian meminta bantuan ojek dari seseorang yang tak lain adalah salah satu " +
                                    "dari komplotan penjahat Joni. Bokir dan Dorman pingsan karena diikuti Sundel Bolong Suketi yang mengenal" +
                                    " penjahat tersebut. Sundel Bolong Suketi kemudian membunuh satu persatu penjahat yang telah menghancurkan" +
                                    " keluarganya. Akhirnya Suketi berhasil membalaskan dendamnya, bersamaan dengan sampainya Bardo, Rio, Ki Rengga " +
                                    "dan masyarakat sekitar tempat tersebut. Dalam adegan sedih, Bardo dan Rio meyakinkan Suketi bahwa cintanya akan" +
                                    " abadi walaupun Suketi kembali ke alamnya. Suketi menitipkan pesan kepada Bardo supaya menjaga Rio baik-baik, " +
                                    "dan kepada Rio supaya kelak bisa menjadi orang yang berguna, " +
                                    "dan Suketi menghilang diiringi kepulan asap kembali ke alam baka." +
                                    "\n" +
                                    "\n" +
                                    "Sutradara\t:Sisworo Gautama Putra\n" +
                                    "Produser\t:Ram Soraya", R.drawable.horor_satu);
                    insertFilm (db,"Petualangan Sherina","Pemeran : \n" +
                                    "* Sherina Munaf sebagai Sherina Melodi Darmawan\n" +
                                    "* Derby Romero sebagai Sadam\n" +
                                    "* Uci Nurul sebagai ibu Sherina  Dll\nMathias Muchus sebagai ayah Sherina\n" +
                                    "* Didi Petet sebagai Pak Ardiwilaga, papi Sadam\n" +
                                    "* Ratna Riantiarno sebagai Bu Ardiwilaga, mami Sadam\n" +
                                    "* Dewi Hughes sebagai guru\n" +
                                    "* Henidar Amroe sebagai Sis Natasya\n" +
                                    "* Djaduk Ferianto sebagai Kertarajasa \nButet Kertaradjasa sebagai Pak Raden, bos penculik\n" +
                                    "* Yadi Timo sebagai penculik\n" +
                                    "* Sas Widjanarko sebagai penculik\n" +
                                    "* Nova \"Omes\" Nugraha sebagai penculik\n" +
                                    "* Epy Kusnandar sebagai Upay\n" +
                                    "* Ray Burhanuddin sebagai Dudung\n" +
                                    "* Arry Variantsyah sebagai Icang\n" +
                                    "* Alyssa Soebandono sebagai teman Sherina di Jakarta\n" +
                                    "* Galabby Tahira Pahlevi sebagai teman Sherina di Jakarta\n" +
                                    "\n" +
                                    "Sinopsis :\n " +
                                    "Ayah Sherina (Sherina Munaf), yaitu Darmawan (Mathias Muchus), " +
                                    "insinyur pertanian, mendapatkan kerja pertanian sesuai dengan impiannya, " +
                                    "Sherina ikut pindah ke Bandung Utara. Di sekolahnya yang baru, ia mendapat musuh, " +
                                    "Sadam (Derby Romero), yang ternyata anak dari majikan Darmawan, Ardiwilaga (Didi Petet). " +
                                    "Sadam yang adalah anak nakal di sekolah, sebenarnya sangat manja di rumah.Hal ini diketahui Sherina saat berliburan ke rumah Ardiwilaga. Dalam kesempatan ini " +
                                    "permusuhan kedua anak tadi berubah menjadi persahabatan, karena keduanya diculik oleh Pak Raden (Butet Kertaradjasa), " +
                                    "suruhan Kertarejasa (Djaduk Ferianto), yang ingin menguasai tanah pertanian Ardiwilaga, untuk proyek propertinya.\n" +
                                    "\n" +
                                    "Sutradara: \t Riri Riza\n" +
                                    "Tanggal rilis : \t 14 Juni 2000\n" +
                                    "Durasi :  \t114 menit\n" +
                                    "Negara : \tIndonesia",
                            R.drawable.petualanganserina);
                    insertFilm (db,"Zathura","Pemeran \n" +
                            "Josh Hutcherson sebagai Walter\n" +
                                    "* Jonah Bobo sebagai Danny\n" +
                                    "* Dax Shepard sebagai Astronaut/Walter masa depan\n" +
                                    "* Kristen Stewart sebagai Lisa\n" +
                                    "* Tim Robbins sebagai Ayah\n" +
                                    "* John Alexander (Frank Oz, suara) sebagai Robot\n" +
                                    "* Derek Mears sebagai Lead Zorgon\n" +
                                    "* Douglas Tait sebagai Kepala Zorgon\n" +
                                    "* Jeff Wolfe sebagai Master Zorgon\n" +
                                    "* Adam Wills sebagai Kapten Zorgon\n" +
                                    "\n" +
                                    "Sinopsis : \n" +
                                    "Bersaudara Walter (Josh Hutcherson) dan Danny (Jonah Bobo) " +
                                    "tidak pernah bisa bergaul satu sama lain, atau dengan kakak " +
                                    "perempuan remaja mereka, Lisa (Kristen Stewart). Selama tinggal di " +
                                    "rumah ayah bercerai mereka, ketika ia pergi bekerja dan Lisa sedang " +
                                    "tidur, anak-anak menemukan permainan clockwork-driven space-bertema " +
                                    "papan tua yang disebut \"Zathura\" di ruang bawah tanah. Keduanya mulai " +
                                    "memainkan permainan, dengan tujuan untuk menjadi yang pertama untuk mencapai " +
                                    "ruang terakhir bernama Zathura. Selama tiap giliran, permainan memberikan kartu " +
                                    "dengan instruksi, tetapi dua cepat menyadari kartu mempengaruhi kenyataannya. Mereka " +
                                    "segera menemukan rumah itu mengambang di sebuah batu kecil di luar angkasa. " +
                                    "Sementara itu, Lisa melihat ke luar jendela, dan percaya itu hanyalah gelap, " +
                                    "dan pergi mandi untuk kencannya. Ketika mereka mencoba untuk memperingatkan " +
                                    "Lisa tentang apa yang telah terjadi, mereka menemukan dia beku dalam tidur " +
                                    "cryonic sebagai akibat dari salah satu kartu. Mereka menyadari bahwa satu-satunya " +
                                    "cara adalah mengakhiri permainan dan mudah-mudahan kembali ke bumi dan mencapai " +
                                    "ruang akhir Zathura.\n" +
                                    "\n" +
                                    "Sutradara : \tJon Favreau\n" +
                                    "Produser :  \tMichael De Luca Dkk.\n" +
                                    "Tanggal rilis : \t" +
                                    "11 November 2005 (Amerika Serikat)\n" +
                                    "Durasi  : \t113 menit",
                            R.drawable.zathura);
                    insertFilm (db,"The Lord of The Ring",
                            "Pemeran : \n" +
                                    "\t\n" +
                                    "* Elijah Wood\n" +
                                    "* Ian McKellen\n" +
                                    "* Liv Tyler\n" +
                                    "* Viggo Mortensen\n" +
                                    "* Sean Astin\n" +
                                    "* Cate Blanchett\n" +
                                    "* John Rhys-Davies\n" +
                                    "* Bernard Hill\n" +
                                    "* Billy Boyd\n" +
                                    "* Dominic Monaghan\n" +
                                    "* Orlando Bloom\n" +
                                    "* Christopher Lee\n" +
                                    "* Hugo Weaving\n" +
                                    "* Miranda Otto\n" +
                                    "* David Wenham\n" +
                                    "* Brad Dourif\n" +
                                    "* Karl Urban\n" +
                                    "* John Noble\n" +
                                    "* Andy Serkis\n" +
                                    "* Ian Holm\n" +
                                    "* Sean Bean\n" +
                                    "* Lawrence Makoare\n" +
                                    "* Paul Norell\n" +
                                    "* Marton Csokas\n" +
                                    "* Craig Parker\n " +
                                    "\n" +
                                    "Sinopsis :  \n" +
                                    "film ini menceritakan cerita hobbit Frodo Baggins (Elijah Wood) ketika dia dan " +
                                    "Sembilan Pembawa Cincin melakukan perjalanan untuk menghancukan One Ring, dan dengan " +
                                    "itu menghancurkan pembuatnya, Dark Lord Sauron. Para Pembawa Cincin terbelah " +
                                    "dan Frodo meneruskan perjalanan dengan teman setianya Sam (Sean Astin) dan " +
                                    "makhluk pengkhianat Gollum (Andy Serkis). Sementara itu, Aragorn (Viggo Mortensen), putra mahkota " +
                                    "Gondor, dan penyihir Gandalf (Ian McKellen) mempersatukan Orang-orang bebas Dunia\n " +
                                    "Tengah dalam Perang Cincin." +
                                    "\n" +
                                    "Sutradara :  \tPeter Jackson" +
                                    "Produser :  Peter Jackson Dkk.\n" ,
                            R.drawable.lordofthering);
                    insertFilm (db,"Jumanji",
                            "Pemeran : \n" +
                                    "* Dwayne Johnson sebagai Dr. Smolder Bravestone, avatar Spencer\n" +
                                    "* Jack Black sebagai Profesor Sheldon \"Shelly\" Oberon, avatar Bethany\n" +
                                    "* Karen Gillan sebagai Ruby Roundhouse, avatar Martha\n" +
                                    "* Kevin Hart sebagai Franklin \"Mouse\" Finbar, avatar Fridge\n" +
                                    "* Nick Jonas sebagai Jefferson \"Seaplane\" McDonough, avatar Alex Vreeke[8]\n" +
                                    "* Bobby Cannavale sebagai Van Pelt\n" +
                                    "* Rhys Darby sebagai Nigel Billingsley\n" +
                                    "* William Tokarsky sebagai pedagang\n" +
                                    "* Rohan Chand sebagai anak kecil di bazar\n" +
                                    "\n" +
                                    "Sinopsis  : \n" +
                                    "Jumanji: Welcome to the Jungle adalah film komedi petualangan Amerika Serikat tahun 2017 " +
                                    "yang disutradarai oleh Jake Kasdan dan diproduseri oleh Matt Tolmach dan William Teitler. " +
                                    "Naskah film ini ditulis oleh Jake Kasdan, Chris McKenna, Erik Sommers, Scott Rosenberg dan Jeff Pinkner," +
                                    " sementara ceritanya ditulis oleh Chris McKenna berdasarkan buku Jumanji karya Chris Van Allsburg. Film ini" +
                                    " dibintangi oleh Dwayne Johnson, Jack Black, Kevin Hart, Karen Gillan, Nick Jonas dan Bobby Cannavale.\n" +
                                    "\n" +
                                    "Sutradara : \tJake Kasdan\n" +
                                    "Produser :\tMatt Tolmach\n" +
                                    "\t William Teitler\n",
                            R.drawable.jumanji);
                    insertFilm (db,"Epen Cupen",
                            "Pemeran : \n" +
                                    "* Klemens Awi sebagai Cello & Bomel\n" +
                                    "* Babe Cabiita sebagai Babe\n" +
                                    "* Marissa Nasution sebagai Stella\n" +
                                    "* Edward Gunawan sebagai John\n" +
                                    "* Nato Beko sebagai Nato Beko\n" +
                                    "* Fico Fahriza sebagai Fico\n" +
                                    "* Pierre Gruno sebagai William Waru\n" +
                                    "* Dedy Mahendra Desta sebagai Peramal\n" +
                                    "* Temon sebagai Somad\n" +
                                    "* David Nurbianto sebagai Hansip\n" +
                                    "* Abdur Arsyad sebagai Supir Bajaj\n" +
                                    "* Uus sebagai Sales Tukang Obat\n" +
                                    "\n" +
                                    "Sinopsis : \n" +
                                    "Cello seorang pemuda dari Papua, disuruh ayahnya untuk pergi mencari saudara kembarnya yang " +
                                    "hilang sejak kecil. Cello berangkat dengan mengikuti petunjuk dari mimpi ayahnya yang melihat " +
                                    "saudara kembarnya berada di medan perang." +
                                    "Setibanya di kota Jayapura, tanpa sengaja Cello bertemu dengan Babe, seorang pengusaha bangkrut dari" +
                                    " Medan dan meminta bantuannya untuk mencari di mana medan perang itu. Babe yang terlibat banyak utang justru membuat masalah Cello bertambah ribet. Mereka dikejar debt collector dan bersembunyi di dalam gudang kargo bandara, tanpa sadar mereka terbawa pesawat sampai ke Jakarta.\n" +
                                    "Di Jakarta, Cello dan Babe terlibat banyak masalah baru, apalagi waktu mereka dikejar Nato Beko, " +
                                    "kelompok geng Biawak yang lagi memperebutkan harta warisan geng Rusa Jantan milik William." +
                                    "Cello yang jujur selain harus mencari saudara kembarnya, ia pun terlibat konflik antar geng perkotaan, " +
                                    "sementara Babe yang licik juga terus memanfaatkan Cello untuk mendapatkan keinginannya\n" +
                                    "\n" +
                                    "Sutradara   :Irham Acho Bachtiar\n" +
                                    "Produser :  Gope T Samtani"
                            ,R.drawable.sci_epen_cupen);
                    insertFilm  (db,"Mentalis",
                            "Pemeran :\n"
                                    +"* Deddy Corbuzier\n" +
                                    "* Limbad\n" +
                                    "* Meiditha Badawijaya\n" +
                                    "* Denaya Bintang Azmi\n" +
                                    "* Vista Putri \n" +
                                    "\n" +
                                    "Sinopsis : \n" +
                                    "Berkisah tentang 2 Mentalis, Deddy Corbuzier dan Ronggo Sewu " +
                                    "(Limbad) yang bersaing untuk menunjukan siapa yang paling hebat di antara keduanya. " +
                                    "Ronggo Sewu (Limbad) yang dulunya bekas asistant Deddy Corbuzier memfitnah Deddy Corbuzier " +
                                    "menggunakan ilmu sihir dalam setiap aksi/atraksi sulapnya. Tentu hal ini tidak bisa diterima oleh " +
                                    "Deddy Corbuzier yang akhirnya membuat permusuhan dan dendam di antara keduanya tidak bisa dihindarkan lagi. " +
                                    "Merekapun terjun ke dalam permainan yang berbahaya di mana nyawa menjadi taruhanya.\n" +
                                    "\n" +
                                    "\n" +
                                    "Sutradara\t :Walmer Sitohang\n" +
                                    "Produser\t :Hengky Kurniawan\n" +
                                    "\t Marwan Hoesin"
                            ,R.drawable.sci_mentalist);
                    insertFilm  (db,"Prefosionalish",
                            "Pemeran : \n" +
                                    "* Fachri Albar sebagai Abi\n" +
                                    "* Arifin Putra sebagai Reza\n" +
                                    "* Lukman Sardi sebagai Cokro, ayah Tomi\n" +
                                    "* Cornelio Sunny sebagai Ferry\n" +
                                    "* Richard Kyle sebagai Joe\n" +
                                    "* Melayu Nicole Hall sebagai Sophie\n" +
                                    "* Imelda Therinne sebagai Nicole\n" +
                                    "* Dimas Aditya sebagai Tomi\n" +
                                    "* Emil Kusumo sebagai Toha\n" +
                                    "* Iang Darmawan sebagai Pak Karta\n" +
                                    "* Ramon Y. Tungka sebagai Dani\n" +
                                    "* Viviane sebagai istri Abi\n" +
                                    "* Sandra Olga sebagai sekretaris Reza\n" +
                                    "* Emil Kusumo sebagai Toha\n" +
                                    "\n" +
                                    "The Professionals menceritakan tentang seorang yang bernama Abi (Fachri Albar), " +
                                    "Dia ternyata juga merupakan seorang pengusaha yang harus menjalani kehidupan di " +
                                    "penjara karena dijatuhkan dan dimasukan ke dalam penjara oleh lawan atau pesaing" +
                                    " bisnisnya yang bernama Reza (Arifin Putra).\n" +
                                    "\n" +
                                    "Setelah beberapa waktu di Abi pun akhirnya bisa keluar dari penjara tersebut, " +
                                    "Ia juga berencana untuk balas dendam kepada Reza. Suatu ketika Abi merencanakan " +
                                    "sebuah perampokan besar dengan target yaitu perusahaannya Reza. Abi hanya ingin" +
                                    " Reza mengalami hal yang ia rasakan waktu dulu.\n" +
                                    "\n" +
                                    "Abi mengajak teman temannya yaitu Cokro (Lukman Sardi), Ferry (Cornelio Sunny), " +
                                    "Jo (Richard Kyle), Nicole (Imelda Therinne), dan Sophie (Melayu Nicole Hall). " +
                                    "Tak ingin tinggal diam, Reza pun melakukan berbagai upaya untuk menghentikan aksi " +
                                    "Abi yang dapat membahayakan posisinya dan juga perusahaaannya.\n" +
                                    "\n" +
                                    "Dari situlah pertarungan strategi dilakukan, anggota team Reza yang tidak ingin " +
                                    "kalah licik dari Abi mencoba melindungi perusahaan milik Reza. Tapi rupanya Abi " +
                                    "merekrut para perampok profesional yang sudah sering melakukan aksi kriminal." +
                                    "\n" +
                                    "Sutradara\t : Affandi Abdul Rachman\n" +
                                    "Produser\t :Toha Essa"
                            ,R.drawable.sci_profesionals);
                    insertFilm (db,"Semesta Mendukung",
                            "Pemeran : \n" +
                                    "* Sayef Muhammad Billah sebagai Muhammad Arief\n" +
                                    "* Revalina S. Temat sebagai Ibu Tari Hayat\n" +
                                    "* Lukman Sardi sebagai Muslat\n" +
                                    "* Helmalia Putri sebagai Salmah\n" +
                                    "* Sudjiwo Tedjo sebagai Cak Alul\n" +
                                    "* Ferry Salim sebagai Pak Tio Yohanes\n" +
                                    "* Febby Febiola sebagai Deborah Sinaga\n" +
                                    "* Angga Putra sebagai Muhammad Thamrin\n" +
                                    "* Dinda Hauw sebagai Clara Annabela\n" +
                                    "* Sheina Abdat sebagai Cut Muthia\n" +
                                    "* Marco Dandy sebagai Husni Arsyad\n" +
                                    "* Rendy Ahmad sebagai Erwi\n" +
                                    "* Rangga Raditya sebagai Bima\n" +
                                    "* Indro Warkop sebagai Cak Kumis\n" +
                                    "* Jan Shulga sebagai Juri Olimpiade\n" +
                                    "\n" +
                                    "Sinopsis : \n" +
                                    "Muhammad Arief (Sayef Muhammad Billah), anak dari sebuah keluarga miskin dari" +
                                    " Sumenep, Madura, sangat menggemari sains, khususnya fisika. Meski tinggal " +
                                    "jauh dari kota besar dan bersekolah dengan fasilitas yang serbaminim, " +
                                    "Arief tetap menekuni fisika.\n" +
                                    "\n" +
                                    "Arief tinggal bersama ayahnya, Muslat (Lukman Sardi), " +
                                    "mantan petani garam yang beralih profesi menjadi sopir truk serabutan " +
                                    "karena ladang garam sedang dilanda paceklik akibat anomali cuaca. " +
                                    "Hal ini diperparah dengan kegemaran Muslat berjudi. Lantaran kondisi " +
                                    "ekonomi keluarga yang serba kekurangan itu, ibu Arief, Salmah (Helmalia Putri), " +
                                    "terpaksa bekerja sebagai TKW di Singapura. Setelah bertahun-tahun belum juga kembali, " +
                                    "dan tidak pernah memberi kabar, Arief sangat merindukannya. Arief bekerja di " +
                                    "bengkel sepulang sekolah dengan cita-cita mengumpulkan uang untuk mencari ibunya. " +
                                    "Arief akan dibantu oleh Cak Alul (Sudjiwo Tedjo).\n" +
                                    "\n" +
                                    "Ibu Tari Hayat (Revalina S. Temat), seorang guru fisika," +
                                    " melihat bakat besar yang dimiliki Arief ketika ia sedang menolong temannya untuk " +
                                    "mengambil bola yang tersangkut di pohon menggunakan konsep roket air. Berkat dorongan " +
                                    "Ibu Tari, Arief ikut seleksi olimpiade sains yang akan diadakan di Singapura. Namun, " +
                                    "sesungguhnya Arief memiliki agenda tersembunyi: menemukan ibunya di sana.\n" +
                                    "\n" +
                                    "Seleksi dilakukan oleh Pak Tio Yohanes (Ferry Salim) di Jakarta, yang dibantu " +
                                    "oleh Deborah Sinaga (Febby Febiola). Para peserta bersaing untuk lolos, sekaligus " +
                                    "menjalin persahabatan. Arief menjalin persahabatan dengan Muhammad Thamrin (Angga Putra)," +
                                    " dan Clara Annabela (Dinda Hauw).Dengan kerja keras dan dukungan banyak orang itulah, " +
                                    "akhirnya Arif menjadi salah satu peraih medali emas dan ia kembali bertemu ibunya setelah " +
                                    "pulang ke Madura.\n" +
                                    "\n" +
                                    "Sutradara\t :John De Rantau\n" +
                                    "Produser\t :Putut Widjanarko"
                            ,R.drawable.sci_semesta);
                };
                if (oldVersion < 2) {
                    db.execSQL("ALTER TABLE FILM ADD COLUMN FAVORITE NUMERIC;");
                }
            }
        }



