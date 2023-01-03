package com.example.ratingstarview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.rating_star_view

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rating_star_view.apply {
            setRatingPercent(1, 2)
            setRatingPercent(2, 60)
            setRatingPercent(3, 30)
            setRatingPercent(4, 80)
            setRatingPercent(5, 100)
            setRating(4.3F)
            setReviewSize("58 reviews")
        }
    }
}
