package com.idk.feature_home.presentation.ui.drawer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DrawerContent() {
    ModalDrawerSheet {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Profile", style = MaterialTheme.typography.bodyLarge)
            Text(text = "Design System", style = MaterialTheme.typography.bodyLarge)
            Text(text = "Push Notification", style = MaterialTheme.typography.bodyLarge)
            Text(text = "Deep Link", style = MaterialTheme.typography.bodyLarge)
            Text(text = "Google Maps", style = MaterialTheme.typography.bodyLarge)
        }
    }
}
