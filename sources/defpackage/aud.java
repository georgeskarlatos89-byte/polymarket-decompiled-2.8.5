package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class aud implements cb0 {
    public final int a;
    public final int b;
    public final long c;
    public final rvi d;
    public final poe e;
    public final l8b f;
    public final int g;
    public final int h;
    public final kxi i;

    public aud(int i, int i2, long j, rvi rviVar, poe poeVar, l8b l8bVar, int i3, int i4, kxi kxiVar) {
        boolean z;
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = rviVar;
        this.e = poeVar;
        this.f = l8bVar;
        this.g = i3;
        this.h = i4;
        this.i = kxiVar;
        dyi[] dyiVarArr = cyi.b;
        if (!cyi.a(j, cyi.c)) {
            if (cyi.c(j) >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                lw9.c("lineHeight can't be negative (" + cyi.c(j) + ')');
            }
        }
    }

    public final aud a(aud audVar) {
        if (audVar == null) {
            return this;
        }
        return bud.a(this, audVar.a, audVar.b, audVar.c, audVar.d, audVar.e, audVar.f, audVar.g, audVar.h, audVar.i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aud) {
                aud audVar = (aud) obj;
                if (this.a == audVar.a && this.b == audVar.b && cyi.a(this.c, audVar.c) && Intrinsics.areEqual(this.d, audVar.d) && Intrinsics.areEqual(this.e, audVar.e) && Intrinsics.areEqual(this.f, audVar.f) && this.g == audVar.g && this.h == audVar.h && Intrinsics.areEqual(this.i, audVar.i)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int b = woa.b(this.b, Integer.hashCode(this.a) * 31, 31);
        dyi[] dyiVarArr = cyi.b;
        int d = woa.d(b, 31, this.c);
        int i4 = 0;
        rvi rviVar = this.d;
        if (rviVar != null) {
            i = rviVar.hashCode();
        } else {
            i = 0;
        }
        int i5 = (d + i) * 31;
        poe poeVar = this.e;
        if (poeVar != null) {
            i2 = poeVar.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        l8b l8bVar = this.f;
        if (l8bVar != null) {
            i3 = l8bVar.hashCode();
        } else {
            i3 = 0;
        }
        int b2 = woa.b(this.h, woa.b(this.g, (i6 + i3) * 31, 31), 31);
        kxi kxiVar = this.i;
        if (kxiVar != null) {
            i4 = kxiVar.hashCode();
        }
        return b2 + i4;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) mqi.a(this.a)) + ", textDirection=" + ((Object) zri.a(this.b)) + ", lineHeight=" + ((Object) cyi.e(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) f8b.a(this.g)) + ", hyphens=" + ((Object) mi9.a(this.h)) + ", textMotion=" + this.i + ')';
    }

    public aud(int i, long j, rvi rviVar, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) == 0 ? 1 : 0, (i2 & 4) != 0 ? cyi.c : j, (i2 & 8) != 0 ? null : rviVar, null, null, 0, 0, null);
    }
}
