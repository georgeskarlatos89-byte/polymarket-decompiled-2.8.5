package io.sentry.util;

import com.fingerprintjs.android.fpjs_pro_internal.f3;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.cxi;
import defpackage.dmk;
import defpackage.m51;
import defpackage.sv6;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.t0;
import io.sentry.c7;
import io.sentry.e1;
import io.sentry.e7;
import io.sentry.h5;
import io.sentry.j0;
import io.sentry.j3;
import io.sentry.m1;
import io.sentry.n5;
import io.sentry.p5;
import io.sentry.p6;
import io.sentry.protocol.c0;
import io.sentry.protocol.e0;
import io.sentry.protocol.v;
import io.sentry.protocol.w;
import io.sentry.u;
import io.sentry.u2;
import io.sentry.v3;
import io.sentry.v6;
import io.sentry.x0;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class b {
    public static final String[] a = new String[0];

    public static void a(String str) {
        n5.d().a(str);
    }

    public static v3 b(v3 v3Var) {
        if (((Double) v3Var.c) != null) {
            return v3Var;
        }
        return new v3((Boolean) v3Var.a, (Double) v3Var.b, c((Boolean) v3Var.a, null, (Double) v3Var.b), (Boolean) v3Var.d, (Double) v3Var.e);
    }

    public static Double c(Boolean bool, Double d, Double d2) {
        if (d != null) {
            return d;
        }
        double c = o.a().c();
        if (d2 != null && bool != null) {
            if (bool.booleanValue()) {
                return Double.valueOf(d2.doubleValue() * c);
            }
            return Double.valueOf(((1.0d - d2.doubleValue()) * c) + d2.doubleValue());
        }
        return Double.valueOf(c);
    }

    public static ClassLoader d(ClassLoader classLoader) {
        if (classLoader == null) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                return contextClassLoader;
            }
            return ClassLoader.getSystemClassLoader();
        }
        return classLoader;
    }

    public static boolean e(String str, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.contains(str2)) {
                return true;
            }
            if (str.matches(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(File file) {
        if (!file.isDirectory() && !file.mkdirs() && !file.isDirectory()) {
            return false;
        }
        return true;
    }

    public static j0 g(Object obj) {
        j0 j0Var = new j0();
        j0Var.d(obj, "sentry:typeCheckHint");
        return j0Var;
    }

    public static boolean h(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return true;
        }
        for (File file2 : listFiles) {
            if (!h(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public static io.sentry.c i(io.sentry.c cVar, Boolean bool, Double d, Double d2) {
        if (cVar == null) {
            cVar = new io.sentry.c(u2.a);
        }
        if (cVar.d == null) {
            Double d3 = cVar.c;
            if (d3 != null) {
                d = d3;
            }
            Double c = c(bool, d2, d);
            if (cVar.f) {
                cVar.d = c;
            }
        }
        if (cVar.f && cVar.g) {
            cVar.f = false;
        }
        return cVar;
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean k(j0 j0Var, Class cls) {
        return cls.isInstance(j0Var.b("sentry:typeCheckHint"));
    }

    public static boolean l(j0 j0Var) {
        return Boolean.TRUE.equals(j0Var.c(Boolean.class, "sentry:isFromHybridSdk"));
    }

    public static boolean m(h5 h5Var, SentryAndroidOptions sentryAndroidOptions) {
        if (e.a(sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), h5Var) <= 1048576) {
            return true;
        }
        return false;
    }

    public static boolean n(Double d, boolean z) {
        if (d == null) {
            return z;
        }
        if (!d.isNaN() && d.doubleValue() >= ConstantsKt.UNSET && d.doubleValue() <= 1.0d) {
            return true;
        }
        return false;
    }

    public static void o(Class cls, Object obj, x0 x0Var) {
        String str;
        p5 p5Var = p5.DEBUG;
        if (obj != null) {
            str = obj.getClass().getCanonicalName();
        } else {
            str = "Hint";
        }
        x0Var.f(p5Var, "%s is not %s", str, cls.getCanonicalName());
    }

    public static ConcurrentHashMap p(Map map) {
        if (map != null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    concurrentHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return concurrentHashMap;
        }
        return null;
    }

    public static com.socure.docv.capturesdk.core.extractor.c q(String str) {
        boolean z;
        String str2;
        String rawAuthority;
        try {
            URI uri = new URI(str);
            if (uri.isAbsolute()) {
                try {
                    uri.toURL();
                    z = true;
                } catch (Exception unused) {
                    z = false;
                }
                if (!z) {
                    return new com.socure.docv.capturesdk.core.extractor.c(null, null, null, 8);
                }
            }
            String str3 = "";
            if (uri.getScheme() == null) {
                str2 = "";
            } else {
                str2 = uri.getScheme() + "://";
            }
            if (uri.getRawAuthority() == null) {
                rawAuthority = "";
            } else {
                rawAuthority = uri.getRawAuthority();
            }
            if (uri.getRawPath() != null) {
                str3 = uri.getRawPath();
            }
            String rawQuery = uri.getRawQuery();
            String rawFragment = uri.getRawFragment();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            String str4 = "[Filtered]";
            if (rawAuthority.contains("@")) {
                if (rawAuthority.startsWith("@")) {
                    rawAuthority = "[Filtered]".concat(rawAuthority);
                } else {
                    if (rawAuthority.substring(0, rawAuthority.indexOf(64)).contains(":")) {
                        str4 = "[Filtered]:[Filtered]";
                    }
                    rawAuthority = str4.concat(rawAuthority.substring(rawAuthority.indexOf(64)));
                }
            }
            sb.append(rawAuthority);
            sb.append(str3);
            return new com.socure.docv.capturesdk.core.extractor.c(sb.toString(), rawQuery, rawFragment, 8);
        } catch (Exception unused2) {
            return new com.socure.docv.capturesdk.core.extractor.c(null, null, null, 8);
        }
    }

    public static byte[] r(long j, String str) {
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.length() <= j) {
                        FileInputStream fileInputStream = new FileInputStream(str);
                        try {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[Barcode.FORMAT_UPC_E];
                                    while (true) {
                                        int read = bufferedInputStream.read(bArr);
                                        if (read != -1) {
                                            byteArrayOutputStream.write(bArr, 0, read);
                                        } else {
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                            bufferedInputStream.close();
                                            fileInputStream.close();
                                            return byteArray;
                                        }
                                    }
                                } finally {
                                }
                            } catch (Throwable th) {
                                try {
                                    bufferedInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } else {
                        com.appsflyer.internal.l.l("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", new Object[]{str, Long.valueOf(file.length()), Long.valueOf(j)});
                        return null;
                    }
                } else {
                    dmk.x(sv6.n("Reading the item ", str, " failed, because can't read the file."));
                    return null;
                }
            } else {
                dmk.x(sv6.n("Reading path ", str, " failed, because it's not a file."));
                return null;
            }
        } else {
            dmk.x(sv6.n("File '", file.getName(), "' doesn't exists"));
            return null;
        }
    }

    public static String s(File file) {
        if (file.exists() && file.isFile() && file.canRead()) {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                }
                while (true) {
                    String readLine2 = bufferedReader.readLine();
                    if (readLine2 != null) {
                        sb.append("\n");
                        sb.append(readLine2);
                    } else {
                        bufferedReader.close();
                        return sb.toString();
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            return null;
        }
    }

    public static void t(Object obj, String str) {
        if (obj != null) {
            return;
        }
        dmk.v(str);
    }

    public static boolean u(j0 j0Var) {
        if ((!io.sentry.hints.d.class.isInstance(j0Var.b("sentry:typeCheckHint")) && !io.sentry.hints.b.class.isInstance(j0Var.b("sentry:typeCheckHint"))) || t0.class.isInstance(j0Var.b("sentry:typeCheckHint"))) {
            return true;
        }
        return false;
    }

    public static boolean v(p6 p6Var, SentryAndroidOptions sentryAndroidOptions, boolean z) {
        String str;
        boolean z2 = k.a;
        if (!z2 && (sentryAndroidOptions.getVersionDetector() instanceof j3)) {
            sentryAndroidOptions.setVersionDetector(new u(sentryAndroidOptions, 1));
        }
        if (sentryAndroidOptions.getVersionDetector().a()) {
            sentryAndroidOptions.getLogger().f(p5.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
            if (z2) {
                str = "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions";
            } else {
                str = "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions";
            }
            dmk.n(sv6.n("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", str, " for more details."));
            return false;
        }
        if (!z || p6Var == null || sentryAndroidOptions.isForceInit() || p6Var.getInitPriority().ordinal() <= sentryAndroidOptions.getInitPriority().ordinal()) {
            return true;
        }
        return false;
    }

    public static com.socure.docv.capturesdk.core.extractor.c w(e1 e1Var, String str, List list, m1 m1Var) {
        p6 options = e1Var.getOptions();
        com.socure.docv.capturesdk.core.extractor.c cVar = null;
        if (options.isTraceSampling() && e(str, options.getTracePropagationTargets())) {
            p6 options2 = e1Var.getOptions();
            if (m1Var != null && !m1Var.i()) {
                v6 b = m1Var.b();
                f3 q = m1Var.q(list);
                if (options2.isPropagateTraceparent()) {
                    c7 u = m1Var.u();
                    cVar = new com.socure.docv.capturesdk.core.extractor.c(u.a, u.b, b.c, 3);
                }
                return new com.socure.docv.capturesdk.core.extractor.c(b, q, cVar, 7);
            }
            f3 f3Var = new f3(21, false);
            f3Var.b = null;
            e1Var.p(new cxi(14, f3Var, options2));
            v3 v3Var = (v3) f3Var.b;
            if (v3Var != null) {
                io.sentry.c cVar2 = (io.sentry.c) v3Var.e;
                Boolean bool = (Boolean) v3Var.a;
                e7 e7Var = (e7) v3Var.c;
                w wVar = (w) v3Var.b;
                f3 g = f3.g(cVar2, list);
                v6 v6Var = new v6(wVar, e7Var, bool);
                if (options2.isPropagateTraceparent()) {
                    cVar = new com.socure.docv.capturesdk.core.extractor.c(wVar, e7Var, bool, 3);
                }
                return new com.socure.docv.capturesdk.core.extractor.c(v6Var, g, cVar, 7);
            }
        }
        return null;
    }

    public static void x(h5 h5Var, SentryAndroidOptions sentryAndroidOptions) {
        ArrayList d = h5Var.d();
        if (d != null) {
            Iterator it = d.iterator();
            while (it.hasNext()) {
                c0 c0Var = ((v) it.next()).e;
                if (c0Var != null) {
                    y(c0Var, h5Var, sentryAndroidOptions, "Truncated exception stack frames of event %s");
                }
            }
        }
        ArrayList e = h5Var.e();
        if (e != null) {
            Iterator it2 = e.iterator();
            while (it2.hasNext()) {
                c0 c0Var2 = ((e0) it2.next()).i;
                if (c0Var2 != null) {
                    y(c0Var2, h5Var, sentryAndroidOptions, "Truncated thread stack frames for event %s");
                }
            }
        }
    }

    public static void y(c0 c0Var, h5 h5Var, p6 p6Var, String str) {
        List list = c0Var.a;
        if (list != null && list.size() > 500) {
            ArrayList arrayList = new ArrayList(RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE);
            arrayList.addAll(list.subList(0, RadarSimpleLogBuffer.PURGE_AMOUNT));
            arrayList.addAll(list.subList(list.size() - RadarSimpleLogBuffer.PURGE_AMOUNT, list.size()));
            c0Var.a = arrayList;
            p6Var.getLogger().f(p5.DEBUG, str, h5Var.a);
        }
    }

    public static CopyOnWriteArrayList z(CopyOnWriteArrayList copyOnWriteArrayList) {
        ArrayList arrayList = new ArrayList();
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                throw m51.g(it);
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }
}
