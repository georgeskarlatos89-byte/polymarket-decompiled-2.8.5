package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLogHandler;", "Ljava/util/logging/Handler;", "<init>", "()V", "publish", "", "record", "Ljava/util/logging/LogRecord;", "flush", "close", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidLogHandler extends Handler {
    public static final AndroidLogHandler INSTANCE = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        record.getClass();
        AndroidLog androidLog = AndroidLog.INSTANCE;
        String loggerName = record.getLoggerName();
        loggerName.getClass();
        int access$getAndroidLevel = AndroidLogKt.access$getAndroidLevel(record);
        String message = record.getMessage();
        message.getClass();
        androidLog.androidLog$okhttp(loggerName, access$getAndroidLevel, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
