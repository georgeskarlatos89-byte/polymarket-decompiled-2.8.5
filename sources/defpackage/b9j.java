package defpackage;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b9j {
    public HashSet a;

    public final boolean a(String str) {
        return !this.a.contains(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(b9j.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(((b9j) obj).a, this.a);
    }
}
