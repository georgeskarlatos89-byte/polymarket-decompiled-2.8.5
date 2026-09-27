package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class u5l extends y5l {
    public static final u5l b = new u5l(z5l.a);
    public final AtomicReference a;

    public u5l(y5l y5lVar) {
        this.a = new AtomicReference(y5lVar);
    }

    @Override // defpackage.y5l
    public final void a(String str, Level level, boolean z) {
        ((y5l) this.a.get()).a(str, level, z);
    }

    @Override // defpackage.y5l
    public final i6l b() {
        return ((y5l) this.a.get()).b();
    }

    @Override // defpackage.y5l
    public final phn c() {
        return ((y5l) this.a.get()).c();
    }
}
