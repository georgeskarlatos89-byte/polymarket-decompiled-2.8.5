package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import skip.lib.Duration;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xyh {
    public boolean a;
    public long b;

    public final void a() {
        brn.r("This stopwatch is already running.", !this.a);
        this.a = true;
        this.b = System.nanoTime();
    }

    public final String toString() {
        long j;
        TimeUnit timeUnit;
        String str;
        if (this.a) {
            j = System.nanoTime() - this.b;
        } else {
            j = 0;
        }
        long j2 = j / 86400000000000L;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (j2 > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (j / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (j / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (j / Duration.ATTOSECONDS_PER_NANOSECOND > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (j / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (j / 1000 > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = timeUnit2;
        }
        StringBuilder sb = new StringBuilder(String.format(Locale.ROOT, "%.4g", Double.valueOf(j / timeUnit2.convert(1L, timeUnit))));
        sb.append(ApiConstant.SPACE);
        switch (wyh.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = d.d;
                break;
            default:
                f27.p();
                return null;
        }
        sb.append(str);
        return sb.toString();
    }
}
