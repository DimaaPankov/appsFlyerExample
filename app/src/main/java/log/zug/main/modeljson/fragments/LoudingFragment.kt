package log.zug.main.modeljson.fragments

import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example2.testproject.model.dataImpl.Repository
import com.example2.testproject.model.models.JsonData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import log.zug.main.databinding.FragmentLoudingBinding


class LoudingFragment : Fragment() {


    val jdghjdg by lazy { FragmentLoudingBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Handler().postDelayed({
            getConfig()
        },2000L)


        return jdghjdg.root
    }

    private fun getConfig() {

        CoroutineScope(Dispatchers.IO).launch {
            var JsonResult = "black"// settingsAPI("yzby7zvd5swwhm4fzrbvl93fsbm1sbk7").body
            Log.d("aaaa", JsonResult)
            withContext(Dispatchers.Main) {
                if (JsonResult == "white") {
                    findNavController().navigate(
                        LoudingFragmentDirections.actionLoudingFragmentToZugFragment())


                } else if (JsonResult == "black") {
                    findNavController().navigate(
                        LoudingFragmentDirections.actionLoudingFragmentToBlackFragment())


                } else {
                    findNavController().navigate(
                        LoudingFragmentDirections.actionLoudingFragmentToZugFragment())
                }
            }



        }
    }
    private suspend fun settingsAPI(str: String): JsonData {
        val result = Repository.getData(str)
        Log.d("llllll", result!!.body)
        return result
    }

}