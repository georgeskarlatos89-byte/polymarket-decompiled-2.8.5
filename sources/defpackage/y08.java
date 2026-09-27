package defpackage;

import kotlin.io.FileWalkDirection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class y08 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FileWalkDirection.values().length];
        try {
            iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
