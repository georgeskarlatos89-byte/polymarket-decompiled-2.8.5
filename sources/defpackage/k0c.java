package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k0c implements dv7 {
    public static final /* synthetic */ int b = 0;
    public final Map a;

    static {
        c0a.a(Collections.EMPTY_MAP);
    }

    public k0c(LinkedHashMap linkedHashMap) {
        this.a = Collections.unmodifiableMap(linkedHashMap);
    }

    @Override // defpackage.kgf
    public final Object get() {
        int i;
        Map map = this.a;
        int size = map.size();
        if (size < 3) {
            i = size + 1;
        } else if (size < 1073741824) {
            i = (int) ((size / 0.75f) + 1.0f);
        } else {
            i = bd0.API_PRIORITY_OTHER;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((jgf) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
