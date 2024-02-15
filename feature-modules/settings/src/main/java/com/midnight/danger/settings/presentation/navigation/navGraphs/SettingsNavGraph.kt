package com.midnight.danger.settings.presentation.navigation.navGraphs

import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.annotation.RootNavGraph

@RootNavGraph
@NavGraph
annotation class SettingsNavGraph(
    val start: Boolean = false
)