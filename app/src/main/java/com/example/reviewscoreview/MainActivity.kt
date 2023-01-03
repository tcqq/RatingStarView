package com.example.reviewscoreview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*        review_score_view.apply {
            setOneRatingPercent(2)
            setTwoRatingPercent(60)
            setThreeRatingPercent(30)
            setFourRatingPercent(80)
            setFiveRatingPercent(100)
            setRating(4.3F)
            setReviewSize("58 reviews")
        }*/
    }
}
