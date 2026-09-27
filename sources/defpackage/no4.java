package defpackage;

import com.checkout.components.interfaces.uicustomisation.font.FontWeight;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class no4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FontWeight.values().length];
        try {
            iArr[FontWeight.Light.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FontWeight.Normal.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FontWeight.Medium.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FontWeight.SemiBold.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FontWeight.Bold.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[FontWeight.ExtraBold.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
