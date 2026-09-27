package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class uea extends kfa {
    public final boolean a;
    public final SerialDescriptor b;
    public final String c;

    public uea(Object obj, boolean z, SerialDescriptor serialDescriptor) {
        obj.getClass();
        this.a = z;
        this.b = serialDescriptor;
        this.c = obj.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            dmk.v("Failed requirement.");
            throw null;
        }
    }

    @Override // defpackage.kfa
    public final String a() {
        return this.c;
    }

    @Override // defpackage.kfa
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && uea.class == obj.getClass()) {
                uea ueaVar = (uea) obj;
                if (this.a == ueaVar.a && Intrinsics.areEqual(this.c, ueaVar.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.kfa
    public final String toString() {
        boolean z = this.a;
        String str = this.c;
        if (z) {
            StringBuilder sb = new StringBuilder();
            v1i.a(sb, str);
            return sb.toString();
        }
        return str;
    }
}
