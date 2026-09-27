package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o2j {
    public static final Object q = new Object();
    public static final j7c r;
    public Object b;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public f7c j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object a = q;
    public j7c c = r;

    /* JADX WARN: Type inference failed for: r10v0, types: [d7c, c7c] */
    static {
        g7c g7cVar;
        t68 t68Var = new t68();
        new d85();
        List list = Collections.EMPTY_LIST;
        we8 we8Var = jr9.b;
        wwf wwfVar = wwf.e;
        e7c e7cVar = new e7c();
        h7c h7cVar = h7c.a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            g7cVar = new g7c(uri, null, null, list, wwfVar, null, -9223372036854775807L);
        } else {
            g7cVar = null;
        }
        r = new j7c("androidx.media3.common.Timeline", new c7c(t68Var), g7cVar, new f7c(e7cVar), n7c.B, h7cVar);
        ix2.v(1, 2, 3, 4, 5);
        ix2.v(6, 7, 8, 9, 10);
        u1k.G(11);
        u1k.G(12);
        u1k.G(13);
    }

    public final boolean a() {
        if (this.j != null) {
            return true;
        }
        return false;
    }

    public final void b(j7c j7cVar, Object obj, long j, long j2, long j3, boolean z, boolean z2, f7c f7cVar, long j4, long j5, long j6) {
        j7c j7cVar2;
        Object obj2;
        g7c g7cVar;
        this.a = q;
        if (j7cVar != null) {
            j7cVar2 = j7cVar;
        } else {
            j7cVar2 = r;
        }
        this.c = j7cVar2;
        if (j7cVar != null && (g7cVar = j7cVar.b) != null) {
            obj2 = g7cVar.e;
        } else {
            obj2 = null;
        }
        this.b = obj2;
        this.d = obj;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z;
        this.i = z2;
        this.j = f7cVar;
        this.l = j4;
        this.m = j5;
        this.n = 0;
        this.o = 0;
        this.p = j6;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o2j.class.equals(obj.getClass())) {
                o2j o2jVar = (o2j) obj;
                if (Objects.equals(this.a, o2jVar.a) && Objects.equals(this.c, o2jVar.c) && Objects.equals(this.d, o2jVar.d) && Objects.equals(this.j, o2jVar.j) && this.e == o2jVar.e && this.f == o2jVar.f && this.g == o2jVar.g && this.h == o2jVar.h && this.i == o2jVar.i && this.k == o2jVar.k && this.l == o2jVar.l && this.m == o2jVar.m && this.n == o2jVar.n && this.o == o2jVar.o && this.p == o2jVar.p) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        f7c f7cVar = this.j;
        if (f7cVar != null) {
            i = f7cVar.hashCode();
        }
        int i3 = (i2 + i) * 31;
        long j = this.e;
        int i4 = (i3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i5 = (i4 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        int i6 = (((((((i5 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j4 = this.l;
        int i7 = (i6 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.m;
        int i8 = (((((i7 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j6 = this.p;
        return i8 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
