package io.sentry.util;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g {
    public final f b;
    public volatile Object a = null;
    public final a c = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, io.sentry.util.a] */
    public g(f fVar) {
        this.b = fVar;
    }

    public final Object a() {
        if (this.a == null) {
            a aVar = this.c;
            aVar.e();
            try {
                if (this.a == null) {
                    this.a = this.b.c();
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this.a;
    }

    public final void b(Object obj) {
        a aVar = this.c;
        aVar.e();
        try {
            this.a = obj;
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
