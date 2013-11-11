package maria.com;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class FrasesSQLHelper extends SQLiteOpenHelper {


	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "frasesDB";
	private static final String KEY_PHRASE = "frase";
	private static final String KEY_CAT = "categoria";
	private static final String KEY_RW = "rw";

	public FrasesSQLHelper (Context context) {
		super (context, DATABASE_NAME, null, DATABASE_VERSION);
	}


	//Creando tabla

	@Override
	public void onCreate(SQLiteDatabase db) {
		String CREATE_TABLE = "CREATE TABLE " + DATABASE_NAME + " (" + 
				KEY_CAT + " INTEGER, " + KEY_PHRASE + " TEXT, " + KEY_RW + " INTEGER)";
		db.execSQL(CREATE_TABLE);

	}

	public List<String> getAllPhrases() {
		List<String> phraseList = new ArrayList<String>();
		HashSet<String> hs = new HashSet<String>(); //hashSet no admite info duplicada

		String selectQuery = "SELECT " + KEY_PHRASE + " FROM " + DATABASE_NAME;
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);

		if (cursor.moveToFirst()) {
			do {
				phraseList.add(cursor.getString(0));
			} while (cursor.moveToNext());
		}

		hs.addAll(phraseList);
		phraseList.clear();
		phraseList.addAll(hs);
		return phraseList;
	}
	
	//Devuelve un Cursor con todos los datos en la db
	public Cursor getAllData() {
		String selectQuery = "SELECT " + KEY_CAT + ", " + KEY_PHRASE + ", " + KEY_RW + " FROM " + DATABASE_NAME;
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);
		if (cursor.moveToFirst()) {
			do {
			} while (cursor.moveToNext());
		}
		return cursor;
	}

	public void addPhrase(String frase, int category, int readwrite) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_PHRASE, frase);
		values.put(KEY_CAT, category);
		values.put(KEY_RW, readwrite);

		// Inserting Row
		db.insert(DATABASE_NAME, null, values);
		db.close(); // Closing database connection
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

	}

}