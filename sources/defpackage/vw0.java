package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vw0 {
    public static final vw0 f = new vw0(10485760, 200, 10000, 81920, 604800000);
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public vw0(long j, int i, int i2, int i3, long j2) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vw0) {
            vw0 vw0Var = (vw0) obj;
            if (this.a == vw0Var.a && this.b == vw0Var.b && this.c == vw0Var.c && this.d == vw0Var.d && this.e == vw0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        long j2 = this.d;
        return this.e ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.a);
        sb.append(", loadBatchSize=");
        sb.append(this.b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return ix2.i(this.e, "}", sb);
    }
}
