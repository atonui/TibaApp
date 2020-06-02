package com.example.tibaapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class SlideAdapter(var context: Context): PagerAdapter() {
    val images = arrayListOf<Int>(
        R.drawable.corona1,
        R.drawable.corona2,
        R.drawable.corona3
    )
    val headings = arrayListOf<Int>(
        R.string.first_slide_title,
        R.string.second_slide_title,
        R.string.third_slide_title
    )
    val descriptions = arrayListOf<Int>(
        R.string.first_slide_description,
        R.string.second_slide_description,
        R.string.third_slide_description
    )

    override fun getCount(): Int {
        return headings.count()
    }

    override fun instantiateItem(container: ViewGroup, position: Int): View {
//        defining our data structure
        val layoutInflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = layoutInflater.inflate(R.layout.slide_layout, container, false)

        val imageView: ImageView = view.findViewById(R.id.img_slider)
        val headingView: TextView = view.findViewById(R.id.tv_title)
        val descriptionView: TextView = view.findViewById(R.id.tv_description)

//        setting the data to the views/container
        imageView.setImageResource(images[position])
        headingView.setText(headings[position])
        descriptionView.setText(descriptions[position])

        container.addView(view)

        return view

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val wrapper =`object` as View
        container.removeView(wrapper)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as View
    }
}