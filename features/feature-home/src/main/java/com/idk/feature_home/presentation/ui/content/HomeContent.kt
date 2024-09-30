package com.idk.feature_home.presentation.ui.content

import androidx.compose.material3.DrawerState
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.idk.feature_home.presentation.ui.body.HomeScreenBody
import com.idk.feature_home.presentation.ui.drawer.DrawerContent
import com.idk.feature_home.presentation.ui.footer.HomeScreenFooter
import com.idk.feature_home.presentation.ui.header.HomeScreenHeader
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun HomeContent(scope: CoroutineScope, drawerState: DrawerState) {

    ModalNavigationDrawer(drawerState = drawerState, drawerContent = {
        DrawerContent()
    }) {
        Scaffold(topBar = {
            HomeScreenHeader { scope.launch { drawerState.open() } }
        }, bottomBar = {
            HomeScreenFooter()
        }, content = { paddingValues ->
            HomeScreenBody(paddingValues)
        })
    }
}
