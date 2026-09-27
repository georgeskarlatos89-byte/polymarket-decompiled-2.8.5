package bo.app;

import defpackage.zv5;
import java.util.UUID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wb extends yf {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wb() {
        super(new ag(r0), zv5.e() / 1000.0d, null, false);
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
    }

    @Override // bo.app.yf
    public final Double d() {
        return this.c;
    }

    @Override // bo.app.yf
    public final String toString() {
        return "\nMutableSession(sessionId=" + this.a + ", startTime=" + this.b + ", endTime=" + this.c + ", isSealed=" + this.d + ", duration=" + c() + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(ag agVar, double d, Double d2, boolean z) {
        super(agVar, d, d2, z);
        agVar.getClass();
    }
}
