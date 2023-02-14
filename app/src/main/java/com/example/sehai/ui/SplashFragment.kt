package com.example.sehai.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation
import com.example.sehai.R
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_splash.*

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        return view
    }
    private fun moveToSignUpFragment(){
        Navigation.findNavController(requireView()).navigate(R.id.action_splashFragment_to_signUpFragment)
    }
    private fun moveToSignInFragment(){
        Navigation.findNavController(requireView()).navigate(R.id.action_splashFragment_to_signInFragment)
    }
}