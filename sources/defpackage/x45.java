package defpackage;

import io.ably.lib.rest.Auth;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class x45 {
    public static final y45 a;
    public static final y45 b;

    static {
        new y45("text", Auth.WILDCARD_CLIENTID);
        a = new y45("text", "plain");
        new y45("text", "css");
        new y45("text", "csv");
        new y45("text", "html");
        new y45("text", "javascript");
        new y45("text", "vcard");
        new y45("text", "xml");
        b = new y45("text", "event-stream");
    }
}
