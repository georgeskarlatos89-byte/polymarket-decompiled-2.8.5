package defpackage;

import java.io.Closeable;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class dak {
    private final eak impl = new eak();

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        str.getClass();
        autoCloseable.getClass();
        eak eakVar = this.impl;
        if (eakVar != null) {
            if (eakVar.d) {
                eak.a(autoCloseable);
                return;
            }
            synchronized (eakVar.a) {
                autoCloseable2 = (AutoCloseable) eakVar.b.put(str, autoCloseable);
            }
            eak.a(autoCloseable2);
        }
    }

    public final void clear$lifecycle_viewmodel() {
        eak eakVar = this.impl;
        if (eakVar != null && !eakVar.d) {
            eakVar.d = true;
            synchronized (eakVar.a) {
                try {
                    Iterator it = eakVar.b.values().iterator();
                    while (it.hasNext()) {
                        eak.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = eakVar.c.iterator();
                    while (it2.hasNext()) {
                        eak.a((AutoCloseable) it2.next());
                    }
                    eakVar.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        T t;
        str.getClass();
        eak eakVar = this.impl;
        if (eakVar != null) {
            synchronized (eakVar.a) {
                t = (T) eakVar.b.get(str);
            }
            return t;
        }
        return null;
    }

    public void onCleared() {
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        eak eakVar = this.impl;
        if (eakVar != null) {
            if (eakVar.d) {
                eak.a(autoCloseable);
                return;
            }
            synchronized (eakVar.a) {
                eakVar.c.add(autoCloseable);
            }
        }
    }

    @hm6
    public void addCloseable(Closeable closeable) {
        closeable.getClass();
        eak eakVar = this.impl;
        if (eakVar != null) {
            if (eakVar.d) {
                eak.a(closeable);
                return;
            }
            synchronized (eakVar.a) {
                eakVar.c.add(closeable);
            }
        }
    }
}
