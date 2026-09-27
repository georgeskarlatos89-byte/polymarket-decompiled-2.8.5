package com.google.android.libraries.places.api.model;

import android.text.TextUtils;
import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class EncodedPolyline implements Polyline {
    public static EncodedPolyline newInstance(String str) {
        brn.g("Encoded polyline must not contain empty values.", !TextUtils.isEmpty(str));
        return new zzey(str);
    }

    public abstract String getEncodedPolyline();
}
