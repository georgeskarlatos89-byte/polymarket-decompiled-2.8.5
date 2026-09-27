package io.sentry.internal.modules;

import io.sentry.p5;
import io.sentry.x0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class d implements a {
    public static final Charset d = Charset.forName("UTF-8");
    public final x0 a;
    public final io.sentry.util.a b = new Object();
    public volatile Map c = null;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.sentry.util.a] */
    public d(x0 x0Var) {
        this.a = x0Var;
    }

    @Override // io.sentry.internal.modules.a
    public final Map a() {
        if (this.c == null) {
            io.sentry.util.a aVar = this.b;
            aVar.e();
            try {
                if (this.c == null) {
                    this.c = b();
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this.c;
    }

    public abstract Map b();

    public final TreeMap c(InputStream inputStream) {
        x0 x0Var = this.a;
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, d));
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    int lastIndexOf = readLine.lastIndexOf(58);
                    treeMap.put(readLine.substring(0, lastIndexOf), readLine.substring(lastIndexOf + 1));
                }
                x0Var.f(p5.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            x0Var.d(p5.ERROR, "Error extracting modules.", e);
            return treeMap;
        } catch (RuntimeException e2) {
            x0Var.b(p5.ERROR, e2, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}
