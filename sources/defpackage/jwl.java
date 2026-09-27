package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class jwl implements vxl {
    public final int c;
    public final qxl d;

    public jwl(int i, qxl qxlVar) {
        this.c = i;
        this.d = qxlVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return vxl.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vxl) {
                vxl vxlVar = (vxl) obj;
                if (this.c == vxlVar.zza() && this.d.equals(vxlVar.zzb())) {
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

    @Override // defpackage.vxl
    public final int zza() {
        return this.c;
    }

    @Override // defpackage.vxl
    public final qxl zzb() {
        return this.d;
    }
}
