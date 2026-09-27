package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFb1rSDK {
    public static Uri k_(Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1nSDK aFj1nSDK = new AFj1nSDK(intent);
        Uri uri = (Uri) aFj1nSDK.H_("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String mediationNetwork = aFj1nSDK.getMediationNetwork("android.intent.extra.REFERRER_NAME");
        if (mediationNetwork == null) {
            return null;
        }
        return Uri.parse(mediationNetwork);
    }
}
