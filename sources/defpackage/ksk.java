package defpackage;

import android.os.AsyncTask;
import io.ably.lib.http.HttpConstants;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ksk extends AsyncTask {
    public static String a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        try {
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(sl1.DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS);
            httpURLConnection.setRequestMethod(HttpConstants.Methods.GET);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return Integer.valueOf(httpURLConnection.getResponseCode()).toString();
        } finally {
            httpURLConnection.disconnect();
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            return a(((String[]) objArr)[0]);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
    }
}
