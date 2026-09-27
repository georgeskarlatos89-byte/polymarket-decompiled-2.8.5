package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lh8 {
    public final ArrayList a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public lh8(ArrayList arrayList, char c, double d, String str, String str2) {
        this.a = arrayList;
        this.b = c;
        this.c = d;
        this.d = str;
        this.e = str2;
    }

    public static int a(String str, String str2, char c) {
        return str2.hashCode() + hdi.e(c * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.e, this.d, this.b);
    }
}
