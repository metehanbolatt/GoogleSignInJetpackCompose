package com.metehanbolat.googlesignin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.metehanbolat.googlesignin.presentation.AuthScreen
import com.metehanbolat.googlesignin.ui.theme.GoogleSignInTheme
import com.metehanbolat.googlesignin.viewmodel.AuthViewModel

@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoogleSignInTheme {
                Surface(color = MaterialTheme.colors.background) {
                    AuthScreen(AuthViewModel())
                }
            }
        }
    }
}