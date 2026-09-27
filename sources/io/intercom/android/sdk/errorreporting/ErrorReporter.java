package io.intercom.android.sdk.errorreporting;

import android.content.Context;
import com.google.gson.Gson;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ErrorReporter {
    static final int MAX_HANDLED_REPORTS_PER_SESSION = 1;
    private final Provider<Api> apiProvider;
    private final IntercomDataLayer dataLayer;
    private final ExceptionParser exceptionParser;
    private final ErrorReportStore reportStore;
    private final Set<String> reportedHandledKeys = Collections.synchronizedSet(new LinkedHashSet());

    public ErrorReporter(ErrorReportStore errorReportStore, Provider<Api> provider, ExceptionParser exceptionParser, IntercomDataLayer intercomDataLayer) {
        this.reportStore = errorReportStore;
        this.apiProvider = provider;
        this.exceptionParser = exceptionParser;
        this.dataLayer = intercomDataLayer;
    }

    public static ErrorReporter create(Context context, Gson gson, Provider<Api> provider, IntercomDataLayer intercomDataLayer) {
        return new ErrorReporter(ErrorReportStore.create(context.getApplicationContext(), gson), provider, new ExceptionParser(), intercomDataLayer);
    }

    public void disableExceptionHandler() {
        IntercomExceptionHandler.disable();
        this.reportStore.deleteFromDisk();
    }

    public void enableExceptionHandler() {
        IntercomExceptionHandler.enable(this);
    }

    public void reportHandledException(Throwable th) {
        String str = th.getClass().getName() + ":" + th.getMessage();
        if (this.reportedHandledKeys.contains(str) || this.reportedHandledKeys.size() >= 1) {
            return;
        }
        this.reportedHandledKeys.add(str);
        this.reportStore.sendImmediately(this.exceptionParser.createReportFrom(th, this.dataLayer.getSessionId(), true), this.apiProvider);
    }

    public void saveReport(Throwable th) {
        if (this.exceptionParser.containsIntercomMethod(th)) {
            this.reportStore.saveToDisk(this.exceptionParser.createReportFrom(th, this.dataLayer.getSessionId(), false));
        }
    }

    public void sendSavedReport() {
        this.reportStore.sendSavedReport(this.apiProvider);
    }
}
