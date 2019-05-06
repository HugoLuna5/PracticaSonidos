package lunainc.com.mx.practicasonidos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val listaSonidos: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listaSonidos.add("Animales Salvajes")
        listaSonidos.add("Instrumentos")
        listaSonidos.add("Naturaleza")
        listaSonidos.add("Animales Caseros")


        var layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = Adaptador(this, listaSonidos)
    }
}
