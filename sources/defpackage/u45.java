package defpackage;

import io.ably.lib.rest.Auth;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class u45 {
    public static final y45 a;
    public static final y45 b;

    static {
        new y45("application", Auth.WILDCARD_CLIENTID);
        new y45("application", "atom+xml");
        new y45("application", "cbor");
        a = new y45("application", "json");
        new y45("application", "hal+json");
        new y45("application", "javascript");
        b = new y45("application", "octet-stream");
        new y45("application", "rss+xml");
        new y45("application", "soap+xml");
        new y45("application", "xml");
        new y45("application", "xml-dtd");
        new y45("application", "yaml");
        new y45("application", "zip");
        new y45("application", "gzip");
        new y45("application", "x-www-form-urlencoded");
        new y45("application", "pdf");
        new y45("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        new y45("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        new y45("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        new y45("application", "protobuf");
        new y45("application", "wasm");
        new y45("application", "problem+json");
        new y45("application", "problem+xml");
    }
}
