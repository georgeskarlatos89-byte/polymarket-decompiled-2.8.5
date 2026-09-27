package io.ably.lib.types;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.ace;
import defpackage.m51;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import java.io.IOException;
import java.net.NoRouteToHostException;
import java.net.UnknownHostException;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageUnpacker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class ErrorInfo {
    private static final String HREF_BASE = "https://help.ably.io/error/";
    private static final String TAG = "io.ably.lib.types.ErrorInfo";
    public int code;
    public String href;
    public String message;
    public int statusCode;

    public ErrorInfo(String str, int i, int i2) {
        this(str, i2);
        this.statusCode = i;
        if (i2 > 0) {
            this.href = href(i2);
        }
    }

    public static ErrorInfo fromMsgpack(MessageUnpacker messageUnpacker) {
        return new ErrorInfo().readMsgpack(messageUnpacker);
    }

    private static ErrorInfo fromMsgpackBody(MessageUnpacker messageUnpacker) {
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        ErrorInfo errorInfo = null;
        for (int i = 0; i < unpackMapHeader; i++) {
            String intern = messageUnpacker.unpackString().intern();
            if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else {
                intern.getClass();
                if (!intern.equals("error")) {
                    Log.v(TAG, "Unexpected field: ".concat(intern));
                    messageUnpacker.skipValue();
                } else {
                    errorInfo = fromMsgpack(messageUnpacker);
                }
            }
        }
        return errorInfo;
    }

    public static ErrorInfo fromResponseStatus(String str, int i) {
        return new ErrorInfo(str, i, i * 100);
    }

    public static ErrorInfo fromThrowable(Throwable th) {
        if (!(th instanceof UnknownHostException) && !(th instanceof NoRouteToHostException)) {
            if (th instanceof IOException) {
                return new ErrorInfo(th.getLocalizedMessage(), RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE, 50000);
            }
            return new ErrorInfo("Unexpected exception: " + th.getLocalizedMessage(), 50000, RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE);
        }
        return new ErrorInfo(th.getLocalizedMessage(), RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE, 50002);
    }

    private static String href(int i) {
        return ace.f(i, HREF_BASE);
    }

    private String logMessage() {
        String str = this.message;
        if (str == null) {
            str = "";
        }
        String str2 = this.href;
        if (str2 == null) {
            int i = this.code;
            if (i > 0) {
                str2 = href(i);
            } else {
                str2 = null;
            }
        }
        if (str2 != null && !str.contains(str2)) {
            return m51.k(str, " (See ", str2, ")");
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) obj;
        if (this.code == errorInfo.code && this.statusCode == errorInfo.statusCode) {
            String str = this.message;
            String str2 = errorInfo.message;
            if (str != str2) {
                if (str != null && str.equals(str2)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        switch(r5) {
            case 0: goto L31;
            case 1: goto L30;
            case 2: goto L29;
            case 3: goto L28;
            default: goto L27;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        io.ably.lib.util.Log.v(io.ably.lib.types.ErrorInfo.TAG, "Unexpected field: ".concat(r3));
        r7.skipValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r6.message = r7.unpackString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        r6.statusCode = r7.unpackInt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r6.href = r7.unpackString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        r6.code = r7.unpackInt();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ErrorInfo readMsgpack(MessageUnpacker messageUnpacker) {
        int unpackMapHeader = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < unpackMapHeader; i++) {
            String intern = messageUnpacker.unpackString().intern();
            if (messageUnpacker.getNextFormat().equals(MessageFormat.NIL)) {
                messageUnpacker.unpackNil();
            } else {
                intern.getClass();
                char c = 65535;
                switch (intern.hashCode()) {
                    case 3059181:
                        if (intern.equals(ApiConstant.KEY_CODE)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3211051:
                        if (intern.equals("href")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 247507199:
                        if (intern.equals("statusCode")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 954925063:
                        if (intern.equals("message")) {
                            c = 3;
                            break;
                        }
                        break;
                }
            }
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{ErrorInfo message=");
        sb.append(logMessage());
        if (this.code > 0) {
            sb.append(" code=");
            sb.append(this.code);
        }
        if (this.statusCode > 0) {
            sb.append(" statusCode=");
            sb.append(this.statusCode);
        }
        if (this.href != null) {
            sb.append(" href=");
            sb.append(this.href);
        }
        sb.append('}');
        return sb.toString();
    }

    public ErrorInfo(String str, int i) {
        this.code = i;
        this.message = str;
    }

    public ErrorInfo() {
    }

    public static ErrorInfo fromMsgpackBody(byte[] bArr) {
        return fromMsgpackBody(Serialisation.msgpackUnpackerConfig.newUnpacker(bArr));
    }
}
