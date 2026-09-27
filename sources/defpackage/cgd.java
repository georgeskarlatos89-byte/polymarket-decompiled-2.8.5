package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class cgd {
    public final i8a a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public cgd(i8a i8aVar, int[] iArr, String[] strArr) {
        boolean z;
        Set set;
        i8aVar.getClass();
        iArr.getClass();
        strArr.getClass();
        this.a = i8aVar;
        this.b = iArr;
        this.c = strArr;
        if (iArr.length == strArr.length) {
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                set = vzg.b(strArr[0]);
            } else {
                set = fd7.a;
            }
            this.d = set;
            return;
        }
        dmk.n("Check failed.");
        throw null;
    }
}
