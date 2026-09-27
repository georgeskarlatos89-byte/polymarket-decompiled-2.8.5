package io.intercom.android.sdk.errorreporting;

import com.google.gson.annotations.SerializedName;
import com.socure.docv.capturesdk.api.Keys;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ErrorReport {

    @SerializedName("exception_reports")
    private final List<ExceptionReport> exceptionReports;
    private final boolean handled;

    @SerializedName(Keys.KEY_SESSION_ID)
    private final String sessionId;
    private final long timestamp;

    public ErrorReport(List<ExceptionReport> list, long j, String str, boolean z) {
        this.exceptionReports = list;
        this.timestamp = j;
        this.sessionId = str;
        this.handled = z;
    }

    public List<ExceptionReport> getExceptionReports() {
        return this.exceptionReports;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
