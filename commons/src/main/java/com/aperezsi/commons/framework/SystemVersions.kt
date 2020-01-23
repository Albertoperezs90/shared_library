package com.aperezsi.commons.framework

import android.os.Build

class SystemVersions {

    fun isEqualOrAboveGivenVersion(givenVersion: Int): Boolean = Build.VERSION.SDK_INT < givenVersion

}