package edu.dartmouth.dali.dalilab.Voting

import android.content.Context
import android.content.Intent
import android.os.Bundle
import edu.dartmouth.dali.dalilab.ActionBarActivity
import edu.dartmouth.dali.dalilab.R

class VotingActivity : ActionBarActivity() {
    companion object {
        fun newIntent(context: Context): Intent {
            val intent = Intent(context, VotingActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_voting)
    }
}
