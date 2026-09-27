package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class cl6 {
    public final ArrayList a;
    public final char b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public cl6 f;
    public cl6 g;

    public cl6(ArrayList arrayList, char c, boolean z, boolean z2, cl6 cl6Var) {
        this.a = arrayList;
        this.b = c;
        this.d = z;
        this.e = z2;
        this.f = cl6Var;
        this.c = arrayList.size();
    }

    public final List a(int i) {
        ArrayList arrayList = this.a;
        if (i >= 1 && i <= arrayList.size()) {
            return arrayList.subList(0, i);
        }
        dmk.v(woa.l(arrayList.size(), i, "length must be between 1 and ", ", was "));
        return null;
    }

    public final List b(int i) {
        ArrayList arrayList = this.a;
        if (i >= 1 && i <= arrayList.size()) {
            return arrayList.subList(arrayList.size() - i, arrayList.size());
        }
        dmk.v(woa.l(arrayList.size(), i, "length must be between 1 and ", ", was "));
        return null;
    }
}
