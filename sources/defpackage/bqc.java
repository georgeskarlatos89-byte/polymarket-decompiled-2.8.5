package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bqc {
    public static final bqc b = new bqc();
    public final AtomicReference a = new AtomicReference(new u5f(new pyl(1)));

    public final synchronized void a(o5f o5fVar) {
        pyl pylVar = new pyl((u5f) this.a.get());
        HashMap hashMap = pylVar.b;
        t5f t5fVar = new t5f(o5fVar.a, m24.class);
        if (hashMap.containsKey(t5fVar)) {
            o5f o5fVar2 = (o5f) hashMap.get(t5fVar);
            if (!o5fVar2.equals(o5fVar) || o5fVar != o5fVar2) {
                xbc.u(t5fVar, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ");
            }
        } else {
            hashMap.put(t5fVar, o5fVar);
        }
        this.a.set(new u5f(pylVar));
    }
}
