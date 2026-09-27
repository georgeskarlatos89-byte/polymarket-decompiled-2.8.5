package defpackage;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wpa {
    public final String a;
    public final Map b;

    public wpa(String str, Map map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wpa) {
                wpa wpaVar = (wpa) obj;
                if (!Intrinsics.areEqual(this.a, wpaVar.a) || !Intrinsics.areEqual(this.b, wpaVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "@" + this.a + '(' + CollectionsKt.N(d.q(this.b), null, null, null, ec9.m, 31) + ')';
    }
}
