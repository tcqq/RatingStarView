package com.example.reviewscoreview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        review_score_view.setRatingProgress(2, 60, 30, 80, 100)
        review_score_view.setRating(4.3F)
        review_score_view.setReviewSize(58)
    }
}
