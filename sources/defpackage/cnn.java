package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class cnn {
    public static final tt4 a(aee aeeVar) {
        aeeVar.getClass();
        int i = o6e.a[aeeVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return tt4.None;
                }
                dmk.a();
                return null;
            }
            return tt4.OnSession;
        }
        return tt4.OffSession;
    }

    public static final e8e b(e8e e8eVar, String str, bee beeVar) {
        wde wdeVar;
        vde vdeVar;
        tt4 a;
        e8e a8eVar;
        beeVar.getClass();
        c6e.Companion.getClass();
        c6e a2 = b6e.a(str);
        if (a2 != null) {
            yde ydeVar = beeVar.a;
            e8e e8eVar2 = null;
            if (ydeVar instanceof wde) {
                wdeVar = (wde) ydeVar;
            } else {
                wdeVar = null;
            }
            if (wdeVar != null && (vdeVar = wdeVar.e) != null) {
                aee aeeVar = (aee) vdeVar.a.get(a2);
                if (aeeVar != null && (a = a(aeeVar)) != null) {
                    if (e8eVar != null) {
                        tt4 b = rnn.b(e8eVar);
                        if (b == tt4.OffSession) {
                            a = b;
                        }
                        if (e8eVar instanceof v7e) {
                            a8eVar = new v7e(((v7e) e8eVar).b, a);
                        } else if (e8eVar instanceof w7e) {
                            a8eVar = w7e.g((w7e) e8eVar, null, a, 11);
                        } else if (e8eVar instanceof z7e) {
                            a8eVar = new z7e(a);
                        } else if (e8eVar instanceof x7e) {
                            String str2 = ((x7e) e8eVar).b;
                            str2.getClass();
                            a8eVar = new x7e(str2, a);
                        } else if (e8eVar instanceof y7e) {
                            a8eVar = new y7e(a);
                        } else if (e8eVar instanceof b8e) {
                            a8eVar = new b8e(a);
                        } else if (e8eVar instanceof c8e) {
                            a8eVar = new c8e(((c8e) e8eVar).b, a);
                        } else if (e8eVar instanceof d8e) {
                            a8eVar = new d8e(a);
                        } else if (e8eVar instanceof a8e) {
                            c6e c6eVar = ((a8e) e8eVar).b;
                            c6eVar.getClass();
                            a.getClass();
                            a8eVar = new a8e(c6eVar, a);
                        } else {
                            dmk.a();
                            return null;
                        }
                    } else {
                        a8eVar = new a8e(a2, a);
                    }
                    e8eVar2 = a8eVar;
                }
                if (e8eVar2 != null) {
                    return e8eVar2;
                }
            }
        }
        return e8eVar;
    }
}
