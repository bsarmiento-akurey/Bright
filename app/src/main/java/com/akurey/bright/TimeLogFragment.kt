package com.akurey.bright


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 */
class TimeLogFragment : Fragment() {

    // region New Instance Method
    companion object {
        fun newInstance(): TimeLogFragment {
            val arguments = Bundle()
            val fragment = TimeLogFragment()
            fragment.arguments = arguments
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_time_log, container, false)
    }


}
