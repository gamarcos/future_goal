package br.com.gabrielmarcos.pokedex.pokedexes

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import br.com.gabrielmarcos.futuregoals.GoalApplication.Companion.coreComponent
import br.com.gabrielmarcos.pokedex.R
import br.com.gabrielmarcos.pokedex.di.DaggerPokedexComponent
import kotlinx.android.synthetic.main.fragment_features_pokedex.*
import javax.inject.Inject

class PokedexesFragment : Fragment() {

    @Inject
    lateinit var viewModel: PokedexesViewModel

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
        viewModel.getPokedexes()
        viewModel.getNextPokedexes()

        viewModel.loading.observe(viewLifecycleOwner, Observer {
            loading.visibility = if (it) View.VISIBLE else View.GONE
        })

        viewModel.pokedexes.observe(viewLifecycleOwner, Observer {
            Toast.makeText(context, it?.size.toString(), Toast.LENGTH_LONG).show()
        })

        viewModel.error.observe(viewLifecycleOwner, Observer {
            Toast.makeText(context, it, Toast.LENGTH_LONG).show()
        })
    }
}
