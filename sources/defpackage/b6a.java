package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http.HttpStatusCodesKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class b6a extends yc0 {
    public final /* synthetic */ int a;

    public /* synthetic */ b6a(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public cd0 buildClient(Context context, Looper looper, r64 r64Var, Object obj, bx8 bx8Var, cx8 cx8Var) {
        switch (this.a) {
            case 1:
                e6h e6hVar = r64Var.e;
                Integer num = r64Var.f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new c6h(context, looper, r64Var, bundle, bx8Var, cx8Var);
            case 2:
                throw woa.i(obj);
            case 6:
                return new g4l(context, looper, r64Var, (f4l) obj, bx8Var, cx8Var);
            case 8:
                return new h4l(context, looper, r64Var, (GoogleSignInOptions) obj, bx8Var, cx8Var);
            case 10:
                kek kekVar = (kek) obj;
                if (kekVar == null) {
                    kekVar = new kek(new nfj());
                }
                return new nek(context, looper, r64Var, bx8Var, cx8Var, kekVar.a, kekVar.b);
            case 13:
                return new ww8(context, looper, 51, r64Var, bx8Var, cx8Var);
            case 14:
                return new ww8(context, looper, 148, r64Var, bx8Var, cx8Var);
            default:
                return super.buildClient(context, looper, r64Var, obj, bx8Var, cx8Var);
        }
    }

    @Override // defpackage.bd0
    public List getImpliedScopes(Object obj) {
        switch (this.a) {
            case 8:
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                if (googleSignInOptions == null) {
                    return Collections.EMPTY_LIST;
                }
                return new ArrayList(googleSignInOptions.b);
            default:
                return super.getImpliedScopes(obj);
        }
    }

    @Override // defpackage.yc0
    public cd0 buildClient(Context context, Looper looper, r64 r64Var, Object obj, gw4 gw4Var, eid eidVar) {
        switch (this.a) {
            case 0:
                context.getClass();
                looper.getClass();
                r64Var.getClass();
                ((zc0) obj).getClass();
                gw4Var.getClass();
                eidVar.getClass();
                return new ww8(context, looper, 352, r64Var, gw4Var, eidVar);
            case 1:
            case 2:
            case 6:
            case 8:
            case 10:
            default:
                return super.buildClient(context, looper, r64Var, obj, gw4Var, eidVar);
            case 3:
                return new ww8(context, looper, HttpStatusCodesKt.HTTP_PERM_REDIRECT, r64Var, gw4Var, eidVar);
            case 4:
                return new ww8(context, looper, 449, r64Var, gw4Var, eidVar);
            case 5:
                return new t3l(context, looper, r64Var, (vpi) obj, gw4Var, eidVar);
            case 7:
                return new z3l(context, looper, r64Var, gw4Var, eidVar);
            case 9:
                return new ww8(context, looper, 23, r64Var, gw4Var, eidVar);
            case 11:
                return new asl(context, looper, r64Var, gw4Var, eidVar);
            case 12:
                return new ww8(context, looper, 457, r64Var, gw4Var, eidVar);
        }
    }
}
