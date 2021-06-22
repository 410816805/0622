package tw.edu.pu.csim.tcyang.testdrag

import android.graphics.Rect
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var img:ImageView
    lateinit var a:ImageView


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

        a = findViewById(R.id.a)
        a.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(p0: View?, motionEvent: MotionEvent?): Boolean {
                if (motionEvent?.action == MotionEvent.ACTION_MOVE) {
                    a.y = motionEvent.rawY-a.height
                    a.x = motionEvent.rawX-a.width/2
                }

                return true
            }
        })
    }

    fun CollisionTest(a: Rect, a1: Rect?): Boolean? {
        if (a.intersect(a1!!)) {
            a.visibility = View.GONE
        }
        else {

        }
        return true
    }

}