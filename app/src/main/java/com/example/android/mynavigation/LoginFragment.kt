package com.example.android.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.android.mynavigation.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentLoginBinding =
            DataBindingUtil.inflate(inflater,R.layout.fragment_login, container, false)

        binding.btnComfirm.setOnClickListener {
            val username = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()
            val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username, password)
            findNavController().navigate(action)
        }
        return binding.root
    }



}