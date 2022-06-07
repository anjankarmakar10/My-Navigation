package com.example.android.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.android.mynavigation.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {

    private val args: WelcomeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentWelcomeBinding =
            DataBindingUtil.inflate(inflater,R.layout.fragment_welcome, container, false)

        val username = args.username
        val password = args.password

        binding.tvUsername.text = username
        binding.tvPassword.text = password

        binding.btnOk.setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
            findNavController().navigate(action)
        }

        return binding.root
    }

}