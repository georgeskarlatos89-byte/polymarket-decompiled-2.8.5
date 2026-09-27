package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class cva implements tv2 {
    public final /* synthetic */ List a;

    public cva(List list) {
        this.a = list;
    }

    @Override // defpackage.tv2
    public final void onSuccess(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tv2) it.next()).onSuccess(obj);
        }
    }
}
