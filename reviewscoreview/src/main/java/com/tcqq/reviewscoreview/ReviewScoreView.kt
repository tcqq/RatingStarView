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

    fun setRatingProgress(
        @IntRange(from = 0, to = 100) one: Int,
        @IntRange(from = 0, to = 100) two: Int,
        @IntRange(from = 0, to = 100) three: Int,
        @IntRange(from = 0, to = 100) four: Int,
        @IntRange(from = 0, to = 100) five: Int
    ) {
        rating_one.progress = one
        rating_two.progress = two
        rating_three.progress = three
        rating_four.progress = four
        rating_five.progress = five
    }

    fun setRating(@FloatRange(from = 0.0, to = 5.0) rating: Float) {
        rating_bar.rating = rating
        rating_value.text = rating.toString()
    }

    fun setReviewSize(size: Int) {
        review_size.text = context.getString(R.string.n_reviews, size)
    }
}