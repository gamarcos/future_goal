package br.com.gabrielmarcos.pokemon.pokemons

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import br.com.gabrielmarcos.core.extensions.observe
import br.com.gabrielmarcos.futuregoals.GoalApplication.Companion.coreComponent
import br.com.gabrielmarcos.pokemon.R
import br.com.gabrielmarcos.pokemon.di.DaggerPokemonsComponent
import kotlinx.android.synthetic.main.fragment_features_pokedex.*
import javax.inject.Inject

class PokemonsFragment : Fragment() {

    @Inject
    lateinit var viewModel: PokemonsViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        DaggerPokemonsComponent
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

        viewModel.getPokemons()
//        viewModel.requestMethodWithDalay { viewModel.getNextPokedexes() }

        viewLifecycleOwner.observe(viewModel.loading) {
            loading.visibility = if (it) View.VISIBLE else View.GONE
        }

        viewLifecycleOwner.observe(viewModel.pokedexes) {
            Toast.makeText(context, it?.size.toString(), Toast.LENGTH_LONG).show()
        }

        viewLifecycleOwner.observe(viewModel.error) {
            Toast.makeText(context, it, Toast.LENGTH_LONG).show()
        }
    }
}
