import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.Tugas3.R

class Adapter(private val namaList: ArrayList<ItemData>): RecyclerView.Adapter<Adapter.ViewHolder>() {
    private lateinit var mListener: onItemClickListener

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener = listener
    }

    class ViewHolder(itemData: View, listener: Adapter.onItemClickListener) :
        RecyclerView.ViewHolder(itemData) {
        val gambar: ImageView = itemData.findViewById(R.id.id_gambar)
        val nama: TextView = itemData.findViewById(R.id.id_nama)
        val asal: TextView = itemData.findViewById(R.id.id_asal)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemData = LayoutInflater.from(parent.context).inflate(R.layout.item_image,parent,false)
        return ViewHolder(itemData, mListener)
    }

    override fun getItemCount(): Int = namaList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = namaList[position]
        holder.gambar.setImageResource(currentItem.gambar)
        holder.nama.text = currentItem.nama
        holder.asal.text = currentItem.asal
    }
}