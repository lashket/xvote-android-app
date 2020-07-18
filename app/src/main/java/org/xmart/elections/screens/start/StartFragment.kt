package org.xmart.elections.screens.start

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_start.*
import org.xmart.elections.R
import org.xmart.elections.base.BaseFragment

class StartFragment: BaseFragment(R.layout.fragment_start) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        btn_vote.setOnClickListener {
            navigateTo(R.id.action_mainFragment_to_chooseCandidateFragment)
        }
    }


}