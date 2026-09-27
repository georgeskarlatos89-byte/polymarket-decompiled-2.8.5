package defpackage;

import com.checkout.components.interfaces.Environment;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class mxk {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Environment.values().length];
        try {
            iArr[Environment.SANDBOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Environment.PRODUCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
