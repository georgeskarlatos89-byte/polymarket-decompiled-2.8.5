package defpackage;

import com.appsflyer.attribution.RequestError;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.common.utils.SelfieConstants;
import io.ably.lib.util.AgentHeaderCreator;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.io.File;
import java.net.URLConnection;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class qfn {
    public static float a(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        if (f > f3) {
            return f3;
        }
        return f;
    }

    public static int b(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        if (i > i3) {
            return i3;
        }
        return i;
    }

    public static String c(File file) {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.endsWith(AgentHeaderCreator.AGENT_DIVIDER)) {
            return canonicalPath.concat(AgentHeaderCreator.AGENT_DIVIDER);
        }
        return canonicalPath;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005d, code lost:
    
        if (r5.equals("mhtml") == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String d(String str) {
        String str2 = null;
        if (str != null) {
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
            if (guessContentTypeFromName != null) {
                str2 = guessContentTypeFromName;
            } else {
                char c = '.';
                int lastIndexOf = str.lastIndexOf(46);
                if (lastIndexOf != -1) {
                    String lowerCase = str.substring(lastIndexOf + 1).toLowerCase();
                    lowerCase.getClass();
                    switch (lowerCase.hashCode()) {
                        case 3315:
                            if (lowerCase.equals("gz")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3401:
                            if (lowerCase.equals("js")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 97669:
                            if (lowerCase.equals("bmp")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 98819:
                            if (lowerCase.equals("css")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 102340:
                            if (lowerCase.equals("gif")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 103649:
                            if (lowerCase.equals("htm")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 104085:
                            if (lowerCase.equals("ico")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 105441:
                            if (lowerCase.equals("jpg")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 106458:
                            if (lowerCase.equals("m4a")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 106479:
                            if (lowerCase.equals("m4v")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 108089:
                            if (lowerCase.equals("mht")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 108150:
                            if (lowerCase.equals("mjs")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 108272:
                            if (lowerCase.equals("mp3")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 108273:
                            if (lowerCase.equals("mp4")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case 108324:
                            if (lowerCase.equals("mpg")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109961:
                            if (lowerCase.equals("oga")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109967:
                            if (lowerCase.equals("ogg")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109973:
                            if (lowerCase.equals("ogm")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109982:
                            if (lowerCase.equals("ogv")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case 110834:
                            if (lowerCase.equals("pdf")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        case 111030:
                            if (lowerCase.equals("pjp")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case 111145:
                            if (lowerCase.equals("png")) {
                                c = 21;
                                break;
                            }
                            c = 65535;
                            break;
                        case 114276:
                            if (lowerCase.equals("svg")) {
                                c = 22;
                                break;
                            }
                            c = 65535;
                            break;
                        case 114791:
                            if (lowerCase.equals("tgz")) {
                                c = 23;
                                break;
                            }
                            c = 65535;
                            break;
                        case 114833:
                            if (lowerCase.equals("tif")) {
                                c = 24;
                                break;
                            }
                            c = 65535;
                            break;
                        case 117484:
                            if (lowerCase.equals("wav")) {
                                c = 25;
                                break;
                            }
                            c = 65535;
                            break;
                        case 118660:
                            if (lowerCase.equals("xht")) {
                                c = 26;
                                break;
                            }
                            c = 65535;
                            break;
                        case 118807:
                            if (lowerCase.equals("xml")) {
                                c = 27;
                                break;
                            }
                            c = 65535;
                            break;
                        case 120609:
                            if (lowerCase.equals("zip")) {
                                c = 28;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3000872:
                            if (lowerCase.equals("apng")) {
                                c = 29;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3145576:
                            if (lowerCase.equals("flac")) {
                                c = 30;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3213227:
                            if (lowerCase.equals("html")) {
                                c = 31;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3259225:
                            if (lowerCase.equals("jfif")) {
                                c = ' ';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3268712:
                            if (lowerCase.equals("jpeg")) {
                                c = '!';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3271912:
                            if (lowerCase.equals("json")) {
                                c = '\"';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3358085:
                            if (lowerCase.equals("mpeg")) {
                                c = '#';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3418175:
                            if (lowerCase.equals("opus")) {
                                c = '$';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3529614:
                            if (lowerCase.equals("shtm")) {
                                c = '%';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3542678:
                            if (lowerCase.equals("svgz")) {
                                c = '&';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3559925:
                            if (lowerCase.equals("tiff")) {
                                c = '\'';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3642020:
                            if (lowerCase.equals("wasm")) {
                                c = '(';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3645337:
                            if (lowerCase.equals("webm")) {
                                c = ')';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3645340:
                            if (lowerCase.equals("webp")) {
                                c = '*';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3655064:
                            if (lowerCase.equals("woff")) {
                                c = '+';
                                break;
                            }
                            c = 65535;
                            break;
                        case 3678569:
                            if (lowerCase.equals("xhtm")) {
                                c = ',';
                                break;
                            }
                            c = 65535;
                            break;
                        case 96488848:
                            if (lowerCase.equals("ehtml")) {
                                c = '-';
                                break;
                            }
                            c = 65535;
                            break;
                        case 103877016:
                            break;
                        case 106703064:
                            if (lowerCase.equals("pjpeg")) {
                                c = '/';
                                break;
                            }
                            c = 65535;
                            break;
                        case 109418142:
                            if (lowerCase.equals("shtml")) {
                                c = '0';
                                break;
                            }
                            c = 65535;
                            break;
                        case 114035747:
                            if (lowerCase.equals("xhtml")) {
                                c = '1';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 23:
                            str2 = "application/gzip";
                            break;
                        case 1:
                        case 11:
                            str2 = "text/javascript";
                            break;
                        case 2:
                            str2 = "image/bmp";
                            break;
                        case 3:
                            str2 = "text/css";
                            break;
                        case 4:
                            str2 = "image/gif";
                            break;
                        case 5:
                        case 31:
                        case '%':
                        case '-':
                        case '0':
                            str2 = "text/html";
                            break;
                        case 6:
                            str2 = "image/x-icon";
                            break;
                        case 7:
                        case 20:
                        case ' ':
                        case '!':
                        case '/':
                            str2 = "image/jpeg";
                            break;
                        case '\b':
                            str2 = "audio/x-m4a";
                            break;
                        case '\t':
                        case '\r':
                            str2 = "video/mp4";
                            break;
                        case '\n':
                        case '.':
                            str2 = "multipart/related";
                            break;
                        case '\f':
                            str2 = "audio/mpeg";
                            break;
                        case 14:
                        case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                            str2 = "video/mpeg";
                            break;
                        case 15:
                        case 16:
                        case '$':
                            str2 = "audio/ogg";
                            break;
                        case 17:
                        case MlKitException.UNSUPPORTED /* 18 */:
                            str2 = "video/ogg";
                            break;
                        case zh4.REMOTE_EXCEPTION /* 19 */:
                            str2 = "application/pdf";
                            break;
                        case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            str2 = "image/png";
                            break;
                        case 22:
                        case '&':
                            str2 = "image/svg+xml";
                            break;
                        case 24:
                        case '\'':
                            str2 = "image/tiff";
                            break;
                        case 25:
                            str2 = "audio/wav";
                            break;
                        case 26:
                        case Carousel.ENTITY_TYPE /* 44 */:
                        case '1':
                            str2 = "application/xhtml+xml";
                            break;
                        case 27:
                            str2 = "text/xml";
                            break;
                        case 28:
                            str2 = "application/zip";
                            break;
                        case 29:
                            str2 = "image/apng";
                            break;
                        case SelfieConstants.EXPAND_GUIDING_BOX_PERCENTAGE /* 30 */:
                            str2 = "audio/flac";
                            break;
                        case '\"':
                            str2 = "application/json";
                            break;
                        case '(':
                            str2 = "application/wasm";
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            str2 = "video/webm";
                            break;
                        case '*':
                            str2 = "image/webp";
                            break;
                        case '+':
                            str2 = "application/font-woff";
                            break;
                    }
                }
            }
        }
        if (str2 == null) {
            return ApiConstant.TEXT_PLAIN_MEDIA_TYPE;
        }
        return str2;
    }

    public static /* synthetic */ boolean e(Unsafe unsafe, wrl wrlVar, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(wrlVar, j, obj, obj2)) {
            if (unsafe.getObject(wrlVar, j) != obj && unsafe.getObject(wrlVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
