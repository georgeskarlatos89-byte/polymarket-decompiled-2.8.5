package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface rma {
    public static final Charset a = Charset.forName("UTF-8");

    boolean equals(Object obj);

    int hashCode();

    void updateDiskCacheKey(MessageDigest messageDigest);
}
