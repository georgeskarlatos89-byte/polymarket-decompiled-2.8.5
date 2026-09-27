package io.sentry.android.core;

import io.sentry.h2;
import io.sentry.i2;
import io.sentry.o2;
import io.sentry.p5;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class a1 {
    public boolean a;
    public final Object b;
    public final Object c;

    public a1(SentryAndroidOptions sentryAndroidOptions) {
        this.c = new ArrayList();
        this.a = false;
        this.b = sentryAndroidOptions;
    }

    public static void d(BufferedInputStream bufferedInputStream, long j) {
        while (j > 0) {
            long skip2 = bufferedInputStream.skip(j);
            if (skip2 == 0) {
                if (bufferedInputStream.read() != -1) {
                    j--;
                } else {
                    throw new EOFException("Unexpected end of stream while skipping bytes");
                }
            } else {
                j -= skip2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x001d A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z0 a(BufferedInputStream bufferedInputStream, int i, File file) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        z0 z0Var = null;
        try {
            y0 y0Var = new y0(bufferedInputStream, i);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(y0Var, StandardCharsets.UTF_8);
                try {
                    h2 h2Var = new h2(inputStreamReader);
                    io.sentry.vendor.gson.stream.a aVar = h2Var.a;
                    h2Var.beginObject();
                    String str = null;
                    Date date = null;
                    while (aVar.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String nextName = aVar.nextName();
                        int hashCode = nextName.hashCode();
                        if (hashCode != 55126294) {
                            if (hashCode == 1874684019 && nextName.equals("platform")) {
                                str = h2Var.w0();
                                if (str == null && date != null) {
                                    break;
                                }
                            }
                            h2Var.skipValue();
                            if (str == null) {
                            }
                        } else {
                            if (nextName.equals("timestamp")) {
                                date = h2Var.P(sentryAndroidOptions.getLogger());
                                if (str == null) {
                                }
                            }
                            h2Var.skipValue();
                            if (str == null) {
                            }
                        }
                    }
                    if ("native".equals(str) && date != null) {
                        z0Var = new z0(file, date.getTime());
                    }
                    inputStreamReader.close();
                    y0Var.close();
                    return z0Var;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    y0Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().b(p5.DEBUG, th3, "Error parsing event JSON from: %s", file.getName());
            return null;
        }
    }

    public Properties b() {
        o2 o2Var = (o2) this.c;
        String str = (String) this.b;
        try {
            File file = new File(str.trim());
            if (file.isFile() && file.canRead()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    return properties;
                } finally {
                }
            }
            if (!file.isFile()) {
                if (this.a) {
                    o2Var.f(p5.ERROR, "Failed to load Sentry configuration since it is not a file or does not exist: %s", str);
                    return null;
                }
            } else if (!file.canRead()) {
                o2Var.f(p5.ERROR, "Failed to load Sentry configuration since it is not readable: %s", str);
            }
            return null;
        } catch (Throwable th) {
            o2Var.b(p5.ERROR, th, "Failed to load Sentry configuration from file: %s", str);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x001d A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i2 c(String str) {
        try {
            Charset charset = StandardCharsets.UTF_8;
            InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(str.getBytes(charset)), charset);
            try {
                h2 h2Var = new h2(inputStreamReader);
                io.sentry.vendor.gson.stream.a aVar = h2Var.a;
                h2Var.beginObject();
                int i = -1;
                String str2 = null;
                while (aVar.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String nextName = aVar.nextName();
                    int hashCode = nextName.hashCode();
                    if (hashCode != -1106363674) {
                        if (hashCode == 3575610 && nextName.equals("type")) {
                            str2 = h2Var.w0();
                            if (str2 == null && i >= 0) {
                                break;
                            }
                        }
                        h2Var.skipValue();
                        if (str2 == null) {
                        }
                    } else {
                        if (nextName.equals("length")) {
                            i = h2Var.nextInt();
                            if (str2 == null) {
                            }
                        }
                        h2Var.skipValue();
                        if (str2 == null) {
                        }
                    }
                }
                if (i >= 0) {
                    i2 i2Var = new i2(str2, i);
                    inputStreamReader.close();
                    return i2Var;
                }
                inputStreamReader.close();
                return null;
            } finally {
            }
        } catch (Throwable th) {
            ((SentryAndroidOptions) this.b).getLogger().b(p5.DEBUG, th, "Error parsing item header", new Object[0]);
            return null;
        }
    }

    public a1(String str, o2 o2Var, boolean z) {
        this.b = str;
        this.c = o2Var;
        this.a = z;
    }
}
