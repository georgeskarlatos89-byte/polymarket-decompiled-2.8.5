package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vic extends cy2 {
    @Override // defpackage.cy2
    public final void e(Object obj, Object obj2) {
        wic wicVar = (wic) obj;
        wicVar.getClass();
        ArrayDeque arrayDeque = wic.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(wicVar);
        }
    }
}
