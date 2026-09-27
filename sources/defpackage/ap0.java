package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ap0 implements yff {
    public final int c;
    public final wff d;

    public ap0(int i, wff wffVar) {
        this.c = i;
        this.d = wffVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return yff.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yff) {
                yff yffVar = (yff) obj;
                if (this.c == yffVar.tag() && this.d.equals(yffVar.intEncoding())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.c) + (this.d.hashCode() ^ 2041407134);
    }

    @Override // defpackage.yff
    public final wff intEncoding() {
        return this.d;
    }

    @Override // defpackage.yff
    public final int tag() {
        return this.c;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.c + "intEncoding=" + this.d + ')';
    }
}
