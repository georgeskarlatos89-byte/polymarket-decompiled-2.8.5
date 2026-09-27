package defpackage;

import io.sentry.android.core.m0;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rw9 {
    public final LinkedHashMap a;

    public rw9(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                return;
            default:
                this.a = new LinkedHashMap();
                return;
        }
    }

    public void a(String str, long j, long j2, vl4 vl4Var) {
        this.a.put(str, new hx9(new fne(4, j, j2), new vl4(new fl2(vl4Var, 6), true, -905386904)));
    }

    public void b(dgc dgcVar) {
        dgcVar.getClass();
        int i = dgcVar.startVersion;
        int i2 = dgcVar.endVersion;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i2))) {
            m0.p("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i2)) + " with " + dgcVar);
        }
        treeMap.put(Integer.valueOf(i2), dgcVar);
    }
}
