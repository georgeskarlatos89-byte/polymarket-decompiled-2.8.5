package defpackage;

import kotlin.UInt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class nqa extends iqa {
    public final int a;

    public nqa(int i) {
        this.a = i;
    }

    @Override // defpackage.iqa
    public final Object a() {
        return new UInt(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nqa) && this.a == ((nqa) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        akj akjVar = UInt.b;
        return Integer.hashCode(this.a);
    }
}
