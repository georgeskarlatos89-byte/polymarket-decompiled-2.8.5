package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class jf2 {
    public final dtc a;
    public Function0 b;

    public jf2(dtc dtcVar) {
        this.a = dtcVar;
    }

    public final int a() {
        return this.a.a.size();
    }

    public final tzc b() {
        return (tzc) CollectionsKt.S(this.a);
    }

    public final void c() {
        Function0 function0 = this.b;
        if (function0 != null) {
            ((Boolean) function0.invoke()).getClass();
        } else if (a() > 1) {
            CollectionsKt.q0(this.a);
        }
    }

    public final void d() {
        if (a() > 1) {
            ddh ddhVar = this.a.a;
            ((eai) ddhVar.subList(1, ddhVar.size())).clear();
        }
    }

    public final void e(tzc tzcVar) {
        tzcVar.getClass();
        this.a.a(tzcVar);
    }

    public final void f(tzc tzcVar, Object obj) {
        obj.getClass();
        z0d.a.put(tzcVar, obj);
        this.a.a(tzcVar);
    }
}
