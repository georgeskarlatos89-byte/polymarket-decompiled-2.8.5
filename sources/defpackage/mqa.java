package defpackage;

import kotlin.UByte;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class mqa extends iqa {
    public final byte a;

    public mqa(byte b) {
        this.a = b;
    }

    @Override // defpackage.iqa
    public final Object a() {
        return UByte.m884boximpl(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mqa) && this.a == ((mqa) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        tjj tjjVar = UByte.b;
        return Byte.hashCode(this.a);
    }
}
