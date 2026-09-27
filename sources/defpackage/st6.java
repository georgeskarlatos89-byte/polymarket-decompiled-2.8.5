package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import com.polymarket.android.R;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.stripe.android.model.StripeIntent$Status;
import java.io.InputStream;
import java.text.Normalizer;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class st6 implements ajc, ut6 {
    public Context a;

    public /* synthetic */ st6(Context context, boolean z) {
        this.a = context;
    }

    @Override // defpackage.ut6
    public void a(Object obj) {
        ((InputStream) obj).close();
    }

    @Override // defpackage.ut6
    public Class b() {
        return InputStream.class;
    }

    public String c() {
        boolean z = xl3.J;
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        int i = Build.VERSION.SDK_INT;
        String g = k84.g("Android ", Build.VERSION.RELEASE);
        String f = f();
        String g2 = g();
        StringBuilder sb = new StringBuilder("stream-chat-android-7.9.0");
        sb.append("|os=".concat(g));
        sb.append("|api_version=" + i);
        sb.append("|device_model=" + str2 + ApiConstant.SPACE + str);
        boolean z2 = xl3.J;
        StringBuilder sb2 = new StringBuilder("|offline_enabled=");
        sb2.append(z2);
        sb.append(sb2.toString());
        sb.append("|app=".concat(f));
        sb.append("|app_version=".concat(g2));
        String normalize = Normalizer.normalize(sb.toString(), Normalizer.Form.NFD);
        normalize.getClass();
        return new Regex("[^\\p{ASCII}]").replace(normalize, "");
    }

    @Override // defpackage.ut6
    public Object d(int i, Resources.Theme theme, Resources resources) {
        return resources.openRawResource(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (((defpackage.l4e) r9).s != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (((defpackage.l0h) r9).m != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String e(int i, c8i c8iVar, String str) {
        c6e c6eVar;
        String str2;
        String str3;
        j6e j6eVar;
        c6e c6eVar2;
        Context context = this.a;
        c8iVar.getClass();
        if (i == 4) {
            return context.getResources().getString(R.string.stripe_failure_reason_timed_out);
        }
        j6e l0 = c8iVar.l0();
        String str4 = null;
        if (l0 != null) {
            c6eVar = l0.e;
        } else {
            c6eVar = null;
        }
        if (c6eVar == c6e.Card && (c8iVar.i() instanceof t7i)) {
            if (!(c8iVar instanceof l4e)) {
                if (!(c8iVar instanceof l0h)) {
                    dmk.a();
                    return null;
                }
            }
            return null;
        }
        if (c8iVar.c() == StripeIntent$Status.RequiresPaymentMethod || c8iVar.c() == StripeIntent$Status.RequiresAction) {
            if (c8iVar instanceof l4e) {
                l4e l4eVar = (l4e) c8iVar;
                StripeIntent$Status stripeIntent$Status = l4eVar.q;
                i4e i4eVar = l4eVar.s;
                if (stripeIntent$Status != StripeIntent$Status.RequiresAction || ((j6eVar = l4eVar.n) != null && (c6eVar2 = j6eVar.e) != null && c6eVar2.isVoucher)) {
                    if (i4eVar != null) {
                        str3 = i4eVar.b;
                    } else {
                        str3 = null;
                    }
                    if (!Intrinsics.areEqual(str3, "payment_intent_authentication_failure")) {
                        if (i4eVar != null) {
                            boolean z = l4eVar.m;
                            context.getClass();
                            String str5 = i4eVar.e;
                            String str6 = i4eVar.b;
                            String str7 = i4eVar.c;
                            h4e h4eVar = i4eVar.h;
                            if (h4eVar != null) {
                                str4 = h4eVar.a();
                            }
                            return zrl.b(str5, str4, str6, str7, z, str, context);
                        }
                    }
                }
                return context.getResources().getString(R.string.stripe_failure_reason_authentication);
            }
            if (c8iVar instanceof l0h) {
                l0h l0hVar = (l0h) c8iVar;
                k0h k0hVar = l0hVar.m;
                if (k0hVar != null) {
                    str2 = k0hVar.a;
                } else {
                    str2 = null;
                }
                if (Intrinsics.areEqual(str2, "setup_intent_authentication_failure")) {
                    return context.getResources().getString(R.string.stripe_failure_reason_authentication);
                }
                if (k0hVar != null) {
                    boolean z2 = l0hVar.g;
                    context.getClass();
                    String str8 = k0hVar.d;
                    String str9 = k0hVar.a;
                    String str10 = k0hVar.b;
                    j0h j0hVar = k0hVar.g;
                    if (j0hVar != null) {
                        str4 = j0hVar.a();
                    }
                    return zrl.b(str8, str4, str9, str10, z2, str, context);
                }
            } else {
                dmk.a();
                return null;
            }
        }
        return null;
    }

    public String f() {
        String obj;
        Context context = this.a;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return "UnknownApp";
        }
        int i = applicationInfo.labelRes;
        if (i == 0) {
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            if (charSequence == null || (obj = charSequence.toString()) == null) {
                return "UnknownApp";
            }
            return obj;
        }
        String string = context.getString(i);
        if (string == null) {
            return "UnknownApp";
        }
        return string;
    }

    public String g() {
        Object m882constructorimpl;
        Context context = this.a;
        try {
            Result.Companion companion = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (m882constructorimpl instanceof r5g) {
            m882constructorimpl = null;
        }
        String str = (String) m882constructorimpl;
        if (str == null) {
            return "nameNotFound";
        }
        return str;
    }

    public ApplicationInfo h(int i, String str) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo i(int i, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public boolean j() {
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.a;
        if (callingUid == myUid) {
            return f0a.c(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    @Override // defpackage.ajc
    public zic l0(m64 m64Var) {
        return new rm0(this.a, this);
    }
}
