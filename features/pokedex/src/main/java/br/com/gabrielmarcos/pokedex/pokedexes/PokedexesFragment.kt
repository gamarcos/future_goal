package br.com.gabrielmarcos.pokedex.pokedexes

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import br.com.gabrielmarcos.futuregoals.GoalApplication.Companion.coreComponent
import br.com.gabrielmarcos.pokedex.R
import br.com.gabrielmarcos.pokedex.di.DaggerPokedexComponent
import br.com.gabrielmarcos.pokedex.pokedexes.domain.GetNextPokedexes
import br.com.gabrielmarcos.pokedex.pokedexes.domain.GetPokedexes
import br.com.gabrielmarcos.pokedex.pokedexes.domain.model.Pokedexes
import javax.inject.Inject

class PokedexesFragment : Fragment() {

    @Inject
    lateinit var pokedexes: MutableLiveData<Pokedexes>

    @Inject
    lateinit var getPokedexes: GetPokedexes

    @Inject
    lateinit var getNextPokedexes: GetNextPokedexes

    override fun onAttach(context: Context) {
        super.onAttach(context)
        DaggerPokedexComponent
            .builder()
            .coreComponent(coreComponent(requireContext()))
            .build()
            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(
        R.layout.fragment_features_pokedex,
        container,
        false
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getPokedexes("")

        Handler().postDelayed({
            getNextPokedexes("")
        }, 3000)

        Handler().postDelayed({
            getNextPokedexes("")
        }, 6000)

        pokedexes.observe(viewLifecycleOwner, Observer {
            println("TESTE_POKEDEX: pokedexes $it")
        })
    }
}
