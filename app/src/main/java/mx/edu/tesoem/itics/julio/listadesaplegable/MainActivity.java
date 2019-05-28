    package mx.edu.tesoem.itics.julio.listadesaplegable;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.widget.EditText;
    import android.widget.Spinner;
    import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
        EditText txtnum1,txtnum2;
        TextView lblresultado;
        Spinner spoperacion;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            txtnum1 = (EditText) findViewById(R.id.txtnumero1);
            txtnum2 = (EditText) findViewById(R.id.txtnumero2);    }
                                }
