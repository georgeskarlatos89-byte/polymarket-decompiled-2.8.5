package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class iij {
    public final List a;

    public iij(cff cffVar) {
        cffVar.getClass();
        List list = cffVar.c;
        if ((cffVar.b & 1) == 1) {
            int i = cffVar.d;
            list.getClass();
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.w(list2));
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                wef wefVar = (wef) obj;
                if (i2 >= i) {
                    wefVar.getClass();
                    vef r = wef.r(wefVar);
                    r.d |= 2;
                    r.f = true;
                    wefVar = r.k();
                    if (!wefVar.b()) {
                        throw new buj();
                    }
                }
                arrayList.add(wefVar);
                i2 = i3;
            }
            list = arrayList;
        }
        list.getClass();
        this.a = list;
    }

    public final wef a(int i) {
        return (wef) this.a.get(i);
    }
}
