package com.example.soptseminar29th.presentation.sign

import android.os.Bundle
import androidx.activity.viewModels
import com.example.soptseminar29th.R
import com.example.soptseminar29th.databinding.ActivitySignInBinding
import com.example.soptseminar29th.util.BaseViewUtil


class SignInActivity :
    BaseViewUtil.BaseActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {
    private val viewModel: SignInViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}