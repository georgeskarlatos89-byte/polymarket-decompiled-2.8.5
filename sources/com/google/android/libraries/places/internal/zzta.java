package com.google.android.libraries.places.internal;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.din;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzta {
    public static final Parcelable zza(Bundle bundle, String str, Class cls) {
        bundle.getClass();
        str.getClass();
        cls.getClass();
        Parcelable parcelable = (Parcelable) din.b(bundle, str, cls);
        if (parcelable != null) {
            return parcelable;
        }
        dmk.n("Required value was null.");
        return null;
    }
}
