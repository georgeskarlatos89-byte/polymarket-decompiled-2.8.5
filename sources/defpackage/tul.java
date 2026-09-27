package defpackage;

import com.socure.idplus.device.internal.mediaDevice.manager.d;
import java.text.SimpleDateFormat;
import java.util.Locale;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class tul {
    public static final SimpleDateFormat a;
    public static final StringBuilder b;

    static {
        Locale locale = Locale.ROOT;
        a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        b = new StringBuilder(33);
    }

    public static void a(long j, StringBuilder sb) {
        if (j == 0) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z = false;
        if (j < 0) {
            sb.append("-");
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = Long.MAX_VALUE;
                z = true;
            }
        }
        if (j >= 86400000) {
            sb.append(j / 86400000);
            sb.append(d.d);
            j %= 86400000;
        }
        if (true == z) {
            j = 25975808;
        }
        if (j >= 3600000) {
            sb.append(j / 3600000);
            sb.append("h");
            j %= 3600000;
        }
        if (j >= RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) {
            sb.append(j / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
            sb.append("m");
            j %= RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
        }
        if (j >= 1000) {
            sb.append(j / 1000);
            sb.append("s");
            j %= 1000;
        }
        if (j > 0) {
            sb.append(j);
            sb.append("ms");
        }
    }
}
