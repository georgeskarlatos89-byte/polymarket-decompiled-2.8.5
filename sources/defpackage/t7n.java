package defpackage;

import com.appsflyer.attribution.RequestError;
import com.google.mlkit.vision.common.InputImage;
import com.socure.docv.capturesdk.common.utils.SelfieConstants;
import io.intercom.android.sdk.models.carousel.Carousel;
import kotlin.text.Regex;
import okhttp3.internal.ws.WebSocketProtocol;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class t7n {
    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean b(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static final String d(String str) {
        str.getClass();
        return new Regex("\\d").replace(str, "$0 ");
    }

    public static boolean e(cig cigVar) {
        char l;
        if (cigVar.e()) {
            if (cigVar.j('<')) {
                while (cigVar.e() && (l = cigVar.l()) != '\n' && l != '<') {
                    if (l != '>') {
                        if (l != '\\') {
                            cigVar.i();
                        } else {
                            cigVar.i();
                            char l2 = cigVar.l();
                            switch (l2) {
                                case '!':
                                case '\"':
                                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                                case '$':
                                case '%':
                                case '&':
                                case '\'':
                                case '(':
                                case RequestError.NO_DEV_KEY /* 41 */:
                                case '*':
                                case '+':
                                case Carousel.ENTITY_TYPE /* 44 */:
                                case '-':
                                case '.':
                                case '/':
                                    break;
                                default:
                                    switch (l2) {
                                        case ':':
                                        case ';':
                                        case SelfieConstants.SELFIE_OVAL_TOP_MARGIN /* 60 */:
                                        case '=':
                                        case '>':
                                        case '?':
                                        case '@':
                                            break;
                                        default:
                                            switch (l2) {
                                                case '[':
                                                case '\\':
                                                case ']':
                                                case '^':
                                                case '_':
                                                case '`':
                                                    break;
                                                default:
                                                    switch (l2) {
                                                    }
                                            }
                                    }
                            }
                            cigVar.i();
                        }
                    } else {
                        cigVar.i();
                        return true;
                    }
                }
            } else {
                int i = 0;
                boolean z = true;
                while (cigVar.e()) {
                    char l3 = cigVar.l();
                    if (l3 != ' ') {
                        if (l3 != '\\') {
                            if (l3 != '(') {
                                if (l3 != ')') {
                                    if (Character.isISOControl(l3)) {
                                        return !z;
                                    }
                                    cigVar.i();
                                } else {
                                    if (i == 0) {
                                        return true;
                                    }
                                    i--;
                                    cigVar.i();
                                }
                            } else {
                                i++;
                                if (i <= 32) {
                                    cigVar.i();
                                }
                            }
                        } else {
                            cigVar.i();
                            char l4 = cigVar.l();
                            switch (l4) {
                                case '!':
                                case '\"':
                                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                                case '$':
                                case '%':
                                case '&':
                                case '\'':
                                case '(':
                                case RequestError.NO_DEV_KEY /* 41 */:
                                case '*':
                                case '+':
                                case Carousel.ENTITY_TYPE /* 44 */:
                                case '-':
                                case '.':
                                case '/':
                                    break;
                                default:
                                    switch (l4) {
                                        case ':':
                                        case ';':
                                        case SelfieConstants.SELFIE_OVAL_TOP_MARGIN /* 60 */:
                                        case '=':
                                        case '>':
                                        case '?':
                                        case '@':
                                            break;
                                        default:
                                            switch (l4) {
                                                case '[':
                                                case '\\':
                                                case ']':
                                                case '^':
                                                case '_':
                                                case '`':
                                                    break;
                                                default:
                                                    switch (l4) {
                                                        case '{':
                                                        case '|':
                                                        case '}':
                                                        case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                            }
                                    }
                            }
                            cigVar.i();
                        }
                        z = false;
                    } else {
                        return !z;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean f(cig cigVar) {
        while (cigVar.e()) {
            switch (cigVar.l()) {
                case '[':
                    return false;
                case '\\':
                    cigVar.i();
                    char l = cigVar.l();
                    switch (l) {
                        case '!':
                        case '\"':
                        case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case RequestError.NO_DEV_KEY /* 41 */:
                        case '*':
                        case '+':
                        case Carousel.ENTITY_TYPE /* 44 */:
                        case '-':
                        case '.':
                        case '/':
                            break;
                        default:
                            switch (l) {
                                case ':':
                                case ';':
                                case SelfieConstants.SELFIE_OVAL_TOP_MARGIN /* 60 */:
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    break;
                                default:
                                    switch (l) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                        case '^':
                                        case '_':
                                        case '`':
                                            break;
                                        default:
                                            switch (l) {
                                            }
                                    }
                            }
                    }
                    cigVar.i();
                    break;
                case ']':
                    return true;
                default:
                    cigVar.i();
                    break;
            }
        }
        return true;
    }

    public static boolean g(cig cigVar, char c) {
        while (cigVar.e()) {
            char l = cigVar.l();
            if (l == '\\') {
                cigVar.i();
                char l2 = cigVar.l();
                switch (l2) {
                    case '!':
                    case '\"':
                    case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case RequestError.NO_DEV_KEY /* 41 */:
                    case '*':
                    case '+':
                    case Carousel.ENTITY_TYPE /* 44 */:
                    case '-':
                    case '.':
                    case '/':
                        break;
                    default:
                        switch (l2) {
                            case ':':
                            case ';':
                            case SelfieConstants.SELFIE_OVAL_TOP_MARGIN /* 60 */:
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                                break;
                            default:
                                switch (l2) {
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                        break;
                                    default:
                                        switch (l2) {
                                        }
                                }
                        }
                }
                cigVar.i();
            } else if (l != c) {
                if (c == ')' && l == '(') {
                    return false;
                }
                cigVar.i();
            } else {
                return true;
            }
        }
        return true;
    }
}
