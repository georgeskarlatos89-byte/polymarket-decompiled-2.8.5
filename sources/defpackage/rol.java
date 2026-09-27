package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rol extends pul {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ iwl h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rol(iwl iwlVar, bol bolVar, String str, String str2) {
        super(iwlVar, true);
        this.e = 2;
        this.i = bolVar;
        this.f = str;
        this.g = str2;
        Objects.requireNonNull(iwlVar);
        this.h = iwlVar;
    }

    @Override // defpackage.pul
    public final void a() {
        switch (this.e) {
            case 0:
                ell ellVar = this.h.e;
                arn.h(ellVar);
                ellVar.clearConditionalUserProperty(this.f, this.g, (Bundle) this.i);
                return;
            case 1:
                ell ellVar2 = this.h.e;
                arn.h(ellVar2);
                ellVar2.getConditionalUserProperties(this.f, this.g, (skl) this.i);
                return;
            default:
                ell ellVar3 = this.h.e;
                arn.h(ellVar3);
                ellVar3.setCurrentScreenByScionActivityInfo((bol) this.i, this.f, this.g, this.a);
                return;
        }
    }

    @Override // defpackage.pul
    public void b() {
        switch (this.e) {
            case 1:
                ((skl) this.i).E(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rol(iwl iwlVar, String str, String str2, Object obj, int i) {
        super(iwlVar, true);
        this.e = i;
        this.f = str;
        this.g = str2;
        this.i = obj;
        this.h = iwlVar;
    }
}
