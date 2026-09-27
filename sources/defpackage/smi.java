package defpackage;

import com.stripe.stripeterminal.external.models.TerminalErrorCode;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class smi {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TerminalErrorCode.values().length];
        try {
            iArr[TerminalErrorCode.DECLINED_BY_READER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TerminalErrorCode.DECLINED_BY_STRIPE_API.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TerminalErrorCode.TAP_TO_PAY_DEVICE_TAMPERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TerminalErrorCode.TAP_TO_PAY_UNSUPPORTED_DEVICE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TerminalErrorCode.CARD_READ_TIMED_OUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TerminalErrorCode.TAP_TO_PAY_INSECURE_ENVIRONMENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
