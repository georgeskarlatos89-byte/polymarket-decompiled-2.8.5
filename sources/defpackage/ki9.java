package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ki9 extends FilterInputStream {
    public final HttpURLConnection a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ki9(HttpURLConnection httpURLConnection) {
        super(r0);
        InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        this.a = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.a.disconnect();
    }
}
