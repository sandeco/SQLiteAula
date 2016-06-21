package sandeco.sqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MostrarPessoaActivity extends AppCompatActivity {

    private DataBaseHelper helper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_pessoa);


        DataBaseHelper helper = new DataBaseHelper(this);
        SQLiteDatabase db = helper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * from Pessoa",null);

        cursor.moveToFirst();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        for(int i =0; i< cursor.getCount();i++) {
            Pessoa pessoa = new Pessoa();

            int id = cursor.getInt(cursor.getColumnIndex("_id"));
            pessoa.setId(id);

            String nome = cursor.getString(cursor.getColumnIndex("nome"));
            pessoa.setNome(nome);

            pessoas.add(pessoa);

            cursor.moveToNext();
        }

        cursor.close();
    }
}
