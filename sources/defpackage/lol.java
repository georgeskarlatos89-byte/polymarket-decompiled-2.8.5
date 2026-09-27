package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class lol extends pul {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ iwl i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lol(iwl iwlVar, String str, String str2, Object obj, boolean z) {
        super(iwlVar, true);
        this.f = str;
        this.g = str2;
        this.j = obj;
        this.h = z;
        Objects.requireNonNull(iwlVar);
        this.i = iwlVar;
    }

    @Override // defpackage.pul
    public final void a() {
        switch (this.e) {
            case 0:
                ell ellVar = this.i.e;
                arn.h(ellVar);
                ellVar.setUserProperty(this.f, this.g, new rfd(this.j), this.h, this.a);
                return;
            case 1:
                ell ellVar2 = this.i.e;
                arn.h(ellVar2);
                ellVar2.getUserProperties(this.f, this.g, this.h, (skl) this.j);
                return;
            default:
                long j = this.a;
                long j2 = this.b;
                ell ellVar3 = this.i.e;
                arn.h(ellVar3);
                ellVar3.logEventWithElapsedTime(this.f, this.g, (Bundle) this.j, this.h, true, j, j2);
                return;
        }
    }

    @Override // defpackage.pul
    public void b() {
        switch (this.e) {
            case 1:
                ((skl) this.j).E(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lol(iwl iwlVar, String str, String str2, Bundle bundle, boolean z) {
        super(iwlVar, true);
        this.f = str;
        this.g = str2;
        this.j = bundle;
        this.h = z;
        this.i = iwlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lol(iwl iwlVar, String str, String str2, boolean z, skl sklVar) {
        super(iwlVar, true);
        this.f = str;
        this.g = str2;
        this.h = z;
        this.j = sklVar;
        this.i = iwlVar;
    }
}
