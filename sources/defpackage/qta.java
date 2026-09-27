package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qta implements Comparable {
    public static final pta d = new pta(null);
    public static final qta e = new qta(2, 4, 0);
    public final int a;
    public final int b;
    public final int c;

    public qta(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256) {
            this.c = (i << 16) + (i2 << 8);
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + ".0").toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        qta qtaVar = (qta) obj;
        qtaVar.getClass();
        return this.c - qtaVar.c;
    }

    public final boolean equals(Object obj) {
        qta qtaVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof qta) {
            qtaVar = (qta) obj;
        } else {
            qtaVar = null;
        }
        if (qtaVar != null && this.c == qtaVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        return ix2.i(this.b, ".0", sb);
    }
}
