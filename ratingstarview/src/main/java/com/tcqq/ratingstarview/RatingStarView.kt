package com.tcqq.ratingstarview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.annotation.FloatRange
import androidx.annotation.IntRange
import kotlinx.android.synthetic.main.view_rating_star.view.rating_bar
import kotlinx.android.synthetic.main.view_rating_star.view.rating_five
import kotlinx.android.synthetic.main.view_rating_star.view.rating_four
import kotlinx.android.synthetic.main.view_rating_star.view.rating_one
import kotlinx.android.synthetic.main.view_rating_star.view.rating_three
import kotlinx.android.synthetic.main.view_rating_star.view.rating_two
import kotlinx.android.synthetic.main.view_rating_star.view.rating_value
import kotlinx.android.synthetic.main.view_rating_star.view.review_size


/**
 * @author Perry Lance
 * @since 2019-07-29 Created
 */
class RatingStarView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) :
    LinearLayout(context, attrs) {

    init {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.view_rating_star, this, true)
    }

    fun setRatingPercent(
        @IntRange(from = 1, to = 5) star: Int,
        @IntRange(from = 0, to = 100) percent: Int
    ) {
        when (star) {
            1 -> rating_one.progress = percent
            2 -> rating_two.progress = percent
            3 -> rating_three.progress = percent
            4 -> rating_four.progress = percent
            5 -> rating_five.progress = percent
        }
    }

    fun setRating(@FloatRange(from = 0.0, to = 5.0) rating: Float) {
        rating_bar.rating = rating
        rating_value.text = rating.toString()
    }

    fun setReviewSize(sizeText: String) {
        review_size.text = sizeText
    }
}