package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gp8 {
    public final long a;
    public long b;
    public int c = 1;
    public final float d;
    public final float e;
    public final hp8 f;
    public final ArrayList g;

    public gp8(long j, long j2, float f, float f2, hp8 hp8Var, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.d = f;
        this.e = f2;
        this.f = hp8Var;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gp8) {
                gp8 gp8Var = (gp8) obj;
                if (this.a != gp8Var.a || this.b != gp8Var.b || this.c != gp8Var.c || Float.compare(this.d, gp8Var.d) != 0 || Float.compare(this.e, gp8Var.e) != 0 || !Intrinsics.areEqual(this.f, gp8Var.f) || !Intrinsics.areEqual(this.g, gp8Var.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + sv6.a(sv6.a(woa.b(this.c, woa.d(Long.hashCode(this.a) * 31, 31, this.b), 31), this.d, 31), this.e, 31)) * 31);
    }

    public final String toString() {
        return "RageClickSession(firstClickTime=" + this.a + ", lastClickTime=" + this.b + ", clickCount=" + this.c + ", firstClickX=" + this.d + ", firstClickY=" + this.e + ", targetInfo=" + this.f + ", clicks=" + this.g + ')';
    }
}
