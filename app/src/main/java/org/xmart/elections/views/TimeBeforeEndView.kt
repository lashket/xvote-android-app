package org.xmart.elections.views

import android.content.Context
import android.os.CountDownTimer
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.view_candidate.view.*
import org.xmart.elections.R
import org.xmart.elections.models.Candidate

open class TimeBeforeEndView : LinearLayout {

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
            .layout.view_time_before_results, this)

    }

}