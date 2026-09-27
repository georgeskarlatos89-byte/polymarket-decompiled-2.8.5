package io.sentry;

import java.util.Objects;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class e7 implements j2 {
    public static final e7 b = new e7("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));
    public volatile String a;

    public e7(String str) {
        Objects.requireNonNull(str, "value is required");
        this.a = str;
    }

    public final String a() {
        String str;
        String str2 = this.a;
        if (str2 == null) {
            synchronized (this) {
                try {
                    str = this.a;
                    if (str == null) {
                        byte[] bArr = new byte[8];
                        io.sentry.util.o.a().b(bArr);
                        byte b2 = (byte) (bArr[6] & 15);
                        bArr[6] = b2;
                        bArr[6] = (byte) (b2 | 64);
                        long j = 0;
                        for (int i = 0; i < 8; i++) {
                            j = (j << 8) | (bArr[i] & MessagePack.Code.EXT_TIMESTAMP);
                        }
                        char[] cArr = new char[16];
                        io.sentry.util.r.a(cArr, j);
                        String str3 = new String(cArr);
                        this.a = str3;
                        str = str3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e7.class == obj.getClass()) {
            return a().equals(((e7) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // io.sentry.j2
    public final void serialize(l3 l3Var, x0 x0Var) {
        ((io.sentry.internal.debugmeta.c) l3Var).D(a());
    }

    public final String toString() {
        return a();
    }
}
