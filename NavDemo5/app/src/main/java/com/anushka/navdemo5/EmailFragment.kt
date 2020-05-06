package com.anushka.navdemo5


import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.anushka.navdemo5.databinding.FragmentEmailBinding

/**
 * A simple [Fragment] subclass.
 */
class EmailFragment : Fragment() {

    private lateinit var binding: FragmentEmailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_email, container, false)

        val userName = requireArguments().getString("input_user")
        binding.submitButton.setOnClickListener {
            val emailVal = binding.emailEditText.text.toString()
            if (!TextUtils.isEmpty(emailVal)) {
                val bundle = bundleOf("input_user" to userName, "input_email" to emailVal)
                it.findNavController().navigate(R.id.action_emailFragment_to_welcomeFragment, bundle)
            } else {
                Toast.makeText(activity, "Please enter a email", Toast.LENGTH_LONG).show()
            }

        }
        return binding.root
    }
}
