package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public enum AFh1zSDK {
    application,
    activity,
    other;

    public static AFh1zSDK AFAdRevenueData(Context context) {
        if (context instanceof Activity) {
            return activity;
        }
        if (context instanceof Application) {
            return application;
        }
        return other;
    }
}
