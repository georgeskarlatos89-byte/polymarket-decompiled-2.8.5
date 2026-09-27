package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class bo2 implements eb8 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ ca2 d;
    public final /* synthetic */ x0h e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ qqc g;
    public final /* synthetic */ qqc h;
    public final /* synthetic */ qqc i;

    public bo2(boolean z, boolean z2, Function0 function0, ca2 ca2Var, x0h x0hVar, Function0 function02, qqc qqcVar, qqc qqcVar2, qqc qqcVar3) {
        this.a = z;
        this.b = z2;
        this.c = function0;
        this.d = ca2Var;
        this.e = x0hVar;
        this.f = function02;
        this.g = qqcVar;
        this.h = qqcVar2;
        this.i = qqcVar3;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean z = this.b;
        boolean z2 = this.a;
        qqc qqcVar = this.h;
        if (booleanValue && !z2 && z) {
            Boolean bool = Boolean.TRUE;
            this.g.setValue(bool);
            if (!((Boolean) qqcVar.getValue()).booleanValue()) {
                qqcVar.setValue(bool);
                Function0 function0 = this.c;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        } else if (booleanValue && !z2 && !z) {
            qqc qqcVar2 = this.i;
            if (!((Boolean) qqcVar2.getValue()).booleanValue()) {
                qqcVar2.setValue(Boolean.TRUE);
                this.d.a(DesignTokens.Haptic.error);
                this.e.a(true);
                Function0 function02 = this.f;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        } else if (!booleanValue) {
            qqcVar.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
