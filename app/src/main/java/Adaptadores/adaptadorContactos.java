package Adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alexd.segundoparcial.R;

import java.util.List;

public class adaptadorContactos extends RecyclerView.Adapter<vhContactos> {

    private List<Contactos> listContactos;

    public adaptadorContactos(List<Contactos> datasources){
        this.listContactos = datasources;
    }

    public vhContactos onCreateViewHolder(ViewGroup parent, int viewType){
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.plantilla_contactos, parent, false);
        vhContactos vhC= new vhContactos(v);
        return vhC;
    }

    @Override
    public void onBindViewHolder(@NonNull vhContactos holder, int position) {
        holder.getTxtNombre().setText(this.listContactos.get(position).getNombre());
        holder.getTxtApellido().setText(this.listContactos.get(position).getApelldo());
        holder.getTxtTel1().setText(this.listContactos.get(position).getTel1());
        holder.getTxtTel2().setText(this.listContactos.get(position).getTel2());
    }

    public int getItemCount() {
        return this.listContactos.size();
    }

}