package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class akc {
    public static final akc b = new akc(Collections.unmodifiableMap(new HashMap()));
    public final Map a;

    public akc(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akc)) {
            return false;
        }
        return this.a.equals(((akc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
