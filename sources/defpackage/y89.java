package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class y89 implements Comparable {
    public final String a;
    public final x89 b;
    public final long c;
    public final int d;
    public final long e;
    public final z17 f;
    public final String g;
    public final String h;
    public final long i;
    public final long j;
    public final boolean k;

    public y89(String str, x89 x89Var, long j, int i, long j2, z17 z17Var, String str2, String str3, long j3, long j4, boolean z) {
        this.a = str;
        this.b = x89Var;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = z17Var;
        this.g = str2;
        this.h = str3;
        this.i = j3;
        this.j = j4;
        this.k = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long longValue = l.longValue();
        long j = this.e;
        if (j > longValue) {
            return 1;
        }
        if (j < l.longValue()) {
            return -1;
        }
        return 0;
    }
}
