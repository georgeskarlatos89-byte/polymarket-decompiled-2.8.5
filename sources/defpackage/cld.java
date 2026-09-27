package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cld {
    public static final z65 e = new z65(18);
    public final Object a;
    public final bld b;
    public final String c;
    public volatile byte[] d;

    public cld(String str, Object obj, bld bldVar) {
        if (!TextUtils.isEmpty(str)) {
            this.c = str;
            this.a = obj;
            this.b = bldVar;
            return;
        }
        dmk.v("Must not be null or empty");
        throw null;
    }

    public static cld a(Object obj, String str) {
        return new cld(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cld) {
            return this.c.equals(((cld) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return woa.r(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
