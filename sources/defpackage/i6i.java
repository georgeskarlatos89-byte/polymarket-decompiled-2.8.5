package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class i6i implements Closeable {
    public static final String b = StandardCharsets.UTF_8.name();
    public final HttpsURLConnection a;

    public i6i(HttpsURLConnection httpsURLConnection) {
        this.a = httpsURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream errorStream;
        HttpsURLConnection httpsURLConnection = this.a;
        int responseCode = httpsURLConnection.getResponseCode();
        if (200 <= responseCode && responseCode < 300) {
            errorStream = httpsURLConnection.getInputStream();
        } else {
            errorStream = httpsURLConnection.getErrorStream();
        }
        if (errorStream != null) {
            errorStream.close();
        }
        httpsURLConnection.disconnect();
    }

    public final a9i e() {
        InputStream errorStream;
        HttpsURLConnection httpsURLConnection = this.a;
        int responseCode = httpsURLConnection.getResponseCode();
        int responseCode2 = httpsURLConnection.getResponseCode();
        if (200 <= responseCode2 && responseCode2 < 300) {
            errorStream = httpsURLConnection.getInputStream();
        } else {
            errorStream = httpsURLConnection.getErrorStream();
        }
        String str = null;
        if (errorStream != null) {
            try {
                Scanner useDelimiter = new Scanner(errorStream, b).useDelimiter("\\A");
                if (useDelimiter.hasNext()) {
                    str = useDelimiter.next();
                }
                errorStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    uon.b(errorStream, th);
                    throw th2;
                }
            }
        }
        Map<String, List<String>> headerFields = httpsURLConnection.getHeaderFields();
        headerFields.getClass();
        return new a9i(responseCode, str, headerFields);
    }
}
