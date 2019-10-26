package Adaptadores;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alexd.segundoparcial.R;

public class vhContactos extends RecyclerView.ViewHolder {
    private ImageView imgUser;
    private TextView txtNom;
    private TextView txtApe;
    private TextView txtTel1;
    private TextView txtTel2;

    public vhContactos(@NonNull View itemView) {
        super(itemView);

        this.imgUser = itemView.findViewById(R.id.imgUsu);
        this.txtNom = itemView.findViewById(R.id.lblNombre);
        this.txtApe = itemView.findViewById(R.id.lblApellido);
        this.txtTel1 = itemView.findViewById(R.id.lblTel1);
        this.txtTel2 = itemView.findViewById(R.id.lblTel2);
    }

    public ImageView getImgUser() {
        return imgUser;
    }

    public TextView getTxtNombre() {
        return txtNom;
    }

    public TextView getTxtApellido() {
        return txtApe;
    }

    public TextView getTxtTel1() {
        return txtTel1;
    }

    public TextView getTxtTel2() {
        return txtTel2;
    }

}
