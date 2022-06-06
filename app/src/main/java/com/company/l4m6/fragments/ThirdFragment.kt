package com.company.l4m6.fragments

import android.view.LayoutInflater
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.company.l4m6.adapter.AdapterForThirdFragment
import com.company.l4m6.base.BaseFragment
import com.company.l4m6.databinding.FragmentThirdBinding
import com.company.l4m6.view_model.MainViewModel

class ThirdFragment : BaseFragment<FragmentThirdBinding>() {
    private val adapter = AdapterForThirdFragment()
    private val viewModel: MainViewModel by activityViewModels()

    override fun inflateVB(inflater: LayoutInflater): FragmentThirdBinding {
        return FragmentThirdBinding.inflate(inflater)
    }

    override fun initView() {
        initAdapter()
        viewModel.historyList.observe(viewLifecycleOwner) {
            adapter.addHistory(it)
        }
    }

    private fun initAdapter() {
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.adapter = adapter
    }

    override fun initListener() {
    }
}