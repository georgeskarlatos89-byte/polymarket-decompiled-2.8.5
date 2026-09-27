package defpackage;

import com.checkout.components.interfaces.model.Phone;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sxf {
    public final String a;
    public final Phone b;

    public sxf(String str, Phone phone) {
        this.a = str;
        this.b = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxf)) {
            return false;
        }
        sxf sxfVar = (sxf) obj;
        if (Intrinsics.areEqual(this.a, sxfVar.a) && Intrinsics.areEqual(this.b, sxfVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Phone phone = this.b;
        if (phone != null) {
            i = phone.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "Data(email=" + this.a + ", phone=" + this.b + ")";
    }
}
