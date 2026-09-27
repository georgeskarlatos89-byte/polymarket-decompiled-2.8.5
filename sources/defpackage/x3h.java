package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class x3h {
    public final j9g a;
    public final AtomicBoolean b;
    public final Lazy c;

    public x3h(j9g j9gVar) {
        j9gVar.getClass();
        this.a = j9gVar;
        this.b = new AtomicBoolean(false);
        this.c = LazyKt.lazy(new gpf(this, 24));
    }

    public final cdi a() {
        j9g j9gVar = this.a;
        j9gVar.assertNotMainThread();
        if (this.b.compareAndSet(false, true)) {
            return (cdi) this.c.getValue();
        }
        return j9gVar.compileStatement(b());
    }

    public abstract String b();

    public final void c(cdi cdiVar) {
        cdiVar.getClass();
        if (cdiVar == ((cdi) this.c.getValue())) {
            this.b.set(false);
        }
    }
}
