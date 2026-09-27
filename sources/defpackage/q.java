package defpackage;

import android.widget.ImageView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class q {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[cp5.values().length];
        try {
            iArr[cp5.MEMORY_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cp5.MEMORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cp5.DISK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cp5.NETWORK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        try {
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr2;
        int[] iArr3 = new int[phg.values().length];
        try {
            iArr3[phg.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[phg.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr3;
    }
}
