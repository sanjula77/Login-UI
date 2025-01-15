package com.example.loginui.navigation

 sealed interface Screen {

     @kotlinx.serialization.Serializable
     data object LoginScreen: Screen

     @kotlinx.serialization.Serializable
     data object RegisterScreen: Screen

}