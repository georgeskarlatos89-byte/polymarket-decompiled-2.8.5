package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ytb extends vtb implements a84 {
    public static final xtb e = new xtb(null);
    public static final ytb f = new ytb(1, 0);

    public ytb(long j, long j2) {
        super(j, j2, 1L);
    }

    public final boolean a(long j) {
        if (this.a <= j && j <= this.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vtb
    public final boolean equals(Object obj) {
        if (obj instanceof ytb) {
            if (!isEmpty() || !((ytb) obj).isEmpty()) {
                ytb ytbVar = (ytb) obj;
                if (this.a == ytbVar.a && this.b == ytbVar.b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.vtb
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.vtb
    public final boolean isEmpty() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vtb
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
