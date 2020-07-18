package org.xmart.elections.screens.results

import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_vote_success.*
import org.xmart.elections.R
import org.xmart.elections.base.BaseFragment


class VoteSuccessFragment : BaseFragment(R.layout.fragment_vote_success) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        btn_calculate.setOnClickListener {
            navigateTo(R.id.action_voteSuccessFragment_to_voteResultFragment)
        }
        btn_share.setOnClickListener {
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(
                Intent.EXTRA_TEXT,
                getString(R.string.share_app)
            )
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
        }
    }

}