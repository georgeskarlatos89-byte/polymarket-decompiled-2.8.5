package defpackage;

import java.util.Arrays;
import org.msgpack.core.MessagePacker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class br9 extends x2 implements ar9 {
    public final byte a;
    public final byte[] b;

    public br9(byte b, byte[] bArr) {
        this.a = b;
        this.b = bArr;
    }

    @Override // defpackage.h3k
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h3k) {
                h3k h3kVar = (h3k) obj;
                x3k valueType = ((x2) h3kVar).getValueType();
                valueType.getClass();
                if (valueType == x3k.EXTENSION) {
                    tt7 m = h3kVar.m();
                    if (this.a == m.getType() && Arrays.equals(this.b, m.getData())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.h3k
    public final void f(MessagePacker messagePacker) {
        byte[] bArr = this.b;
        messagePacker.packExtensionTypeHeader(this.a, bArr.length);
        messagePacker.writePayload(bArr);
    }

    @Override // defpackage.tt7
    public final byte[] getData() {
        return this.b;
    }

    @Override // defpackage.tt7
    public final byte getType() {
        return this.a;
    }

    @Override // defpackage.h3k
    public final x3k getValueType() {
        return x3k.EXTENSION;
    }

    @Override // defpackage.h3k
    public final String h() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(Byte.toString(this.a));
        sb.append(",\"");
        for (byte b : this.b) {
            sb.append(Integer.toString(b, 16));
        }
        sb.append("\"]");
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.a + 31;
        for (byte b : this.b) {
            i = (i * 31) + b;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(Byte.toString(this.a));
        sb.append(",0x");
        for (byte b : this.b) {
            sb.append(Integer.toString(b, 16));
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.x2, defpackage.h3k
    public final tt7 m() {
        return this;
    }

    @Override // defpackage.x2
    public final ar9 v() {
        return this;
    }
}
