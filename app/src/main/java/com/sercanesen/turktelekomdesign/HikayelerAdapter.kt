package com.sercanesen.turktelekomdesign

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sercanesen.turktelekomdesign.databinding.HikayeCardTasarimBinding


class HikayelerAdapter(var mContext: Context, var hikayelerListesi: List<Hikayeler>) :
    RecyclerView.Adapter<HikayelerAdapter.HikayeCardTasarimTutucu>() {

    inner class HikayeCardTasarimTutucu(binding: HikayeCardTasarimBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var binding: HikayeCardTasarimBinding

        init {
            this.binding = binding
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HikayeCardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = HikayeCardTasarimBinding.inflate(layoutInflater, parent, false)
        return HikayeCardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: HikayeCardTasarimTutucu, position: Int) {
        val hikaye = hikayelerListesi.get(position)
        val t = holder.binding
        t.storyImage.setImageResource(
            mContext.resources.getIdentifier(hikaye.hikayeResimAdi,"drawable",mContext.packageName)
        )
        t.storyText.text=hikaye.hikayeAdi


    }

    override fun getItemCount(): Int {
        return hikayelerListesi.size
    }
}