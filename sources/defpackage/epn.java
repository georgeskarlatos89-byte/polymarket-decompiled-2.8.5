package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class epn {
    public static int a;

    public static final List a(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableList(new ArrayList(list));
            }
            return Collections.singletonList(CollectionsKt.E(list));
        }
        return CollectionsKt.emptyList();
    }

    public static final Map b(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableMap(new LinkedHashMap(map));
            }
            Map.Entry entry = (Map.Entry) CollectionsKt.D(map.entrySet());
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
        return zc7Var;
    }
}
