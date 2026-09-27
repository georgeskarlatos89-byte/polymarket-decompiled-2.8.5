package defpackage;

import org.msgpack.core.MessagePacker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class vq9 extends x2 implements h3k {
    public static final vq9 b = new vq9(true);
    public static final vq9 c = new vq9(false);
    public final boolean a;

    public vq9(boolean z) {
        this.a = z;
    }

    @Override // defpackage.h3k
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h3k) {
                h3k h3kVar = (h3k) obj;
                x3k valueType = ((x2) h3kVar).getValueType();
                valueType.getClass();
                if (valueType == x3k.BOOLEAN) {
                    if (this.a == h3kVar.r().a) {
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

    @Override // defpackage.h3k
    public final void f(MessagePacker messagePacker) {
        messagePacker.packBoolean(this.a);
    }

    @Override // defpackage.h3k
    public final x3k getValueType() {
        return x3k.BOOLEAN;
    }

    @Override // defpackage.h3k
    public final String h() {
        return Boolean.toString(this.a);
    }

    public final int hashCode() {
        if (this.a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.x2, defpackage.h3k
    public final vq9 r() {
        return this;
    }

    @Override // defpackage.x2
    public final vq9 u() {
        return this;
    }
}
