package log.zug.main.modeljson.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import log.zug.main.R
import log.zug.main.databinding.FragmentColculutorBinding
import log.zug.main.modeljson.const.MAIN


class ColculutorFragment : Fragment() {
     val binding : FragmentColculutorBinding by lazy {
         FragmentColculutorBinding.inflate(layoutInflater)
     }
    private val aargs: ColculutorFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setClick()
        MAIN.goBack = {
            findNavController().navigate(R.id.action_colculutorFragment_to_zugFragment)
        }
        return binding.root
    }


    fun setClick(){

         //   var intent: Intent? = null
               // intent = getIntent()
               // nameValute = findViewById(R.id.nameValute)
               // nameValute.setText(intent.getStringExtra("name"))
                binding.ButtonClear.setOnClickListener {
                   binding.Input.setText("")
                    binding.Output.setText("")
                }
        binding.Button0.setOnClickListener{ binding.Input.setText(addToInputText("0")) }
        binding.Button1.setOnClickListener{ binding.Input.setText(addToInputText("1")) }
        binding.Button2.setOnClickListener{ binding.Input.setText(addToInputText("2")) }
        binding.Button3.setOnClickListener{ binding.Input.setText(addToInputText("3")) }
        binding.Button4.setOnClickListener{ binding.Input.setText(addToInputText("4")) }
        binding.Button5.setOnClickListener{ binding.Input.setText(addToInputText("5")) }
        binding.Button6.setOnClickListener{ binding.Input.setText(addToInputText("6")) }
        binding.Button7.setOnClickListener{ binding.Input.setText(addToInputText("7")) }
        binding.Button8.setOnClickListener{ binding.Input.setText(addToInputText("8")) }
        binding.Button9.setOnClickListener{ binding.Input.setText(addToInputText("9")) }
        binding.ButtonDot.setOnClickListener{ binding.Input.setText(addToInputText(".")) }
        binding.nameValute.setText(aargs.title)
        binding.ButtonEquals.setOnClickListener {

            val inputValue: Double = java.lang.Double.valueOf(binding.Input.getText().toString())
            val result: Double = inputValue * java.lang.Double.valueOf(aargs.cource)
           binding.Output.setText(String.format("%.2f", result))

        }
            }

            private fun addToInputText(buttonValue: String): String {
                return binding.Input!!.text.toString() + buttonValue
            }


}