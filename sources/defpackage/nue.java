package defpackage;

import com.polymarket.appwebview.PolyWebBridge;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class nue {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PolyWebBridge.HapticStyle.values().length];
        try {
            iArr[PolyWebBridge.HapticStyle.success.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PolyWebBridge.HapticStyle.error.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PolyWebBridge.HapticStyle.warning.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PolyWebBridge.HapticStyle.light.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PolyWebBridge.HapticStyle.soft.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PolyWebBridge.HapticStyle.medium.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PolyWebBridge.HapticStyle.heavy.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PolyWebBridge.HapticStyle.selection.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PolyWebBridge.HapticStyle.doubleTap.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[PolyWebBridge.HapticStyle.none.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[PolyWebBridge.HapticStyle.rigid.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        a = iArr;
    }
}
