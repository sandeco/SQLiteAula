package sandeco.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sandeco on 19/06/16.
 */
public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String BANCO_DADOS = "meubanco";
    private static final int VERSAO = 1;


    public DataBaseHelper(Context context) {
        super(context, BANCO_DADOS, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String ddl = "CREATE TABLE pessoa("+
                                          "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                                          " nome TEXT not null)";
        db.execSQL(ddl);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
