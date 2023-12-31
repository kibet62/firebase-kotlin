package com.example.myfirebase.navigation



import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myfirebase.ui.theme.screen.home.HomeScreen
import com.example.myfirebase.ui.theme.screen.login.LoginScreen
import com.example.myfirebase.ui.theme.screen.product.AddProductsScreen
import com.example.myfirebase.ui.theme.screen.product.UpdateProductsScreen
//import com.example.myfirebase.ui.theme.screen.product.ViewProductsScreen
import com.example.myfirebase.ui.theme.screen.register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController:NavHostController= rememberNavController(),startDestination:String= ROUTE_LOGIN) {

    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT) {
            AddProductsScreen(navController)
        }
//        composable(ROUTE_VIEW_PRODUCT){
//            ViewProductsScreen (navController)
//        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
    }

}






