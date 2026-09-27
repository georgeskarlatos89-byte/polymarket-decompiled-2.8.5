package bo.app;

import defpackage.b69;
import defpackage.dhk;
import defpackage.ok1;
import defpackage.pm1;
import defpackage.rug;
import defpackage.uug;
import defpackage.wug;
import defpackage.ztk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class b {
    public final rug a;

    /* JADX WARN: Type inference failed for: r0v1, types: [rug, uug] */
    public b() {
        int i = wug.a;
        this.a = new uug(1);
    }

    public static final String b(Object obj, boolean z) {
        return "Tried to confirm outboundObject [" + obj + "] with success [" + z + "], but the cache wasn't locked, so not doing anything.";
    }

    public final synchronized void a(Object obj, boolean z) {
        b bVar;
        try {
            try {
                if (((uug) this.a).c() != 0) {
                    b69.h(this, pm1.W, null, false, new ok1(obj, z, 14), 6);
                    return;
                }
                c(obj, z);
                try {
                    b69.h(this, pm1.V, null, false, new ztk(this, 0), 6);
                    ((uug) this.a).d();
                } catch (Throwable th) {
                    th = th;
                    bVar = this;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                bVar = this;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public abstract Object c();

    public abstract void c(Object obj, boolean z);

    public static final String b() {
        return "Received call to export dirty object, but the cache was already locked.";
    }

    public static final String b(b bVar) {
        return "Cache locked successfully for export: " + bVar;
    }

    public final synchronized Object a() {
        b bVar;
        try {
            try {
                if (((uug) this.a).f()) {
                    b69.h(this, null, null, false, new ztk(this, 1), 7);
                    return c();
                }
                try {
                    b69.h(this, null, null, false, new dhk(17), 7);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bVar = this;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                bVar = this;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static final String a(b bVar) {
        return "Notifying confirmAndUnlock listeners for cache: " + bVar;
    }
}
