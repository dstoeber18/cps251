package com.example.addnamesavedata1.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.addnamesavedata1.R
import com.example.addnamesavedata1.databinding.MainFragmentBinding

private var _binding: MainFragmentBinding? = null
private val binding get() = _binding!!

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

       binding.nameList.text = viewModel.getList().toString()




        binding.addNameBtn.setOnClickListener {
            if (binding.nameInput.text.isNotEmpty()) {
                viewModel.addName(binding.nameInput.text.toString())
                binding.nameList.text = viewModel.getList()
            }
        }
    }

}