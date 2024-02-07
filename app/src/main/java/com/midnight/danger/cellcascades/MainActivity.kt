package com.midnight.danger.cellcascades

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.midnight.danger.cellcascades.ui.theme.CellCascadesTheme
import com.midnight.danger.neumorphicdesignsystem.components.surface.NDSScaffold
import com.midnight.danger.neumorphicdesignsystem.theme.NeumorphicDesignTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NeumorphicDesignTheme {
                NDSScaffold {
                    Text(text = "Hello Neumorphism")
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true, device = Devices.PIXEL_7_PRO)
@Composable
fun MainScreenPreview() {
    NDSScaffold {
        Text(text = "Hello Neumorphism")
    }
}