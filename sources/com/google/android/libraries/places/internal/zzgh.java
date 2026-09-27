package com.google.android.libraries.places.internal;

import defpackage.pq8;
import io.sentry.android.core.m0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzgh implements pq8 {
    @Override // defpackage.pq8
    public final void onFailure(Throwable th) {
        th.getClass();
        if (!(th instanceof zzfz)) {
            m0.q("ZwiebackCookieClient", "Failed to update Zwieback cookie", th);
        }
    }

    @Override // defpackage.pq8
    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzbvh) obj).getClass();
    }
}
