package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class nzn implements lzn {
    public final ArrayList a;

    public nzn(Context context, izn iznVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        iznVar.getClass();
        arrayList.add(new xzn(context, iznVar));
    }

    @Override // defpackage.lzn
    public final void a(kzn kznVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lzn) it.next()).a(kznVar);
        }
    }
}
