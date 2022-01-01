package com.example.herdi_cinema;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity{

    public static final String EXTRA_FILMID = "filmId";
    private CinemaDatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //Get the drink from the intent

//        //Set the toolbar as the activity's app bar
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        int filmId = (Integer) getIntent().getExtras().get(EXTRA_FILMID);
        System.out.println("ini id film isinya ini lo =====================  "+filmId);
        //Create a cursor
        SQLiteOpenHelper cinemaDatabaseHelper = new CinemaDatabaseHelper(this);
        try {
            SQLiteDatabase db = cinemaDatabaseHelper.getReadableDatabase();
            Cursor cursor = db.query("FILM",
                    new String[]{"NAME", "DESCRIPTION", "IMAGE_RESOURCE_ID"},
                    "_id = ?",
                    new String[]{Integer.toString(filmId)},
                    null, null, null);
            //Move to the first record in the Cursor
            //Move to the first record in the Cursor
            if (cursor.moveToFirst()) {
                //Get the drink details from the cursor
                String nameText = cursor.getString(0);
                String descriptionText = cursor.getString(1);
                int photoId = cursor.getInt(2);
//                boolean isFavorite = (cursor.getInt(3) == 1);
                //Populate the drink name
                TextView name = (TextView) findViewById(R.id.name);
                name.setText(nameText);
                //Populate the drink description
                TextView description = (TextView) findViewById(R.id.description);
                description.setText(descriptionText);

                NestedScrollView scrollView = (NestedScrollView) findViewById(R.id.nestedScrollView);
                scrollView.setFillViewport(true);

                //Populate the drink image
                ImageView photo = (ImageView) findViewById(R.id.photo);
                photo.setImageResource(photoId);
                photo.setContentDescription(nameText);
                //Populate the favorite checkbox
            }
            cursor.close();
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this,
                    "Database unavailable di detail activity",
                    Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    //Update the database when the checkbox is clicked
    public void onFavoriteClicked(View view){
        int filmId = (Integer) getIntent().getExtras().get(EXTRA_FILMID);
        //Get the value of the checkbox
//        CheckBox favorite = (CheckBox) findViewById(R.id.favorite);
        ContentValues cinemaValues = new ContentValues();
//        cinemaValues.put("FAVORITE", favorite.isChecked());
        //Get a reference to the database and update the FAVORITE column
        SQLiteOpenHelper cinemaDatabaseHelper = new CinemaDatabaseHelper(this);
        try {
            SQLiteDatabase db = cinemaDatabaseHelper.getWritableDatabase();
            db.update("FILM",
                    cinemaValues,
                    "_id = ?",
                    new String[] {Integer.toString(filmId)});
            db.close();
        } catch(SQLiteException e) {
            Toast toast = Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}
//        //Display details of the pizza
//
//
//        int pizzaId = (Integer)getIntent().getExtras().get(EXTRA_FILMID);
//        String CinemaName = Film.top[pizzaId].getName();
//        TextView textView = (TextView)findViewById(R.id.cinema_text);
//        textView.setText(CinemaName);
//        int pizzaImage = Film.top[pizzaId].getImageResourceId();
//        ImageView imageView = (ImageView)findViewById(R.id.cinema_image);
//        imageView.setImageDrawable(ContextCompat.getDrawable(this, pizzaImage));
//        imageView.setContentDescription(CinemaName);
//    }
////    private void setSupportActionBar(Toolbar toolbar) {
////    }
//}