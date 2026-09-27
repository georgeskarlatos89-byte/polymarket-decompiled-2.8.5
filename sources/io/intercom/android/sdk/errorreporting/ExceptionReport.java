package io.intercom.android.sdk.errorreporting;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ExceptionReport {

    @SerializedName("class_name")
    private final String className;
    private final List<StackFrame> frames;
    private final String message;
    private final String stacktrace;

    public ExceptionReport(String str, String str2, String str3, List<StackFrame> list) {
        this.className = str;
        this.message = str2;
        this.stacktrace = str3;
        this.frames = list;
    }

    public String getClassName() {
        return this.className;
    }

    public List<StackFrame> getFrames() {
        return this.frames;
    }

    public String getMessage() {
        return this.message;
    }

    public String getStacktrace() {
        return this.stacktrace;
    }
}
