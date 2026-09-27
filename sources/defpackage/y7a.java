package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class y7a extends IOException {
    public boolean a;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes.dex */
    public static class a extends y7a {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y7a, java.io.IOException] */
    public static y7a a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y7a$a, java.io.IOException] */
    public static a b() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y7a, java.io.IOException] */
    public static y7a c() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y7a, java.io.IOException] */
    public static y7a d() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y7a, java.io.IOException] */
    public static y7a e() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
