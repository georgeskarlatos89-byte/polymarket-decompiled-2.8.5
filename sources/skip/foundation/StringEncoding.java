package skip.foundation;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import skip.lib.CustomStringConvertibleKt;
import skip.lib.Hasher;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lskip/foundation/StringEncoding;", "Lskip/lib/RawRepresentable;", "Ljava/nio/charset/Charset;", "rawValue", "unusedp_0", "", "<init>", "(Ljava/nio/charset/Charset;Ljava/lang/Void;)V", "(Ljava/nio/charset/Charset;)V", "getRawValue", "()Ljava/nio/charset/Charset;", "description", "", "getDescription", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StringEncoding implements RawRepresentable<Charset> {
    private static final StringEncoding utf32;
    private static final StringEncoding utf32BigEndian;
    private static final StringEncoding utf32LittleEndian;
    private final Charset rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final StringEncoding utf8 = new StringEncoding(Charsets.UTF_8);
    private static final StringEncoding utf16 = new StringEncoding(Charsets.b);
    private static final StringEncoding utf16LittleEndian = new StringEncoding(Charsets.d);
    private static final StringEncoding utf16BigEndian = new StringEncoding(Charsets.c);

    static {
        Charsets.a.getClass();
        Charset charset = Charsets.g;
        if (charset == null) {
            charset = Charset.forName("UTF-32");
            charset.getClass();
            Charsets.g = charset;
        }
        utf32 = new StringEncoding(charset);
        Charset charset2 = Charsets.h;
        if (charset2 == null) {
            charset2 = Charset.forName("UTF-32LE");
            charset2.getClass();
            Charsets.h = charset2;
        }
        utf32LittleEndian = new StringEncoding(charset2);
        Charset charset3 = Charsets.i;
        if (charset3 == null) {
            charset3 = Charset.forName("UTF-32BE");
            charset3.getClass();
            Charsets.i = charset3;
        }
        utf32BigEndian = new StringEncoding(charset3);
    }

    public StringEncoding(Charset charset, Void r3) {
        charset.getClass();
        this.rawValue = (Charset) StructKt.sref$default(charset, null, 1, null);
    }

    public static final /* synthetic */ StringEncoding access$getUtf16$cp() {
        return utf16;
    }

    public static final /* synthetic */ StringEncoding access$getUtf16BigEndian$cp() {
        return utf16BigEndian;
    }

    public static final /* synthetic */ StringEncoding access$getUtf16LittleEndian$cp() {
        return utf16LittleEndian;
    }

    public static final /* synthetic */ StringEncoding access$getUtf32$cp() {
        return utf32;
    }

    public static final /* synthetic */ StringEncoding access$getUtf32BigEndian$cp() {
        return utf32BigEndian;
    }

    public static final /* synthetic */ StringEncoding access$getUtf32LittleEndian$cp() {
        return utf32LittleEndian;
    }

    public static final /* synthetic */ StringEncoding access$getUtf8$cp() {
        return utf8;
    }

    public boolean equals(Object other) {
        if (!(other instanceof StringEncoding)) {
            return false;
        }
        return Intrinsics.areEqual(getRawValue(), ((StringEncoding) other).getRawValue());
    }

    public final String getDescription() {
        return CustomStringConvertibleKt.getDescription(getRawValue());
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ Charset getRawValue() {
        return getRawValue();
    }

    public int hashCode() {
        return Hasher.INSTANCE.combine(1, getRawValue());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lskip/foundation/StringEncoding$Companion;", "", "<init>", "()V", "utf8", "Lskip/foundation/StringEncoding;", "getUtf8", "()Lskip/foundation/StringEncoding;", "utf16", "getUtf16", "utf16LittleEndian", "getUtf16LittleEndian", "utf16BigEndian", "getUtf16BigEndian", "utf32", "getUtf32", "utf32LittleEndian", "getUtf32LittleEndian", "utf32BigEndian", "getUtf32BigEndian", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StringEncoding getUtf16() {
            return StringEncoding.access$getUtf16$cp();
        }

        public final StringEncoding getUtf16BigEndian() {
            return StringEncoding.access$getUtf16BigEndian$cp();
        }

        public final StringEncoding getUtf16LittleEndian() {
            return StringEncoding.access$getUtf16LittleEndian$cp();
        }

        public final StringEncoding getUtf32() {
            return StringEncoding.access$getUtf32$cp();
        }

        public final StringEncoding getUtf32BigEndian() {
            return StringEncoding.access$getUtf32BigEndian$cp();
        }

        public final StringEncoding getUtf32LittleEndian() {
            return StringEncoding.access$getUtf32LittleEndian$cp();
        }

        public final StringEncoding getUtf8() {
            return StringEncoding.access$getUtf8$cp();
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public Charset getRawValue() {
        return this.rawValue;
    }

    public /* synthetic */ StringEncoding(Charset charset, Void r2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(charset, (i & 2) != 0 ? null : r2);
    }

    public StringEncoding(Charset charset) {
        charset.getClass();
        this.rawValue = (Charset) StructKt.sref$default(charset, null, 1, null);
    }
}
