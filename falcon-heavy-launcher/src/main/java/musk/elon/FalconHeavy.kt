package musk.elon

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.gif.GifDrawable
import com.bumptech.glide.request.target.ImageViewTarget

/**
 * This is a reusable super heavy-lift launch vehicle designed and manufactured just for fun:)
 *
 * Created by roman.donchenko on 09.02.18.
 */
internal class FalconHeavy : ImageView {

    constructor(context: Context?) : super(context)

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    @Suppress("unused")
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        handler?.post(::startup)
    }

    override fun onDetachedFromWindow() {
        handler?.removeCallbacksAndMessages(null)
        super.onDetachedFromWindow()
    }

    private fun startup() {
        if (check()) {
            liftoff()
        } else {
            testing()
        }
    }

    private fun testing() {
        Glide.with(this)
                .asGif()
                .load(R.raw.testing)
                .into(this)
    }

    private fun check() = parent is RealSpace

    private fun liftoff() {
        Glide.with(this)
                .asGif()
                .load(R.raw.launch)
                .into(object : ImageViewTarget<GifDrawable>(this) {
                    override fun setResource(resource: GifDrawable?) {
                        if (resource == null) return
                        resource.setLoopCount(1)
                        resource.startFromFirstFrame()
                        view.setImageDrawable(resource)
                        handler?.postDelayed(::fairingDeploy, 10000)
                    }

                })
    }

    private fun fairingDeploy() {
        Glide.with(this)
                .asGif()
                .load(R.raw.tesla)
                .into(this)
    }

}