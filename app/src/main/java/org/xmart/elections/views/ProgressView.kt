package org.xmart.elections.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class ProgressView : View {

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    private fun init() {

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }

    private fun RoundedRect(
        left: Float,
        top: Float,
        right: Float,
        bottom: Float,
        rx: Float,
        ry: Float,
        conformToOriginalPost: Boolean
    ): Path? {
        var rx = rx
        var ry = ry
        val path = Path()
        if (rx < 0) rx = 0f
        if (ry < 0) ry = 0f
        val width = right - left
        val height = bottom - top
        if (rx > width / 2) rx = width / 2
        if (ry > height / 2) ry = height / 2
        val widthMinusCorners = width - 2 * rx
        val heightMinusCorners = height - 2 * ry
        path.moveTo(right, top + ry)
        path.rQuadTo(0F, -ry, -rx, -ry) //top-right corner
        path.rLineTo(-widthMinusCorners, 0F)
        path.rQuadTo(-rx, 0F, -rx, ry) //top-left corner
        path.rLineTo(0F, heightMinusCorners)
        if (conformToOriginalPost) {
            path.rLineTo(0F, ry)
            path.rLineTo(width, 0F)
            path.rLineTo(0F, -ry)
        } else {
            path.rQuadTo(0F, ry, rx, ry) //bottom-left corner
            path.rLineTo(widthMinusCorners, 0F)
            path.rQuadTo(rx, 0F, rx, -ry) //bottom-right corner
        }
        path.rLineTo(0F, -heightMinusCorners)
        path.close() //Given close, last lineto can be removed.

        return path
    }

}