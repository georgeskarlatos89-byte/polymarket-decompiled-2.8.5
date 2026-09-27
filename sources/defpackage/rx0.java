package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rx0 {
    public String a;
    public pje b;
    public String c;
    public String d;
    public long e;
    public long f;
    public String g;
    public byte h;

    public final sx0 a() {
        if (this.h == 3 && this.b != null) {
            return new sx0(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" registrationStatus");
        }
        if ((this.h & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.h & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        fi9.q(sb, "Missing required properties:");
        return null;
    }

    public final void b(pje pjeVar) {
        if (pjeVar != null) {
            this.b = pjeVar;
        } else {
            dmk.s("Null registrationStatus");
        }
    }
}
