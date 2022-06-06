package com.company.l4m6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.company.l4m6.adapter.PagerAdapter
import com.company.l4m6.base.BaseActivity
import com.company.l4m6.databinding.ActivityMainBinding
import com.company.l4m6.extensions.setIconAlpha
import com.company.l4m6.extensions.setIconColor
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun inflateVB(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(inflater)
    }

    override fun initView() {
        initViewPager()
        initTabLayout()
    }

    private fun initTabLayout() {
        binding.tabLayout.tabIconTint = null
        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.setIcon(R.drawable.ic_baseline_confirmation_number_24)
                    setIconColor(tab, R.color.purple_500)
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_baseline_countertops_24)
                    setIconColor(tab, R.color.teal_200)
                    setIconAlpha(tab, 70)
                }
                else -> {
                    tab.setIcon(R.drawable.ic_baseline_history_24)
                    setIconColor(tab, R.color.teal_700)
                    setIconAlpha(tab, 70)
                }
            }
        }.attach()
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                setIconAlpha(tab, 250)
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                setIconAlpha(tab, 70)
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }

    private fun initViewPager() {
        binding.viewPager2.adapter = PagerAdapter(this)
    }
}