package mobi.pooh3.verticalviewpagerexample

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


class MyFragmentAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val tabs = arrayListOf<Screen>(Screen.PlaceHolder, Screen.PlaceHolder, Screen.PlaceHolder)

    override fun getItem(position: Int): Fragment = tabs[position].fragment
    override fun getCount(): Int = tabs.size
    override fun getPageTitle(position: Int): CharSequence = tabs[position].title + position
}

sealed class Screen(val title: String) {
    abstract val fragment: Fragment
    abstract val screenName: String

    object PlaceHolder: Screen("place holder") {
        override val fragment: Fragment
            get() = PlaceHolderFragment.newInstance()
        override val screenName: String
            get() = PlaceHolderFragment::class.java.simpleName
    }
}