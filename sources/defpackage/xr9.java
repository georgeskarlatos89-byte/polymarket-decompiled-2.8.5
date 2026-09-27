package defpackage;

import java.util.Arrays;
import org.msgpack.core.MessagePacker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xr9 extends w2 {
    @Override // defpackage.h3k
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h3k) {
            h3k h3kVar = (h3k) obj;
            x3k valueType = ((x2) h3kVar).getValueType();
            valueType.getClass();
            if (valueType == x3k.STRING) {
                boolean z = h3kVar instanceof xr9;
                byte[] bArr = this.a;
                if (z) {
                    return Arrays.equals(bArr, ((xr9) h3kVar).a);
                }
                byte[] bArr2 = h3kVar.q().a;
                return Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr2.length));
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.h3k
    public final void f(MessagePacker messagePacker) {
        byte[] bArr = this.a;
        messagePacker.packRawStringHeader(bArr.length);
        messagePacker.writePayload(bArr);
    }

    @Override // defpackage.h3k
    public final x3k getValueType() {
        return x3k.STRING;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.x2
    public final xr9 C() {
        return this;
    }

    @Override // defpackage.x2, defpackage.h3k
    public final xr9 q() {
        return this;
    }
}
