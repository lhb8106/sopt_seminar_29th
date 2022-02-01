package com.example.soptseminar29th.presentation.sign

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.soptseminar29th.R
import com.example.soptseminar29th.databinding.ActivitySignUpBinding
import com.example.soptseminar29th.presentation.sign.ViewModel.SignUpViewModel
import com.example.soptseminar29th.util.BaseViewUtil
import com.example.soptseminar29th.util.shortToast

class SignUpActivity :
    BaseViewUtil.BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {

    //미리 초기화
    private val signUpViewModel: SignUpViewModel by viewModels {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return SignUpViewModel() as T
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initFinish()
    }

    //회원가입 빈칸 체크 및 완료 클릭 이벤트
    private fun initFinish() = with(binding) {
        btnSingup.setOnClickListener {
            if (etId.text.isNotEmpty() && etName.text.isNotEmpty() && etPassword.text.isNotEmpty()) {
                val intent = Intent(this@SignUpActivity, SignInActivity::class.java)
                startActivity(intent)
                finish()
                setResultSignUp()
            } else {
                shortToast("입력되지 않은 정보가 있습니다.")
            }
        }
    }

    //회원가입 정보 로그인 창에 전달
    private fun setResultSignUp() {
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            val id = it.data?.getStringExtra("id")
            val password = it.data?.getStringExtra("password")
            binding.etId.setText(id)
            binding.etPassword.setText(password)
        }
    }
}

