package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class z2c {
    public final p1c a;
    public final p1c b;
    public final List c;

    public z2c(p1c p1cVar, p1c p1cVar2, List list) {
        p1cVar.getClass();
        p1cVar2.getClass();
        list.getClass();
        this.a = p1cVar;
        this.b = p1cVar2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        z2c z2cVar;
        if (obj instanceof z2c) {
            z2cVar = (z2c) obj;
        } else {
            z2cVar = null;
        }
        if (z2cVar == null || !Intrinsics.areEqual(this.a, z2cVar.a) || !Intrinsics.areEqual(this.b, z2cVar.b) || !Intrinsics.areEqual(this.c, z2cVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 37)) * 37);
    }
}
