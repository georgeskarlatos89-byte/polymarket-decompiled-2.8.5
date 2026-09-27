package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class rtd {
    public final Object a;
    public final Object b;

    public rtd(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rtd)) {
            return false;
        }
        rtd rtdVar = (rtd) obj;
        if (!Objects.equals(rtdVar.a, this.a) || !Objects.equals(rtdVar.b, this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.a);
        sb.append(ApiConstant.SPACE);
        return ix2.o(sb, this.b, "}");
    }
}
