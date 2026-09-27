package defpackage;

import java.util.Arrays;
import org.msgpack.core.MessagePacker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tq9 extends w2 {
    @Override // defpackage.h3k
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3k)) {
            return false;
        }
        h3k h3kVar = (h3k) obj;
        x3k valueType = ((x2) h3kVar).getValueType();
        valueType.getClass();
        if (valueType != x3k.BINARY) {
            return false;
        }
        boolean z = h3kVar instanceof tq9;
        byte[] bArr = this.a;
        if (z) {
            return Arrays.equals(bArr, ((tq9) h3kVar).a);
        }
        byte[] bArr2 = h3kVar.n().a;
        return Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr2.length));
    }

    @Override // defpackage.h3k
    public final void f(MessagePacker messagePacker) {
        byte[] bArr = this.a;
        messagePacker.packBinaryHeader(bArr.length);
        messagePacker.writePayload(bArr);
    }

    @Override // defpackage.h3k
    public final x3k getValueType() {
        return x3k.BINARY;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.x2, defpackage.h3k
    public final tq9 n() {
        return this;
    }

    @Override // defpackage.x2
    public final tq9 t() {
        return this;
    }
}
