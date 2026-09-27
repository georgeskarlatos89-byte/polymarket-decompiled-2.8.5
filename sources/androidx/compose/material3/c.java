package androidx.compose.material3;

import defpackage.epc;
import defpackage.gkj;
import defpackage.hkj;
import defpackage.hy6;
import defpackage.i8g;
import defpackage.ib4;
import defpackage.mj6;
import defpackage.sv6;
import defpackage.vt9;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c implements vt9 {
    public final boolean a;
    public final float b;
    public final long c;

    public c(float f, long j, boolean z) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.vt9
    public final mj6 a(epc epcVar) {
        return new DelegatingThemeAwareRippleNode(epcVar, this.a, this.b, new i8g(this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.a != cVar.a || !hy6.c(this.b, cVar.b) || !Intrinsics.areEqual(null, null)) {
                return false;
            }
            long j = cVar.c;
            int i = ib4.n;
            return hkj.a(this.c, j);
        }
        return false;
    }

    @Override // defpackage.vt9
    public final int hashCode() {
        int a = sv6.a(Boolean.hashCode(this.a) * 31, this.b, 961);
        int i = ib4.n;
        gkj gkjVar = hkj.b;
        return Long.hashCode(this.c) + a;
    }
}
