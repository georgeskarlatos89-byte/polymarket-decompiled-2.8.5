package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class aqe {
    public final Object a;
    public final int b;
    public final j7c c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        ix2.v(0, 1, 2, 3, 4);
        u1k.G(5);
        u1k.G(6);
    }

    public aqe(Object obj, int i, j7c j7cVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = j7cVar;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aqe.class == obj.getClass()) {
            aqe aqeVar = (aqe) obj;
            if (this.b == aqeVar.b && this.e == aqeVar.e && this.f == aqeVar.f && this.g == aqeVar.g && this.h == aqeVar.h && this.i == aqeVar.i && Objects.equals(this.c, aqeVar.c) && Objects.equals(this.a, aqeVar.a) && Objects.equals(this.d, aqeVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }
}
