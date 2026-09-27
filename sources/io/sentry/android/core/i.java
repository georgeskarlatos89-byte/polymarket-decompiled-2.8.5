package io.sentry.android.core;

import io.sentry.s3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[s3.values().length];
        a = iArr;
        try {
            iArr[s3.TRACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[s3.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
