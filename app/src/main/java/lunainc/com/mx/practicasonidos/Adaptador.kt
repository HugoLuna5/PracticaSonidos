package lunainc.com.mx.practicasonidos

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class Adaptador(private val context: MainActivity, private val listaSonidos: ArrayList<String>) :

    RecyclerView.Adapter<Adaptador.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))
    }



    override fun getItemCount(): Int {
        return listaSonidos.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.chapterName?.text = listaSonidos.get(position)

        holder.itemView.setOnClickListener {
            Toast.makeText(context, listaSonidos.get(position), Toast.LENGTH_LONG).show()

            val intent = Intent(context, SonidosActivity::class.java)
            intent.putExtra("categoria", listaSonidos.get(position))
            context.startActivity(intent)
        }
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val chapterName = view.titulo
    }
}