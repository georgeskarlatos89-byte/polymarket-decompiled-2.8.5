package com.fingerprintjs.android.fpjs_pro;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/UnknownError;", "Lcom/fingerprintjs/android/fpjs_pro/Error;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UnknownError extends Error {
    public UnknownError(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        super((i & 1) != 0 ? "Unknown" : str, (i & 2) != 0 ? "Unknown" : str2);
    }
}
