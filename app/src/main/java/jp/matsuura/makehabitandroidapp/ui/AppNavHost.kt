package jp.matsuura.makehabitandroidapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import jp.matsuura.makehabitandroidapp.ui.habit_selection.HabitSelectionScreen
import jp.matsuura.makehabitandroidapp.ui.home.HomeScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Home,
    ) {
        composable<Home> {
            HomeScreen(
                onFabClicked = {
                    navController.navigate(HabitSelection)
                }
            )
        }
        composable<HabitSelection> {
            HabitSelectionScreen()
        }
    }
}