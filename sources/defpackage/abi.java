package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class abi implements g3h {
    public final k3h a;
    public final h1 b;

    public abi(k3h k3hVar, h1 h1Var) {
        this.a = k3hVar;
        this.b = h1Var;
    }

    @Override // defpackage.g3h
    public final List c() {
        return this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(eb8 eb8Var, Continuation continuation) {
        zai zaiVar;
        int i;
        if (continuation instanceof zai) {
            zaiVar = (zai) continuation;
            int i2 = zaiVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zaiVar.m = i2 - Integer.MIN_VALUE;
                Object obj = zaiVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = zaiVar.m;
                if (i == 0) {
                    if (i != 1) {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    yai yaiVar = new yai(eb8Var, this.b);
                    zaiVar.m = 1;
                    if (k3h.m(this.a, yaiVar, zaiVar) == u85Var) {
                        return u85Var;
                    }
                }
                f05.c();
                return null;
            }
        }
        zaiVar = new zai(this, continuation);
        Object obj2 = zaiVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = zaiVar.m;
        if (i == 0) {
        }
        f05.c();
        return null;
    }
}
