package com.motionlayout.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setClickListener()
    }

    private fun setClickListener() {
        // Apply default transition on app launch
        motion_layout.setTransition(motion_layout.currentState, R.id.home_expand)
        motion_layout.transitionToEnd()

        iv_home.setOnClickListener {
            setTransition(motion_layout.currentState, R.id.home_expand)
        }

        iv_search.setOnClickListener {
            setTransition(motion_layout.currentState, R.id.search_expand)
        }

        iv_like.setOnClickListener {
            setTransition(motion_layout.currentState, R.id.like_expand)
        }

        iv_profile.setOnClickListener {
            setTransition(motion_layout.currentState, R.id.profile_expand)
        }
    }

    private fun setTransition(startState: Int, endState: Int) {
        motion_layout.setTransition(startState, endState)
        motion_layout.setTransitionDuration(200)
        motion_layout.transitionToEnd()
    }
}
