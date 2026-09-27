package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class g1o extends l2o {
    public final String b;
    public final int c;
    public int d = 0;

    public g1o(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.l2o
    public final int a() {
        return (char) this.c;
    }

    @Override // defpackage.l2o
    public final String b() {
        return "com/google/mediapipe/framework/Graph".replace('/', '.');
    }

    @Override // defpackage.l2o
    public final String c() {
        return "Graph.java";
    }

    @Override // defpackage.l2o
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g1o) {
            g1o g1oVar = (g1o) obj;
            if (this.b.equals(g1oVar.b) && this.c == g1oVar.c && b().equals(g1oVar.b())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            int e = hdi.e(4867, 31, this.b) + this.c;
            this.d = e;
            return e;
        }
        return i;
    }
}
