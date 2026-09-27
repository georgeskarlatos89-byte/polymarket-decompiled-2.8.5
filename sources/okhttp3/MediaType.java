package okhttp3;

import com.fingerprintjs.android.fpjs_pro.g;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.dmk;
import defpackage.dsn;
import defpackage.fi9;
import defpackage.hdi;
import defpackage.hm6;
import defpackage.p3;
import defpackage.r3c;
import defpackage.woa;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0003J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0012J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u001b"}, d2 = {"Lokhttp3/MediaType;", "", "mediaType", "", "type", "subtype", "parameterNamesAndValues", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "getMediaType$okhttp", "()Ljava/lang/String;", "[Ljava/lang/String;", "charset", "Ljava/nio/charset/Charset;", "defaultValue", "parameter", Keys.KEY_NAME, "-deprecated_type", "-deprecated_subtype", "toString", "equals", "", "other", "hashCode", "", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaType {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Regex TYPE_SUBTYPE = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Regex PARAMETER = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public MediaType(String str, String str2, String str3, String[] strArr) {
        g.x(str, str2, str3);
        strArr.getClass();
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public static final /* synthetic */ Regex access$getPARAMETER$cp() {
        return PARAMETER;
    }

    public static final /* synthetic */ Regex access$getTYPE_SUBTYPE$cp() {
        return TYPE_SUBTYPE;
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    public static final MediaType get(String str) {
        return INSTANCE.get(str);
    }

    public static final MediaType parse(String str) {
        return INSTANCE.parse(str);
    }

    @hm6
    /* renamed from: -deprecated_subtype, reason: not valid java name and from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    @hm6
    /* renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final String getType() {
        return this.type;
    }

    public final Charset charset(Charset defaultValue) {
        String parameter = parameter("charset");
        if (parameter == null) {
            return defaultValue;
        }
        try {
            return Charset.forName(parameter);
        } catch (IllegalArgumentException unused) {
            return defaultValue;
        }
    }

    public boolean equals(Object other) {
        if ((other instanceof MediaType) && Intrinsics.areEqual(((MediaType) other).mediaType, this.mediaType)) {
            return true;
        }
        return false;
    }

    /* renamed from: getMediaType$okhttp, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String parameter(String name) {
        name.getClass();
        int i = 0;
        int c = dsn.c(0, this.parameterNamesAndValues.length - 1, 2);
        if (c >= 0) {
            while (!e.o(this.parameterNamesAndValues[i], name, true)) {
                if (i != c) {
                    i += 2;
                } else {
                    return null;
                }
            }
            return this.parameterNamesAndValues[i + 1];
        }
        return null;
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\n\u001a\u00020\u000b*\u00020\u0005H\u0007¢\u0006\u0002\b\fJ\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u0005H\u0007¢\u0006\u0002\b\u000eJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u0010J\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/MediaType$Companion;", "", "<init>", "()V", "TOKEN", "", "QUOTED", "TYPE_SUBTYPE", "Lkotlin/text/Regex;", "PARAMETER", "toMediaType", "Lokhttp3/MediaType;", "get", "toMediaTypeOrNull", "parse", "mediaType", "-deprecated_get", "-deprecated_parse", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @hm6
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final MediaType m971deprecated_get(String mediaType) {
            mediaType.getClass();
            return get(mediaType);
        }

        @hm6
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final MediaType m972deprecated_parse(String mediaType) {
            mediaType.getClass();
            return parse(mediaType);
        }

        public final MediaType get(String str) {
            String str2;
            String str3;
            str.getClass();
            b b = MediaType.access$getTYPE_SUBTYPE$cp().b(0, str);
            if (b != null) {
                String str4 = (String) ((r3c) b.getGroupValues()).get(1);
                Locale locale = Locale.ROOT;
                String lowerCase = str4.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((String) ((r3c) b.getGroupValues()).get(2)).toLowerCase(locale);
                lowerCase2.getClass();
                ArrayList arrayList = new ArrayList();
                int i = b.a().b;
                while (true) {
                    int i2 = i + 1;
                    if (i2 < str.length()) {
                        b b2 = MediaType.access$getPARAMETER$cp().b(i2, str);
                        if (b2 != null) {
                            p3 p3Var = b2.c;
                            MatchGroup a = p3Var.a(1);
                            if (a != null) {
                                str2 = a.a;
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                i = b2.a().b;
                            } else {
                                MatchGroup a2 = p3Var.a(2);
                                if (a2 != null) {
                                    str3 = a2.a;
                                } else {
                                    str3 = null;
                                }
                                if (str3 == null) {
                                    MatchGroup a3 = p3Var.a(3);
                                    a3.getClass();
                                    str3 = a3.a;
                                } else if (StringsKt.g0(str3, '\'') && StringsKt.N(str3, '\'') && str3.length() > 2) {
                                    str3 = woa.k(1, 1, str3);
                                }
                                arrayList.add(str2);
                                arrayList.add(str3);
                                i = b2.a().b;
                            }
                        } else {
                            fi9.l("Parameter is not formatted correctly: \"", str.substring(i2), "\" for: \"", str, 34);
                            return null;
                        }
                    } else {
                        return new MediaType(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                    }
                }
            } else {
                dmk.v(hdi.o("No subtype found for: \"", str, '\"'));
                return null;
            }
        }

        public final MediaType parse(String str) {
            str.getClass();
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }
}
