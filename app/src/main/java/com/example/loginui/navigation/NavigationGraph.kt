package com.example.loginui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginui.LoginScreen
import com.example.loginui.RegisterScreen


@Composable
fun NavigationGraph(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.LoginScreen
    ) {
        composable<Screen.LoginScreen> {
            LoginScreen(
                onGoToNextScreen = {
                    navController.navigate(Screen.RegisterScreen)
                },
                modifier = modifier
            )
        }
        composable<Screen.RegisterScreen> {
            RegisterScreen(
                onGoBack = {
                    navController.popBackStack()
                },
                modifier = modifier
            )
        }
    }
}