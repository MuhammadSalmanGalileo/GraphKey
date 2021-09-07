package com.example.graphkey

import android.inputmethodservice.InputMethodService
import android.util.Log
import android.view.View
import android.view.inputmethod.InputConnection
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MyInputMethodService: InputMethodService() {

    override fun onCreateInputView(): View {
        return layoutInflater.inflate(R.layout.keyboard_view, null).also{
            var button: Button = it.findViewById(R.id.testButton)
            button.setOnClickListener {
                currentInputConnection.also { ic: InputConnection ->
                    ic.commitText("Hello World", 1)
                }
                Log.d("test", "Button clicked");
            }
        }
    }
}