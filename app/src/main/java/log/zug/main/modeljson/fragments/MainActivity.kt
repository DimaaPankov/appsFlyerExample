package log.zug.main.modeljson.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import log.zug.main.R
import log.zug.main.databinding.ActivityMainBinding
import log.zug.main.modeljson.const.MAIN

class MainActivity : AppCompatActivity() {
    var goBack = { }
    lateinit var huercvy: ActivityMainBinding
    lateinit var deuhwe: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        huercvy = ActivityMainBinding.inflate(layoutInflater)
        setContentView(huercvy.root)
        MAIN = this
        deuhwe = Navigation.findNavController(this, R.id.nav_host_fragment)

    }

    override fun onBackPressed() {
        goBack()
    }
}