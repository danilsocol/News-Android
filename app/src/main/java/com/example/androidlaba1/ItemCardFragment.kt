package com.example.androidlaba1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.androidlaba1.databinding.FragmentItemCardBinding

class ItemCardFragment : Fragment() {

    private lateinit var binding: FragmentItemCardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        return inflater.inflate(R.layout.fragment_item_card,container,false)
    }



}