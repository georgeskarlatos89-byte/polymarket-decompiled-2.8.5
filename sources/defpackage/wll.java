package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class wll implements tml {
    public final int c;
    public final rml d;

    public wll(int i, rml rmlVar) {
        this.c = i;
        this.d = rmlVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return tml.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tml) {
                tml tmlVar = (tml) obj;
                if (this.c == tmlVar.zza() && this.d.equals(tmlVar.zzb())) {
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
        return (this.c ^ 14552422) + (this.d.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.c + "intEncoding=" + this.d + ')';
    }

    @Override // defpackage.tml
    public final int zza() {
        return this.c;
    }

    @Override // defpackage.tml
    public final rml zzb() {
        return this.d;
    }
}
