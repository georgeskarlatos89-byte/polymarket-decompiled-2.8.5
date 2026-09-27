package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class iw8 implements rma {
    public final q59 b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public iw8(String str) {
        lza lzaVar = q59.a;
        this.c = null;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            zqn.c(lzaVar, "Argument must not be null");
            this.b = lzaVar;
            return;
        }
        dmk.v("Must not be null or empty");
        throw null;
    }

    public final String a() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        zqn.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL b() {
        URL url = this.f;
        if (url == null) {
            if (TextUtils.isEmpty(this.e)) {
                String str = this.d;
                if (TextUtils.isEmpty(str)) {
                    URL url2 = this.c;
                    zqn.c(url2, "Argument must not be null");
                    str = url2.toString();
                }
                this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            url = new URL(this.e);
            this.f = url;
        }
        return url;
    }

    @Override // defpackage.rma
    public final boolean equals(Object obj) {
        if (obj instanceof iw8) {
            iw8 iw8Var = (iw8) obj;
            if (a().equals(iw8Var.a()) && this.b.equals(iw8Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.rma
    public final int hashCode() {
        int i = this.h;
        if (i == 0) {
            int hashCode = a().hashCode();
            this.h = hashCode;
            int hashCode2 = this.b.hashCode() + (hashCode * 31);
            this.h = hashCode2;
            return hashCode2;
        }
        return i;
    }

    public final String toString() {
        return a();
    }

    @Override // defpackage.rma
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = a().getBytes(rma.a);
        }
        messageDigest.update(this.g);
    }

    public iw8(URL url) {
        lza lzaVar = q59.a;
        zqn.c(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        zqn.c(lzaVar, "Argument must not be null");
        this.b = lzaVar;
    }
}
