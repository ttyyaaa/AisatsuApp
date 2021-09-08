package jp.techacademy.touya.kobayashi.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.TimePickerDialog
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button1 -> showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener{ view, hour, minute ->
                    var msg ="こんばんは"
                    if (hour in 2..9) {
                        msg = "おはよう"
                    } else if (hour in 10..17) {
                        msg = "こんにちは"
                    }
                    textView.text = msg
                },
                12, 0, true)
        timePickerDialog.show()
    }
}