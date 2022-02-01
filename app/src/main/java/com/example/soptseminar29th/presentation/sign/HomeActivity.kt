package com.example.soptseminar29th.presentation.sign

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.soptseminar29th.R
import com.example.soptseminar29th.databinding.ActivityHomeBinding
import com.example.soptseminar29th.databinding.ActivitySignInBinding
import com.example.soptseminar29th.presentation.sign.ViewModel.HomeViewModel
import com.example.soptseminar29th.presentation.sign.ViewModel.SignInViewModel
import com.example.soptseminar29th.util.BaseViewUtil

class HomeActivity : BaseViewUtil.BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
    private val homeViewModel: HomeViewModel by viewModels {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return HomeViewModel() as T
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBtn()
    }

    private fun initBtn() {
        binding.btnGit.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/lhb8106"))
            startActivity(intent)
        }
    }
}