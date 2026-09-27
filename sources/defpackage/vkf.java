package defpackage;

import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vkf {
    public final String a;
    public final String b;

    public vkf(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkf)) {
            return false;
        }
        vkf vkfVar = (vkf) obj;
        if (Intrinsics.areEqual(this.a, vkfVar.a) && Intrinsics.areEqual(this.b, vkfVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        Charset charset = Charsets.UTF_8;
        String encode = URLEncoder.encode(this.a, charset.name());
        encode.getClass();
        String encode2 = URLEncoder.encode(this.b, charset.name());
        encode2.getClass();
        return sv6.n(encode, "=", encode2);
    }
}
