package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nfj {
    public int a;
    public final String b;

    public nfj() {
        this.a = 3;
        this.b = UUID.randomUUID().toString();
    }

    public String a() {
        String str;
        int i = this.a;
        if (i == 0) {
            return this.b;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        if (i == 0) {
            str = "String";
        } else if (i != 1) {
            str = "Unknown";
        } else {
            str = "ArrayBuffer";
        }
        throw new IllegalStateException(ix2.p(sb, str, " expected, but got ", "String"));
    }

    public void b(int i) {
        if (i != 0) {
            if (i != 0) {
                if (i != 2 && i != 1 && i != 23 && i != 3) {
                    Locale locale = Locale.US;
                    dmk.v(ace.f(i, "Invalid environment value "));
                    return;
                }
            } else {
                i = 0;
            }
        }
        this.a = i;
    }

    public nfj(String str) {
        this.b = str;
        this.a = 0;
    }

    public nfj(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public nfj(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.b = null;
        this.a = 1;
    }
}
