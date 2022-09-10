package curso.clases.recyclerview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import curso.clases.recyclerview.Models.Persona;
import curso.clases.recyclerview.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<Persona> lPersona;
    private LayoutInflater mInflater;
    private Context context;

    public RecyclerViewAdapter(List<Persona> lPersona, LayoutInflater mInflater, Context context) {
        this.lPersona = lPersona;
        this.mInflater = mInflater;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.recycler_view,parent,false);
        return new RecyclerViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(lPersona.get(position));
    }

    @Override
    public int getItemCount() {
        return lPersona.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView nombre,direccion,color;
        public ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.imageView);
            nombre = view.findViewById(R.id.textNombre);
            direccion = view.findViewById(R.id.textDireccion);
            color = view.findViewById(R.id.textColor);
        }
        void bindData(final Persona persona){
            nombre.setText(persona.getNombre());
            direccion.setText(persona.getDireccion());
            color.setText(persona.getColor());
            Picasso.get()
                    .load(persona.getImagen())
                    //.fit()
                    .resize(50, 50)
                    .centerCrop()
                    //.placeholder(R.drawable.ic_launcher_background)
                    //.error(R.drawable.ic_launcher_background)
                    .into(imageView);
        }
    }
}
