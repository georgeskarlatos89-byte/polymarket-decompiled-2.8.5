package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class r9n implements abn {
    public final ArrayList a;

    public r9n(Context context, b9n b9nVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        b9nVar.getClass();
        arrayList.add(new ncn(context, b9nVar));
    }

    @Override // defpackage.abn
    public final void a(f9n f9nVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((abn) it.next()).a(f9nVar);
        }
    }
}
