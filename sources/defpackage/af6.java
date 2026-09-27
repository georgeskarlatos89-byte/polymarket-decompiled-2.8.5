package defpackage;

import com.stripe.stripeterminal.external.models.TerminalException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class af6 implements cmi {
    public final String a;

    public af6(TerminalException terminalException) {
        this.a = terminalException.getErrorCode().toLogString();
    }

    @Override // defpackage.cmi
    public final String getValue() {
        return this.a;
    }
}
