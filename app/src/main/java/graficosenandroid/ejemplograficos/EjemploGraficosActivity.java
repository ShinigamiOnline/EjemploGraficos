package graficosenandroid.ejemplograficos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EjemploGraficosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Ejemploview(this));
    }
    public class Ejemploview extends View {
        public Ejemploview(Context context){
            super(context);
        }
        @Override
        protected  void onDraw(Canvas canvas){
            //dibujar aquí

            Paint pincel = new Paint();
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(8);
            pincel.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(150,150,100,pincel);

            Paint pincel2 = new Paint();
            pincel2.setColor(Color.BLACK);
            pincel2.setStrokeWidth(8);
            pincel2.setStyle(Paint.Style.FILL_AND_STROKE);
            canvas.drawCircle(300,300,100,pincel2);

        }
    }
}
