package com.example.share

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class FragmentB : Fragment() {
    private lateinit var viewModel: ShareViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        viewModel = ViewModelProvider(requireActivity())[ShareViewModel::class.java]
        val edit: EditText = view.findViewById(R.id.edit_text1)

        viewModel.text.observe(viewLifecycleOwner, Observer {
            edit.setText(it)
            Toast.makeText(activity, it, Toast.LENGTH_SHORT).show()
        })
        return view
    }


}