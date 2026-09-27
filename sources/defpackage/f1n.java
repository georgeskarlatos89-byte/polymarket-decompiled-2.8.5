package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class f1n {
    public static final StackTraceElement[] a = new StackTraceElement[0];

    public static dla a(wka wkaVar) {
        gdn gdnVar = gdn.C;
        pgj d0 = gdnVar.d0((f3) wkaVar);
        int C = gdnVar.C(d0);
        ArrayList arrayList = new ArrayList(C);
        for (int i = 0; i < C; i++) {
            arrayList.add((yka) gdnVar.H(d0, i));
        }
        if (!arrayList.isEmpty()) {
            return new dla(d1c.n(CollectionsKt.U0(arrayList, wkaVar.d())));
        }
        return dla.b;
    }

    public static boolean b(byte b) {
        if (b > -65) {
            return true;
        }
        return false;
    }
}
