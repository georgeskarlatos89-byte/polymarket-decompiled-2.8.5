package defpackage;

import com.stripe.stripeterminal.external.models.TerminalErrorCode;
import java.util.Set;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class yf6 {
    public static final Set a = ArraysKt.l0(new TerminalErrorCode[]{TerminalErrorCode.TAP_TO_PAY_NFC_DISABLED, TerminalErrorCode.TAP_TO_PAY_DEVICE_TAMPERED, TerminalErrorCode.TAP_TO_PAY_UNSUPPORTED_DEVICE, TerminalErrorCode.TAP_TO_PAY_UNSUPPORTED_ANDROID_VERSION, TerminalErrorCode.TAP_TO_PAY_UNSUPPORTED_PROCESSOR, TerminalErrorCode.TAP_TO_PAY_LIBRARY_NOT_INCLUDED, TerminalErrorCode.TAP_TO_PAY_DEBUG_NOT_SUPPORTED, TerminalErrorCode.TAP_TO_PAY_INSECURE_ENVIRONMENT});

    public final boolean a(Throwable th) {
        return false;
    }
}
