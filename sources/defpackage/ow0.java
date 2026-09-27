package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ow0 {
    public final String a;
    public final Class b;
    public final Object c;

    public ow0(String str, Class cls, CaptureRequest.Key key) {
        this.a = str;
        if (cls != null) {
            this.b = cls;
            this.c = key;
        } else {
            dmk.s("Null valueClass");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ow0) {
                ow0 ow0Var = (ow0) obj;
                if (this.a.equals(ow0Var.a) && this.b.equals(ow0Var.b)) {
                    Object obj2 = ow0Var.c;
                    Object obj3 = this.c;
                    if (obj3 == null) {
                        if (obj2 == null) {
                            return true;
                        }
                        return false;
                    }
                    if (obj3.equals(obj2)) {
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
        int hashCode2 = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.c;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option{id=");
        sb.append(this.a);
        sb.append(", valueClass=");
        sb.append(this.b);
        sb.append(", token=");
        return ix2.o(sb, this.c, "}");
    }
}
