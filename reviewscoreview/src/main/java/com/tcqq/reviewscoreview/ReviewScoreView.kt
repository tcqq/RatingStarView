package com.tcqq.reviewscoreview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.annotation.FloatRange
import androidx.annotation.IntRange
import kotlinx.android.synthetic.main.view_review_score.view.*


/**
 * @author Perry Lance
 * @since 2019-07-29 Created
 */
class ReviewScoreView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) :
    LinearLayout(context, attrs) {

    init {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.view_review_score, this, true)
    }

    fun setOneRatingPercent(@IntRange(from = 0, to = 100) percent: Int) {
        rating_one.progress = percent
    }

    fun setTwoRatingPercent(@IntRange(from = 0, to = 100) percent: Int) {
        rating_two.progress = percent
    }

    fun setThreeRatingPercent(@IntRange(from = 0, to = 100) percent: Int) {
        rating_three.progress = percent
    }

    fun setFourRatingPercent(@IntRange(from = 0, to = 100) percent: Int) {
        rating_four.progress = percent
    }

    fun setFiveRatingPercent(@IntRange(from = 0, to = 100) percent: Int) {
        rating_five.progress = percent
    }

    fun setRating(@FloatRange(from = 0.0, to = 5.0) rating: Float) {
        rating_bar.rating = rating
        rating_value.text = rating.toString()
    }

    fun setReviewSize(sizeText: String) {
        review_size.text = sizeText
    }
}