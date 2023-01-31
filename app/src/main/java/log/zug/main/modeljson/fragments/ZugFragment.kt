package log.zug.main.modeljson.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import log.zug.main.R
import log.zug.main.databinding.FragmentZugBinding
import log.zug.main.modeljson.const.StateAdapter
import log.zug.main.modeljson.const.courseValute



    class FragmentZug : Fragment() {
        val binding by lazy{
            FragmentZugBinding.inflate(layoutInflater)
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setView()
        }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            //setView()
            return binding.root
        }

        fun setView() {
            val adapter =
                StateAdapter(requireContext(), arrayListOf(
                    courseValute( "AUD","111.6500"),
                    courseValute("AZN","142.2332"),
                    courseValute("GBP","4961.000"),
                    courseValute( "AMD","108.0400"),
                    courseValute( "BYN","1.8100"),
                    courseValute("BGN","89.7800"),
                    courseValute("BRL","1.0000"),
                    courseValute("HUF","86.1450"),
                    courseValute("HKD","2.0191"),
                    courseValute("DKK","0.3770"),
                    courseValute("USD","1"),
                    courseValute("EUR","2.0157"),
                    courseValute("INR","1.0000"),
                    courseValute("KZT","6.8750"),
                    courseValute("CAD","0.0860"),
                    courseValute("KGS","1.3594"),
                    courseValute("CNY","1999.5000"),
                    courseValute("MDL","76.0005"),
                    courseValute("NOK","112.6250"),
                    courseValute("PLN","4.3629"),
                    courseValute("RON","2.7100"),
                    courseValute( "XDR","22840.0000"),
                    courseValute( "TJS","105.5000"),
                    courseValute("TRY","209.2150"),
                    courseValute("TMT","53.3750"),
                    courseValute("UZS","6.9750"),
                    courseValute( "UAH","7.7100"),
                    courseValute( "CZK","8973.5000"),
                    courseValute( "SEK","1.3334"),
                    courseValute( "CHF","24.6234"),
                    courseValute( "ZAR","3.2500"),
                    courseValute( "KRW","55.9400"),
                    courseValute( "JPY","3.6730"))

                ) { c: courseValute ->

                    val discription = FragmentZugDirections.actionZugFragmentToColculutorFragment(c.name,c.cource)

                    findNavController().navigate(discription)
                }

            binding.recyclerView.setAdapter(adapter)
            binding. recyclerView.setLayoutManager(
                LinearLayoutManager(
                    requireContext(),
                    RecyclerView.VERTICAL,
                    false
                )
            )
        }
    }