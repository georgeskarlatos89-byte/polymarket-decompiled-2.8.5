package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n8j {
    public static final n8j d = new n8j(new m8j[0]);
    public final int a;
    public final wwf b;
    public int c;

    static {
        u1k.G(0);
    }

    public n8j(m8j... m8jVarArr) {
        wwf n = jr9.n(m8jVarArr);
        this.b = n;
        this.a = m8jVarArr.length;
        int i = 0;
        while (i < n.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < n.d; i3++) {
                if (((m8j) n.get(i)).equals(n.get(i3))) {
                    q7m.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final m8j a(int i) {
        return (m8j) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n8j.class == obj.getClass()) {
                n8j n8jVar = (n8j) obj;
                if (this.a == n8jVar.a && this.b.equals(n8jVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int hashCode = this.b.hashCode();
            this.c = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        return this.b.toString();
    }
}
