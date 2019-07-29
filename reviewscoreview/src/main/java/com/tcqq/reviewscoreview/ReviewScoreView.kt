package com.tcqq.reviewscoreview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout


/**
 * @author Alan Dreamer
 * @since 2019-07-29 Created
 */
class ReviewScoreView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) :
    LinearLayout(context, attrs) {

    init {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.view_review_score, this, true)
    }
}