package lab.kotolin.funwithkotolin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val intab: Int = 1
    val intc = 3
    var c: Int = 0  // Type required when no initializer is provided

    val inta: Int = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        c = 1       // definite assignment

        hello.text = "Hello Kotlin !!" + ifexpression(3, 9)

        printSum(4, 8)

        nullCheck();

        makeDate();

        try {
            questionMark("dfadefas")
            questionMark(null)

        } catch(ex: Exception) {
            Log.d("test", "bbbrtn == null")

        }
        try {
            var bbbrtn = checkClassType("dfadefas")
            Log.d("test", "bbbrtn == $bbbrtn")

            bbbrtn = checkClassType(256)
            Log.d("test", "bbbrtn == $bbbrtn")

            bbbrtn = checkClassType(null)
            Log.d("test", "bbbrtn == $bbbrtn")

        } catch(ex: Exception) {
            Log.d("test", "bbbrtn == null")

        }
    }

    /**
     *
     */
    private fun makeDate() {
    }

    private fun add(a: Int, b: Int): Int {
        return a + b
    }

    private fun add01(a: Int, b: Int) = a + b

    private fun printSum(a: Int, b: Int): Unit {
        Log.d("test", "" + a + " " + b);
        Log.d("test", "a == $a")
    }


    private fun ifexpression(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    private fun nullCheck() {
        var aaa: String = "aaa"
        var bbb: String? = null

        var bbbrtn = bbb?.length ?: -1
        Log.d("test", "bbbrtn == $bbbrtn")



        bbb = "dcde"

        bbbrtn = bbb!!.length

        Log.d("test", "bbbrtn == $bbbrtn")

    }

    private fun questionMark(stringVariable: String?) {
        var bbbrtn = stringVariable!!.length
        Log.d("test", "bbbrtn == $bbbrtn")
    }

    private fun checkClassType(obj: Any?): Int? {
        obj!!

        if (obj !is String) {
            return null
        }

        return obj?.length
    }
}
