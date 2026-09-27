package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.CommonUtils;
import com.google.mlkit.common.sdkinternal.MLTaskExecutor;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class awn {
    public static vjl k;
    public static final y9l l;
    public final String a;
    public final String b;
    public final fvn c;
    public final SharedPrefManager d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", OptionalModuleUtils.BARCODE_MODULE_ID};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        l = new y9l(objArr, 2);
    }

    public awn(Context context, SharedPrefManager sharedPrefManager, fvn fvnVar, String str) {
        int i;
        this.a = context.getPackageName();
        this.b = CommonUtils.getAppVersion(context);
        this.d = sharedPrefManager;
        this.c = fvnVar;
        uwn.U();
        this.g = str;
        this.e = MLTaskExecutor.getInstance().scheduleCallable(new lu6(this, 8));
        MLTaskExecutor mLTaskExecutor = MLTaskExecutor.getInstance();
        Objects.requireNonNull(sharedPrefManager);
        this.f = mLTaskExecutor.scheduleCallable(new y9n(sharedPrefManager, 2));
        y9l y9lVar = l;
        if (y9lVar.containsKey(str)) {
            i = m57.d(context, (String) y9lVar.get(str), false);
        } else {
            i = -1;
        }
        this.h = i;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(xvn xvnVar, oen oenVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!d(oenVar, elapsedRealtime)) {
            return;
        }
        this.i.put(oenVar, Long.valueOf(elapsedRealtime));
        MLTaskExecutor.workerThreadExecutor().execute(new w93(15, this, xvnVar.zza(), oenVar, c(), false));
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return i6b.c.a(this.g);
    }

    public final boolean d(oen oenVar, long j) {
        HashMap hashMap = this.i;
        if (hashMap.get(oenVar) == null || j - ((Long) hashMap.get(oenVar)).longValue() > 30000) {
            return true;
        }
        return false;
    }
}
