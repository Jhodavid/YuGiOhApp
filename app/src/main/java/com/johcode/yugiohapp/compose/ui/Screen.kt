package com.johcode.yugiohapp.compose.ui

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class Screen (
    val route: String,
    val navArguments: List<NamedNavArgument> = emptyList()
) {
    data object Home : Screen("home")

    data object CardDetail : Screen(
        route = "cardDetail/{cardId}",
        navArguments = listOf(navArgument("cardId") {
            type = NavType.IntType
        })
    ) {
        fun createRoute(cardId: Long) = "cardDetail/${cardId}"
    }
}