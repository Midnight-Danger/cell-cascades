package com.midnight.danger.neumorphicdesignsystem.components.surface

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.CoroutineScope

@Composable
fun NDSScaffold(
    modifier: Modifier = Modifier,
    contentVerticalArrangement: Arrangement.Vertical = Arrangement.Top,
    contentHorizontalAlignment: Alignment.Horizontal = Alignment.Start,
    singleEvents: suspend CoroutineScope.() -> Unit = {},
    content: @Composable ColumnScope.() -> Unit
) {
    Scaffold {
        LaunchedEffect(Unit, block = singleEvents)
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .then(modifier),
            content = content,
            verticalArrangement = contentVerticalArrangement,
            horizontalAlignment = contentHorizontalAlignment
        )
    }
}