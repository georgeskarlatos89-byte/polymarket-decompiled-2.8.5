package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.common.MlKitException;
import com.socure.docv.capturesdk.common.utils.BlurConstants;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.RadarTripOptions;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketProtocol;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class u1k {
    public static final int a;
    public static final String b;
    public static final byte[] c;
    public static final Pattern d;
    public static final Pattern e;
    public static HashMap f;
    public static final String[] g;
    public static final String[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        b = hdi.l(i2, ", ", sb);
        c = new byte[0];
        d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        e = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        g = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        h = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        i = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        j = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        k = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, WebSocketProtocol.PAYLOAD_SHORT, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, BlurConstants.H_BD, 179, 186, 189, 199, 192, MlKitException.CODE_SCANNER_CANCELLED, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, ModuleDescriptor.MODULE_VERSION, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 200, 221, 218, 211, 212, 105, 110, HttpStatusCodesKt.HTTP_EARLY_HINTS, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 230, 225, 232, 239, RadarSimpleLogBuffer.PURGE_AMOUNT, 253, 244, 243};
    }

    public static String A(StringBuilder sb, Formatter formatter, long j2) {
        String str;
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        if (j2 < 0) {
            str = "-";
        } else {
            str = "";
        }
        long abs = (Math.abs(j2) + 500) / 1000;
        long j3 = abs % 60;
        long j4 = (abs / 60) % 60;
        long j5 = abs / 3600;
        sb.setLength(0);
        if (j5 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString();
        }
        return formatter.format("%s%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    public static String B(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            q7m.d("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String C(int i2) {
        switch (i2) {
            case trd.POSITION_NONE /* -2 */:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return RadarTripOptions.KEY_METADATA;
            case 6:
                return "camera motion";
            default:
                if (i2 >= 10000) {
                    return sv6.j(i2, "custom (", ")");
                }
                return "?";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean D(bqe bqeVar) {
        boolean z = false;
        if (bqeVar == null) {
            return false;
        }
        ir7 ir7Var = (ir7) bqeVar;
        int n = ir7Var.n();
        if (n == 1 && ir7Var.q(2)) {
            ir7Var.y();
        } else {
            if (n == 4 && ir7Var.q(4)) {
                ir7Var.D(ir7Var.g(), false, -9223372036854775807L);
            }
            if (!ir7Var.q(1)) {
                ir7Var.K(true);
                return true;
            }
            return z;
        }
        z = true;
        if (!ir7Var.q(1)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int E(Uri uri, String str) {
        int i2;
        char c2 = 65535;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme == null || (!lfn.b("rtsp", scheme) && !lfn.b("rtspt", scheme))) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (lastIndexOf >= 0) {
                        String c3 = lfn.c(lastPathSegment.substring(lastIndexOf + 1));
                        c3.getClass();
                        switch (c3.hashCode()) {
                            case 104579:
                                if (c3.equals("ism")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 108321:
                                if (c3.equals("mpd")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 3242057:
                                if (c3.equals("isml")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 3299913:
                                if (c3.equals("m3u8")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                        }
                        switch (c2) {
                            case 0:
                            case 2:
                                i2 = 1;
                                break;
                            case 1:
                                i2 = 0;
                                break;
                            case 3:
                                i2 = 2;
                                break;
                            default:
                                i2 = 4;
                                break;
                        }
                        if (i2 != 4) {
                            return i2;
                        }
                    }
                    String path = uri.getPath();
                    path.getClass();
                    Matcher matcher = e.matcher(path);
                    if (matcher.matches()) {
                        String group = matcher.group(2);
                        if (group != null) {
                            if (!group.contains("format=mpd-time-csf")) {
                                if (group.contains("format=m3u8-aapl")) {
                                    return 2;
                                }
                            }
                            return 0;
                        }
                        return 1;
                    }
                }
                return 4;
            }
            return 3;
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c2 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c2 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                break;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean F(svd svdVar, svd svdVar2, Inflater inflater) {
        if (svdVar.a() <= 0) {
            return false;
        }
        if (svdVar2.a.length < svdVar.a()) {
            svdVar2.b(svdVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(svdVar.a, svdVar.b, svdVar.a());
        int i2 = 0;
        while (true) {
            try {
                byte[] bArr = svdVar2.a;
                i2 += inflater.inflate(bArr, i2, bArr.length - i2);
                if (inflater.finished()) {
                    svdVar2.E(i2);
                    inflater.reset();
                    return true;
                }
                if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                }
                byte[] bArr2 = svdVar2.a;
                if (i2 == bArr2.length) {
                    svdVar2.b(bArr2.length * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
    }

    public static void G(int i2) {
        Integer.toString(i2, 36);
    }

    public static boolean H(int i2) {
        if (i2 != 3 && i2 != 2 && i2 != 268435456 && i2 != 21 && i2 != 1342177280 && i2 != 22 && i2 != 1610612736 && i2 != 4) {
            return false;
        }
        return true;
    }

    public static boolean I(Context context) {
        int i2 = a;
        if (i2 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i2 == 30) {
                String str = Build.MODEL;
                if (lfn.b(str, "moto g(20)") || lfn.b(str, "rmx3231")) {
                    return true;
                }
            }
            if (i2 != 34 || !lfn.b(Build.MODEL, "sm-x200")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean J(int i2) {
        if (i2 != 10 && i2 != 13) {
            return false;
        }
        return true;
    }

    public static boolean K(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static long L(long j2) {
        if (j2 != -9223372036854775807L && j2 != Long.MIN_VALUE) {
            return j2 * 1000;
        }
        return j2;
    }

    public static String M(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String c2 = lfn.c(str);
        int i2 = 0;
        String str2 = c2.split("-", 2)[0];
        HashMap hashMap = f;
        if (hashMap == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = g;
            HashMap hashMap2 = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap2.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                hashMap2.put(strArr[i3], strArr[i3 + 1]);
            }
            f = hashMap2;
            hashMap = hashMap2;
        }
        String str4 = (String) hashMap.get(str2);
        if (str4 != null) {
            c2 = str4.concat(c2.substring(str2.length()));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return c2;
        }
        while (true) {
            String[] strArr2 = h;
            if (i2 < strArr2.length) {
                if (c2.startsWith(strArr2[i2])) {
                    return strArr2[i2 + 1] + c2.substring(strArr2[i2].length());
                }
                i2 += 2;
            } else {
                return c2;
            }
        }
    }

    public static Object[] N(int i2, Object[] objArr) {
        boolean z;
        if (i2 <= objArr.length) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        return Arrays.copyOf(objArr, i2);
    }

    public static long O(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.matches()) {
            int i2 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i2 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                if ("-".equals(matcher.group(11))) {
                    i2 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i2 != 0) {
                return timeInMillis - (i2 * RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
            }
            return timeInMillis;
        }
        throw dwd.a(null, "Invalid date/time format: ".concat(str));
    }

    public static void P(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return;
        }
        if (looper == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static long Q(int i2, long j2) {
        return S(j2, 1000000L, i2, RoundingMode.DOWN);
    }

    public static void R(long[] jArr, long j2) {
        long j3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long d2 = lan.d(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = lan.d(jArr[i2], d2, roundingMode);
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long d3 = lan.d(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = lan.f(jArr[i2], d3);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j4 = jArr[i3];
            if (j4 != 0) {
                if (j2 >= j4 && j2 % j4 == 0) {
                    jArr[i3] = lan.d(1000000L, lan.d(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 < j4 && j4 % j2 == 0) {
                    jArr[i3] = lan.f(1000000L, lan.d(j4, j2, RoundingMode.UNNECESSARY));
                } else {
                    j3 = j2;
                    jArr[i3] = T(j4, 1000000L, j3, roundingMode);
                    i3++;
                    j2 = j3;
                }
            }
            j3 = j2;
            i3++;
            j2 = j3;
        }
    }

    public static long S(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        if (j4 >= j3 && j4 % j3 == 0) {
            return lan.d(j2, lan.d(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return lan.f(j2, lan.d(j3, j4, RoundingMode.UNNECESSARY));
        }
        if (j4 >= j2 && j4 % j2 == 0) {
            return lan.d(j3, lan.d(j4, j2, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j4 < j2 && j2 % j4 == 0) {
            return lan.f(j3, lan.d(j2, j4, RoundingMode.UNNECESSARY));
        }
        return T(j2, j3, j4, roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L54;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x007d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long T(long j2, long j3, long j4, RoundingMode roundingMode) {
        double d2;
        long j5;
        int i2;
        boolean z;
        long f2 = lan.f(j2, j3);
        if (f2 != Long.MAX_VALUE && f2 != Long.MIN_VALUE) {
            return lan.d(f2, j4, roundingMode);
        }
        long e2 = lan.e(Math.abs(j3), Math.abs(j4));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long d3 = lan.d(j3, e2, roundingMode2);
        long d4 = lan.d(j4, e2, roundingMode2);
        long e3 = lan.e(Math.abs(j2), Math.abs(d4));
        long d5 = lan.d(j2, e3, roundingMode2);
        long d6 = lan.d(d4, e3, roundingMode2);
        long f3 = lan.f(d5, d3);
        if (f3 != Long.MAX_VALUE && f3 != Long.MIN_VALUE) {
            return lan.d(f3, d6, roundingMode);
        }
        double d7 = d5 * (d3 / d6);
        if (d7 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d7 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i3 = ux6.a;
        if (xxn.c(d7)) {
            boolean z2 = true;
            switch (tx6.a[roundingMode.ordinal()]) {
                case 1:
                    ofn.j(ux6.a(d7));
                    d2 = d7;
                    if ((-9.223372036854776E18d) - d2 >= 1.0d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (d2 >= 9.223372036854776E18d) {
                        z2 = false;
                    }
                    if (!(z & z2)) {
                        return (long) d2;
                    }
                    throw new ArithmeticException("rounded value is out of range for input " + d7 + " and rounding mode " + roundingMode);
                case 2:
                    if (d7 < ConstantsKt.UNSET && !ux6.a(d7)) {
                        j5 = ((long) d7) - 1;
                        d2 = j5;
                        if ((-9.223372036854776E18d) - d2 >= 1.0d) {
                        }
                        if (d2 >= 9.223372036854776E18d) {
                        }
                        if (!(z & z2)) {
                        }
                    }
                    d2 = d7;
                    if ((-9.223372036854776E18d) - d2 >= 1.0d) {
                    }
                    if (d2 >= 9.223372036854776E18d) {
                    }
                    if (!(z & z2)) {
                    }
                    break;
                case 3:
                    if (d7 > ConstantsKt.UNSET && !ux6.a(d7)) {
                        j5 = ((long) d7) + 1;
                        d2 = j5;
                        if ((-9.223372036854776E18d) - d2 >= 1.0d) {
                        }
                        if (d2 >= 9.223372036854776E18d) {
                        }
                        if (!(z & z2)) {
                        }
                    }
                    d2 = d7;
                    if ((-9.223372036854776E18d) - d2 >= 1.0d) {
                    }
                    if (d2 >= 9.223372036854776E18d) {
                    }
                    if (!(z & z2)) {
                    }
                    break;
                case 4:
                    d2 = d7;
                    if ((-9.223372036854776E18d) - d2 >= 1.0d) {
                    }
                    if (d2 >= 9.223372036854776E18d) {
                    }
                    if (!(z & z2)) {
                    }
                    break;
                case 5:
                    if (!ux6.a(d7)) {
                        long j6 = (long) d7;
                        if (d7 > ConstantsKt.UNSET) {
                            i2 = 1;
                        } else {
                            i2 = -1;
                        }
                        d2 = j6 + i2;
                        if ((-9.223372036854776E18d) - d2 >= 1.0d) {
                        }
                        if (d2 >= 9.223372036854776E18d) {
                        }
                        if (!(z & z2)) {
                        }
                    }
                    d2 = d7;
                    if ((-9.223372036854776E18d) - d2 >= 1.0d) {
                    }
                    if (d2 >= 9.223372036854776E18d) {
                    }
                    if (!(z & z2)) {
                    }
                    break;
                case 6:
                    d2 = Math.rint(d7);
                    if ((-9.223372036854776E18d) - d2 >= 1.0d) {
                    }
                    if (d2 >= 9.223372036854776E18d) {
                    }
                    if (!(z & z2)) {
                    }
                    break;
                case 7:
                    d2 = Math.rint(d7);
                    if (Math.abs(d7 - d2) == 0.5d) {
                        d2 = Math.copySign(0.5d, d7) + d7;
                    }
                    if ((-9.223372036854776E18d) - d2 >= 1.0d) {
                    }
                    if (d2 >= 9.223372036854776E18d) {
                    }
                    if (!(z & z2)) {
                    }
                    break;
                case 8:
                    d2 = Math.rint(d7);
                    break;
                default:
                    f27.p();
                    return 0L;
            }
        } else {
            throw new ArithmeticException("input is infinite or NaN");
        }
    }

    public static boolean U(bqe bqeVar, boolean z) {
        if (bqeVar != null) {
            ir7 ir7Var = (ir7) bqeVar;
            if (ir7Var.m() && ir7Var.n() != 1 && ir7Var.n() != 4) {
                if (z) {
                    ir7Var.V();
                    if (ir7Var.h0.n == 0) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static String[] V(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.trim().split("(\\s*,\\s*)", -1);
    }

    public static long W(long j2) {
        if (j2 != -9223372036854775807L && j2 != Long.MIN_VALUE) {
            return j2 / 1000;
        }
        return j2;
    }

    public static int a(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i2 = binarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j2) {
                break;
            }
            binarySearch = i2;
        }
        if (z) {
            return binarySearch;
        }
        return i2;
    }

    public static int b(ctb ctbVar, long j2) {
        int i2 = ctbVar.b - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (ctbVar.d(i4) < j2) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        int i5 = i2 + 1;
        if (i5 < ctbVar.b && ctbVar.d(i5) == j2) {
            return i5;
        }
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    public static int c(List list, boolean z, Long l) {
        int i2;
        int binarySearch = Collections.binarySearch(list, l);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || ((Comparable) list.get(i3)).compareTo(l) != 0) {
                    break;
                }
                binarySearch = i3;
            }
            i2 = binarySearch;
        }
        if (z) {
            return Math.max(0, i2);
        }
        return i2;
    }

    public static int d(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                i3 = binarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                binarySearch = i3;
            }
            if (z) {
                i4 = binarySearch;
            } else {
                i4 = i3;
            }
        }
        if (z2) {
            return Math.max(0, i4);
        }
        return i4;
    }

    public static int e(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                binarySearch = i3;
            }
            i2 = binarySearch;
        }
        if (z) {
            return Math.max(0, i2);
        }
        return i2;
    }

    public static int f(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float h(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int i(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long j(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static boolean k(SparseArray sparseArray, int i2) {
        if (sparseArray.indexOfKey(i2) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean l(Object obj, Object[] objArr) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int m(int i2, int i3, int i4, byte[] bArr) {
        while (i2 < i3) {
            i4 = i[((i4 >>> 24) ^ (bArr[i2] & MessagePack.Code.EXT_TIMESTAMP)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static Handler n(y6c y6cVar) {
        Looper myLooper = Looper.myLooper();
        pfn.g(myLooper);
        return new Handler(myLooper, y6cVar);
    }

    public static String o(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int p(int i2) {
        if (i2 == 20) {
            return 30;
        }
        if (i2 != 22) {
            if (i2 != 30) {
                switch (i2) {
                    case 2:
                    case 3:
                        return 3;
                    case 4:
                    case 5:
                    case 6:
                        return 21;
                    case 7:
                    case 8:
                        return 23;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return 28;
                    default:
                        switch (i2) {
                            case 14:
                                return 25;
                            case 15:
                            case 16:
                            case 17:
                            case MlKitException.UNSUPPORTED /* 18 */:
                                return 28;
                            default:
                                return bd0.API_PRIORITY_OTHER;
                        }
                }
            }
            return 34;
        }
        return 31;
    }

    public static AudioFormat q(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    public static int r(int i2) {
        int i3 = a;
        if (i2 != 10) {
            if (i2 != 12) {
                if (i2 != 24) {
                    switch (i2) {
                        case 1:
                            return 4;
                        case 2:
                            return 12;
                        case 3:
                            return 28;
                        case 4:
                            return MlKitException.CODE_SCANNER_TASK_IN_PROGRESS;
                        case 5:
                            return 220;
                        case 6:
                            return 252;
                        case 7:
                            return 1276;
                        case 8:
                            return 6396;
                        default:
                            return 0;
                    }
                }
                if (i3 < 32) {
                    return 0;
                }
                return 67108860;
            }
            return 743676;
        }
        if (i3 < 32) {
            return 6396;
        }
        return 737532;
    }

    public static int s(int i2) {
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 21) {
                        if (i2 != 22) {
                            if (i2 != 268435456) {
                                if (i2 != 1342177280) {
                                    if (i2 != 1610612736) {
                                        omf.a();
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                    return 3;
                }
                return 4;
            }
            return 1;
        }
        return 2;
    }

    public static int t(int i2, String str) {
        int i3 = 0;
        for (String str2 : V(str)) {
            if (i2 == ggc.h(ggc.d(str2))) {
                i3++;
            }
        }
        return i3;
    }

    public static String u(int i2, String str) {
        String[] V = V(str);
        if (V.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : V) {
                if (i2 == ggc.h(ggc.d(str2))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str2);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        }
        return null;
    }

    public static int v(int i2) {
        if (i2 != 2 && i2 != 4) {
            if (i2 != 10) {
                if (i2 != 7) {
                    if (i2 != 8) {
                        switch (i2) {
                            case 15:
                                return 6003;
                            case 16:
                            case MlKitException.UNSUPPORTED /* 18 */:
                                return 6005;
                            case 17:
                            case zh4.REMOTE_EXCEPTION /* 19 */:
                            case 20:
                            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            case 22:
                                return 6004;
                            default:
                                switch (i2) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }

    public static int w(String str) {
        String[] split;
        int length;
        boolean z;
        int i2 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z = true;
        } else {
            z = false;
        }
        try {
            str2.getClass();
            i2 = Integer.parseInt(str2);
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    public static long x(float f2, long j2) {
        if (f2 == 1.0f) {
            return j2;
        }
        return Math.round(j2 * f2);
    }

    public static int y(int i2) {
        if (i2 != 8) {
            if (i2 != 16) {
                if (i2 != 24) {
                    if (i2 != 32) {
                        return 0;
                    }
                    return 22;
                }
                return 21;
            }
            return 2;
        }
        return 3;
    }

    public static long z(float f2, long j2) {
        if (f2 == 1.0f) {
            return j2;
        }
        return Math.round(j2 / f2);
    }
}
