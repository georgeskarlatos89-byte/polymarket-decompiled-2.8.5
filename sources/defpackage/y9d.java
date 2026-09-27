package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class y9d extends gk6 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9d(s7h s7hVar, int i) {
        super(s7hVar);
        this.c = i;
    }

    @Override // defpackage.fk6, defpackage.ita
    public final boolean a0() {
        switch (this.c) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.fk6
    public final fk6 x0(s7h s7hVar) {
        switch (this.c) {
            case 0:
                return new y9d(s7hVar, 0);
            default:
                return new y9d(s7hVar, 1);
        }
    }
}
