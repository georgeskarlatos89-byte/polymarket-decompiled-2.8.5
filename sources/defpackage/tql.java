package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class tql extends pul {
    public final /* synthetic */ int e;
    public final /* synthetic */ skl f;
    public final /* synthetic */ iwl g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tql(iwl iwlVar, skl sklVar, int i) {
        super(iwlVar, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = sklVar;
                Objects.requireNonNull(iwlVar);
                this.g = iwlVar;
                super(iwlVar, true);
                return;
            case 2:
                this.f = sklVar;
                Objects.requireNonNull(iwlVar);
                this.g = iwlVar;
                super(iwlVar, true);
                return;
            default:
                this.f = sklVar;
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
                ellVar.getGmpAppId(this.f);
                return;
            case 1:
                ell ellVar2 = this.g.e;
                arn.h(ellVar2);
                ellVar2.getCachedAppInstanceId(this.f);
                return;
            case 2:
                ell ellVar3 = this.g.e;
                arn.h(ellVar3);
                ellVar3.generateEventId(this.f);
                return;
            case 3:
                ell ellVar4 = this.g.e;
                arn.h(ellVar4);
                ellVar4.getCurrentScreenName(this.f);
                return;
            default:
                ell ellVar5 = this.g.e;
                arn.h(ellVar5);
                ellVar5.getCurrentScreenClass(this.f);
                return;
        }
    }

    @Override // defpackage.pul
    public final void b() {
        int i = this.e;
        skl sklVar = this.f;
        switch (i) {
            case 0:
                sklVar.E(null);
                return;
            case 1:
                sklVar.E(null);
                return;
            case 2:
                sklVar.E(null);
                return;
            case 3:
                sklVar.E(null);
                return;
            default:
                sklVar.E(null);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tql(iwl iwlVar, skl sklVar, int i, boolean z) {
        super(iwlVar, true);
        this.e = i;
        this.f = sklVar;
        this.g = iwlVar;
    }
}
