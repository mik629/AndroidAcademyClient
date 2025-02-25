package com.academy.android.ui.profile

data class ProfileItem(
    val value: String?,
    val hintResId: Int,
    val onValueChanged: (String) -> Unit,
    val isEditable: Boolean = false
)