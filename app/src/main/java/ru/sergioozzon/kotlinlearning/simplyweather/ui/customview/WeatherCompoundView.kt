package ru.sergioozzon.kotlinlearning.simplyweather.ui.customview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import ru.sergioozzon.kotlinlearning.simplyweather.R

class WeatherCompoundView(context: Context?, attrs: AttributeSet?, defStyleAttr: Int):
    LinearLayout(context, attrs, defStyleAttr) {

    init {
        val inflater: LayoutInflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.weather_compound_view, this)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
    }
}
