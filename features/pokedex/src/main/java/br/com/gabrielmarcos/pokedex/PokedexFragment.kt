package br.com.gabrielmarcos.pokedex

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

class PokedexFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(
        R.layout.fragment_features_pokedex,
        container,
        false
    )
}