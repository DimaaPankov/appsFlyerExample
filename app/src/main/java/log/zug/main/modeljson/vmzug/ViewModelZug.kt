package log.zug.main.modeljson.vmzug

import androidx.lifecycle.ViewModel
import log.zug.main.R
import log.zug.main.modeljson.const.DataQestion



class ViewModelZug(): ViewModel() {
    var efjdhfh  = 0
    val mainDataList = listOf(
        DataQestion(
            R.string.button_1_1,
            R.string.button_1_2,
            R.string.button_1_3,
            R.string.button_1_4,
            R.string.qestion_1,
            true,
            false,
            false,
            false),
        DataQestion( R.string.button_2_1,
            R.string.button_2_2,
            R.string.button_2_3,
            R.string.button_2_4,
            R.string.qestion_2,
            false,
            true,
            false,
            false),
        DataQestion(
            R.string.button_3_1,
            R.string.button_3_2,
            R.string.button_3_3,
            R.string.button_3_4,
            R.string.qestion_3,
            false,
            false,
            true,
            false),
        DataQestion(
            R.string.button_4_1,
            R.string.button_4_2,
            R.string.button_4_3,
            R.string.button_4_4,
            R.string.qestion_4,
            false,
            false,
            false,
            true),

        DataQestion(
            R.string.button_5_1,
            R.string.button_5_2,
            R.string.button_5_3,
            R.string.button_5_4,
            R.string.qestion_5,
            true,
            false,
            false,
            false),
        DataQestion(
            R.string.button_5_1,
            R.string.button_5_2,
            R.string.button_5_3,
            R.string.button_5_4,
            R.string.qestion_5,
            true,
            false,
            false,
            false)
        )

    fun wrjeguherghijj(): DataQestion {
        return mainDataList[efjdhfh]

    }
    fun kgoijkjjjkjk(){
        if(efjdhfh<mainDataList.size){
            ++efjdhfh
        }else{
            efjdhfh = 0
        }
    }
    fun hrvfgureghvkkk1() = if(efjdhfh!=0)mainDataList[efjdhfh].answer1 else mainDataList[efjdhfh].answer1
    fun hrvfgureghvkkk2() = if(efjdhfh!=0)mainDataList[efjdhfh].answer2 else mainDataList[efjdhfh].answer2
    fun hrvfgureghvkkk3() = if(efjdhfh!=0)mainDataList[efjdhfh].answer3 else mainDataList[efjdhfh].answer3
    fun hrvfgureghvkkk4() = if(efjdhfh!=0)mainDataList[efjdhfh].answer4 else mainDataList[efjdhfh].answer4
}



