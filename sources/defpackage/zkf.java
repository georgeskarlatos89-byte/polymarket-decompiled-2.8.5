package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zkf {
    public final boolean a;
    public final Set b;
    public final Set c;

    public zkf(boolean z, HashSet hashSet, HashSet hashSet2) {
        Set hashSet3;
        Set hashSet4;
        this.a = z;
        if (hashSet == null) {
            hashSet3 = Collections.EMPTY_SET;
        } else {
            hashSet3 = new HashSet(hashSet);
        }
        this.b = hashSet3;
        if (hashSet2 == null) {
            hashSet4 = Collections.EMPTY_SET;
        } else {
            hashSet4 = new HashSet(hashSet2);
        }
        this.c = hashSet4;
    }

    public final boolean a(Class cls, boolean z) {
        if (!this.b.contains(cls)) {
            if (!this.c.contains(cls) && this.a && z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zkf)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zkf zkfVar = (zkf) obj;
        if (this.a != zkfVar.a || !Objects.equals(this.b, zkfVar.b) || !Objects.equals(this.c, zkfVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.a + ", forceEnabledQuirks=" + this.b + ", forceDisabledQuirks=" + this.c + '}';
    }
}
