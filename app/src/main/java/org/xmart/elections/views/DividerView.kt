package org.xmart.elections.views

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import org.xmart.elections.R

open class DividerView : LinearLayout {

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
            .layout.view_divider, this)
    }

}