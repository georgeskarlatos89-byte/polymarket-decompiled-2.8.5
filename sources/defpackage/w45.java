package defpackage;

import io.ably.lib.rest.Auth;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class w45 {
    public static final y45 a;

    static {
        new y45("multipart", Auth.WILDCARD_CLIENTID);
        new y45("multipart", "mixed");
        new y45("multipart", "alternative");
        new y45("multipart", "related");
        a = new y45("multipart", "form-data");
        new y45("multipart", "signed");
        new y45("multipart", "encrypted");
        new y45("multipart", "byteranges");
    }
}
