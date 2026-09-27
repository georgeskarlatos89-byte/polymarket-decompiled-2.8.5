package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class r64 {
    public final Set a;
    public final Set b;
    public final String c;
    public final String d;
    public final e6h e;
    public Integer f;

    public r64(String str, String str2, Set set) {
        Set unmodifiableSet;
        if (set == null) {
            unmodifiableSet = Collections.EMPTY_SET;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.a = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.c = str;
        this.d = str2;
        this.e = e6h.a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.b = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw m51.g(it);
    }
}
