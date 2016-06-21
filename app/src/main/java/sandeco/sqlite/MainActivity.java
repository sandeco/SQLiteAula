package sandeco.sqlite;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private DataBaseHelper helper;
    private EditText etNome;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new DataBaseHelper(this);
        etNome = (EditText)findViewById(R.id.nome);

    }




    public void salvarPessoa(View v){

        SQLiteDatabase db = helper.getWritableDatabase();

        String nome = this.etNome.getText().toString();


        ContentValues values = new ContentValues();
        values.put("nome",nome);

        long id = db.insert("pessoa",null,values);


        if(id != -1 ){
            Toast.makeText(this,"Pessoal salva com sucesso",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Erro na gravação", Toast.LENGTH_SHORT).show();
        }

        db.close();
        /*
        Intent intent = new Intent(this, MostrarPessoaActivity.class);
        startActivity(intent);
        */
    }

}
