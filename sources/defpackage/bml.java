package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bml extends anl {
    public static final bml b = new bml(aol.a);
    public final AtomicReference a;

    public bml(anl anlVar) {
        this.a = new AtomicReference(anlVar);
    }

    @Override // defpackage.anl
    public final odn a() {
        return ((anl) this.a.get()).a();
    }

    @Override // defpackage.anl
    public final mpl b() {
        return ((anl) this.a.get()).b();
    }

    @Override // defpackage.anl
    public final void c(String str, Level level, boolean z) {
        ((anl) this.a.get()).c(str, level, z);
    }
}
