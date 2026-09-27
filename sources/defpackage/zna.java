package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zna implements Serializable {
    public static final zna b = new zna("EC");
    public static final zna c = new zna("RSA");
    public static final zna d = new zna("oct");
    public static final zna e = new zna("OKP");
    public final String a;

    public zna(String str) {
        if (str != null) {
            this.a = str;
        } else {
            dmk.v("The key type value must not be null");
            throw null;
        }
    }

    public static zna a(String str) {
        if (str != null) {
            zna znaVar = b;
            if (str.equals(znaVar.a)) {
                return znaVar;
            }
            zna znaVar2 = c;
            if (str.equals(znaVar2.a)) {
                return znaVar2;
            }
            zna znaVar3 = d;
            if (str.equals(znaVar3.a)) {
                return znaVar3;
            }
            zna znaVar4 = e;
            if (str.equals(znaVar4.a)) {
                return znaVar4;
            }
            return new zna(str);
        }
        dmk.v("The key type to parse must not be null");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zna) {
            if (this.a.equals(((zna) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
