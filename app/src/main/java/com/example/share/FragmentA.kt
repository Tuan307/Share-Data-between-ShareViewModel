package com.example.share

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider


class FragmentA : Fragment() {
    private lateinit var viewModel: ShareViewModel // khai bao
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        Log.d("KeyCheckA", "A")
        viewModel = ViewModelProvider(requireActivity())[ShareViewModel::class.java]
        val edit: EditText = view.findViewById(R.id.edit_text)
        val buttonOk: Button = view.findViewById(R.id.button_ok)
        buttonOk.setOnClickListener {
            viewModel.setInputText(edit.text.toString())
            Log.d("CheckKeyA", edit.text.toString())
        }

        return view
    }

}