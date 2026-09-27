package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class AFd1jSDK {
    private final int getMediationNetwork;

    public AFd1jSDK(int i) {
        this.getMediationNetwork = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFAdRevenueData(HttpURLConnection httpURLConnection) {
        Throwable th;
        BufferedReader bufferedReader;
        InputStream errorStream;
        String str;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Exception e) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
                if (e.getMessage() == null) {
                    str = "";
                } else {
                    str = e.getMessage();
                }
                aFLogger.e(aFg1cSDK, str, e, false, false, false, false);
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z = true;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            if (!z) {
                                sb.append('\n');
                            }
                            sb.append(readLine);
                            z = false;
                        } else {
                            String obj = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader == null) {
                            bufferedReader.close();
                            throw th;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            if (inputStreamReader != null) {
            }
            if (bufferedReader == null) {
            }
        }
    }

    public final AFe1ySDK<String> getMonetizationNetwork(AFd1cSDK aFd1cSDK) {
        Throwable th;
        byte[] mediationNetwork;
        HttpURLConnection httpURLConnection;
        String str;
        boolean z;
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection2 = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            mediationNetwork = aFd1cSDK.getMediationNetwork();
            StringBuilder sb = new StringBuilder();
            sb.append(aFd1cSDK.getMediationNetwork);
            sb.append(":");
            sb.append(aFd1cSDK.AFAdRevenueData);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            byte[] mediationNetwork2 = aFd1cSDK.getMediationNetwork();
            if (aFd1cSDK.getRevenue() && mediationNetwork2 != null) {
                if (aFd1cSDK.getMonetizationNetwork()) {
                    str2 = "<encrypted>";
                } else {
                    str2 = new String(mediationNetwork2, Charset.defaultCharset());
                }
                sb2.append("\n payload: ");
                sb2.append(str2);
            }
            for (Map.Entry<String, String> entry : aFd1cSDK.getRevenue.entrySet()) {
                sb2.append("\n ");
                sb2.append(entry.getKey());
                sb2.append(": ");
                sb2.append(entry.getValue());
            }
            StringBuilder sb3 = new StringBuilder("[");
            sb3.append(aFd1cSDK.hashCode());
            sb3.append("] ");
            sb3.append((Object) sb2);
            AFLogger.INSTANCE.d(AFg1cSDK.HTTP_CLIENT, sb3.toString());
            httpURLConnection = (HttpURLConnection) new URL(aFd1cSDK.AFAdRevenueData).openConnection();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            httpURLConnection.setRequestMethod(aFd1cSDK.getMediationNetwork);
            if (aFd1cSDK.AFAdRevenueData()) {
                httpURLConnection.setUseCaches(false);
            }
            if (!aFd1cSDK.component3()) {
                httpURLConnection.setInstanceFollowRedirects(false);
            }
            int i = this.getMediationNetwork;
            int i2 = aFd1cSDK.areAllFieldsValid;
            if (i2 != -1) {
                i = i2;
            }
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i);
            if (aFd1cSDK.getMonetizationNetwork()) {
                str = "application/octet-stream";
            } else {
                str = "application/json";
            }
            httpURLConnection.addRequestProperty("Content-Type", str);
            for (Map.Entry<String, String> entry2 : aFd1cSDK.getRevenue.entrySet()) {
                httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
            }
            if (mediationNetwork != null) {
                httpURLConnection.setDoOutput(true);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(mediationNetwork.length);
                httpURLConnection.setRequestProperty("Content-Length", sb4.toString());
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    try {
                        bufferedOutputStream2.write(mediationNetwork);
                        bufferedOutputStream2.close();
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            if (httpURLConnection.getResponseCode() / 100 == 2) {
                z = true;
            } else {
                z = false;
            }
            String str3 = "";
            if (aFd1cSDK.getCurrencyIso4217Code()) {
                str3 = AFAdRevenueData(httpURLConnection);
            }
            String str4 = str3;
            AFd1dSDK aFd1dSDK = new AFd1dSDK(System.currentTimeMillis() - currentTimeMillis);
            StringBuilder sb5 = new StringBuilder("response code:");
            sb5.append(httpURLConnection.getResponseCode());
            sb5.append(ApiConstant.SPACE);
            sb5.append(httpURLConnection.getResponseMessage());
            sb5.append("\n body:");
            sb5.append(str4);
            sb5.append("\n took ");
            sb5.append(aFd1dSDK.AFAdRevenueData);
            sb5.append("ms");
            String obj = sb5.toString();
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
            StringBuilder sb6 = new StringBuilder("[");
            sb6.append(aFd1cSDK.hashCode());
            sb6.append("] ");
            sb6.append(obj);
            aFLogger.d(aFg1cSDK, sb6.toString());
            HashMap hashMap = new HashMap(httpURLConnection.getHeaderFields());
            hashMap.remove(null);
            AFe1ySDK<String> aFe1ySDK = new AFe1ySDK<>(str4, httpURLConnection.getResponseCode(), z, hashMap, aFd1dSDK);
            httpURLConnection.disconnect();
            return aFe1ySDK;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection2 = httpURLConnection;
            try {
                AFd1dSDK aFd1dSDK2 = new AFd1dSDK(System.currentTimeMillis() - currentTimeMillis);
                StringBuilder sb7 = new StringBuilder("error: ");
                sb7.append(th);
                sb7.append("\n took ");
                sb7.append(aFd1dSDK2.AFAdRevenueData);
                sb7.append("ms");
                String obj2 = sb7.toString();
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK2 = AFg1cSDK.HTTP_CLIENT;
                StringBuilder sb8 = new StringBuilder("[");
                sb8.append(aFd1cSDK.hashCode());
                sb8.append("] ");
                sb8.append(obj2);
                aFLogger2.e(aFg1cSDK2, sb8.toString(), th, false, false, false);
                throw new HttpException(th, aFd1dSDK2);
            } catch (Throwable th6) {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th6;
            }
        }
    }
}
