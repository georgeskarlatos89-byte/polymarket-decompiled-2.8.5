package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nng {
    public final qng a;
    public final qng b;

    public nng(qng qngVar, qng qngVar2) {
        this.a = qngVar;
        this.b = qngVar2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && nng.class == obj.getClass()) {
                nng nngVar = (nng) obj;
                if (this.a.equals(nngVar.a) && this.b.equals(nngVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        qng qngVar = this.a;
        sb.append(qngVar);
        qng qngVar2 = this.b;
        if (qngVar.equals(qngVar2)) {
            str = "";
        } else {
            str = ", " + qngVar2;
        }
        return woa.r(sb, str, "]");
    }
}
