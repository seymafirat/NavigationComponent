package com.example.mediumnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second,container,false)
        val buttonSecond : Button = view.findViewById(R.id.buttonSecond)
        val textView : TextView = view.findViewById(R.id.text_second)
        arguments?.let{
            val username = SecondFragmentArgs.fromBundle(it).username
            textView.text = username
        }
        buttonSecond.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            findNavController().navigate(action)
        }
        return view
    }
}