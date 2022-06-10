package com.example.myapplication


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.coroutines.EmptyCoroutineContext.plus


class MainActivity : AppCompatActivity() {
    var tv: TextView? = null
    var buttonYek: Button? = null
    var buttonDoo: Button? = null
    var buttonSe: Button? = null
    var buttonChahar: Button? = null
    var buttonPanj: Button? = null
    var buttonShesh: Button? = null
    var buttonHaft: Button? = null
    var buttonHasht: Button? = null
    var buttonNoh: Button? = null
    var buttonSefr: Button? = null

    var buttonPlus: Button? = null
    var buttonResult: Button? = null
    var buttonMinus: Button? = null

    var total: Long = 0
    var opt = '#'
    var showResult = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.tvResult)
        buttonYek = findViewById(R.id.yek)
        buttonDoo = findViewById(R.id.doo)
        buttonSe = findViewById(R.id.se)
        buttonChahar = findViewById(R.id.chahar)
        buttonPanj = findViewById(R.id.panj)
        buttonShesh = findViewById(R.id.shesh)
        buttonHaft = findViewById(R.id.haft)
        buttonHasht = findViewById(R.id.hasht)
        buttonNoh = findViewById(R.id.noh)
        buttonSefr = findViewById(R.id.sefr)

        buttonResult = findViewById(R.id.result)
        buttonPlus = findViewById(R.id.plus)
        buttonMinus = findViewById(R.id.minus)

        with(buttonDoo) {
            this?.setOnClickListener {
                var txt = tv!!.text.toString()
                val temp = txt.substring(7)
                val l = temp.toLong()
                if (l == 0L) {
                    txt = "2"
                } else if (showResult == true) {
                    txt = "2"
                    showResult = false
                    opt = '#'
                } else txt = temp + "2"
                val s = "نتیجه: "
                tv!!.text = s + txt
            }
        }


    }

    fun clickYek(v: View?) {
        var txt = tv!!.text.toString()
        val temp = txt.substring(7)
        val l = temp.toLong()
        if (l == 0L) {
            txt = "1"
        } else if (showResult == true) {
            txt = "1"
            showResult = false
            opt = '#'
        } else txt = temp + "1"
        val s = "نتیجه: "
        tv!!.text = s + txt
    }

    fun clickSe(v: View?) {
        var txt = tv!!.text.toString()
        val temp = txt.substring(7)
        val l = temp.toLong()
        if (l == 0L) {
            txt = "3"
        } else if (showResult == true) {
            txt = "3"
            showResult = false
            opt = '#'
        } else txt = temp + "3"
        val s = "نتیجه: "
        tv!!.text = s + txt
    }

    fun clickChahar(v: View?) {
        var txt = tv!!.text.toString()
        val temp = txt.substring(7)
        val l = temp.toLong()
        if (l == 0L) {
            txt = "4"
        } else if (showResult == true) {
            txt = "4"
            showResult = false
            opt = '#'
        } else txt = temp + "4"
        val s = "نتیجه: "
        tv!!.text = s + txt
    }

    fun clickPanj(v: View?) {
        var txt = tv!!.text.toString()
        val temp = txt.substring(7)
        val l = temp.toLong()
        if (l == 0L) {
            txt = "5"
        } else if (showResult == true) {
            txt = "5"
            showResult = false
            opt = '#'
        } else txt = temp + "5"
        val s = "نتیجه: "
        tv!!.text = s + txt
    }

    fun clickShesh(v: View?) {
        var txt = tv!!.text.toString()
        val temp = txt.substring(7)
        val l = temp.toLong()
        if (l == 0L) {
            txt = "6"
        } else if (showResult == true) {
            txt = "6"
            showResult = false
            opt = '#'
        } else txt = temp + "6"
        val s = "نتیجه: "
        tv!!.text = s + txt
    }

    fun clickHaft(v: View?) {
        var txt = tv!!.text.toString()
        val temp = txt.substring(7)
        val l = temp.toLong()
        if (l == 0L) {
            txt = "7"
        } else if (showResult == true) {
            txt = "7"
            showResult = false
            opt = '#'
        } else txt = temp + "7"
        val s = "نتیجه: "
        tv!!.text = s + txt
    }

    fun clickHasht(v: View?) {
        var txt = tv!!.text.toString()
        val temp = txt.substring(7)
        val l = temp.toLong()
        if (l == 0L) {
            txt = "8"
        } else if (showResult == true) {
            txt = "8"
            showResult = false
            opt = '#'
        } else txt = temp + "8"
        val s = "نتیجه: "
        tv!!.text = s + txt
    }

    fun clickNoh(v: View?) {
        var txt = tv!!.text.toString()
        val temp = txt.substring(7)
        val l = temp.toLong()
        if (l == 0L) {
            txt = "9"
        } else if (showResult == true) {
            txt = "9"
            showResult = false
            opt = '#'
        } else txt = temp + "9"
        val s = "نتیجه: "
        tv!!.text = s + txt
    }

    fun clickSefr(v: View?) {
        var txt = tv!!.text.toString()
        val temp = txt.substring(7)
        val l = temp.toLong()
        if (l == 0L) {
            txt = "0"
        } else if (showResult == true) {
            txt = "0"
            showResult = false
            opt = '#'
        } else txt = temp + "0"
        val s = "نتیجه: "
        tv!!.text = s + txt
    }

    fun clickPlus(v: View?) {
        opt = '+'
        val txt = tv!!.text.toString()
        val temp = txt.substring(7)
        total = temp.toLong()
        val s = "نتیجه: 0"
        tv!!.text = s
    }

    fun clickEqual(v: View?) {
        showResult = true
        var txt = tv!!.text.toString()
        val temp = txt.substring(7)
        val l = temp.toLong()
        if (opt == '+') {
            total = total + l
        } else if (opt == '-') total = total - l
        txt = total.toString()
        val s = "نتیجه: "
        tv!!.text = s + txt
    }

    fun clickMinus(v: View?) {
        opt = '-'
        val txt = tv!!.text.toString()
        val temp = txt.substring(7)
        total = temp.toLong()
        val s = "نتیجه: 0"
        tv!!.text = s
    }


}