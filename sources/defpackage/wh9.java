package defpackage;

import com.google.mlkit.common.MlKitException;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import okhttp3.internal.http.HttpStatusCodesKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wh9 implements Comparable {
    public static final wh9 c;
    public static final wh9 d;
    public static final wh9 e;
    public static final wh9 f;
    public static final wh9 g;
    public static final wh9 h;
    public static final List i;
    public final int a;
    public final String b;

    static {
        wh9 wh9Var = new wh9(100, "Continue");
        wh9 wh9Var2 = new wh9(101, "Switching Protocols");
        wh9 wh9Var3 = new wh9(102, "Processing");
        wh9 wh9Var4 = new wh9(200, "OK");
        wh9 wh9Var5 = new wh9(MlKitException.CODE_SCANNER_CANCELLED, "Created");
        wh9 wh9Var6 = new wh9(MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, "Accepted");
        wh9 wh9Var7 = new wh9(MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, "Non-Authoritative Information");
        wh9 wh9Var8 = new wh9(MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, "No Content");
        wh9 wh9Var9 = new wh9(MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, "Reset Content");
        wh9 wh9Var10 = new wh9(MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, "Partial Content");
        wh9 wh9Var11 = new wh9(MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, "Multi-Status");
        wh9 wh9Var12 = new wh9(300, "Multiple Choices");
        wh9 wh9Var13 = new wh9(MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, "Moved Permanently");
        c = wh9Var13;
        wh9 wh9Var14 = new wh9(302, "Found");
        d = wh9Var14;
        wh9 wh9Var15 = new wh9(303, "See Other");
        e = wh9Var15;
        wh9 wh9Var16 = new wh9(304, "Not Modified");
        wh9 wh9Var17 = new wh9(305, "Use Proxy");
        wh9 wh9Var18 = new wh9(306, "Switch Proxy");
        wh9 wh9Var19 = new wh9(HttpStatusCodesKt.HTTP_TEMP_REDIRECT, "Temporary Redirect");
        f = wh9Var19;
        wh9 wh9Var20 = new wh9(HttpStatusCodesKt.HTTP_PERM_REDIRECT, "Permanent Redirect");
        g = wh9Var20;
        wh9 wh9Var21 = new wh9(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Bad Request");
        wh9 wh9Var22 = new wh9(401, "Unauthorized");
        wh9 wh9Var23 = new wh9(402, "Payment Required");
        wh9 wh9Var24 = new wh9(403, "Forbidden");
        wh9 wh9Var25 = new wh9(404, "Not Found");
        h = wh9Var25;
        List listOf = CollectionsKt.listOf(wh9Var, wh9Var2, wh9Var3, wh9Var4, wh9Var5, wh9Var6, wh9Var7, wh9Var8, wh9Var9, wh9Var10, wh9Var11, wh9Var12, wh9Var13, wh9Var14, wh9Var15, wh9Var16, wh9Var17, wh9Var18, wh9Var19, wh9Var20, wh9Var21, wh9Var22, wh9Var23, wh9Var24, wh9Var25, new wh9(405, "Method Not Allowed"), new wh9(406, "Not Acceptable"), new wh9(407, "Proxy Authentication Required"), new wh9(408, "Request Timeout"), new wh9(409, "Conflict"), new wh9(410, "Gone"), new wh9(411, "Length Required"), new wh9(412, "Precondition Failed"), new wh9(413, "Payload Too Large"), new wh9(414, "Request-URI Too Long"), new wh9(415, "Unsupported Media Type"), new wh9(416, "Requested Range Not Satisfiable"), new wh9(417, "Expectation Failed"), new wh9(422, "Unprocessable Entity"), new wh9(423, "Locked"), new wh9(424, "Failed Dependency"), new wh9(425, "Too Early"), new wh9(426, "Upgrade Required"), new wh9(429, "Too Many Requests"), new wh9(431, "Request Header Fields Too Large"), new wh9(RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE, "Internal Server Error"), new wh9(501, "Not Implemented"), new wh9(502, "Bad Gateway"), new wh9(503, "Service Unavailable"), new wh9(504, "Gateway Timeout"), new wh9(505, "HTTP Version Not Supported"), new wh9(506, "Variant Also Negotiates"), new wh9(507, "Insufficient Storage"));
        i = listOf;
        List list = listOf;
        int a = c1c.a(CollectionsKt.w(list));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((wh9) obj).a), obj);
        }
    }

    public wh9(int i2, String str) {
        str.getClass();
        this.a = i2;
        this.b = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        wh9 wh9Var = (wh9) obj;
        wh9Var.getClass();
        return this.a - wh9Var.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof wh9) && ((wh9) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return this.a + ' ' + this.b;
    }
}
