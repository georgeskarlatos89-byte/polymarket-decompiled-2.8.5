package com.socure.docv.capturesdk.feature.scanner.data;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/data/ErrorScenario;", "", ApiConstant.KEY_MSG, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "MANUAL_FAILED", "CONTINUOUS_ERRORS_MAXED", "REMOVE_BLOCKER_MANUAL_CAPTURE_FAILED", "REMOVE_BLOCKER_AUTO_CAPTURE_FAILED", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorScenario {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ErrorScenario[] $VALUES;
    private final String msg;
    public static final ErrorScenario MANUAL_FAILED = new ErrorScenario("MANUAL_FAILED", 0, "manual_capture_failed");
    public static final ErrorScenario CONTINUOUS_ERRORS_MAXED = new ErrorScenario("CONTINUOUS_ERRORS_MAXED", 1, "continuous_errors_maxed");
    public static final ErrorScenario REMOVE_BLOCKER_MANUAL_CAPTURE_FAILED = new ErrorScenario("REMOVE_BLOCKER_MANUAL_CAPTURE_FAILED", 2, "remove_blocker_manual_capture_failed");
    public static final ErrorScenario REMOVE_BLOCKER_AUTO_CAPTURE_FAILED = new ErrorScenario("REMOVE_BLOCKER_AUTO_CAPTURE_FAILED", 3, "remove_blocker_auto_capture_failed");

    private static final /* synthetic */ ErrorScenario[] $values() {
        return new ErrorScenario[]{MANUAL_FAILED, CONTINUOUS_ERRORS_MAXED, REMOVE_BLOCKER_MANUAL_CAPTURE_FAILED, REMOVE_BLOCKER_AUTO_CAPTURE_FAILED};
    }

    static {
        ErrorScenario[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
    }

    private ErrorScenario(String str, int i, String str2) {
        this.msg = str2;
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static ErrorScenario valueOf(String str) {
        return (ErrorScenario) Enum.valueOf(ErrorScenario.class, str);
    }

    public static ErrorScenario[] values() {
        return (ErrorScenario[]) $VALUES.clone();
    }

    public final String getMsg() {
        return this.msg;
    }
}
