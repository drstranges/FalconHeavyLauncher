package musk.elon

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout

/**
 * In space, no one can hear you scream.
 *
 * Created by roman.donchenko on 12.02.18.
 */
internal class RealSpace(context: Context?, attrs: AttributeSet?) : FrameLayout(context, attrs) {

    override fun generateLayoutParams(attrs: AttributeSet?)
            = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        if (child !is FalconHeavy) {
            throw ClassCastException("android.widget.Space cannot be cast to android.view.ViewGroup").apply {
                stackTrace = arrayOf(
                        StackTraceElement("android.view.LayoutInflater.java", "rInflate", "LayoutInflater.java", 864),
                        StackTraceElement("android.view.LayoutInflater.java", "rInflateChildren", "LayoutInflater.java", 824),
                        StackTraceElement("android.view.LayoutInflater.java", "rInflate", "LayoutInflater.java", 866),
                        StackTraceElement("android.view.LayoutInflater.java", "rInflateChildren", "LayoutInflater.java", 824),
                        StackTraceElement("android.view.LayoutInflater.java", "inflate", "LayoutInflater.java", 515),
                        StackTraceElement("android.view.LayoutInflater.java", "inflate", "LayoutInflater.java", 423),
                        StackTraceElement("android.view.LayoutInflater.java", "inflate", "LayoutInflater.java", 374),
                        StackTraceElement("com.android.internal.policy.PhoneWindow.java", "setContentView", "PhoneWindow.java", 419),
                        StackTraceElement("android.app.Activity.java", "setContentView", "Activity.java", 2669)
                )
            }
        }
        super.addView(child, index, params)
    }
}