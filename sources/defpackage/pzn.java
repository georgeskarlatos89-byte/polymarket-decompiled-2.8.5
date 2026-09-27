package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class pzn extends qzn {
    public static final qzn e;

    static {
        qzn a = new qzn(null, new b7h(0)).a();
        e = a;
        qzn qznVar = new qzn(a, new b7h());
        boolean z = !qznVar.c;
        Boolean bool = Boolean.TRUE;
        brn.r("Can't mutate after handing to trace", z);
        brn.r("Key already present", !qznVar.b());
        qznVar.b.put(qzn.d, bool);
        qznVar.a();
    }
}
