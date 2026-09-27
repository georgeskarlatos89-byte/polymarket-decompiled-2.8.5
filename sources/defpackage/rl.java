package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.mlkit.common.MlKitException;
import com.polymarket.android.PolymarketApplication;
import com.polymarket.usviewmodels.LegalAgreementsMenuViewModel;
import com.stripe.android.view.CardNumberEditText;
import io.intercom.android.sdk.api.DeDuperStore$Companion$createSharedPrefsMigration$1;
import io.intercom.android.sdk.api.ShutdownStore$Companion$createSharedPrefsMigration$1;
import io.intercom.android.sdk.api.WrapperPrefsStore$Companion$createSharedPrefsMigration$1;
import io.intercom.android.sdk.identity.AppConfigStore$Companion$createSharedPrefsMigration$1;
import io.intercom.android.sdk.identity.AppIdentityStore$Companion$createSharedPrefsMigration$1;
import io.intercom.android.sdk.identity.DeviceIdentityStore$Companion$createSharedPrefsMigration$1;
import io.intercom.android.sdk.identity.PushTokenStore$Companion$createSharedPrefsMigration$1;
import io.intercom.android.sdk.identity.UserIdentityStore$Companion$createSharedPrefsMigration$1;
import io.intercom.android.sdk.m5.helpcenter.ui.components.BrowseAllHelpTopicsComponentKt;
import io.sentry.android.core.m0;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class rl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ rl(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        int i2 = this.a;
        pk4 pk4Var = null;
        Context context = this.b;
        switch (i2) {
            case 0:
                hpb a = ioe.a.v().a();
                String language = a.a.getLanguage();
                Locale locale = Locale.ROOT;
                String lowerCase = language.toLowerCase(locale);
                lowerCase.getClass();
                String upperCase = a.a.getCountry().toUpperCase(locale);
                upperCase.getClass();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://static.afterpay.com/modal/%s.html", Arrays.copyOf(new Object[]{sv6.n(lowerCase, "_", upperCase)}, 1)))));
                return Unit.INSTANCE;
            case 1:
                return AppConfigStore$Companion$createSharedPrefsMigration$1.a(context);
            case 2:
                return AppIdentityStore$Companion$createSharedPrefsMigration$1.a(context);
            case 3:
                return BrowseAllHelpTopicsComponentKt.c(context);
            case 4:
                return BrowseAllHelpTopicsComponentKt.e(context);
            case 5:
                int i3 = CardNumberEditText.L;
                m2e m2eVar = m2e.c;
                if (m2eVar == null) {
                    SharedPreferences sharedPreferences = new l2e(context).a;
                    String string = sharedPreferences.getString("key_publishable_key", null);
                    if (string != null) {
                        m2eVar = new m2e(string, sharedPreferences.getString("key_account_id", null));
                    } else {
                        m2eVar = null;
                    }
                    if (m2eVar != null) {
                        m2e.c = m2eVar;
                    } else {
                        dmk.n("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                        return null;
                    }
                }
                return m2eVar.a;
            case 6:
                return DeDuperStore$Companion$createSharedPrefsMigration$1.a(context);
            case 7:
                return context.getSharedPreferences("app_info", 0);
            case 8:
                m2e m2eVar2 = m2e.c;
                if (m2eVar2 == null) {
                    SharedPreferences sharedPreferences2 = new l2e(context).a;
                    String string2 = sharedPreferences2.getString("key_publishable_key", null);
                    if (string2 != null) {
                        m2eVar2 = new m2e(string2, sharedPreferences2.getString("key_account_id", null));
                    } else {
                        m2eVar2 = null;
                    }
                    if (m2eVar2 != null) {
                        m2e.c = m2eVar2;
                    } else {
                        dmk.n("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                        return null;
                    }
                }
                return m2eVar2.a;
            case 9:
                return context.getSharedPreferences("FraudDetectionDataStore", 0);
            case 10:
                return context.getSharedPreferences("PaymentSheet_LinkStore", 0);
            case 11:
                return DeviceIdentityStore$Companion$createSharedPrefsMigration$1.a(context);
            case 12:
                try {
                    String path = context.getCacheDir().getPath();
                    path.getClass();
                    return xu6.z(new File(path + File.separator + "stripe_image_cache"));
                } catch (IOException e) {
                    m0.e("stripe_image_disk_cache", "error opening cache", e);
                    return null;
                }
            case 13:
                Bitmap.Config[] configArr = r.a;
                File cacheDir = context.getCacheDir();
                if (cacheDir != null) {
                    cacheDir.mkdirs();
                    return cacheDir;
                }
                dmk.n("cacheDir == null");
                return null;
            case 14:
                Bitmap.Config[] configArr2 = r.a;
                File cacheDir2 = context.getCacheDir();
                if (cacheDir2 != null) {
                    cacheDir2.mkdirs();
                    return cacheDir2;
                }
                dmk.n("cacheDir == null");
                return null;
            case 15:
                l55.b(context);
                return Unit.INSTANCE;
            case 16:
                l55.b(context);
                return Unit.INSTANCE;
            case 17:
                return iin.b(context);
            case MlKitException.UNSUPPORTED /* 18 */:
                m2e m2eVar3 = m2e.c;
                if (m2eVar3 == null) {
                    SharedPreferences sharedPreferences3 = new l2e(context).a;
                    String string3 = sharedPreferences3.getString("key_publishable_key", null);
                    if (string3 != null) {
                        m2eVar3 = new m2e(string3, sharedPreferences3.getString("key_account_id", null));
                    } else {
                        m2eVar3 = null;
                    }
                    if (m2eVar3 != null) {
                        m2e.c = m2eVar3;
                    } else {
                        dmk.n("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                        return null;
                    }
                }
                return m2eVar3.a;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                int i4 = PolymarketApplication.b;
                uqf uqfVar = new uqf(0);
                try {
                    Object l = d55.l(context, ActivityManager.class);
                    l.getClass();
                    ActivityManager activityManager = (ActivityManager) l;
                    if ((context.getApplicationInfo().flags & 1048576) != 0) {
                        i = activityManager.getLargeMemoryClass();
                    } else {
                        i = activityManager.getMemoryClass();
                    }
                } catch (Exception unused) {
                    i = 256;
                }
                return new gqf(new xh6((long) (0.15d * i * 1048576), uqfVar), uqfVar);
            case 20:
                return new LegalAgreementsMenuViewModel(new LegalAgreementsMenuViewModel.Callbacks(new f71(context, 11)));
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return PushTokenStore$Companion$createSharedPrefsMigration$1.a(context);
            case 22:
                return ShutdownStore$Companion$createSharedPrefsMigration$1.a(context);
            case 23:
                return UserIdentityStore$Companion$createSharedPrefsMigration$1.a(context);
            case 24:
                return WrapperPrefsStore$Companion$createSharedPrefsMigration$1.a(context);
            default:
                context.getClass();
                if (context instanceof pk4) {
                    pk4Var = (pk4) context;
                }
                if (pk4Var != null) {
                    pk4Var.finish();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ rl(Object obj, Context context, int i) {
        this.a = i;
        this.b = context;
    }
}
