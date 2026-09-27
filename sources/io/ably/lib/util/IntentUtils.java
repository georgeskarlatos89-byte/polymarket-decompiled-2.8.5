package io.ably.lib.util;

import android.content.Intent;
import io.ably.lib.types.ErrorInfo;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class IntentUtils {
    public static void addErrorInfo(Intent intent, ErrorInfo errorInfo) {
        boolean z;
        if (errorInfo != null) {
            z = true;
        } else {
            z = false;
        }
        intent.putExtra("hasError", z);
        if (errorInfo != null) {
            intent.putExtra("error.message", errorInfo.message);
            intent.putExtra("error.statusCode", errorInfo.statusCode);
            intent.putExtra("error.code", errorInfo.code);
        }
    }

    public static ErrorInfo getErrorInfo(Intent intent) {
        if (!intent.getBooleanExtra("hasError", false)) {
            return null;
        }
        return new ErrorInfo(intent.getStringExtra("error.message"), intent.getIntExtra("error.statusCode", 0), intent.getIntExtra("error.code", 0));
    }
}
