package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
enum zzafo {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    public static /* synthetic */ zzafo zza(Object obj) {
        if (obj instanceof String) {
            return STRING;
        }
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof Long) {
            return LONG;
        }
        if (obj instanceof Double) {
            return DOUBLE;
        }
        dmk.i("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return null;
    }
}
