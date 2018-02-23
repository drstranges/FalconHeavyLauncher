package musk.elon

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout.LayoutParams
import android.widget.FrameLayout.LayoutParams.MATCH_PARENT
import android.widget.Space


/**
 * This is the factory where was built Falcon Heavy
 *
 * Created by roman.donchenko on 12.02.18.
 */
internal class FalconHeavyFactory : LayoutInflater.Factory {

    override fun onCreateView(name: String?, context: Context?, attrs: AttributeSet?) = when (name) {
        "Space" -> {
            var type = 0
            context?.obtainStyledAttributes(attrs, R.styleable.RealSpace)?.apply {
                type = getInt(R.styleable.RealSpace_type, 0)
                recycle()
            }
            if (type == 1) {
                RealSpace(context, attrs)
            } else {
                Space(context, attrs)
            }
        }
        "FalconHeavy", "musk.elon.FalconHeavy" -> {
            FalconHeavy(context, attrs)
                    .apply {
                        layoutParams = LayoutParams(MATCH_PARENT, MATCH_PARENT)
                    }
        }
        else -> null
    }
}