package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f7c {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        new f7c(new e7c());
        u1k.G(0);
        u1k.G(1);
        u1k.G(2);
        u1k.G(3);
        u1k.G(4);
    }

    public f7c(e7c e7cVar) {
        long j = e7cVar.a;
        long j2 = e7cVar.b;
        long j3 = e7cVar.c;
        float f = e7cVar.d;
        float f2 = e7cVar.e;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e7c, java.lang.Object] */
    public final e7c a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7c)) {
            return false;
        }
        f7c f7cVar = (f7c) obj;
        if (this.a == f7cVar.a && this.b == f7cVar.b && this.c == f7cVar.c && this.d == f7cVar.d && this.e == f7cVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.a;
        long j2 = this.b;
        int i2 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i3 = (i2 + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.d;
        int i4 = 0;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        float f2 = this.e;
        if (f2 != 0.0f) {
            i4 = Float.floatToIntBits(f2);
        }
        return i5 + i4;
    }
}
