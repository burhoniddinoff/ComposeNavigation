package com.example.composenavigation.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.composenavigation.ui.view.bottom.FavouriteScreen
import com.example.composenavigation.ui.view.bottom.HomeScreen
import com.example.composenavigation.ui.view.bottom.ProfileScreen
import com.example.composenavigation.ui.view.bottom.SearchScreen
import com.example.composenavigation.ui.view.home.DetailScreen
import com.example.composenavigation.ui.view.splash.SplashScreen
import com.example.composenavigation.util.Graph

fun NavGraphBuilder.splashNavGraph(navHostController: NavHostController) {
    navigation(
        route = Graph.SPLASH,
        startDestination = "SPLASH"
    ) {
        composable(route = "SPLASH") {
            SplashScreen(navHostController)
        }
    }
}

@Composable
fun MainNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        route = Graph.MAIN,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen(navHostController)
        }
        composable(route = BottomBarScreen.Search.route) {
            SearchScreen(navHostController)
        }
        composable(route = BottomBarScreen.Favourite.route) {
            FavouriteScreen(navHostController)
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen(navHostController)
        }
        detailsNavGraph(navHostController)
    }
}

fun NavGraphBuilder.detailsNavGraph(navHostController: NavHostController) {
    navigation(
        route = Graph.DETAILS,
        startDestination = "DETAILS"
    ) {
        composable(route = "DETAILS") {
            DetailScreen(navHostController = navHostController)
        }
    }
}