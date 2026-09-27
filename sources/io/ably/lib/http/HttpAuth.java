package io.ably.lib.http;

import defpackage.hdi;
import defpackage.ix2;
import defpackage.k84;
import defpackage.m51;
import defpackage.sv6;
import io.ably.lib.util.Base64Coder;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class HttpAuth {
    private static final String HEX_LOOKUP = "0123456789abcdef";
    private static MessageDigest md5;
    private String HA1;
    private int ncCounter = 1;
    private String nonce;
    private String opaque;
    private final String password;
    private final Type prefType;
    private String[] qops;
    private String realm;
    private Type type;
    private final String username;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* renamed from: io.ably.lib.http.HttpAuth$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$ably$lib$http$HttpAuth$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$io$ably$lib$http$HttpAuth$Type = iArr;
            try {
                iArr[Type.BASIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$ably$lib$http$HttpAuth$Type[Type.DIGEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public enum Type {
        BASIC,
        DIGEST,
        X_ABLY_TOKEN;

        public static Type parse(String str) {
            String replace = str.toUpperCase(Locale.ROOT).replace('-', '_');
            try {
                return valueOf(replace);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(hdi.p("Failed to parse conformed form '", replace, "' of raw value '", str, "'."), e);
            }
        }
    }

    static {
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    public HttpAuth(String str, String str2, Type type) {
        this.username = str;
        this.password = str2;
        this.prefType = type;
    }

    private static String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(HEX_LOOKUP.charAt((bArr[i] & 240) >> 4));
            sb.append(HEX_LOOKUP.charAt(bArr[i] & 15));
        }
        return sb.toString();
    }

    private static String digestBytes(byte[] bArr) {
        md5.reset();
        md5.update(bArr);
        return bytesToHexString(md5.digest());
    }

    private static String digestString(String str) {
        try {
            return digestBytes(str.getBytes("ISO-8859-1"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private static String getClientNonce() {
        String format = new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss").format(new Date());
        Integer valueOf = Integer.valueOf(new Random(100000L).nextInt());
        StringBuilder s = sv6.s(format);
        s.append(valueOf.toString());
        return digestString(s.toString()).substring(0, 8);
    }

    private String getDigestHeader(String str, String str2, byte[] bArr) {
        String str3;
        String digestString;
        String str4;
        String[] strArr = this.qops;
        String str5 = null;
        if (strArr != null) {
            for (String str6 : strArr) {
                if (bArr != null) {
                    str3 = "auth-int";
                    if (str6.trim().equals("auth-int")) {
                        break;
                    }
                }
                if (str6.trim().equals("auth")) {
                    str3 = "auth";
                    break;
                }
            }
        }
        str3 = null;
        if (str3 == null) {
            digestString = digestString(this.HA1 + ':' + this.nonce + ':' + digestString(str + ':' + str2));
            str4 = null;
        } else {
            boolean equals = str3.equals("auth");
            int i = this.ncCounter;
            if (equals) {
                this.ncCounter = i + 1;
                str5 = String.format("%08X", Integer.valueOf(i));
                str4 = getClientNonce();
                digestString = digestString(this.HA1 + ':' + this.nonce + ':' + str5 + ':' + str4 + ':' + str3 + ':' + digestString(str + ':' + str2));
            } else {
                this.ncCounter = i + 1;
                str5 = String.format("%08X", Integer.valueOf(i));
                String clientNonce = getClientNonce();
                digestString = digestString(this.HA1 + ':' + this.nonce + ':' + str5 + ':' + clientNonce + ':' + str3 + ':' + digestString(str + ':' + str2 + ':' + digestBytes(bArr)));
                str4 = clientNonce;
            }
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Digest username=\"");
        sb.append(this.username);
        sb.append("\",realm=\"");
        sb.append(this.realm);
        sb.append("\",nonce=\"");
        k84.q(sb, this.nonce, "\",uri=\"", str2, "\",algorithm=\"MD5\",");
        if (str3 != null) {
            k84.q(sb, "qop=\"", str3, "\",nc=", str5);
            ix2.C(sb, ",cnonce=\"", str4, "\",");
        }
        if (this.opaque != null) {
            ix2.C(sb, "response=\"", digestString, "\",opaque=\"");
            sb.append(this.opaque);
            sb.append("\"");
        } else {
            ix2.C(sb, "response=\"", digestString, "\"");
        }
        return sb.toString();
    }

    private synchronized void processDigestHeader(String str) {
        HashMap<String, String> splitAuthFields = splitAuthFields(str);
        this.realm = splitAuthFields.get("realm");
        this.nonce = splitAuthFields.get("nonce");
        this.opaque = splitAuthFields.get("opaque");
        this.HA1 = digestString(this.username + ':' + this.realm + ':' + this.password);
        String str2 = splitAuthFields.get("qop");
        if (str2 != null) {
            this.qops = str2.split(",");
        }
    }

    public static Map<Type, String> sortAuthenticateHeaders(Collection<String> collection) {
        HashMap hashMap = new HashMap();
        for (String str : collection) {
            int indexOf = str.indexOf(32);
            if (indexOf != -1) {
                String trim = str.substring(0, indexOf).trim();
                hashMap.put(Type.parse(trim), str.substring(indexOf + 1).trim());
            } else {
                throw m51.f(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Invalid authenticate header (no delimiter)");
            }
        }
        return hashMap;
    }

    private static HashMap<String, String> splitAuthFields(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(",")) {
            if (str2.contains("=")) {
                hashMap.put(str2.substring(0, str2.indexOf("=")).trim(), str2.substring(str2.indexOf("=") + 1).replaceAll("\"", "").trim());
            }
        }
        return hashMap;
    }

    public String getAuthorizationHeader(String str, String str2, byte[] bArr) {
        int i = AnonymousClass1.$SwitchMap$io$ably$lib$http$HttpAuth$Type[this.type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return getDigestHeader(str, str2, bArr);
        }
        return "Basic " + Base64Coder.encodeString(this.username + ':' + this.password);
    }

    public boolean hasChallenge() {
        if (this.type != null) {
            return true;
        }
        return false;
    }

    public void processAuthenticateHeaders(Map<Type, String> map) {
        Type type = this.prefType;
        this.type = type;
        String str = map.get(type);
        if (str == null) {
            Map.Entry<Type, String> next = map.entrySet().iterator().next();
            if (next != null) {
                this.type = next.getKey();
                str = next.getValue();
            } else {
                throw m51.f(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Invalid authenticate header (no entries)");
            }
        }
        if (this.type == Type.DIGEST) {
            processDigestHeader(str);
        }
    }
}
