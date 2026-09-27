package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class z7a extends IOException {
    public boolean a;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class a extends z7a {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z7a, java.io.IOException] */
    public static z7a a() {
        return new IOException("Protocol message contained an invalid tag (zero).");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z7a, java.io.IOException] */
    public static z7a b() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z7a$a, java.io.IOException] */
    public static a c() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z7a, java.io.IOException] */
    public static z7a d() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z7a, java.io.IOException] */
    public static z7a e() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z7a, java.io.IOException] */
    public static z7a f() {
        return new IOException("Failed to parse the message.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z7a, java.io.IOException] */
    public static z7a g() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
