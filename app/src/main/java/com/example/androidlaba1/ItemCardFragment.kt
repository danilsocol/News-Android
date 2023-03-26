package com.example.androidlaba1

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.Switch
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.androidlaba1.databinding.FragmentItemCardBinding


class ItemCardFragment : Fragment() {

    private var _binding: FragmentItemCardBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        _binding = FragmentItemCardBinding.inflate(inflater, container, false)

        val id = arguments?.getInt("id")
        binding.subhead.text = id.toString()


        binding.newsToolbar.setNavigationOnClickListener{
            findNavController().popBackStack()
        }

        binding.switchColor.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                binding.textLayout.setBackgroundColor(R.color.black.toInt())
            }
            else {
                binding.textLayout.setBackgroundColor(R.color.purple_200.toInt())
            }
        })

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}