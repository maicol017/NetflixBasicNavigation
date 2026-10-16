package me.fabiansuarez.compose.lab.netflixbasicnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import me.fabiansuarez.compose.lab.netflixbasicnavigation.ui.screen.*
import me.fabiansuarez.compose.lab.netflixbasicnavigation.ui.theme.NetflixBasicNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NetflixBasicNavigationTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "login"
                ) {
                    composable("login") {
                        LoginScreen(navController)
                    }
                    composable("register") {
                        RegisterScreen(navController)
                    }
                    composable("register_step2") {
                        RegisterStep2Screen(navController)
                    }
                    composable("register_step3") {
                        RegisterStep3Screen(navController)
                    }
                    composable("home") {
                        HomeScreen()
                    }
                }
            }
        }
    }
}