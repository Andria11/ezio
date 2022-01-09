package com.example.ezio

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class firstfragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val kalmistari = view.findViewById<Button>(R.id.button1)
        val amountEditText = view.findViewById<EditText>(R.id.editTextNumber)


        val controller = Navigation.findNavController(view)


        kalmistari.setOnClickListener {

            val amount = amountEditText.text.toString()

            if (amount.isEmpty()) {
                return@setOnClickListener
            }

            val amount1 = amount.toInt()

            val action = firstfragmentDirections.actionLiverpoolToScouser(amount1)

            controller.navigate(action)
        }


    }


}