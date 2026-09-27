package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class r3b implements lgf {
    public volatile Set a;
    public volatile Set b;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // defpackage.lgf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.a.iterator();
                            while (it.hasNext()) {
                                this.b.add(((lgf) it.next()).get());
                            }
                            this.a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}
