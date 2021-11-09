package com.example.mediumnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first,container,false)
        val buttonFirst : Button = view.findViewById(R.id.button)
        buttonFirst.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("seymafirat")
            findNavController().navigate(action)
        }
        return view
    }
}