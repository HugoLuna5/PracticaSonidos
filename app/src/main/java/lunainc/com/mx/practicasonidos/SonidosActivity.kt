package lunainc.com.mx.practicasonidos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SonidosActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonidos)

        val categoria = intent.getStringExtra("categoria")
        requireNotNull(categoria) { "no user_id provided in Intent extras" }

        this.setTitle(categoria)

    }
}
