package okhttp3;

import defpackage.b3j;
import defpackage.hm6;
import defpackage.hpf;
import defpackage.iw1;
import defpackage.jo0;
import defpackage.jq1;
import defpackage.kxd;
import defpackage.meh;
import defpackage.pkn;
import defpackage.s08;
import defpackage.v49;
import io.getstream.chat.android.models.AttachmentType;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lokhttp3/RequestBody;", "", "<init>", "()V", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Ljq1;", "sink", "", "writeTo", "(Ljq1;)V", "", "isDuplex", "()Z", "isOneShot", "Liw1;", "sha256", "()Liw1;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class RequestBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final RequestBody EMPTY;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        EMPTY = Companion.create$default(companion, iw1.d, (MediaType) null, 1, (Object) null);
    }

    public static final RequestBody create(iw1 iw1Var, MediaType mediaType) {
        return INSTANCE.create(iw1Var, mediaType);
    }

    public long contentLength() {
        return -1L;
    }

    /* renamed from: contentType */
    public abstract MediaType get$contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mf1, java.lang.Object] */
    public final iw1 sha256() {
        v49 v49Var = new v49(new Object());
        hpf hpfVar = new hpf(v49Var);
        try {
            writeTo(hpfVar);
            hpfVar.close();
            byte[] digest = v49Var.a.digest();
            digest.getClass();
            return new iw1(digest);
        } finally {
        }
    }

    public abstract void writeTo(jq1 sink);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\n\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000eJ3\u0010\n\u001a\u00020\u0007*\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u0007*\u00020\u00142\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u0015J'\u0010\u0016\u001a\u00020\u0007*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\u001aJ!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u001dJ5\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\b\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\b\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "<init>", "()V", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/RequestBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "toRequestBody", "Liw1;", "(Liw1;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "Ljava/io/FileDescriptor;", "(Ljava/io/FileDescriptor;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "", "", "offset", "byteCount", "([BLokhttp3/MediaType;II)Lokhttp3/RequestBody;", "Ljava/io/File;", "(Ljava/io/File;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "asRequestBody", "Lkxd;", "Ls08;", "fileSystem", "(Lkxd;Ls08;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "content", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;", "(Lokhttp3/MediaType;Liw1;)Lokhttp3/RequestBody;", "(Lokhttp3/MediaType;[BII)Lokhttp3/RequestBody;", AttachmentType.FILE, "(Lokhttp3/MediaType;Ljava/io/File;)Lokhttp3/RequestBody;", "EMPTY", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.create(bArr, mediaType, i, i2);
        }

        public final RequestBody create(String str, MediaType mediaType) {
            str.getClass();
            Pair<Charset, MediaType> chooseCharset = Internal.chooseCharset(mediaType);
            Charset charset = (Charset) chooseCharset.first;
            MediaType mediaType2 = (MediaType) chooseCharset.second;
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            return create(bytes, mediaType2, 0, bytes.length);
        }

        private Companion() {
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, iw1 iw1Var, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(iw1Var, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, FileDescriptor fileDescriptor, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(fileDescriptor, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, kxd kxdVar, s08 s08Var, MediaType mediaType, int i, Object obj) {
            if ((i & 2) != 0) {
                mediaType = null;
            }
            return companion.create(kxdVar, s08Var, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.create(mediaType, bArr, i, i2);
        }

        @hm6
        public final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
            bArr.getClass();
            return create$default(this, mediaType, bArr, i, 0, 8, (Object) null);
        }

        public final RequestBody create(byte[] bArr) {
            bArr.getClass();
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType) {
            bArr.getClass();
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        public final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
            bArr.getClass();
            return create$default(this, bArr, mediaType, i, 0, 4, (Object) null);
        }

        @hm6
        public final RequestBody create(MediaType mediaType, byte[] bArr) {
            bArr.getClass();
            return create$default(this, mediaType, bArr, 0, 0, 12, (Object) null);
        }

        public final RequestBody create(final iw1 iw1Var, final MediaType mediaType) {
            iw1Var.getClass();
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return iw1Var.d();
                }

                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(jq1 sink) {
                    sink.getClass();
                    sink.b0(iw1Var);
                }
            };
        }

        public final RequestBody create(final FileDescriptor fileDescriptor, final MediaType mediaType) {
            fileDescriptor.getClass();
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public boolean isOneShot() {
                    return true;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(jq1 sink) {
                    sink.getClass();
                    FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
                    try {
                        sink.c().i1(pkn.b(fileInputStream));
                        fileInputStream.close();
                    } finally {
                    }
                }
            };
        }

        public final RequestBody create(final byte[] bArr, final MediaType mediaType, final int i, final int i2) {
            bArr.getClass();
            _UtilCommonKt.checkOffsetAndCount(bArr.length, i, i2);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$3
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i2;
                }

                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(jq1 sink) {
                    sink.getClass();
                    sink.write(bArr, i, i2);
                }
            };
        }

        public final RequestBody create(final File file, final MediaType mediaType) {
            file.getClass();
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(jq1 sink) {
                    sink.getClass();
                    File file2 = file;
                    file2.getClass();
                    jo0 jo0Var = new jo0(new FileInputStream(file2), b3j.NONE);
                    try {
                        sink.i1(jo0Var);
                        jo0Var.close();
                    } finally {
                    }
                }
            };
        }

        public final RequestBody create(final kxd kxdVar, final s08 s08Var, final MediaType mediaType) {
            kxdVar.getClass();
            s08Var.getClass();
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    Long l = s08Var.metadata(kxdVar).d;
                    if (l != null) {
                        return l.longValue();
                    }
                    return -1L;
                }

                @Override // okhttp3.RequestBody
                /* renamed from: contentType, reason: from getter */
                public MediaType get$contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(jq1 sink) {
                    sink.getClass();
                    meh source = s08Var.source(kxdVar);
                    try {
                        sink.i1(source);
                        source.close();
                    } finally {
                    }
                }
            };
        }

        @hm6
        public final RequestBody create(MediaType contentType, String content) {
            content.getClass();
            return create(content, contentType);
        }

        @hm6
        public final RequestBody create(MediaType contentType, iw1 content) {
            content.getClass();
            return create(content, contentType);
        }

        @hm6
        public final RequestBody create(MediaType contentType, byte[] content, int offset, int byteCount) {
            content.getClass();
            return create(content, contentType, offset, byteCount);
        }

        @hm6
        public final RequestBody create(MediaType contentType, File file) {
            file.getClass();
            return create(file, contentType);
        }
    }

    public static final RequestBody create(kxd kxdVar, s08 s08Var, MediaType mediaType) {
        return INSTANCE.create(kxdVar, s08Var, mediaType);
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        return INSTANCE.create(file, mediaType);
    }

    public static final RequestBody create(FileDescriptor fileDescriptor, MediaType mediaType) {
        return INSTANCE.create(fileDescriptor, mediaType);
    }

    public static final RequestBody create(String str, MediaType mediaType) {
        return INSTANCE.create(str, mediaType);
    }

    @hm6
    public static final RequestBody create(MediaType mediaType, iw1 iw1Var) {
        return INSTANCE.create(mediaType, iw1Var);
    }

    @hm6
    public static final RequestBody create(MediaType mediaType, File file) {
        return INSTANCE.create(mediaType, file);
    }

    @hm6
    public static final RequestBody create(MediaType mediaType, String str) {
        return INSTANCE.create(mediaType, str);
    }

    @hm6
    public static final RequestBody create(MediaType mediaType, byte[] bArr) {
        return INSTANCE.create(mediaType, bArr);
    }

    @hm6
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i) {
        return INSTANCE.create(mediaType, bArr, i);
    }

    @hm6
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
        return INSTANCE.create(mediaType, bArr, i, i2);
    }

    public static final RequestBody create(byte[] bArr) {
        return INSTANCE.create(bArr);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        return INSTANCE.create(bArr, mediaType);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i) {
        return INSTANCE.create(bArr, mediaType, i);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i, int i2) {
        return INSTANCE.create(bArr, mediaType, i, i2);
    }
}
