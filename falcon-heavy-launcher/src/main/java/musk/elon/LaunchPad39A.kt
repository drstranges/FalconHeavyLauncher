package musk.elon

import android.content.Context
import android.content.ContextWrapper
import android.view.LayoutInflater


/**
 * Launch Complex 39 (LC-39) is a rocket launch site at the John F. Kennedy Space Center
 * on Merritt Island in Florida, United States. The site and its collection of facilities
 * were originally built for the Apollo program, and later modified for the Space Shuttle program.
 * As of 2017, only Launch Complex 39A is active, launching SpaceX's Falcon 9 and Falcon Heavy.
 * LC-39 is also being modified to support launches of the SpaceX's Dragon 2 and Falcon Heavy,
 * as well as NASA's Space Launch System, with a new, smaller pad, C, added to support smaller launches.
 *(From Wikipedia, the free encyclopedia)
 *
 * Created by roman.donchenko on 12.02.18.
 */
class LaunchPad39A(context: Context) : ContextWrapper(context) {

    private val inflater by lazy {
        LayoutInflater.from(baseContext).apply {
            factory = FalconHeavyFactory()
        }
    }

    override fun getSystemService(name: String?): Any? = if (Context.LAYOUT_INFLATER_SERVICE == name) {
        inflater
    } else {
        super.getSystemService(name)
    }


}