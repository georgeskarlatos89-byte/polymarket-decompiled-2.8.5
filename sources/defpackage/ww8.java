package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ww8 extends z81 implements cd0 {
    private static volatile Executor zaa;
    private final r64 zab;
    private final Set zac;
    private final Account zad;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ww8(Context context, Looper looper, int i, r64 r64Var, gw4 gw4Var, eid eidVar) {
        super(context, looper, r3, r4, i, new zcf(gw4Var, 22), new x3g(eidVar, 20), r64Var.d);
        bjn a = xw8.a(context);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.e;
        arn.h(gw4Var);
        arn.h(eidVar);
        this.zab = r64Var;
        this.zad = null;
        Set<Scope> set = r64Var.b;
        Set<Scope> validateScopes = validateScopes(set);
        Iterator<Scope> it = validateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                dmk.n("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.zac = validateScopes;
    }

    public static void zag(Executor executor) {
        zaa = executor;
    }

    @Override // defpackage.z81
    public final Account getAccount() {
        return this.zad;
    }

    @Override // defpackage.z81
    public Executor getBindServiceExecutor() {
        return zaa;
    }

    public final r64 getClientSettings() {
        return this.zab;
    }

    public gw7[] getRequiredFeatures() {
        return new gw7[0];
    }

    @Override // defpackage.z81
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // defpackage.cd0
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        if (requiresSignIn()) {
            return this.zac;
        }
        return Collections.EMPTY_SET;
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
