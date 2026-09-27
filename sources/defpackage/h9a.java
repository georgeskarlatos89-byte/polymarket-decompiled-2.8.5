package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class h9a extends ye8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ int c;

    public /* synthetic */ h9a(ArrayList arrayList, int i, int i2) {
        this.a = i2;
        this.b = arrayList;
        this.c = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        boolean z;
        int i = this.a;
        int i2 = this.c;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                return arrayList.subList(Math.min(arrayList.size(), i2), arrayList.size()).iterator();
            default:
                Iterator it = arrayList.iterator();
                it.getClass();
                if (i2 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                brn.g("limit is negative", z);
                return new xv1(i2, it);
        }
    }
}
