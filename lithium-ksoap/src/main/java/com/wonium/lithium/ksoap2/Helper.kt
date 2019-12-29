package com.wonium.lithium.ksoap2

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

/**
 * @ClassName:
 * @Description: 开启ADB页面
 * @Author: fxhhq
 * @E-mail: wonium@qq.com
 * @Blog: https://blog.wonium.com
 * @CreateDate: 2019/12/29 19:32
 * @UpdateUser: Ethan
 * @UpdateDate: 2019/12/29 19:32
 * @UpdateDescription: 更新说明
 * @Version: 1.0.0
 */

inline fun Context.isNetworkAvailable(): Boolean {
    val conn = this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val info: NetworkInfo? = conn.activeNetworkInfo
    return info?.state == NetworkInfo.State.CONNECTED
}