package defpackage;

import org.msgpack.core.MessagePacker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class pr9 extends x2 implements h3k {
    public static final pr9 a = new Object();

    @Override // defpackage.h3k
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h3k)) {
            return false;
        }
        x3k valueType = ((x2) ((h3k) obj)).getValueType();
        valueType.getClass();
        if (valueType == x3k.NIL) {
            return true;
        }
        return false;
    }

    @Override // defpackage.h3k
    public final void f(MessagePacker messagePacker) {
        messagePacker.packNil();
    }

    @Override // defpackage.h3k
    public final x3k getValueType() {
        return x3k.NIL;
    }

    @Override // defpackage.h3k
    public final String h() {
        return "null";
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "null";
    }
}
