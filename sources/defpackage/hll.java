package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class hll implements eml {
    public final int c;
    public final aml d;

    public hll(int i, aml amlVar) {
        this.c = i;
        this.d = amlVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return eml.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof eml) {
                eml emlVar = (eml) obj;
                if (this.c == emlVar.zza() && this.d.equals(emlVar.zzb())) {
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

    @Override // defpackage.eml
    public final int zza() {
        return this.c;
    }

    @Override // defpackage.eml
    public final aml zzb() {
        return this.d;
    }
}
