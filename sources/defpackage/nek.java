package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class nek extends ww8 {
    public final Context a;
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;
    public final String f;

    public nek(Context context, Looper looper, r64 r64Var, bx8 bx8Var, cx8 cx8Var, int i, String str) {
        super(context, looper, 4, r64Var, bx8Var, cx8Var);
        this.a = context;
        this.b = i;
        this.c = null;
        this.d = 1;
        this.e = true;
        this.f = str;
    }

    public final Bundle b() {
        String packageName = this.a.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.b);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.e);
        bundle.putString("androidPackageName", packageName);
        String str = this.c;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.d);
        bundle.putString("com.google.android.gms.wallet.EXTRA_WALLET_CLIENT_ID", this.f);
        return bundle;
    }

    @Override // defpackage.z81
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof w4l) {
            return (w4l) queryLocalInterface;
        }
        return new usk(iBinder, "com.google.android.gms.wallet.internal.IOwService", 8);
    }

    @Override // defpackage.z81
    public final gw7[] getApiFeatures() {
        return npm.c;
    }

    @Override // defpackage.z81, defpackage.cd0
    public final int getMinApkVersion() {
        return 12600000;
    }

    @Override // defpackage.z81
    public final String getServiceDescriptor() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // defpackage.z81
    public final String getStartServiceAction() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // defpackage.z81
    public final boolean requiresAccount() {
        return true;
    }

    @Override // defpackage.z81
    public final boolean usesClientTelemetry() {
        return true;
    }
}
