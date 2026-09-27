package bo.app;

import defpackage.pec;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class lb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[pec.values().length];
        try {
            iArr[pec.HTML_FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pec.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pec.MODAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pec.SLIDEUP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pec.HTML.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
