package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class x0a {
    public final long a;

    public /* synthetic */ x0a(long j) {
        this.a = j;
    }

    public static long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final boolean equals(Object obj) {
        long j = this.a;
        if (!(obj instanceof x0a) || j != ((x0a) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return sv6.o(sb, (int) (j & 4294967295L), ')');
    }
}
