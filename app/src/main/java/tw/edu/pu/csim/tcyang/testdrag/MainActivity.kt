package tw.edu.pu.csim.tcyang.testdrag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var img:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hide the action bar
        val actionBar = supportActionBar
        actionBar!!.hide()

        img = findViewById(R.id.img)
        img.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    img.y = motionEvent.rawY-img.height
                    img.x = motionEvent.rawX-img.width/2
                }
                return true
            }
        })
    }
}