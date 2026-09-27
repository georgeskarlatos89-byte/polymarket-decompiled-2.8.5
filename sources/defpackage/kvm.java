package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class kvm {
    public final Context a;
    public final gci b;

    public kvm(Context context, gci gciVar) {
        this.a = context;
        this.b = gciVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof kvm) {
                kvm kvmVar = (kvm) obj;
                if (this.a.equals(kvmVar.a)) {
                    gci gciVar = kvmVar.b;
                    gci gciVar2 = this.b;
                    if (gciVar2 == null) {
                        if (gciVar == null) {
                            return true;
                        }
                        return false;
                    }
                    if (gciVar2.equals(gciVar)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        gci gciVar = this.b;
        if (gciVar == null) {
            hashCode = 0;
        } else {
            hashCode = gciVar.hashCode();
        }
        return hashCode ^ (hashCode2 * 1000003);
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + valueOf.length() + 1);
        k84.q(sb, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb.append("}");
        return sb.toString();
    }
}
