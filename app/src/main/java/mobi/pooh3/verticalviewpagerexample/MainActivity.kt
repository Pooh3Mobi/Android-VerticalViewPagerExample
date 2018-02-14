package mobi.pooh3.verticalviewpagerexample

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() , PlaceHolderFragment.OnFragmentInteractionListener {

    override fun onFragmentInteraction(uri: Uri) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val verticalViewPager: VerticalViewPager = findViewById(R.id.verticalViewPager)
        val adapter = MyFragmentAdapter(supportFragmentManager)
        verticalViewPager.adapter = adapter
    }
}

