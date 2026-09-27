package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface jig {
    List a();

    vl4 b();

    List c();

    Object getKey();

    default Map k() {
        Map map;
        iuc iucVar = (iuc) CollectionsKt.S(c());
        if (iucVar != null && (map = iucVar.c) != null) {
            return map;
        }
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        return zc7Var;
    }
}
