package com.matchadvisor


import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView


class MainActivity : Activity() {


override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val layout = LinearLayout(this).apply {
        orientation = LinearLayout.VERTICAL
        gravity = Gravity.CENTER
        setPadding(32, 32, 32, 32)
        setBackgroundColor(Color.rgb(20, 28, 45))
    }

    val title = TextView(this).apply {
        text = "MATCH ADVISOR"
        textSize = 28f
        setTextColor(Color.WHITE)
        gravity = Gravity.CENTER
    }

    val description = TextView(this).apply {
        text = "\nТвой помощник в Match Masters\n\nЦель: находить лучшие ходы,\nсоздавать комбинации из 4+ фишек\nи набирать больше очков.\n\n"
        textSize = 18f
        setTextColor(Color.LTGRAY)
        gravity = Gravity.CENTER
    }

    val button = Button(this).apply {
        text = "АНАЛИЗИРОВАТЬ ПОЛЕ"
        setOnClickListener {
            description.text =
                "Следующий этап: добавим загрузку скриншота игрового поля и поиск лучших ходов."
        }
    }

    layout.addView(title)
    layout.addView(description)
    layout.addView(
        button,
        LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    )

    setContentView(layout)
}



}


