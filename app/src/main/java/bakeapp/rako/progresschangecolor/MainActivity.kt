package bakeapp.rako.progresschangecolor

import android.app.ActionBar
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*
import android.util.TypedValue
import android.widget.LinearLayout


class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {
    override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
        num.text = p1.toString()
        var largura : Int = view.width*p1/100

        var v: View = View(this)
        v.layoutParams = LinearLayout.LayoutParams(largura, view.height)

        if (p1 > 50) {
            v.setBackgroundColor(Color.rgb(255,((50-p1)*5.1).toInt(),0))
        } else {
            v.setBackgroundColor(Color.rgb((p1*5.1).toInt(),255,0))
        }

        calc.text = largura.toString()
        view.addView(v)

    }

    override fun onStartTrackingTouch(p0: SeekBar?) {
        Log.i("","")
    }

    override fun onStopTrackingTouch(p0: SeekBar?) {
        Log.i("","")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num.text = "0"
        seek.setOnSeekBarChangeListener(this)
    }

}
