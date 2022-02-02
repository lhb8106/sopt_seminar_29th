package com.example.soptseminar29th.presentation.sign

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.example.soptseminar29th.R
import com.example.soptseminar29th.databinding.ActivitySignInBinding
import com.example.soptseminar29th.presentation.home.HomeActivity
import com.example.soptseminar29th.presentation.sign.viewmodel.SignInViewModel
import com.example.soptseminar29th.util.BaseViewUtil
import com.example.soptseminar29th.util.shortToast


class SignInActivity :
    BaseViewUtil.BaseActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {
    private lateinit var getResultText: ActivityResultLauncher<Intent>
    private val signInViewModel: SignInViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initSignIn()
        initSignUp()
        setResultSignUp()

    }

    private fun setResultSignUp() {
        getResultText = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) {
            if (it.resultCode == RESULT_OK) {
                val id = it.data?.getStringExtra("id")
                val password = it.data?.getStringExtra("password")
                binding.etId.setText(id)
                binding.etPw.setText(password)
            }
        }
    }

    //로그인 버튼 클릭이벤트 (빈칸 체크)
    private fun initSignIn() = with(binding) {
        btnLogin.setOnClickListener {
            if (etId.text.isNotEmpty() && etPw.text.isNotEmpty()) {
                val intent = Intent(this@SignInActivity, HomeActivity::class.java)
                startActivity(intent)
                finish()
                shortToast("환영합니다.")
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