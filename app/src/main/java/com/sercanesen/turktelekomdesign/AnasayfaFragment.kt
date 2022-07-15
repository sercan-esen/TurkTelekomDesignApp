package com.sercanesen.turktelekomdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.sercanesen.turktelekomdesign.databinding.FragmentAnasayfaBinding



class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.rv.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        val adapter = getHikayeler()
        binding.rv.adapter=adapter



        return binding.root
    }

    private fun getHikayeler(): HikayelerAdapter {
        val hikayelerListesi = ArrayList<Hikayeler>()
        val h1 = Hikayeler(1, "selfy", "Selfy")
        val h2 = Hikayeler(2, "online_islemler", "Online İşlemler")
        val h3 = Hikayeler(3, "ilk_ay_bedava", "İlk Ay Bedava")
        val h4 = Hikayeler(4, "gameon", "Game ON 2022")
        val h5 = Hikayeler(5, "tivibu_firsat", "Tivibu Fırsat")
        val h6 = Hikayeler(6, "tt_wifi", "Türk Telekom Wifi")
        val h7 = Hikayeler(7, "tecno_smartphone", "Tecno Smartphone")
        hikayelerListesi.add(h1)
        hikayelerListesi.add(h2)
        hikayelerListesi.add(h3)
        hikayelerListesi.add(h4)
        hikayelerListesi.add(h5)
        hikayelerListesi.add(h6)
        hikayelerListesi.add(h7)
        return HikayelerAdapter(requireContext(), hikayelerListesi)
    }


}
