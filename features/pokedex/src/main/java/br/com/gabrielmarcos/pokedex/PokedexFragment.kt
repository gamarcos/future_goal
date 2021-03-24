package br.com.gabrielmarcos.pokedex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import br.com.gabrielmarcos.core.usecase.TestUse

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

        val useCase = TestUse(test)

        useCase("Hello, ")

        test.observe(viewLifecycleOwner, Observer {
            println("TESTE_POKEDEX $it")
        })
    }
}