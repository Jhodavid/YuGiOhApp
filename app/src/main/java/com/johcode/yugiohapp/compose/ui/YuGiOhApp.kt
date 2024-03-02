package com.johcode.yugiohapp.compose.ui

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.johcode.yugiohapp.compose.ui.cardDetail.CardDetailScreen
import com.johcode.yugiohapp.compose.ui.home.HomeScreen

@Composable
fun YuGiOhApp() {
    val navController = rememberNavController()
    YuGiOhNavHost(
        navController = navController
    )
}


@Composable
fun YuGiOhNavHost(
    navController: NavHostController
) {
    val activity = (LocalContext.current as Activity)
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) {
            HomeScreen(
                onCardClick = {
                    navController.navigate(
                        Screen.CardDetail.createRoute(
                            cardId = it.id
                        )
                    )
                }
            )
        }
        composable(
            route = Screen.CardDetail.route,
            arguments = Screen.CardDetail.navArguments
        ) {
            CardDetailScreen(
                onBackClick = { navController.navigateUp() },
            )
        }
    }
}
