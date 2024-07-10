package com.example.gridslist.data

import androidx.annotation.DrawableRes
import com.example.gridslist.R

data class Topic(
    val stringResourceId: Int,
    val number: Int,
    val imageResourceId: Int
)

object DataSource {
    var topics: List<Topic> = listOf(

        Topic(R.string.architecture, 58, R.drawable.architecture),
        Topic(R.string.crafts, 121, R.drawable.crafts),
        Topic(R.string.business, 78, R.drawable.business),
        Topic(R.string.culinary, 118, R.drawable.culinary),
        Topic(R.string.design, 423, R.drawable.design),
        Topic(R.string.fashion, 92, R.drawable.fashion),
        Topic(R.string.film, 165, R.drawable.film),
        Topic(R.string.gaming, 164, R.drawable.gaming),
        Topic(R.string.drawing, 326, R.drawable.drawing),
        Topic(R.string.lifestyle, 305, R.drawable.lifestyle),
        Topic(R.string.music, 212,R.drawable.music),
        Topic(R.string.painting, 172, R.drawable.painting),
        Topic(R.string.photography, 321, R.drawable.photography),
        Topic(R.string.tech, 118, R.drawable.tech),
        Topic(R.string.automotive,74,R.drawable.automotive),
        Topic(R.string.biology,84,R.drawable.biology),
        Topic(R.string.Law,43,R.drawable.law),
        Topic(R.string.automotive,90,R.drawable.automotive),
        Topic(R.string.History,68,R.drawable.history),
        Topic(R.string.Geography,44,R.drawable.geology),
        Topic(R.string.ecology,57,R.drawable.ecology),
        Topic(R.string.engineering,84,R.drawable.engineering),
        Topic(R.string.finance,57,R.drawable.finance),
        Topic(R.string.journalism,67,R.drawable.journalism),
        Topic(R.string.physics,44,R.drawable.physics)
    )
}
