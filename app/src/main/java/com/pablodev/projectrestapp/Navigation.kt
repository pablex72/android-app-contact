package com.pablodev.projectrestapp


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Screen1(navController: NavHostController, viewModel: UserViewModel) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray)) {
        Column(
            modifier = Modifier.align(Alignment.Center).padding(20.dp)
        ) {
            Text(
                text = "Bienvenido a la App de Contactos",
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier.padding(bottom = 18.dp).align(Alignment.CenterHorizontally),

            )
            Text(
                text = "Permite adicionar contactos de una API, para guardar presiona (+)",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 30.dp).align(Alignment.CenterHorizontally)
            )
            Button(
                onClick = { navController.navigate(Routes.Pantalla2.route) },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Acceder a la App")
            }
        }
    }
}
