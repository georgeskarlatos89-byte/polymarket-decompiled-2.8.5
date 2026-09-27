package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ygk extends i8a {
    public final k8a b;
    public final WeakReference c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygk(k8a k8aVar, p9g p9gVar) {
        super(p9gVar.a);
        p9gVar.getClass();
        this.b = k8aVar;
        this.c = new WeakReference(p9gVar);
    }

    @Override // defpackage.i8a
    public final void a(Set set) {
        set.getClass();
        i8a i8aVar = (i8a) this.c.get();
        if (i8aVar == null) {
            this.b.c(this);
        } else {
            i8aVar.a(set);
        }
    }
}
