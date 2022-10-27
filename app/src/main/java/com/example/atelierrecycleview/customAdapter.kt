package com.example.atelierrecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

internal class customAdapter(private var data:List <String>) : RecyclerView.Adapter<customAdapter.MyViewHolder>(){
    //on doit specifier le holder classe personnalisé
    //():constructeur primaire de la classe va implemneter de la superclasse
    //view holder gere une ligne =<on doit affecter une viewholder
    //MyViewHolder classe interne dans le adapter
    //view holder a un constructor primare

   internal inner class MyViewHolder (view: View) :RecyclerView.ViewHolder(view) {
    //view holder  de la clsse recycle view a  un constructeur primaire oon doit le passer un parametre(view)
   // pour la super classe
       var item:TextView =view.findViewById(R.id.itemText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //recuperer le ojet pour gerer le holder
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.ligne,parent,false)
        //on doit creer le holder
        return MyViewHolder(itemView) // le holder va gerer la ligne
        //inflate tj dans la creation de fichier xml et je le utilise pour crer lobjet
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // pour refresh /scroll
        // on va changer le constructeur de la classe interne pour charger les donnees
        val item =data[position]
        holder.item.text=item

    }

    override fun getItemCount(): Int {
        return data.size
    }



}


