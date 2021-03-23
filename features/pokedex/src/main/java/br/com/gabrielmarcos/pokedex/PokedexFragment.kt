package br.com.gabrielmarcos.pokedex

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.observe
import br.com.gabrielmarcos.core.usecase.TestUse
import kotlinx.coroutines.GlobalScope

class PokedexFragment : Fragment() {

    val test: MutableLiveData<String> = MutableLiveData()

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

        val useCase = TestUse(
            test,
            GlobalScope
        )

        useCase("Hello, ")

        test.observe(viewLifecycleOwner, Observer {
            println("TESTE_POKEDEX $it")
        })
    }
}