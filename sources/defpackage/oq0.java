package defpackage;

import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class oq0 implements qq0 {
    public final /* synthetic */ int a;
    public final Map b;

    public oq0(Throwable th, Float f, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = d1c.e(new Pair("error_message", th.getMessage()), new Pair("duration", f));
                return;
            default:
                this.b = d1c.e(new Pair("error_message", th.getMessage()), new Pair("duration", f));
                return;
        }
    }

    @Override // defpackage.fp
    public final String c() {
        switch (this.a) {
            case 0:
                return "elements.attestation.confirmation.prepare.failed";
            case 1:
                return "elements.attestation.confirmation.prepare.succeeded";
            case 2:
                return "elements.attestation.confirmation.request_token.failed";
            default:
                return "elements.attestation.confirmation.request_token.succeeded";
        }
    }

    @Override // defpackage.qq0
    public final Map getParams() {
        int i = this.a;
        return this.b;
    }

    public oq0(Float f, int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = c1c.b(new Pair("duration", f));
                return;
            default:
                this.b = c1c.b(new Pair("duration", f));
                return;
        }
    }
}
