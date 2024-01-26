package com.amikom.amikomone.ui.screens.home.navigation

import com.amikom.amikomone.R

sealed class MenuModel(
    val title: String,
    val icon: Int,
) {
    data object Transcript : MenuModel(
        title = "Transkrip",
        icon = R.drawable.transkrip,
    )

    data object Schedule : MenuModel(
        title = "KHS",
        icon = R.drawable.khs,
    )

    data object Support : MenuModel(
        title = "Bantuan",
        icon = R.drawable.bantuan,
    )

    data object StudentCard : MenuModel(
        title = "KTM",
        icon = R.drawable.ktm,
    )

    data object Library : MenuModel(
        title = "Perpustakaan",
        icon = R.drawable.perpus,
    )

    data object Payment : MenuModel(
        title = "Pembayaran",
        icon = R.drawable.pembayaran,
    )
}