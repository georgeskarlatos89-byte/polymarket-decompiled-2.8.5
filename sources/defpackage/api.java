package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class api implements k7b {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.k7b
    public final void onDestroy() {
        Iterator it = o1k.g(this.a).iterator();
        while (it.hasNext()) {
            ((voi) it.next()).onDestroy();
        }
    }

    @Override // defpackage.k7b
    public final void onStart() {
        Iterator it = o1k.g(this.a).iterator();
        while (it.hasNext()) {
            ((voi) it.next()).onStart();
        }
    }

    @Override // defpackage.k7b
    public final void onStop() {
        Iterator it = o1k.g(this.a).iterator();
        while (it.hasNext()) {
            ((voi) it.next()).onStop();
        }
    }
}
