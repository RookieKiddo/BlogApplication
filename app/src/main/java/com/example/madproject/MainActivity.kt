package com.example.madproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.madproject.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())

        binding.bottomNavView.setOnItemSelectedListener {

            when(it.itemId)
            {
                R.id.home -> replaceFragment(Home())
                R.id.search -> replaceFragment(Search())
                R.id.profile -> replaceFragment(Profile())
                R.id.settings -> replaceFragment(Settings())


                else ->
                {

                }

            }
            true
        }

    }
        private fun replaceFragment(fragment: Fragment)
        {
            val fragmentManager = supportFragmentManager
            val fragmentTransition = fragmentManager.beginTransaction()
            fragmentTransition.replace(R.id.layout, fragment)
            findViewById<BottomNavigationView>(R.id.bottomNavView).background = null
            fragmentTransition.commit()

        }



//        findViewById<BottomNavigationView>(R.id.bottomNavView) as BottomNavigationView
//        findViewById<BottomNavigationView>(R.id.bottomNavView).background = null
//        findViewById<BottomNavigationView>(R.id.bottomNavView).menu.getItem(2).isEnabled = false
//    }

}