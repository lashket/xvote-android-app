package org.xmart.elections.views

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.view_candidate.view.*
import org.xmart.elections.R
import org.xmart.elections.models.Candidate

open class CandidateView : LinearLayout {

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    private fun init() {
        inflate(context, R
            .layout.view_candidate, this)
    }

    fun setCandidateInfo(candidate: Candidate) {
        tv_name.text = candidate.name
        tv_description.text = candidate.info
    }

    override fun setSelected(selected: Boolean) {
        setBackgroundResource(if (selected) R.drawable.bg_selected_candidate else R.drawable.bg_unselected_candidate )
        tv_name.setTextColor(ContextCompat.getColor(context, if (selected) R.color.blue else R.color.black_text_color))
        super.setSelected(selected)
    }

}