package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class tx6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        a = iArr;
        try {
            iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[RoundingMode.FLOOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[RoundingMode.CEILING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[RoundingMode.DOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[RoundingMode.UP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[RoundingMode.HALF_EVEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[RoundingMode.HALF_UP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[RoundingMode.HALF_DOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
