package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bpl extends pul {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ iwl g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpl(iwl iwlVar, String str, int i) {
        super(iwlVar, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = str;
                Objects.requireNonNull(iwlVar);
                this.g = iwlVar;
                super(iwlVar, true);
                return;
            case 2:
                this.f = str;
                Objects.requireNonNull(iwlVar);
                this.g = iwlVar;
                super(iwlVar, true);
                return;
            default:
                this.f = str;
                Objects.requireNonNull(iwlVar);
                this.g = iwlVar;
                return;
        }
    }

    @Override // defpackage.pul
    public final void a() {
        switch (this.e) {
            case 0:
                ell ellVar = this.g.e;
                arn.h(ellVar);
                ellVar.setUserId(this.f, this.a);
                return;
            case 1:
                ell ellVar2 = this.g.e;
                arn.h(ellVar2);
                ellVar2.beginAdUnitExposure(this.f, this.b);
                return;
            default:
                ell ellVar3 = this.g.e;
                arn.h(ellVar3);
                ellVar3.endAdUnitExposure(this.f, this.b);
                return;
        }
    }
}
