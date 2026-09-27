package io.sentry.android.core;

import io.sentry.p5;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[p5.values().length];
        a = iArr;
        try {
            iArr[p5.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[p5.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[p5.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[p5.FATAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[p5.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
