package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ype {
    public final f78 a;

    public ype(f78 f78Var) {
        this.a = f78Var;
    }

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (this.a.a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ype)) {
            return false;
        }
        return this.a.equals(((ype) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
