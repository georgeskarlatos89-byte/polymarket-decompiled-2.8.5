package bo.app;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c6 implements Closeable {
    public final InputStream[] a;

    public c6(InputStream[] inputStreamArr) {
        this.a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.a) {
            Charset charset = di.a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }
}
