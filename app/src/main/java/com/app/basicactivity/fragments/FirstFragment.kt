package com.app.basicactivity.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.util.Log
import androidx.navigation.fragment.findNavController
import com.app.basicactivity.R

class FirstFragment : Fragment() {
    private val simpleTag = this::class.java.simpleName

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(simpleTag, getString(R.string.first_fragment_loaded))
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            Log.d(simpleTag, getString(R.string.next_button_label))
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }
}
