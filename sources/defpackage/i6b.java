package defpackage;

import android.util.Log;
import io.ably.lib.util.AgentHeaderCreator;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class i6b {
    public static final yw8 b = new yw8("LibraryVersion", "");
    public static final i6b c = new i6b();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        IOException e;
        Object obj;
        InputStream inputStream;
        yw8 yw8Var = b;
        arn.f(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        ?? r6 = 0;
        r6 = 0;
        r6 = 0;
        InputStream inputStream2 = null;
        try {
            try {
                inputStream = i6b.class.getResourceAsStream(AgentHeaderCreator.AGENT_DIVIDER + str + ".properties");
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
            obj = null;
        }
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                String property = properties.getProperty("version", null);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(property);
                String sb2 = sb.toString();
                r6 = property;
                if (Log.isLoggable(yw8Var.a, 2)) {
                    yw8Var.f(sb2);
                    r6 = property;
                }
            } else {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                sb3.append("Failed to get app version for libraryName: ");
                sb3.append(str);
                yw8Var.e("LibraryVersion", sb3.toString());
            }
        } catch (IOException e3) {
            e = e3;
            Object obj2 = r6;
            inputStream2 = inputStream;
            obj = obj2;
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 43);
            sb4.append("Failed to get app version for libraryName: ");
            sb4.append(str);
            yw8Var.c("LibraryVersion", sb4.toString(), e);
            InputStream inputStream3 = inputStream2;
            r6 = obj;
            inputStream = inputStream3;
            if (inputStream != null) {
            }
            if (r6 == 0) {
            }
            concurrentHashMap.put(str, r6);
            return r6;
        } catch (Throwable th2) {
            th = th2;
            r6 = inputStream;
            if (r6 != 0) {
                try {
                    r6.close();
                } catch (IOException unused) {
                }
            }
            throw th;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        if (r6 == 0) {
            yw8Var.a(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            r6 = "UNKNOWN";
        }
        concurrentHashMap.put(str, r6);
        return r6;
    }
}
