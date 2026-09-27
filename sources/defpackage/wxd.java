package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wxd extends kyd {
    public final float c;
    public final float d;

    public wxd(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxd)) {
            return false;
        }
        wxd wxdVar = (wxd) obj;
        if (Float.compare(this.c, wxdVar.c) == 0 && Float.compare(this.d, wxdVar.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.c);
        sb.append(", y=");
        return ix2.m(sb, this.d, ')');
    }
}
