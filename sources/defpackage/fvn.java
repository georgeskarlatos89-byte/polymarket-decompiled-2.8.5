package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fvn implements bvn {
    public final ArrayList a;

    public fvn(Context context, wun wunVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        wunVar.getClass();
        arrayList.add(new own(context, wunVar));
    }

    @Override // defpackage.bvn
    public final void a(zun zunVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bvn) it.next()).a(zunVar);
        }
    }
}
