package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class epg {
    public final f3g a;
    public final int b;
    public final long c;

    public epg(f3g f3gVar, int i, long j) {
        this.a = f3gVar;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epg)) {
            return false;
        }
        epg epgVar = (epg) obj;
        if (this.a == epgVar.a && this.b == epgVar.b && this.c == epgVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + woa.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", selectableId=");
        return ix2.n(sb, this.c, ')');
    }
}
