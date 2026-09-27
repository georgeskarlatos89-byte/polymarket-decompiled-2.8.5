package okhttp3;

import defpackage.dmk;
import defpackage.gp7;
import defpackage.hm6;
import defpackage.iw1;
import defpackage.kq1;
import defpackage.omf;
import defpackage.woa;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0004*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0006H\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010\u0003R\u0018\u0010)\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "", "T", "Lkotlin/Function1;", "Lkq1;", "consumer", "", "sizeMapper", "consumeSource", "(Lokhttp3/ResponseBody;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "()Ljava/nio/charset/Charset;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "source", "()Lkq1;", "", "bytes", "()[B", "Liw1;", "byteString", "()Liw1;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", "string", "()Ljava/lang/String;", "", "close", "reader", "Ljava/io/Reader;", "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ResponseBody implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ResponseBody EMPTY;
    private Reader reader;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "Lkq1;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lkq1;Ljava/nio/charset/Charset;)V", "", "cbuf", "", "off", "len", "read", "([CII)I", "", "close", "()V", "Lkq1;", "Ljava/nio/charset/Charset;", "", MetricTracker.Action.CLOSED, "Z", "delegate", "Ljava/io/Reader;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final kq1 source;

        public BomAwareReader(kq1 kq1Var, Charset charset) {
            kq1Var.getClass();
            charset.getClass();
            this.source = kq1Var;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) {
            cbuf.getClass();
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.n1(), _UtilJvmKt.readBomAsCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cbuf, off, len);
            }
            dmk.x("Stream closed");
            return 0;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        EMPTY = Companion.create$default(companion, iw1.d, (MediaType) null, 1, (Object) null);
    }

    private final Charset charset() {
        return Internal.charsetOrUtf8(get$contentType());
    }

    private final <T> T consumeSource(ResponseBody responseBody, Function1<? super kq1, ? extends T> function1, Function1<? super T, Integer> function12) {
        Throwable th;
        T t;
        long j = responseBody.get$contentLength();
        if (j <= 2147483647L) {
            kq1 kq1Var = responseBody.get$this_asResponseBody();
            try {
                t = function1.invoke(kq1Var);
                if (kq1Var != null) {
                    try {
                        kq1Var.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                th = null;
            } catch (Throwable th3) {
                if (kq1Var != null) {
                    try {
                        kq1Var.close();
                    } catch (Throwable th4) {
                        gp7.a(th3, th4);
                    }
                }
                th = th3;
                t = (Object) null;
            }
            if (th == null) {
                int intValue = function12.invoke(t).intValue();
                if (j == -1 || j == intValue) {
                    return t;
                }
                omf.b(intValue, j);
                return null;
            }
            throw th;
        }
        dmk.x(woa.m(j, "Cannot buffer entire body for content length: "));
        return null;
    }

    public static final ResponseBody create(kq1 kq1Var, MediaType mediaType, long j) {
        return INSTANCE.create(kq1Var, mediaType, j);
    }

    public final InputStream byteStream() {
        return get$this_asResponseBody().n1();
    }

    public final iw1 byteString() {
        Throwable th;
        iw1 iw1Var;
        long j = get$contentLength();
        if (j <= 2147483647L) {
            kq1 kq1Var = get$this_asResponseBody();
            try {
                iw1Var = kq1Var.O0();
                try {
                    kq1Var.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (kq1Var != null) {
                    try {
                        kq1Var.close();
                    } catch (Throwable th4) {
                        gp7.a(th3, th4);
                    }
                }
                th = th3;
                iw1Var = null;
            }
            if (th == null) {
                int d = iw1Var.d();
                if (j != -1 && j != d) {
                    omf.b(d, j);
                    return null;
                }
                return iw1Var;
            }
            throw th;
        }
        dmk.x(woa.m(j, "Cannot buffer entire body for content length: "));
        return null;
    }

    public final byte[] bytes() {
        Throwable th;
        byte[] bArr;
        long j = get$contentLength();
        if (j <= 2147483647L) {
            kq1 kq1Var = get$this_asResponseBody();
            try {
                bArr = kq1Var.t0();
                try {
                    kq1Var.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (kq1Var != null) {
                    try {
                        kq1Var.close();
                    } catch (Throwable th4) {
                        gp7.a(th3, th4);
                    }
                }
                th = th3;
                bArr = null;
            }
            if (th == null) {
                int length = bArr.length;
                if (j != -1 && j != length) {
                    omf.b(length, j);
                    return null;
                }
                return bArr;
            }
            throw th;
        }
        dmk.x(woa.m(j, "Cannot buffer entire body for content length: "));
        return null;
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            BomAwareReader bomAwareReader = new BomAwareReader(get$this_asResponseBody(), charset());
            this.reader = bomAwareReader;
            return bomAwareReader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        _UtilCommonKt.closeQuietly(get$this_asResponseBody());
    }

    /* renamed from: contentLength */
    public abstract long get$contentLength();

    /* renamed from: contentType */
    public abstract MediaType get$contentType();

    /* renamed from: source */
    public abstract kq1 get$this_asResponseBody();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final String string() {
        kq1 kq1Var = get$this_asResponseBody();
        String th = null;
        try {
            String K0 = kq1Var.K0(_UtilJvmKt.readBomAsCharset(kq1Var, charset()));
            try {
                kq1Var.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = K0;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (kq1Var != null) {
                try {
                    kq1Var.close();
                } catch (Throwable th4) {
                    gp7.a(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u0012J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0015J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u0016J!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\b\u0010\u0017J)\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\b\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "toResponseBody", "", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Liw1;", "(Liw1;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lkq1;", "", "contentLength", "(Lkq1;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "asResponseBody", "content", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;[B)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;Liw1;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;JLkq1;)Lokhttp3/ResponseBody;", "EMPTY", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, kq1 kq1Var, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(kq1Var, mediaType, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [tp1, java.lang.Object, kq1] */
        public final ResponseBody create(String str, MediaType mediaType) {
            str.getClass();
            Pair<Charset, MediaType> chooseCharset = Internal.chooseCharset(mediaType);
            Charset charset = (Charset) chooseCharset.first;
            MediaType mediaType2 = (MediaType) chooseCharset.second;
            ?? obj = new Object();
            charset.getClass();
            obj.y0(str, 0, str.length(), charset);
            return create((kq1) obj, mediaType2, obj.b);
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, iw1 iw1Var, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(iw1Var, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [tp1, java.lang.Object, kq1] */
        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            bArr.getClass();
            ?? obj = new Object();
            obj.m1395write(bArr, 0, bArr.length);
            return create((kq1) obj, mediaType, bArr.length);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [tp1, java.lang.Object, kq1] */
        public final ResponseBody create(iw1 iw1Var, MediaType mediaType) {
            iw1Var.getClass();
            ?? obj = new Object();
            obj.f0(iw1Var);
            return create((kq1) obj, mediaType, iw1Var.d());
        }

        public final ResponseBody create(final kq1 kq1Var, final MediaType mediaType, final long j) {
            kq1Var.getClass();
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* renamed from: contentLength, reason: from getter */
                public long get$contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                /* renamed from: source, reason: from getter */
                public kq1 get$this_asResponseBody() {
                    return kq1Var;
                }
            };
        }

        @hm6
        public final ResponseBody create(MediaType contentType, String content) {
            content.getClass();
            return create(content, contentType);
        }

        @hm6
        public final ResponseBody create(MediaType contentType, byte[] content) {
            content.getClass();
            return create(content, contentType);
        }

        @hm6
        public final ResponseBody create(MediaType contentType, iw1 content) {
            content.getClass();
            return create(content, contentType);
        }

        @hm6
        public final ResponseBody create(MediaType contentType, long contentLength, kq1 content) {
            content.getClass();
            return create(content, contentType, contentLength);
        }
    }

    public static final ResponseBody create(iw1 iw1Var, MediaType mediaType) {
        return INSTANCE.create(iw1Var, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @hm6
    public static final ResponseBody create(MediaType mediaType, long j, kq1 kq1Var) {
        return INSTANCE.create(mediaType, j, kq1Var);
    }

    @hm6
    public static final ResponseBody create(MediaType mediaType, iw1 iw1Var) {
        return INSTANCE.create(mediaType, iw1Var);
    }

    @hm6
    public static final ResponseBody create(MediaType mediaType, String str) {
        return INSTANCE.create(mediaType, str);
    }

    @hm6
    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }
}
