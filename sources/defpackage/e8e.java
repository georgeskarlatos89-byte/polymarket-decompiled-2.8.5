package defpackage;

import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class e8e implements k8i, Parcelable {
    public final c6e a;

    public e8e(c6e c6eVar) {
        this.a = c6eVar;
    }

    public abstract List e();

    @Override // defpackage.k8i
    public final Map o0() {
        Map map;
        List<Pair> e = e();
        Map map2 = zc7.a;
        map2.getClass();
        for (Pair pair : e) {
            String str = (String) pair.first;
            Object obj = pair.second;
            if (obj != null) {
                map = ace.q(obj, str);
            } else {
                map = null;
            }
            if (map == null) {
                map = zc7.a;
                map.getClass();
            }
            map2 = d1c.j(map2, map);
        }
        if (!map2.isEmpty()) {
            return ace.q(map2, this.a.code);
        }
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        return zc7Var;
    }
}
