package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gbi implements pj9 {
    public volatile boolean a = false;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final LinkedBlockingQueue c = new LinkedBlockingQueue();

    @Override // defpackage.pj9
    public final synchronized asb a(String str) {
        fbi fbiVar;
        fbiVar = (fbi) this.b.get(str);
        if (fbiVar == null) {
            fbiVar = new fbi(str, this.c, this.a);
            this.b.put(str, fbiVar);
        }
        return fbiVar;
    }
}
