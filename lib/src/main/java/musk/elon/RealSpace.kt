package musk.elon

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

/**
 * In space, no one can hear you scream.
 *
 * Created by roman.donchenko on 12.02.18.
 */
internal class RealSpace(context: Context?, attrs: AttributeSet?) : FrameLayout(context, attrs) {

    override fun generateLayoutParams(attrs: AttributeSet?)
            = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
}