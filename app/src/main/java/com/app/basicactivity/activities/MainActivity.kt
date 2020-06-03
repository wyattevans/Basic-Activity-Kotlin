package com.app.basicactivity.activities

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.app.basicactivity.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val simpleTag = this::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(simpleTag, getString(R.string.main_activity_loaded_label))
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, getString(R.string.action_label), Snackbar.LENGTH_LONG)
                .setAction(getString(R.string.action_hint), null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        Log.d(simpleTag, getString(R.string.create_options_menu_label))
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Log.d(simpleTag, getString(R.string.options_item_selected_initiated))
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
