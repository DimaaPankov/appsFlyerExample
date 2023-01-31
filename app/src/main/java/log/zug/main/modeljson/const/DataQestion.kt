package log.zug.main.modeljson.const

import androidx.annotation.StringRes

 data class DataQestion (@StringRes val textResID1:Int,
                         @StringRes val textResID2:Int,
                         @StringRes val textResId3:Int,
                         @StringRes val textResId4:Int,
                         @StringRes val textQestion :Int,
                         val answer1: Boolean,
                         val answer2: Boolean,
                         val answer3: Boolean,
                         val answer4: Boolean)