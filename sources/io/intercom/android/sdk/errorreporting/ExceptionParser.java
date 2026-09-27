package io.intercom.android.sdk.errorreporting;

import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class ExceptionParser {
    private static final String[] ALLOWED_PACKAGES = {"io.intercom.android.sdk", "java.", "kotlin.", "kotlinx.", "android.", "androidx.", "com.android.", "com.google."};
    private static final String ERROR_REPORTING_PACKAGE = "io.intercom.android.sdk.errorreporting.";
    private static final String INTERCOM_SDK_PACKAGE = "io.intercom.android.sdk";
    private static final String REDACTION_LINE = "[Non Intercom/OS method]";

    private List<ExceptionReport> createExceptionReports(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            arrayList.add(new ExceptionReport(th.getClass().getName(), th.getLocalizedMessage(), getStacktraceString(stackTrace), getStructuredFrames(stackTrace)));
            th = th.getCause();
        }
        return arrayList;
    }

    private String getStacktraceString(StackTraceElement[] stackTraceElementArr) {
        String str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stackTraceElementArr.length; i++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            if (isFromAllowedPackage(stackTraceElement)) {
                str = stackTraceElement.toString();
            } else {
                str = REDACTION_LINE;
            }
            sb.append(str);
            if (i < stackTraceElementArr.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private List<StackFrame> getStructuredFrames(StackTraceElement[] stackTraceElementArr) {
        Integer num;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (isFromAllowedPackage(stackTraceElement)) {
                String className = stackTraceElement.getClassName();
                int lineNumber = stackTraceElement.getLineNumber();
                String methodName = stackTraceElement.getMethodName();
                String fileName = stackTraceElement.getFileName();
                if (lineNumber >= 0) {
                    num = Integer.valueOf(lineNumber);
                } else {
                    num = null;
                }
                arrayList.add(new StackFrame(className, methodName, fileName, num, className.startsWith("io.intercom.android.sdk")));
            } else {
                arrayList.add(new StackFrame(REDACTION_LINE, null, null, null, false));
            }
        }
        return arrayList;
    }

    private boolean isFromAllowedPackage(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        for (String str : ALLOWED_PACKAGES) {
            if (className.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsIntercomMethod(Throwable th) {
        while (true) {
            if (th == null) {
                return false;
            }
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                String className = stackTraceElement.getClassName();
                if (className.startsWith("io.intercom.android.sdk") && !className.startsWith(ERROR_REPORTING_PACKAGE)) {
                    return true;
                }
            }
            th = th.getCause();
        }
    }

    public ErrorReport createReportFrom(Throwable th, String str, boolean z) {
        return new ErrorReport(createExceptionReports(th), TimeProvider.SYSTEM.currentTimeMillis(), str, z);
    }
}
