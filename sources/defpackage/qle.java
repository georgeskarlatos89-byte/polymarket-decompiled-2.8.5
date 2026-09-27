package defpackage;

import com.fingerprintjs.android.fpjs_pro.g;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class qle extends rle {
    public final nle c;
    public final String d;
    public final String e;
    public final String f;
    public final ls7 g;

    public qle(nle nleVar) {
        String str;
        this.c = nleVar;
        this.d = nleVar.a;
        String str2 = nleVar.c;
        if (str2 != null) {
            str = str2.replace('#', '5');
            str.getClass();
        } else {
            str = "";
        }
        this.e = str;
        this.f = nleVar.b;
        this.g = new ls7(this, 1);
    }

    @Override // defpackage.rle
    public final String a() {
        return this.f;
    }

    @Override // defpackage.rle
    public final String b() {
        return this.e;
    }

    @Override // defpackage.rle
    public final String c() {
        return this.d;
    }

    @Override // defpackage.rle
    public final zck d() {
        return this.g;
    }

    @Override // defpackage.rle
    public final String e(String str) {
        str.getClass();
        return sv6.m(this.d, StringsKt.v0(f(str), '0'));
    }

    @Override // defpackage.rle
    public final String f(String str) {
        StringBuilder q = g.q(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (rle.a.a(charAt)) {
                q.append(charAt);
            }
        }
        String sb = q.toString();
        return sb.substring(0, Math.min(sb.length(), 15));
    }

    public final String g(String str) {
        str.getClass();
        String str2 = this.c.c;
        if (str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < str2.length(); i2++) {
            char charAt = str2.charAt(i2);
            if (i < str.length()) {
                if (charAt == '#') {
                    charAt = str.charAt(i);
                    i++;
                }
                sb.append(charAt);
            }
        }
        if (i < str.length()) {
            sb.append(' ');
            char[] charArray = str.substring(i).toCharArray();
            charArray.getClass();
            sb.append(charArray);
        }
        return sb.toString();
    }
}
