package skip.foundation;

import android.util.Log;
import defpackage.ace;
import defpackage.ug7;
import defpackage.ww4;
import io.sentry.android.core.m0;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import skip.lib.ErrorKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0003\u001a\u001b\u001cB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u0014\u0010\u0007\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001d"}, d2 = {"Lskip/foundation/SkipLogger;", "", "subsystem", "", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "logName", "getLogName$SkipFoundation", "()Ljava/lang/String;", "isEnabled", "", "type", "Lskip/foundation/SkipLogger$LogType;", "log", "", "level", "message", "trace", "debug", "info", "notice", "warning", "error", "critical", "fault", "LogType", "Companion", "CompanionClass", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public class SkipLogger {
    private final String logName;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lskip/foundation/SkipLogger$CompanionClass;", "", "<init>", "()V", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class CompanionClass {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lskip/foundation/SkipLogger$LogType;", "", "<init>", "(Ljava/lang/String;I)V", "default", "info", "debug", "error", "fault", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class LogType {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ LogType[] $VALUES;

        /* renamed from: default, reason: not valid java name */
        public static final LogType f424default = new LogType("default", 0);
        public static final LogType info = new LogType("info", 1);
        public static final LogType debug = new LogType("debug", 2);
        public static final LogType error = new LogType("error", 3);
        public static final LogType fault = new LogType("fault", 4);

        private static final /* synthetic */ LogType[] $values() {
            return new LogType[]{f424default, info, debug, error, fault};
        }

        static {
            LogType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private LogType(String str, int i) {
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static LogType valueOf(String str) {
            return (LogType) Enum.valueOf(LogType.class, str);
        }

        public static LogType[] values() {
            return (LogType[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogType.values().length];
            try {
                iArr[LogType.f424default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogType.info.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogType.debug.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogType.error.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogType.fault.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SkipLogger(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.logName = ace.m(str, ".", str2);
    }

    public void critical(String message) {
        message.getClass();
        try {
            m0.s(this.logName, message);
        } catch (Throwable th) {
            ErrorKt.aserror(th);
            Logger.getLogger(this.logName).log(Level.SEVERE, message);
        }
    }

    public void debug(String message) {
        message.getClass();
    }

    public void error(String message) {
        message.getClass();
        try {
            m0.d(this.logName, message);
        } catch (Throwable th) {
            ErrorKt.aserror(th);
            Logger.getLogger(this.logName).log(Level.SEVERE, message);
        }
    }

    public void fault(String message) {
        message.getClass();
        try {
            m0.s(this.logName, message);
        } catch (Throwable th) {
            ErrorKt.aserror(th);
            Logger.getLogger(this.logName).log(Level.SEVERE, message);
        }
    }

    /* renamed from: getLogName$SkipFoundation, reason: from getter */
    public final String getLogName() {
        return this.logName;
    }

    public void info(String message) {
        message.getClass();
        try {
            Log.i(this.logName, message);
        } catch (Throwable th) {
            ErrorKt.aserror(th);
            Logger.getLogger(this.logName).log(Level.INFO, message);
        }
    }

    public boolean isEnabled(LogType type) {
        type.getClass();
        return true;
    }

    public void log(LogType level, String message) {
        level.getClass();
        message.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            log(message);
                            return;
                        } else {
                            fault(message);
                            return;
                        }
                    }
                    error(message);
                    return;
                }
                debug(message);
                return;
            }
            info(message);
            return;
        }
        log(message);
    }

    public void notice(String message) {
        message.getClass();
        try {
            Log.i(this.logName, message);
        } catch (Throwable th) {
            ErrorKt.aserror(th);
            Logger.getLogger(this.logName).log(Level.CONFIG, message);
        }
    }

    public void trace(String message) {
        message.getClass();
    }

    public void warning(String message) {
        message.getClass();
        try {
            m0.p(this.logName, message);
        } catch (Throwable th) {
            ErrorKt.aserror(th);
            Logger.getLogger(this.logName).log(Level.WARNING, message);
        }
    }

    public void log(String message) {
        message.getClass();
        try {
            Log.i(this.logName, message);
        } catch (Throwable th) {
            ErrorKt.aserror(th);
            Logger.getLogger(this.logName).log(Level.INFO, message);
        }
    }
}
