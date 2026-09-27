package io.intercom.android.sdk.errorreporting;

import com.google.gson.annotations.SerializedName;
import defpackage.hdi;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JH\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\u0007H×\u0001J\t\u0010\u001f\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/errorreporting/StackFrame;", "", "module", "", "function", "filename", "lineno", "", "inApp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getModule", "()Ljava/lang/String;", "getFunction", "getFilename", "getLineno", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInApp", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Lio/intercom/android/sdk/errorreporting/StackFrame;", "equals", "other", "hashCode", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StackFrame {
    public static final int $stable = 0;
    private final String filename;
    private final String function;

    @SerializedName(MetricTracker.Place.IN_APP)
    private final boolean inApp;
    private final Integer lineno;
    private final String module;

    public StackFrame(String str, String str2, String str3, Integer num, boolean z) {
        this.module = str;
        this.function = str2;
        this.filename = str3;
        this.lineno = num;
        this.inApp = z;
    }

    public static /* synthetic */ StackFrame copy$default(StackFrame stackFrame, String str, String str2, String str3, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stackFrame.module;
        }
        if ((i & 2) != 0) {
            str2 = stackFrame.function;
        }
        if ((i & 4) != 0) {
            str3 = stackFrame.filename;
        }
        if ((i & 8) != 0) {
            num = stackFrame.lineno;
        }
        if ((i & 16) != 0) {
            z = stackFrame.inApp;
        }
        boolean z2 = z;
        String str4 = str3;
        return stackFrame.copy(str, str2, str4, num, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getModule() {
        return this.module;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFunction() {
        return this.function;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getLineno() {
        return this.lineno;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getInApp() {
        return this.inApp;
    }

    public final StackFrame copy(String module, String function, String filename, Integer lineno, boolean inApp) {
        return new StackFrame(module, function, filename, lineno, inApp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StackFrame)) {
            return false;
        }
        StackFrame stackFrame = (StackFrame) other;
        if (Intrinsics.areEqual(this.module, stackFrame.module) && Intrinsics.areEqual(this.function, stackFrame.function) && Intrinsics.areEqual(this.filename, stackFrame.filename) && Intrinsics.areEqual(this.lineno, stackFrame.lineno) && this.inApp == stackFrame.inApp) {
            return true;
        }
        return false;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getFunction() {
        return this.function;
    }

    public final boolean getInApp() {
        return this.inApp;
    }

    public final Integer getLineno() {
        return this.lineno;
    }

    public final String getModule() {
        return this.module;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.module;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.function;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.filename;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num = this.lineno;
        if (num != null) {
            i = num.hashCode();
        }
        return Boolean.hashCode(this.inApp) + ((i4 + i) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StackFrame(module=");
        sb.append(this.module);
        sb.append(", function=");
        sb.append(this.function);
        sb.append(", filename=");
        sb.append(this.filename);
        sb.append(", lineno=");
        sb.append(this.lineno);
        sb.append(", inApp=");
        return hdi.t(sb, this.inApp, ')');
    }
}
