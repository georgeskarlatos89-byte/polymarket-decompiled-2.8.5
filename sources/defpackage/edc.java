package defpackage;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URI;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class edc implements mzh {
    public volatile String a;
    public volatile Reader b;
    public final Object c;
    public final String d;
    public final String e;
    public final URI f;

    public edc(String str, String str2, String str3, URI uri) {
        this.d = str == null ? "message" : str;
        this.a = str2 == null ? "" : str2;
        this.b = null;
        this.c = new Object();
        this.e = str3;
        this.f = uri;
    }

    public final String a() {
        if (this.a != null) {
            return this.a;
        }
        synchronized (this.c) {
            try {
                if (this.a != null) {
                    return this.a;
                }
                char[] cArr = new char[2000];
                StringBuilder sb = new StringBuilder(2000);
                while (true) {
                    try {
                        int read = this.b.read(cArr, 0, 2000);
                        if (read == -1) {
                            break;
                        }
                        sb.append(cArr, 0, read);
                    } catch (IOException unused) {
                    }
                }
                this.b.close();
                this.a = sb.toString();
                this.b = new StringReader(this.a);
                return this.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && edc.class == obj.getClass()) {
                edc edcVar = (edc) obj;
                if (this.d.equals(edcVar.d) && Objects.equals(a(), edcVar.a()) && Objects.equals(this.e, edcVar.e) && Objects.equals(this.f, edcVar.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.d, a(), this.e, this.f);
    }

    public final String toString() {
        String str;
        String sb;
        synchronized (this.c) {
            try {
                StringBuilder sb2 = new StringBuilder("MessageEvent(eventName=");
                sb2.append(this.d);
                sb2.append(",data=");
                if (this.a == null) {
                    str = "<streaming>";
                } else {
                    str = this.a;
                }
                sb2.append(str);
                if (this.e != null) {
                    sb2.append(",id=");
                    sb2.append(this.e);
                }
                sb2.append(",origin=");
                sb2.append(this.f);
                sb2.append(')');
                sb = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb;
    }
}
