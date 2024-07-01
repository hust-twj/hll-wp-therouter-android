package com.therouter.app.router

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by TangWenjing on 2024/7/1
 */
@Parcelize
data class UserInfoEntity @JvmOverloads constructor(

    val uid: Long = -1L,

    var nickname: String = "nickname",

    val gender: Int = -1,
): Parcelable