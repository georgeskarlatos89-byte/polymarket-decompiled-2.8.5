package okhttp3.internal;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.d47;
import defpackage.dmk;
import defpackage.f27;
import defpackage.g1a;
import defpackage.k0i;
import defpackage.kq1;
import defpackage.lnf;
import defpackage.meh;
import defpackage.sv6;
import defpackage.y0a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http2.Header;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\t\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0000¢\u0006\u0004\b\u000b\u0010\u000f\u001a\u001b\u0010\u0013\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\"\u001a\u00020!*\b\u0012\u0004\u0012\u00020 0\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\u00020!H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010'\u001a\u00020\u0002*\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0013\u0010+\u001a\u00020**\u00020)H\u0000¢\u0006\u0004\b+\u0010,\u001a#\u0010/\u001a\u00020\u0002*\u00020-2\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0017H\u0000¢\u0006\u0004\b/\u00100\u001a\u0013\u0010/\u001a\u000201*\u00020\u0010H\u0000¢\u0006\u0004\b/\u00102\u001a#\u00104\u001a\u00020\u0002*\u00020-2\u0006\u00103\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0017H\u0000¢\u0006\u0004\b4\u00100\u001a\u001b\u00107\u001a\u00020\u0002*\u0002052\u0006\u00106\u001a\u00020\u0010H\u0000¢\u0006\u0004\b7\u00108\u001a)\u0010;\u001a\u0002012\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010:\u001a\b\u0012\u0004\u0012\u00020109H\u0080\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0013\u0010>\u001a\u00020\u0015*\u00020=H\u0000¢\u0006\u0004\b>\u0010?\u001a&\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010@*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0080\b¢\u0006\u0004\bA\u0010B\u001a&\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010@*\b\u0012\u0004\u0012\u00028\u00000CH\u0080\b¢\u0006\u0004\bA\u0010D\u001a8\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010G\"\u0004\b\u0000\u0010E\"\u0004\b\u0001\u0010F*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010GH\u0080\b¢\u0006\u0004\bA\u0010H\u001a%\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010@*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0000¢\u0006\u0004\bI\u0010B\u001a/\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010@2\u0012\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0001¢\u0006\u0004\bK\u0010L\u001a)\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010@*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\fH\u0000¢\u0006\u0004\bI\u0010L\u001a\u0013\u0010M\u001a\u000201*\u000205H\u0000¢\u0006\u0004\bM\u0010N\u001a\u0013\u0010M\u001a\u000201*\u00020OH\u0000¢\u0006\u0004\bM\u0010P\u001a\u0013\u0010Q\u001a\u00020\u0000*\u00020\u0015H\u0000¢\u0006\u0004\bQ\u0010R\u001a\u0013\u0010Q\u001a\u00020\u0000*\u00020\u0019H\u0000¢\u0006\u0004\bQ\u0010S\u001a5\u0010X\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010@2\u0006\u0010T\u001a\u00020\r2\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000U2\u0006\u0010W\u001a\u00020\u0000H\u0000¢\u0006\u0004\bX\u0010Y\u001a\u0013\u0010[\u001a\u000201*\u00020ZH\u0000¢\u0006\u0004\b[\u0010\\\"\u0014\u0010^\u001a\u00020]8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b^\u0010_\"\u0014\u0010`\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b`\u0010a\"\u0014\u0010b\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bb\u0010c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006d"}, d2 = {"", Keys.KEY_NAME, "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "Lokhttp3/HttpUrl;", "includeDefaultPort", "toHostHeader", "(Lokhttp3/HttpUrl;Z)Ljava/lang/String;", "format", "", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lkq1;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", "(Lkq1;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "", "checkDuration", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "Ld47;", "checkDuration-HG0u8IE", "(Ljava/lang/String;J)I", "", "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "toHeaders", "(Ljava/util/List;)Lokhttp3/Headers;", "toHeaderList", "(Lokhttp3/Headers;)Ljava/util/List;", "other", "canReuseConnectionFor", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "(Lokhttp3/EventListener;)Lokhttp3/EventListener$Factory;", "Lmeh;", "timeUnit", "skipAll", "(Lmeh;ILjava/util/concurrent/TimeUnit;)Z", "", "(Lkq1;)V", "timeout", "discard", "Ljava/net/Socket;", "source", "isHealthy", "(Ljava/net/Socket;Lkq1;)Z", "Lkotlin/Function0;", "block", "threadName", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lokhttp3/Response;", "headersContentLength", "(Lokhttp3/Response;)J", "T", "unmodifiable", "(Ljava/util/List;)Ljava/util/List;", "", "(Ljava/util/Set;)Ljava/util/Set;", "K", "V", "", "(Ljava/util/Map;)Ljava/util/Map;", "toImmutableList", "elements", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "closeQuietly", "(Ljava/net/Socket;)V", "Ljava/net/ServerSocket;", "(Ljava/net/ServerSocket;)V", "toHexString", "(J)Ljava/lang/String;", "(I)Ljava/lang/String;", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "Lokhttp3/Dispatcher;", "assertLockNotHeld", "(Lokhttp3/Dispatcher;)V", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class _UtilJvmKt {
    public static final TimeZone UTC;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        UTC = timeZone;
        assertionsEnabled = false;
        okHttpName = StringsKt.Z(StringsKt.Y("okhttp3.", OkHttpClient.class.getName()), "Client");
    }

    public static /* synthetic */ Thread a(String str, boolean z, Runnable runnable) {
        return threadFactory$lambda$0(str, z, runnable);
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        eventListener.getClass();
        return new k0i(eventListener, 14);
    }

    private static final EventListener asFactory$lambda$0(EventListener eventListener, Call call) {
        call.getClass();
        return eventListener;
    }

    public static final void assertLockNotHeld(Dispatcher dispatcher) {
        dispatcher.getClass();
        if (assertionsEnabled && Thread.holdsLock(dispatcher)) {
            dmk.l(Thread.currentThread().getName(), " MUST NOT hold lock on ", dispatcher);
        }
    }

    public static /* synthetic */ EventListener b(EventListener eventListener, Call call) {
        return asFactory$lambda$0(eventListener, call);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        httpUrl.getClass();
        httpUrl2.getClass();
        if (Intrinsics.areEqual(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && Intrinsics.areEqual(httpUrl.scheme(), httpUrl2.scheme())) {
            return true;
        }
        return false;
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        str.getClass();
        timeUnit.getClass();
        if (j >= 0) {
            long millis = timeUnit.toMillis(j);
            if (millis <= 2147483647L) {
                if (millis == 0 && j > 0) {
                    f27.q(sv6.m(str, " too small"));
                    return 0;
                }
                return (int) millis;
            }
            f27.q(sv6.m(str, " too large"));
            return 0;
        }
        f27.k(sv6.m(str, " < 0"));
        return 0;
    }

    /* renamed from: checkDuration-HG0u8IE, reason: not valid java name */
    public static final int m1035checkDurationHG0u8IE(String str, long j) {
        str.getClass();
        if (!d47.j(j)) {
            long e = d47.e(j);
            if (e <= 2147483647L) {
                if (e == 0 && j > 0) {
                    f27.q(str.concat(" too small"));
                    return 0;
                }
                return (int) e;
            }
            f27.q(str.concat(" too large"));
            return 0;
        }
        f27.k(str.concat(" < 0"));
        return 0;
    }

    public static final void closeQuietly(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (Intrinsics.areEqual(e2.getMessage(), "bio == null")) {
            } else {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean discard(meh mehVar, int i, TimeUnit timeUnit) {
        mehVar.getClass();
        timeUnit.getClass();
        try {
            return skipAll(mehVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String format(String str, Object... objArr) {
        str.getClass();
        objArr.getClass();
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long headersContentLength(Response response) {
        response.getClass();
        String str = response.headers().get("Content-Length");
        if (str == null) {
            return -1L;
        }
        return _UtilCommonKt.toLongOrDefault(str, -1L);
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        tArr.getClass();
        return toImmutableList(tArr);
    }

    public static final boolean isHealthy(Socket socket, kq1 kq1Var) {
        socket.getClass();
        kq1Var.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !kq1Var.j();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final Charset readBomAsCharset(kq1 kq1Var, Charset charset) {
        kq1Var.getClass();
        charset.getClass();
        int g0 = kq1Var.g0(_UtilCommonKt.getUNICODE_BOMS());
        if (g0 != -1) {
            if (g0 != 0) {
                if (g0 != 1) {
                    if (g0 != 2) {
                        if (g0 != 3) {
                            if (g0 == 4) {
                                Charsets.a.getClass();
                                Charset charset2 = Charsets.i;
                                if (charset2 == null) {
                                    Charset forName = Charset.forName("UTF-32BE");
                                    forName.getClass();
                                    Charsets.i = forName;
                                    return forName;
                                }
                                return charset2;
                            }
                            f27.p();
                            return null;
                        }
                        return Charsets.d;
                    }
                    Charsets.a.getClass();
                    Charset charset3 = Charsets.h;
                    if (charset3 == null) {
                        Charset forName2 = Charset.forName("UTF-32LE");
                        forName2.getClass();
                        Charsets.h = forName2;
                        return forName2;
                    }
                    return charset3;
                }
                return Charsets.c;
            }
            return Charsets.UTF_8;
        }
        return charset;
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        T t;
        Object readFieldOrNull;
        obj.getClass();
        cls.getClass();
        str.getClass();
        Class<?> cls2 = obj.getClass();
        while (true) {
            t = null;
            if (!Intrinsics.areEqual(cls2, Object.class)) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (!cls.isInstance(obj2)) {
                        break;
                    }
                    t = cls.cast(obj2);
                    break;
                } catch (NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                    cls2.getClass();
                }
            } else {
                if (Intrinsics.areEqual(str, "delegate") || (readFieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(readFieldOrNull, cls, str);
            }
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [tp1, java.lang.Object] */
    public static final boolean skipAll(meh mehVar, int i, TimeUnit timeUnit) {
        long j;
        mehVar.getClass();
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        if (mehVar.timeout().hasDeadline()) {
            j = mehVar.timeout().deadlineNanoTime() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        mehVar.timeout().deadlineNanoTime(Math.min(j, timeUnit.toNanos(i)) + nanoTime);
        try {
            ?? obj = new Object();
            while (mehVar.read(obj, 8192L) != -1) {
                obj.e();
            }
            if (j == Long.MAX_VALUE) {
                mehVar.timeout().clearDeadline();
                return true;
            }
            mehVar.timeout().deadlineNanoTime(nanoTime + j);
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                mehVar.timeout().clearDeadline();
                return false;
            }
            mehVar.timeout().deadlineNanoTime(nanoTime + j);
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                mehVar.timeout().clearDeadline();
            } else {
                mehVar.timeout().deadlineNanoTime(nanoTime + j);
            }
            throw th;
        }
    }

    public static final ThreadFactory threadFactory(final String str, final boolean z) {
        str.getClass();
        return new ThreadFactory() { // from class: hsk
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return _UtilJvmKt.a(str, z, runnable);
            }
        };
    }

    private static final Thread threadFactory$lambda$0(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static final void threadName(String str, Function0<Unit> function0) {
        str.getClass();
        function0.getClass();
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            function0.invoke();
        } finally {
            currentThread.setName(name);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        headers.getClass();
        IntRange k = lnf.k(0, headers.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.w(k));
        Iterator it = k.iterator();
        while (((g1a) it).c) {
            int nextInt = ((y0a) it).nextInt();
            arrayList.add(new Header(headers.name(nextInt), headers.value(nextInt)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        list.getClass();
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.getName().t(), header.getValue().t());
        }
        return builder.build();
    }

    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        hexString.getClass();
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        String host;
        httpUrl.getClass();
        if (StringsKt.L(httpUrl.host(), ":", false)) {
            host = "[" + httpUrl.host() + ']';
        } else {
            host = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.INSTANCE.defaultPort(httpUrl.scheme())) {
            return host;
        }
        return host + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        list.getClass();
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        if (list.size() == 1) {
            List<T> singletonList = Collections.singletonList(list.get(0));
            singletonList.getClass();
            return singletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List<T> unmodifiableList = Collections.unmodifiableList(ArraysKt.f(array));
        unmodifiableList.getClass();
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final <T> List<T> unmodifiable(List<? extends T> list) {
        list.getClass();
        List<T> unmodifiableList = Collections.unmodifiableList(list);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        hexString.getClass();
        return hexString;
    }

    public static final <T> Set<T> unmodifiable(Set<? extends T> set) {
        set.getClass();
        Set<T> unmodifiableSet = Collections.unmodifiableSet(set);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    public static final <K, V> Map<K, V> unmodifiable(Map<K, ? extends V> map) {
        map.getClass();
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(map);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        serverSocket.getClass();
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final <T> List<T> toImmutableList(T[] tArr) {
        if (tArr != null && tArr.length != 0) {
            if (tArr.length == 1) {
                List<T> singletonList = Collections.singletonList(tArr[0]);
                singletonList.getClass();
                return singletonList;
            }
            List<T> unmodifiableList = Collections.unmodifiableList(ArraysKt.f((Object[]) tArr.clone()));
            unmodifiableList.getClass();
            return unmodifiableList;
        }
        return CollectionsKt.emptyList();
    }

    public static final void skipAll(kq1 kq1Var) {
        kq1Var.getClass();
        while (!kq1Var.j()) {
            kq1Var.skip(kq1Var.c().b);
        }
    }
}
