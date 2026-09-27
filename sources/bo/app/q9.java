package bo.app;

import defpackage.ace;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class q9 {
    public static final FilterInputStream a(HttpURLConnection httpURLConnection) {
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode / 100 == 2) {
            if ("gzip".equalsIgnoreCase(httpURLConnection.getContentEncoding())) {
                return new GZIPInputStream(httpURLConnection.getInputStream());
            }
            return new BufferedInputStream(httpURLConnection.getInputStream());
        }
        StringBuilder o = ace.o(responseCode, "Bad HTTP response code from Braze: [", "] to url: ");
        o.append(httpURLConnection.getURL());
        throw new xb(o.toString());
    }
}
