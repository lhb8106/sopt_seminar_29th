package com.example.soptseminar29th.presentation.sign

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.soptseminar29th.R
import com.example.soptseminar29th.databinding.ActivitySignInBinding
import com.example.soptseminar29th.presentation.sign.ViewModel.SignInViewModel
import com.example.soptseminar29th.util.BaseViewUtil
import com.example.soptseminar29th.util.shortToast


class SignInActivity :
    BaseViewUtil.BaseActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {

    //미리 초기화
    private val signInViewModel: SignInViewModel by viewModels {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return SignInViewModel() as T
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initSignIn()
        initSignUp()
    }

    //로그인 버튼 클릭이벤트 (빈칸 체크)
    private fun initSignIn() = with(binding) {
        btnLogin.setOnClickListener {
            if(etId.text.isNotEmpty() && etPw.text.isNotEmpty()) {
                val intent = Intent(this@SignInActivity, HomeActivity::class.java)
                startActivity(intent)
                finish()
                shortToast("$etId 님 환영합니다.")
            } else {
                shortToast("로그인 실패")
            }
        }
    }

    //회원가입 버튼 클릭이벤트
    private fun initSignUp() {
        binding.btnSignup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}